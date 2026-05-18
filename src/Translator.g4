grammar Translator;

@header {
import java.util.ArrayList;
import java.util.List;
}
@parser::members {
    ProgramaC programaGlobal;
    SubprogramaC subprogramaActual;

    public boolean esParametroReferencia(String nombreVar) {
        if (subprogramaActual == null) return false;
        return subprogramaActual.esPuntero(nombreVar);
    }

    public SubprogramaC buscarFuncionEnPrograma(String nombreFun) {
        if (programaGlobal == null) return null;
        return programaGlobal.buscarFuncion(nombreFun);
    }
}

prg returns [String codigoC]
    @init {
        ProgramaC programa = new ProgramaC();
        this.programaGlobal = programa;
    }
    : PROGRAM id1=IDENT ';'
    dcllist[programa.getVariablesMain(), programa.getConstantes()]
    cabecera[programa.getInterfaces()]
    sentlist[programa.getSentenciasMain()]
    END PROGRAM id2=IDENT subproglist[programa.getImplementaciones()]
    {
        if (!$id1.text.equals($id2.text)) {
            notifyErrorListeners($id2, "Error Semántico: El nombre del PROGRAM no coincide.", null);
        } else {
            $codigoC = programa.generarCodigo(0);
        }
    }
    ;

dcllist[List<VariableC> vars, List<ConstanteC> consts] : dcl[$vars,$consts] dcllist[$vars, $consts] | ;

cabecera[List<SubprogramaC> interfaces] : INTERFACE cablist[$interfaces] END INTERFACE | ;

cablist[List<SubprogramaC> interfaces]
    : dp=decproc { $interfaces.add($dp.sub); } decsubprog[$interfaces]
    | df=decfun { $interfaces.add($df.fun); } decsubprog[$interfaces]
    ;

decsubprog[List<SubprogramaC> interfaces]
    : dp=decproc { $interfaces.add($dp.sub); } decsubprog[$interfaces]
    | df=decfun { $interfaces.add($df.fun); } decsubprog[$interfaces]
    | ;

sentlist[List<SentenciaC> sents]
    : s=sent { if($s.sentVal != null) $sents.add($s.sentVal); } sentlist_prime[$sents] ;

sentlist_prime[List<SentenciaC> sents]
    : s=sent { if($s.sentVal != null) $sents.add($s.sentVal); } sentlist_prime[$sents] |  ;

dcl[List<VariableC> vars, List<ConstanteC> consts] : t=tipo dcl_varcte[$t.t, $vars, $consts] ;

dcl_varcte[String tipoBase, List<VariableC> vars, List<ConstanteC> consts] : ',' PARAMETER '::' id=IDENT '=' v=simpvalue
    { $consts.add(new ConstanteC($tipoBase, $id.text, $v.val)); } ctelist[$tipoBase, $consts] ';'
    | '::' varlist[$tipoBase, $vars] ';' ;

ctelist [String tipoBase, List<ConstanteC> consts]
    : ',' id=IDENT '=' v=simpvalue { $consts.add(new ConstanteC($tipoBase, $id.text, $v.val)); } ctelist[$tipoBase, $consts]
    |
    ;

simpvalue returns [String val]
    : NUM_INT_CONST   { $val = $NUM_INT_CONST.text; }
    | NUM_REAL_CONST  { $val = $NUM_REAL_CONST.text; }
    | STRING_CONST    {
          String s = $STRING_CONST.text;
          char delimitador = s.charAt(0);
          String contenido = s.substring(1, s.length() - 1);

          if (delimitador == '\'') {
              contenido = contenido.replace("''", "'");
          } else {
              contenido = contenido.replace("\"\"", "\"");
          }
          // 2. Escapar comillas dobles y añadir las comillas de C
          contenido = contenido.replace("\"", "\\\"");
          $val = "\"" + contenido + "\"";
      }
    | NUM_INT_CONST_B { $val = "0b" + $NUM_INT_CONST_B.text.substring(2, $NUM_INT_CONST_B.text.length() - 1); }
    | NUM_INT_CONST_O { $val = "0o" + $NUM_INT_CONST_O.text.substring(2, $NUM_INT_CONST_O.text.length() - 1); }
    | NUM_INT_CONST_H { $val = "0x" + $NUM_INT_CONST_H.text.substring(2, $NUM_INT_CONST_H.text.length() - 1); }
    ;

tipo returns [String t]
    : INTEGER   { $t = "int"; }
    | REAL      { $t = "float"; }
    | CHARACTER c=charlength { $t = "char" + $c.val; }
    ;

charlength returns [String val] : '(' n=NUM_INT_CONST ')' { $val = "[" + $n.text + "]"; } | { $val = ""; } ;

varlist [String tipoBase, List<VariableC> vars]
    : id=IDENT i=init { $vars.add(new VariableC($tipoBase, $id.text, $i.val)); } varlist_prime[$tipoBase, $vars]
    ;

varlist_prime [String tipoBase, List<VariableC> vars]
    : ',' id=IDENT i=init { $vars.add(new VariableC($tipoBase, $id.text, $i.val)); } varlist_prime[$tipoBase, $vars]
    |
    ;

init returns [String val] : '=' v=simpvalue { $val = $v.val; } | { $val = ""; } ;

decproc returns [SubprogramaC sub]
    : SUBROUTINE id1=IDENT { $sub = new SubprogramaC($id1.text, "void"); }
      formal_paramlist[$sub]
      dec_s_paramlist[$sub]
      END SUBROUTINE id2=IDENT
      {
          if (!$id1.text.equals($id2.text)) {
              notifyErrorListeners($id2, "Error Semántico: El nombre en END SUBROUTINE no coincide con el de la cabecera.", null);
          }
      }
    ;

formal_paramlist [SubprogramaC sub] : '(' nomparamlist[$sub] ')'  | ;

nomparamlist [SubprogramaC sub]: id=IDENT{$sub.getParametros().add(new ParametroC("", $id.text, ""));} nomparamlist_prime[$sub];

nomparamlist_prime[SubprogramaC sub] : ',' id=IDENT{$sub.getParametros().add(new ParametroC("", $id.text, ""));} nomparamlist_prime[$sub] | ;

dec_s_paramlist [SubprogramaC sub]
    : t=tipo ',' INTENT '(' m=tipoparam ')' id=IDENT ';'
      {
        boolean correcto = $sub.actualizarParametro($id.text, $t.t, $m.m);
        if (!correcto) { notifyErrorListeners($id, "Error Semántico: El parámetro '" + $id.text +  "' no coincide con el orden/nombre de la cabecera.", null); }
      }
      dec_s_paramlist[$sub]
    | ;

tipoparam returns [String m] : IN { $m = "IN"; } | OUT { $m = "OUT"; } | INOUT { $m = "INOUT"; } ;

decfun returns[SubprogramaC fun] : FUNCTION id1=IDENT { $fun = new SubprogramaC($id1.text, ""); }
    '(' nomparamlist[$fun] ')' t=tipo  '::' id_ret=IDENT
    {
        $fun.setTipoRetorno($t.t);
        if (!$id1.text.equals($id_ret.text)) { notifyErrorListeners($id_ret, "Error Semántico: El nombre de retorno no coincide con la función.", null); }
    }';' dec_f_paramlist[$fun] END FUNCTION id2=IDENT
    {
        if (!$id1.text.equals($id2.text)) {
            notifyErrorListeners($id2, "Error Semántico: El nombre en END FUNCTION no coincide con el de la cabecera.", null);
        }
    }
    ;

dec_f_paramlist[SubprogramaC fun] : dec_f_paramlist_prime[$fun] ;

dec_f_paramlist_prime[SubprogramaC fun] :
    t=tipo ',' INTENT '(' IN ')' id=IDENT ';'
    {
        boolean correcto = $fun.actualizarParametro($id.text, $t.t, "IN");
        if (!correcto) { notifyErrorListeners($id, "Error Semántico: El parámetro '" + $id.text +  "' no coincide con la cabecera.", null); }
    }
    dec_f_paramlist_prime[$fun]
    | ;

sent returns [SentenciaC sentVal]
    : id=IDENT '=' e=exp ';'
      {
          AsignacionC asig = new AsignacionC($id.text, $e.val);
          if (esParametroReferencia($id.text)) asig.setEsPuntero(true);
          $sentVal = asig;
      }
    | pc=proc_call ';' {$sentVal = $pc.procCallVal ; }
    | IF '(' ec=expcond ')' it=if_tail[$ec.val]   { $sentVal = $it.ifObj; }
    | DO dt=do_tail { $sentVal = $dt.doObj; }
    | SELECT CASE '(' e=exp ')' c=casos END SELECT { $sentVal = new SelectCaseC($e.val, $c.listaCasos, $c.listaDefault); }
    ;

exp returns [String val] : f=factor ep=exp_prime[$f.val] { $val = $ep.valSin; } ;

exp_prime[String valHeredado ] returns [String valSin]:
    o=op f=factor ep=exp_prime[$valHeredado + " " + $o.val + " " + $f.val] { $valSin = $ep.valSin; }
    | { $valSin = $valHeredado; };

op returns [String val] : oparit { $val = $oparit.text; } ;
oparit : '+' | '-' | '*' | '/' ;

factor returns [String val]
       : s=simpvalue       { $val = $s.val; }
       | '(' e=exp ')'     { $val = "(" + $e.val + ")"; }
       | id=IDENT fp=factor_prime
         {
             String prefix = $id.text;
             if ($fp.val.isEmpty() && esParametroReferencia($id.text)) {
                 prefix = "*" + prefix;
             }
             $val = prefix + $fp.val;
         }
       ;

factor_prime returns [String val]
    : '(' e=exp el=explist[$e.val] ')' { $val = "(" + $el.val + ")"; }
    | { $val = ""; }
    ;

explist [String valHeredado] returns [String val]
    : ',' e=exp el=explist[$valHeredado + ", " + $e.val] { $val = $el.val; }
    | { $val = $valHeredado; }
    ;

proc_call returns [LlamadaC procCallVal]
    : CALL id=IDENT sp=subpparamlist
      {
          SubprogramaC funcDestino = buscarFuncionEnPrograma($id.text);
          List<String> argsFinales = new ArrayList<String>();

          for (int i = 0; i < $sp.args.size(); i++) {
              String argumento = $sp.args.get(i);
              if (funcDestino != null && i < funcDestino.getParametros().size()) {
                  String modo = funcDestino.getParametros().get(i).getModo();
                  if ("OUT".equalsIgnoreCase(modo) || "INOUT".equalsIgnoreCase(modo)) {
                      argumento = "&" + argumento;
                  }
              }
              argsFinales.add(argumento);
          }
          String argsCompilados = String.join(", ", argsFinales);
          $procCallVal = new LlamadaC($id.text, argsCompilados);
      }
    ;

subpparamlist returns [List<String> args]
    @init { $args = new ArrayList<String>(); }
    : '(' e=exp { $args.add($e.val); } el=explist_llamada[$args] ')'
    |
    ;

explist_llamada [List<String> listaHeredada]
    : ',' e=exp { $listaHeredada.add($e.val); } explist_llamada[$listaHeredada]
    |
    ;

subproglist[List<SubprogramaC> implementaciones]
    : cp=codproc { $implementaciones.add($cp.sub); } subproglist[$implementaciones]
    | cf=codfun  { $implementaciones.add($cf.fun); } subproglist[$implementaciones]
    |
    ;

codproc returns [SubprogramaC sub]
    : SUBROUTINE id1=IDENT
      {
          $sub = new SubprogramaC($id1.text, "void");
          this.subprogramaActual = $sub; // nos guardmaos el subprgrama actual que estamos reconociendo asi podremso identificar los parametros de entrad y salida
      }
      formal_paramlist[$sub]
      dec_s_paramlist[$sub]
      dcllist[$sub.getVariables(), programaGlobal.getConstantes()]
      sentlist[$sub.getSentencias()]
      END SUBROUTINE id2=IDENT
      {
        if (!$id1.text.equals($id2.text)) {
            notifyErrorListeners($id2, "Error Semántico: El nombre en END SUBROUTINE no coincide con el de la cabecera.", null);
                    }
      }
    ;

codfun returns[SubprogramaC fun]  : FUNCTION id1=IDENT
    {
        $fun = new SubprogramaC($id1.text,"");
        this.subprogramaActual = $fun; //Mismo caso para las funciones
    }
    '(' nomparamlist[$fun] ')' t=tipo '::' id_ret=IDENT
    {
       $fun.setTipoRetorno($t.t);
       if (!$id1.text.equals($id_ret.text)) { notifyErrorListeners($id_ret, "Error Semántico: El nombre de retorno no coincide con la función.", null); }
    }';' dec_f_paramlist[$fun] dcllist[$fun.getVariables(), programaGlobal.getConstantes()] fun_body[$fun] ;

fun_body[SubprogramaC fun]
    : pc=proc_call ';' { $fun.getSentencias().add($pc.procCallVal); } fun_body[$fun]
    | id=IDENT '=' e=exp ';'
      {
          AsignacionC asig = new AsignacionC($id.text, $e.val);
          if (esParametroReferencia($id.text)) asig.setEsPuntero(true);
          $fun.getSentencias().add(asig);
      } fun_body_prime[$fun] ;

fun_body_prime[SubprogramaC fun]
     : END FUNCTION id2=IDENT
     {
        if (!$fun.getNombre().equals($id2.text)) { notifyErrorListeners($id2, "Error Semántico: El nombre del END FUNCTION no coincide.", null); }
     }
     | fun_body[$fun] ;

expcond returns [String val]
    : fc=factorcond ecp=expcond_prime[$fc.val] { $val = $ecp.val; } ;

expcond_prime [String valHeredado] returns [String val]
    : o=oplog fc=factorcond ecp=expcond_prime[$valHeredado + " " + $o.val + " " + $fc.val] { $val = $ecp.val; }
    | { $val = $valHeredado; }
    ;

oplog returns [String val]
     : OR   { $val = "||"; } | AND  { $val = "&&"; } | EQV  { $val = "!^"; } | NEQV { $val = "^"; } ;

factorcond returns [String val]
           : e1=exp oc=opcomp e2=exp { $val = $e1.val + " " + $oc.val + " " + $e2.val; }
           | '(' ec=expcond ')'      { $val = "(" + $ec.val + ")"; }
           | NOT fc=factorcond       { $val = "!" + $fc.val; }
           | TRUE                    { $val = "1"; }
           | FALSE                   { $val = "0"; }
           ;

opcomp returns [String val] : '<'  { $val = "<"; } | '>'  { $val = ">"; } | '<=' { $val = "<="; } | '>=' { $val = ">="; } | '==' { $val = "=="; } | '/=' { $val = "!="; } ;

do_tail returns [SentenciaC doObj, List<SentenciaC> sents]
    : WHILE '(' ec=expcond ')' { $sents = new ArrayList<SentenciaC>(); } sentlist[$sents] ENDDO
      { $doObj = new BucleWhileC($ec.val, $sents); }
    | id=IDENT '=' d1=doval ',' d2=doval ',' d3=doval { $sents = new ArrayList<SentenciaC>(); } sentlist[$sents] ENDDO
      { $doObj = new BucleForC($id.text, $d1.val, $d2.val, $d3.val, $sents); }
    ;

if_tail [String cond] returns [IfC ifObj, List<SentenciaC> sIf]
    : s=sent
      {
          $sIf = new ArrayList<SentenciaC>();
          if ($s.sentVal != null) $sIf.add($s.sentVal);
          $ifObj = new IfC($cond, $sIf, new ArrayList<SentenciaC>());
      }
    | THEN { $sIf = new ArrayList<SentenciaC>(); } sentlist[$sIf] itp=if_tail_prime
      { $ifObj = new IfC($cond, $sIf, $itp.sElse); }
    ;

if_tail_prime returns [List<SentenciaC> sElse]
    : ENDIF { $sElse = new ArrayList<SentenciaC>(); }
    | ELSE { $sElse = new ArrayList<SentenciaC>(); } sentlist[$sElse] ENDIF
    ;

doval returns [String val] : nic=NUM_INT_CONST {$val = $nic.text; } | id=IDENT {$val = $id.text; } ;

casos returns [List<CasoC> listaCasos, List<SentenciaC> listaDefault]
    : CASE cp=casos_prime { $listaCasos = $cp.listaCasos; $listaDefault = $cp.listaDefault; }
    | { $listaCasos = new ArrayList<CasoC>(); $listaDefault = new ArrayList<SentenciaC>(); }
    ;

casos_prime returns [List<CasoC> listaCasos, List<SentenciaC> listaDefault]
    : '(' e=etiquetas ')' { List<SentenciaC> sents = new ArrayList<SentenciaC>(); } sentlist[sents] c=casos
      {
          $listaCasos = new ArrayList<CasoC>();
          $listaCasos.add(new CasoC($e.val, sents));
          $listaCasos.addAll($c.listaCasos);
          $listaDefault = $c.listaDefault;
      }
    | DEFAULT { List<SentenciaC> sentsDef = new ArrayList<SentenciaC>(); } sentlist[sentsDef]
      {
          $listaCasos = new ArrayList<CasoC>();
          $listaDefault = sentsDef;
      }
    ;

etiquetas returns [String val]
    : s=simpvalue et=etiquetas_tail[$s.val] { $val = $et.val; }
    | ':' s=simpvalue { $val = "case < " + $s.val + ":"; }
    ;

etiquetas_tail [String sHeredado] returns [String val]
    : le=listaetiqetas[$sHeredado] { $val = $le.val; }
    | ':' etp=etiquetas_tail_prime { if ($etp.val.isEmpty()) { $val = "case > " + $sHeredado + ":"; } else { $val = "case " + $sHeredado + " to " + $etp.val + ":"; } }
    ;

etiquetas_tail_prime returns [String val] : s=simpvalue { $val = $s.val; } | { $val = ""; } ;

listaetiqetas [String sHeredado] returns [String val]
    : ',' s=simpvalue le=listaetiqetas[ $sHeredado + ":\ncase " + $s.val ] { $val = $le.val; }
    |  { $val = "case " + $sHeredado + ":"; }
    ;

PROGRAM   : 'PROGRAM' ;
END       : 'END' ;
INTERFACE : 'INTERFACE' ;
SUBROUTINE: 'SUBROUTINE' ;
FUNCTION  : 'FUNCTION' ;
INTEGER   : 'INTEGER' ;
REAL      : 'REAL' ;
CHARACTER : 'CHARACTER' ;
PARAMETER : 'PARAMETER' ;
INTENT : 'INTENT' ;
IN : 'IN' ;
OUT : 'OUT' ;
INOUT : 'INOUT' ;
CALL : 'CALL' ;
IF : 'IF';
DO : 'DO';
SELECT : 'SELECT';
CASE : 'CASE';
WHILE : 'WHILE';
ENDDO : 'ENDDO';
THEN : 'THEN';
ENDIF : 'ENDIF';
ELSE: 'ELSE';
DEFAULT: 'DEFAULT';
TRUE: '.TRUE.' ;
FALSE: '.FALSE.' ;
OR : '.OR.' ;
AND : '.AND.' ;
EQV : '.EQV.' ;
NEQV : '.NEQV.' ;
NOT : '.NOT.' ;

NUM_INT_CONST_B : 'b' '\'' [01]+ '\'';
NUM_INT_CONST_O : 'o' '\'' [0-7]+ '\'' ;
NUM_INT_CONST_H : 'z' '\'' [0-9a-fA-F]+ '\'' ;
STRING_CONST
    : '\'' ( '\'\'' | ~['\r\n] )* '\''
    | '"'  ( '""'   | ~["\r\n] )* '"'
    ;
NUM_REAL_CONST: '-'? ([0-9]+'.'[0-9]+ | [0-9]+ [eE] '-'? [0-9]+ | [0-9]+'.'[0-9]+[eE]'-'?[0-9]+);
NUM_INT_CONST: '-'? [0-9]+ ;
IDENT : [a-zA-Z] [a-zA-Z0-9_]*;
COMMENT: '!' ~[\r\n]* -> skip;
LN : ('\r' | '\n' | '\r\n')+ -> skip;
WS : [ \t\f]+ -> skip;