grammar Translator;

@header {
import java.util.ArrayList;
}

prg : PROGRAM IDENT ';' dcllist cabecera sentlist END PROGRAM IDENT subproglist ;

dcllist[List<VariableC> vars, List<ConstanteC> consts] : dcl[$vars,$consts] dcllist[$vars, $consts] | ;

cabecera : INTERFACE cablist END INTERFACE | ;

cablist : decproc decsubprog | decfun decsubprog ;

decsubprog : decproc decsubprog | decfun decsubprog | ;

sentlist[List<SentenciaC> sents]
    : s=sent
            {   if($s.sentVal != null){
                    $sents.add($s.sentVal);
                }
            }
     sentlist_prime[$sents] ;

sentlist_prime[List<SentenciaC> sents]
    : s=sent
        {   if($s.sentVal != null){
                $sents.add($s.sentVal);
            }
        }
        sentlist_prime[$sents] |  ;

dcl[List<VariableC> vars, List<ConstanteC> consts] : t=tipo dcl_varcte[$t.t, $vars, $consts] ;

dcl_varcte[String tipoBase, List<VariableC> vars, List<ConstanteC> consts] : ',' PARAMETER '::' id=IDENT '=' v=simpvalue
    {
        $consts.add(new ConstanteC($tipoBase, $id.text, $v.val));
    }ctelist[$tipoBase, $consts] ';'
           | '::' varlist[$tipoBase, $vars] ';' ;

ctelist [String tipoBase, List<ConstanteC> consts]
    : ',' id=IDENT '=' v=simpvalue
      {
          $consts.add(new ConstanteC($tipoBase, $id.text, $v.val));
      }
      ctelist[$tipoBase, $consts]
    |
    ;
simpvalue returns [String val]
    : NUM_INT_CONST   { $val = $NUM_INT_CONST.text; }
    | NUM_REAL_CONST  { $val = $NUM_REAL_CONST.text; }
    | STRING_CONST    { $val = $STRING_CONST.text; }
    | NUM_INT_CONST_B { $val = $NUM_INT_CONST_B.text; }
    | NUM_INT_CONST_O { $val = $NUM_INT_CONST_O.text; }
    | NUM_INT_CONST_H { $val = $NUM_INT_CONST_H.text; };

tipo returns [String t]
          : INTEGER   { $t = "int"; }
          | REAL      { $t = "float"; }
          | CHARACTER charlength { $t = "char"; }
          ;

charlength : '(' NUM_INT_CONST ')'| ;

varlist [String tipoBase, List<VariableC> vars]
    : id=IDENT i=init
      {
          $vars.add(new VariableC($tipoBase, $id.text, $i.val));
      }
      varlist_prime[$tipoBase, $vars]
    ;

varlist_prime [String tipoBase, List<VariableC> vars]
    : ',' id=IDENT i=init
      {
          $vars.add(new VariableC($tipoBase, $id.text, $i.val));
      }
      varlist_prime[$tipoBase, $vars]
    |
    ;

init returns [String val]
    : '=' v=simpvalue { $val = $v.val; }
    | { $val = ""; }
    ;

decproc returns [SubprogramaC sub]
    : SUBROUTINE id1=IDENT
      {
          $sub = new SubprogramaC($id1.text, "void");
      }
      formal_paramlist[$sub]
      dec_s_paramlist[$sub]
      END SUBROUTINE id2=IDENT
    ;

formal_paramlist [SubprogramaC sub] : '(' nomparamlist[$sub] ')'  | ;

nomparamlist [SubprogramaC sub]: id=IDENT{$sub.parametros.add(new ParametroC("", $id.text, ""));} nomparamlist_prime[$sub];

nomparamlist_prime[SubprogramaC sub] : ',' id=IDENT{$sub.parametros.add(new ParametroC("", $id.text, ""));} nomparamlist_prime[$sub] | ;

dec_s_paramlist [SubprogramaC sub]
    : t=tipo ',' INTENT '(' m=tipoparam ')' id=IDENT ';'
      {
        boolean correcto = $sub.actualizarParametro($id.text, $t.t, $m.m);
        if (!correcto) {
            System.err.println("Error Semántico: El parámetro '" + $id.text +  "' no coincide con el orden/nombre de la cabecera.");
        }
      }
      dec_s_paramlist[$sub]
    | ;

tipoparam returns [String m]
          : IN    { $m = "IN"; }
          | OUT   { $m = "OUT"; }
          | INOUT { $m = "INOUT"; }
          ;

decfun returns[SubprogramaC fun] : FUNCTION id1=IDENT
    {
        $fun = new SubprogramaC($id1.text, "");

    }'(' nomparamlist[$fun] ')' t=tipo  '::' id_ret=IDENT
    {
        $fun.setTipoRetorno($t.t);
        if (!$id1.text.equals($id_ret.text)) {
            System.err.println("Error: El nombre de retorno no coincide con la función.");
        }

    }';' dec_f_paramlist[$fun] END FUNCTION IDENT;

dec_f_paramlist[SubprogramaC fun] : dec_f_paramlist_prime[$fun] ;

dec_f_paramlist_prime[SubprogramaC fun] :
    t=tipo ',' INTENT '(' IN ')' id=IDENT ';'
    {
        boolean correcto = $fun.actualizarParametro($id.text, $t.t, "IN");
        if (!correcto) {
            System.err.println("Error Semántico: El parámetro '" + $id.text +  "' no coincide con la cabecera.");
        }
    }
    dec_f_paramlist_prime[$fun] //Se ha quitado el renonbrado de dec_f_paramlist
    | ;

sent returns [SentenciaC sentVal]
    : id=IDENT '=' e=exp ';' {$sentVal = new AsignacionC($id.text,$e.val); }
    | pc=proc_call ';' {$sentVal = $pc.procCallVal ; }
    | IF '(' expcond ')' if_tail
    | DO do_tail
    | SELECT CASE '(' exp ')' casos END SELECT ;

exp returns [String val] : f=factor ep=exp_prime[$f.val] { $val = $ep.valSin; } ;

//Ahora para todos estos casos de Strings que no se van a guardar en variables java si hay que tener tanto heredados
//para ir rellenando los valores hacia abajo y luego devlver el sintetizado para luego cogerlo hacia arriba relleno
//ya que en esre caso no estamos teniendo la referencia a ningun objeto por simplificacion y no crear mas clases.
exp_prime[String valHeredado ] returns [String valSin]:
    o=op f=factor ep=exp_prime[$valHeredado + " " + $o.val + " " + $f.val] { $valSin = $ep.valSin; }
    | { $valSin = $valHeredado; };

op returns [String val]
    : oparit { $val = $oparit.text; }
    ;

oparit : '+' | '-' | '*' | '/' ;

factor returns [String val]
       : s=simpvalue       { $val = $s.val; }
       | '(' e=exp ')'     { $val = "(" + $e.val + ")"; }
       | id=IDENT fp=factor_prime[$id.text] { $val = $fp.val; }
       ;

factor_prime [String valHeredado] returns [String val]
    : '(' e=exp el=explist[$e.val] ')' { $val = $valHeredado + "(" + $el.val + ")"; }
    | { $val = $valHeredado ; }
    ;

explist [String valHeredado] returns [String val]
    : ',' e=exp el=explist[$valHeredado + ", " + $e.val] { $val = $el.val; }
    | { $val = $valHeredado; }
    ;

proc_call returns [LlamadaC procCallVal]: CALL id=IDENT sp=subpparamlist {$procCallVal = new LlamadaC($id.text, $sp.args);};

subpparamlist returns[String args]
    : '(' e=exp ep=explist[$e.val] ')'
        {
           $args = $ep.val ;
        }
    | {$args = "" ; } ;

subproglist : codproc subproglist | codfun subproglist | ;

codproc returns [SubprogramaC sub]
    : SUBROUTINE id1=IDENT
      {
          $sub = new SubprogramaC($id1.text, "void");
      }
      formal_paramlist[$sub]   // HEREDADO
      dec_s_paramlist[$sub]
      dcllist[$sub.getVariables(), new ArrayList<ConstanteC>()]
      sentlist[$sub.getSentencias()]
      END SUBROUTINE id2=IDENT
    ;

codfun returns[SubprogramaC fun]  : FUNCTION id1=IDENT
    {
        $fun = new SubprogramaC($id1.text,"");

    }'(' nomparamlist[$fun] ')' t=tipo '::' id_ret=IDENT
    {
      $fun.setTipoRetorno($t.t);
       if (!$id1.text.equals($id_ret.text)) {
        System.err.println("Error: El nombre de retorno no coincide con la función.");
       }

    }';' dec_f_paramlist[$fun] dcllist[$fun.getVariables(), new ArrayList<ConstanteC>()] fun_body[$fun] ;

fun_body[SubprogramaC fun]
    : CALL id=IDENT sp=subpparamlist ';'
    { $fun.getSentencias().add(new LlamadaC($id.text, $sp.args)); } fun_body[$fun]
    | id=IDENT '=' e=exp ';'
    { $fun.getSentencias().add(new AsignacionC($id.text, $e.val)); } fun_body_prime[$fun] ;

fun_body_prime[SubprogramaC fun] : END FUNCTION id2=IDENT
     {
        // Comprobamos usando el nombre que guardamos al principio en el objeto
        if (!$fun.getNombre().equals($id2.text)) {
            System.err.println("Error Semántico: El nombre del END FUNCTION no coincide.");
        }

     }
     | fun_body[$fun] ;

//PARTE OPCIONAL
expcond returns [String val]
    : fc=factorcond ecp=expcond_prime[$fc.val] { $val = $ecp.val; } ;

expcond_prime [String valHeredado] returns [String val]
    : o=oplog fc=factorcond ecp=expcond_prime[$valHeredado + " " + $o.val + " " + $fc.val]
      { $val = $ecp.val; }
    | { $val = $valHeredado; }
    ;

oplog returns [String val]
     : OR   { $val = "||"; }
     | AND  { $val = "&&"; }
     | EQV  { $val = "=="; }
     | NEQV { $val = "!="; }
     ;

factorcond returns [String val]
           : e1=exp oc=opcomp e2=exp { $val = $e1.val + " " + $oc.val + " " + $e2.val; }
           | '(' ec=expcond ')'      { $val = "(" + $ec.val + ")"; }
           | NOT fc=factorcond       { $val = "!" + $fc.val; }
           | TRUE                    { $val = "1"; }
           | FALSE                   { $val = "0"; }
           ;

opcomp returns [String val]
       : '<'  { $val = "<"; }
       | '>'  { $val = ">"; }
       | '<=' { $val = "<="; }
       | '>=' { $val = ">="; }
       | '==' { $val = "=="; }
       | '/=' { $val = "!="; }
       ;

// --- SENTENCIAS Y CONTROL DE FLUJO (LL1) ---

do_tail : WHILE '(' expcond ')' sentlist ENDDO
        | IDENT '=' doval ',' doval ',' doval sentlist ENDDO ;

if_tail : sent
        | THEN sentlist if_tail_prime ;

if_tail_prime : ENDIF
              | ELSE sentlist ENDIF ;

doval : NUM_INT_CONST
      | IDENT ;

casos : CASE casos_prime
      |  ;

casos_prime : '(' etiquetas ')' sentlist casos
            | DEFAULT sentlist ;

etiquetas : simpvalue etiquetas_tail
          | ':' simpvalue ;

etiquetas_tail : listaetiqetas
               | ':' etiquetas_tail_prime ;

etiquetas_tail_prime : simpvalue
                     |  ;

listaetiqetas : ',' simpvalue listaetiqetas
              | ;

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
STRING_CONST: ('\'' (~[\r\n])* '\'' | '"' (~[\r\n])* '"');
NUM_REAL_CONST: '-'? ([0-9]+'.'[0-9]+ | [0-9]+ [eE] '-'? [0-9]+ | [0-9]+'.'[0-9]+[eE]'-'?[0-9]+);
NUM_INT_CONST: '-'? [0-9]+ ;


IDENT : [a-zA-Z] [a-zA-Z0-9_]*;

COMMENT: '!' ~[\r\n]* -> skip;
LN : ('\r' | '\n' | '\r\n')+ -> skip;
WS : [ \t\f]+ -> skip;