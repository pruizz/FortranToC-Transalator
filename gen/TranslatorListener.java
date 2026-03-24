// Generated from /Users/zskyh/university/third-year/second-term/procesadores/FortranToCTranslator/src/Translator.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TranslatorParser}.
 */
public interface TranslatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#prg}.
	 * @param ctx the parse tree
	 */
	void enterPrg(TranslatorParser.PrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#prg}.
	 * @param ctx the parse tree
	 */
	void exitPrg(TranslatorParser.PrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void enterDcllist(TranslatorParser.DcllistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#dcllist}.
	 * @param ctx the parse tree
	 */
	void exitDcllist(TranslatorParser.DcllistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void enterCabecera(TranslatorParser.CabeceraContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#cabecera}.
	 * @param ctx the parse tree
	 */
	void exitCabecera(TranslatorParser.CabeceraContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#cablist}.
	 * @param ctx the parse tree
	 */
	void enterCablist(TranslatorParser.CablistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#cablist}.
	 * @param ctx the parse tree
	 */
	void exitCablist(TranslatorParser.CablistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void enterDecsubprog(TranslatorParser.DecsubprogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#decsubprog}.
	 * @param ctx the parse tree
	 */
	void exitDecsubprog(TranslatorParser.DecsubprogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void enterSentlist(TranslatorParser.SentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#sentlist}.
	 * @param ctx the parse tree
	 */
	void exitSentlist(TranslatorParser.SentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#sentlist_prime}.
	 * @param ctx the parse tree
	 */
	void enterSentlist_prime(TranslatorParser.Sentlist_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#sentlist_prime}.
	 * @param ctx the parse tree
	 */
	void exitSentlist_prime(TranslatorParser.Sentlist_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#dcl}.
	 * @param ctx the parse tree
	 */
	void enterDcl(TranslatorParser.DclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#dcl}.
	 * @param ctx the parse tree
	 */
	void exitDcl(TranslatorParser.DclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#dcl_varcte}.
	 * @param ctx the parse tree
	 */
	void enterDcl_varcte(TranslatorParser.Dcl_varcteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#dcl_varcte}.
	 * @param ctx the parse tree
	 */
	void exitDcl_varcte(TranslatorParser.Dcl_varcteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void enterCtelist(TranslatorParser.CtelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#ctelist}.
	 * @param ctx the parse tree
	 */
	void exitCtelist(TranslatorParser.CtelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void enterSimpvalue(TranslatorParser.SimpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#simpvalue}.
	 * @param ctx the parse tree
	 */
	void exitSimpvalue(TranslatorParser.SimpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(TranslatorParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(TranslatorParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#charlength}.
	 * @param ctx the parse tree
	 */
	void enterCharlength(TranslatorParser.CharlengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#charlength}.
	 * @param ctx the parse tree
	 */
	void exitCharlength(TranslatorParser.CharlengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(TranslatorParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(TranslatorParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#varlist_prime}.
	 * @param ctx the parse tree
	 */
	void enterVarlist_prime(TranslatorParser.Varlist_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#varlist_prime}.
	 * @param ctx the parse tree
	 */
	void exitVarlist_prime(TranslatorParser.Varlist_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(TranslatorParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(TranslatorParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#decproc}.
	 * @param ctx the parse tree
	 */
	void enterDecproc(TranslatorParser.DecprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#decproc}.
	 * @param ctx the parse tree
	 */
	void exitDecproc(TranslatorParser.DecprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterFormal_paramlist(TranslatorParser.Formal_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#formal_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitFormal_paramlist(TranslatorParser.Formal_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist(TranslatorParser.NomparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#nomparamlist}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist(TranslatorParser.NomparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#nomparamlist_prime}.
	 * @param ctx the parse tree
	 */
	void enterNomparamlist_prime(TranslatorParser.Nomparamlist_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#nomparamlist_prime}.
	 * @param ctx the parse tree
	 */
	void exitNomparamlist_prime(TranslatorParser.Nomparamlist_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_s_paramlist(TranslatorParser.Dec_s_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_s_paramlist(TranslatorParser.Dec_s_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void enterTipoparam(TranslatorParser.TipoparamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#tipoparam}.
	 * @param ctx the parse tree
	 */
	void exitTipoparam(TranslatorParser.TipoparamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#decfun}.
	 * @param ctx the parse tree
	 */
	void enterDecfun(TranslatorParser.DecfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#decfun}.
	 * @param ctx the parse tree
	 */
	void exitDecfun(TranslatorParser.DecfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist(TranslatorParser.Dec_f_paramlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist(TranslatorParser.Dec_f_paramlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#dec_f_paramlist_prime}.
	 * @param ctx the parse tree
	 */
	void enterDec_f_paramlist_prime(TranslatorParser.Dec_f_paramlist_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#dec_f_paramlist_prime}.
	 * @param ctx the parse tree
	 */
	void exitDec_f_paramlist_prime(TranslatorParser.Dec_f_paramlist_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#sent}.
	 * @param ctx the parse tree
	 */
	void enterSent(TranslatorParser.SentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#sent}.
	 * @param ctx the parse tree
	 */
	void exitSent(TranslatorParser.SentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(TranslatorParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(TranslatorParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#exp_prime}.
	 * @param ctx the parse tree
	 */
	void enterExp_prime(TranslatorParser.Exp_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#exp_prime}.
	 * @param ctx the parse tree
	 */
	void exitExp_prime(TranslatorParser.Exp_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(TranslatorParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(TranslatorParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#oparit}.
	 * @param ctx the parse tree
	 */
	void enterOparit(TranslatorParser.OparitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#oparit}.
	 * @param ctx the parse tree
	 */
	void exitOparit(TranslatorParser.OparitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TranslatorParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TranslatorParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#factor_prime}.
	 * @param ctx the parse tree
	 */
	void enterFactor_prime(TranslatorParser.Factor_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#factor_prime}.
	 * @param ctx the parse tree
	 */
	void exitFactor_prime(TranslatorParser.Factor_primeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#explist}.
	 * @param ctx the parse tree
	 */
	void enterExplist(TranslatorParser.ExplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#explist}.
	 * @param ctx the parse tree
	 */
	void exitExplist(TranslatorParser.ExplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void enterProc_call(TranslatorParser.Proc_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#proc_call}.
	 * @param ctx the parse tree
	 */
	void exitProc_call(TranslatorParser.Proc_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void enterSubpparamlist(TranslatorParser.SubpparamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#subpparamlist}.
	 * @param ctx the parse tree
	 */
	void exitSubpparamlist(TranslatorParser.SubpparamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void enterSubproglist(TranslatorParser.SubproglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#subproglist}.
	 * @param ctx the parse tree
	 */
	void exitSubproglist(TranslatorParser.SubproglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#codproc}.
	 * @param ctx the parse tree
	 */
	void enterCodproc(TranslatorParser.CodprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#codproc}.
	 * @param ctx the parse tree
	 */
	void exitCodproc(TranslatorParser.CodprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#codfun}.
	 * @param ctx the parse tree
	 */
	void enterCodfun(TranslatorParser.CodfunContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#codfun}.
	 * @param ctx the parse tree
	 */
	void exitCodfun(TranslatorParser.CodfunContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#fun_body}.
	 * @param ctx the parse tree
	 */
	void enterFun_body(TranslatorParser.Fun_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#fun_body}.
	 * @param ctx the parse tree
	 */
	void exitFun_body(TranslatorParser.Fun_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TranslatorParser#fun_body_prime}.
	 * @param ctx the parse tree
	 */
	void enterFun_body_prime(TranslatorParser.Fun_body_primeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TranslatorParser#fun_body_prime}.
	 * @param ctx the parse tree
	 */
	void exitFun_body_prime(TranslatorParser.Fun_body_primeContext ctx);
}