// Generated from /Users/zskyh/university/third-year/second-term/procesadores/FortranToCTranslator/src/Translator.g4 by ANTLR 4.13.2

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TranslatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TranslatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#prg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrg(TranslatorParser.PrgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#dcllist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcllist(TranslatorParser.DcllistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#cabecera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCabecera(TranslatorParser.CabeceraContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#cablist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCablist(TranslatorParser.CablistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#decsubprog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecsubprog(TranslatorParser.DecsubprogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#sentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist(TranslatorParser.SentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#sentlist_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentlist_prime(TranslatorParser.Sentlist_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl(TranslatorParser.DclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#dcl_varcte}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_varcte(TranslatorParser.Dcl_varcteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#ctelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtelist(TranslatorParser.CtelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#simpvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpvalue(TranslatorParser.SimpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(TranslatorParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#charlength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharlength(TranslatorParser.CharlengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#varlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist(TranslatorParser.VarlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#varlist_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlist_prime(TranslatorParser.Varlist_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(TranslatorParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#decproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecproc(TranslatorParser.DecprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#formal_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal_paramlist(TranslatorParser.Formal_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#nomparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist(TranslatorParser.NomparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#nomparamlist_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomparamlist_prime(TranslatorParser.Nomparamlist_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#dec_s_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_s_paramlist(TranslatorParser.Dec_s_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#tipoparam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoparam(TranslatorParser.TipoparamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#decfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecfun(TranslatorParser.DecfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#dec_f_paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_f_paramlist(TranslatorParser.Dec_f_paramlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#dec_f_paramlist_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_f_paramlist_prime(TranslatorParser.Dec_f_paramlist_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#sent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSent(TranslatorParser.SentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(TranslatorParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#exp_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_prime(TranslatorParser.Exp_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(TranslatorParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#oparit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOparit(TranslatorParser.OparitContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(TranslatorParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#factor_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor_prime(TranslatorParser.Factor_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#explist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist(TranslatorParser.ExplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#proc_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_call(TranslatorParser.Proc_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#subpparamlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpparamlist(TranslatorParser.SubpparamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#explist_llamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplist_llamada(TranslatorParser.Explist_llamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#subproglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproglist(TranslatorParser.SubproglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#codproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodproc(TranslatorParser.CodprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#codfun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodfun(TranslatorParser.CodfunContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#fun_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_body(TranslatorParser.Fun_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#fun_body_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_body_prime(TranslatorParser.Fun_body_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#expcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond(TranslatorParser.ExpcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#expcond_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpcond_prime(TranslatorParser.Expcond_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#oplog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOplog(TranslatorParser.OplogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#factorcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorcond(TranslatorParser.FactorcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#opcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcomp(TranslatorParser.OpcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#do_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_tail(TranslatorParser.Do_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#if_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tail(TranslatorParser.If_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#if_tail_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tail_prime(TranslatorParser.If_tail_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#doval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoval(TranslatorParser.DovalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#casos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos(TranslatorParser.CasosContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#casos_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos_prime(TranslatorParser.Casos_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#etiquetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetas(TranslatorParser.EtiquetasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#etiquetas_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetas_tail(TranslatorParser.Etiquetas_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#etiquetas_tail_prime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetas_tail_prime(TranslatorParser.Etiquetas_tail_primeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TranslatorParser#listaetiqetas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaetiqetas(TranslatorParser.ListaetiqetasContext ctx);
}