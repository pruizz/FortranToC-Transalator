grammar Translator;

prg : PROGRAM IDENT ';' dcllist cabecera sentlist END PROGRAM IDENT subproglist ;

dcllist : dcl dcllist | ;

cabecera : INTERFACE cablist END INTERFACE | ;

cablist : decproc decsubprog | decfun decsubprog ;

decsubprog : decproc decsubprog | decfun decsubprog | ;

sentlist : sent sentlist_prime ;

sentlist_prime : sent sentlist_prime |  ;

dcl : tipo dcl_varcte ;

dcl_varcte : ',' PARAMETER '::' IDENT '=' simpvalue ctelist ';'
           | '::' varlist ';' ;

ctelist : ',' IDENT '=' simpvalue ctelist | ;

simpvalue : NUM_INT_CONST
          | NUM_REAL_CONST
          | STRING_CONST
          | NUM_INT_CONST_B
          | NUM_INT_CONST_O
          | NUM_INT_CONST_H ;

tipo : INTEGER
     | REAL
     | CHARACTER charlength ;

charlength : '(' NUM_INT_CONST ')'| ;

varlist : IDENT init varlist_prime ;

varlist_prime : ',' IDENT init varlist_prime | ;

init : '=' simpvalue | ;

decproc : SUBROUTINE IDENT formal_paramlist dec_s_paramlist END SUBROUTINE IDENT ;

formal_paramlist : '(' nomparamlist ')' | ;

nomparamlist : IDENT nomparamlist_prime ;

nomparamlist_prime : ',' nomparamlist | ;

dec_s_paramlist : tipo ',' INTENT '(' tipoparam ')' IDENT ';' dec_s_paramlist | ;

tipoparam : IN
          | OUT
          | INOUT ;

decfun : FUNCTION IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist END FUNCTION IDENT;

dec_f_paramlist : dec_f_paramlist_prime ;

dec_f_paramlist_prime : tipo ',' INTENT '(' IN ')' IDENT ';' dec_f_paramlist_prime | ;

sent : IDENT '=' exp ';'
     | proc_call ';' ;

exp : factor exp_prime ;

exp_prime : op factor exp_prime | ;

op : oparit ;

oparit : '+' | '-' | '*' | '/' ;

factor : simpvalue
       | '(' exp ')'
       | IDENT factor_prime ;

factor_prime : '(' exp explist ')' | ;

explist : ',' exp explist | ;

proc_call : CALL IDENT subpparamlist ;

subpparamlist : '(' exp explist ')' | ;

subproglist : codproc subproglist | codfun subproglist | ;

codproc : SUBROUTINE IDENT formal_paramlist dec_s_paramlist dcllist sentlist END SUBROUTINE IDENT ;

codfun : FUNCTION IDENT '(' nomparamlist ')' tipo '::' IDENT ';' dec_f_paramlist dcllist fun_body ;

fun_body : CALL IDENT subpparamlist ';' fun_body
         | IDENT '=' exp ';' fun_body_prime ;

fun_body_prime : END FUNCTION IDENT
               | fun_body ;

//PARTE OPCIONAL
expcond : factorcond expcond_prime ;
expcond_prime : oplog factorcond expcond_prime
                | ;
oplog: OR
     | AND
     | EQV
     | NEQV ;


//TODO: NO ES LL(1), la cab'(exp) tiene '(' así que hay que hacer transformaciones
factorcond : exp opcomp exp
           | '(' expcond ')'
           | NOT factorcond
           | TRUE
           | FALSE ;

opcomp : '<'
       | '>'
       | '<='
       | '>='
       | '=='
       | '/=' ;


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

STRING_CONST: ('\'' (~[\r\n])* '\'' | '"' (~[\r\n])* '"');
IDENT : [a-zA-Z] [a-zA-Z0-9_]*;
NUM_REAL_CONST: '-'? ([0-9]+'.'[0-9]+ | [0-9]+ [eE] '-'? [0-9]+ | [0-9]+'.'[0-9]+[eE]'-'?[0-9]+);
NUM_INT_CONST: '-'? [0-9]+ ;

//PARTE OPCIONAL
NUM_INT_CONST_B : 'b' '\'' [01]+ '\'';
NUM_INT_CONST_O : 'o' '\'' [0-7]+ '\'' ;
NUM_INT_CONST_H : 'z' '\'' [0-9a-fA-F]+ '\'' ;
TRUE: '.TRUE.' ;
FALSE: '.FALSE.' ;
OR : '.OR.' ;
AND : '.AND.' ;
EQV : '.EQV.' ;
NEQV : '.NEQV.' ;
NOT : '.NOT.' ;

COMMENT: '!' ~[\r\n]* -> skip;
LN : ('\r' | '\n' | '\r\n')+ -> skip;
WS : [ \t\f]+ -> skip;


