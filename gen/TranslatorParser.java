// Generated from /Users/zskyh/university/third-year/second-term/procesadores/FortranToCTranslator/src/Translator.g4 by ANTLR 4.13.2

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TranslatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		PROGRAM=18, END=19, INTERFACE=20, SUBROUTINE=21, FUNCTION=22, INTEGER=23, 
		REAL=24, CHARACTER=25, PARAMETER=26, INTENT=27, IN=28, OUT=29, INOUT=30, 
		CALL=31, IF=32, DO=33, SELECT=34, CASE=35, WHILE=36, ENDDO=37, THEN=38, 
		ENDIF=39, ELSE=40, DEFAULT=41, TRUE=42, FALSE=43, OR=44, AND=45, EQV=46, 
		NEQV=47, NOT=48, NUM_INT_CONST_B=49, NUM_INT_CONST_O=50, NUM_INT_CONST_H=51, 
		STRING_CONST=52, NUM_REAL_CONST=53, NUM_INT_CONST=54, IDENT=55, COMMENT=56, 
		LN=57, WS=58;
	public static final int
		RULE_prg = 0, RULE_dcllist = 1, RULE_cabecera = 2, RULE_cablist = 3, RULE_decsubprog = 4, 
		RULE_sentlist = 5, RULE_sentlist_prime = 6, RULE_dcl = 7, RULE_dcl_varcte = 8, 
		RULE_ctelist = 9, RULE_simpvalue = 10, RULE_tipo = 11, RULE_charlength = 12, 
		RULE_varlist = 13, RULE_varlist_prime = 14, RULE_init = 15, RULE_decproc = 16, 
		RULE_formal_paramlist = 17, RULE_nomparamlist = 18, RULE_nomparamlist_prime = 19, 
		RULE_dec_s_paramlist = 20, RULE_tipoparam = 21, RULE_decfun = 22, RULE_dec_f_paramlist = 23, 
		RULE_dec_f_paramlist_prime = 24, RULE_sent = 25, RULE_exp = 26, RULE_exp_prime = 27, 
		RULE_op = 28, RULE_oparit = 29, RULE_factor = 30, RULE_factor_prime = 31, 
		RULE_explist = 32, RULE_proc_call = 33, RULE_subpparamlist = 34, RULE_explist_llamada = 35, 
		RULE_subproglist = 36, RULE_codproc = 37, RULE_codfun = 38, RULE_fun_body = 39, 
		RULE_fun_body_prime = 40, RULE_expcond = 41, RULE_expcond_prime = 42, 
		RULE_oplog = 43, RULE_factorcond = 44, RULE_opcomp = 45, RULE_do_tail = 46, 
		RULE_if_tail = 47, RULE_if_tail_prime = 48, RULE_doval = 49, RULE_casos = 50, 
		RULE_casos_prime = 51, RULE_etiquetas = 52, RULE_etiquetas_tail = 53, 
		RULE_etiquetas_tail_prime = 54, RULE_listaetiqetas = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "sentlist_prime", 
			"dcl", "dcl_varcte", "ctelist", "simpvalue", "tipo", "charlength", "varlist", 
			"varlist_prime", "init", "decproc", "formal_paramlist", "nomparamlist", 
			"nomparamlist_prime", "dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", 
			"dec_f_paramlist_prime", "sent", "exp", "exp_prime", "op", "oparit", 
			"factor", "factor_prime", "explist", "proc_call", "subpparamlist", "explist_llamada", 
			"subproglist", "codproc", "codfun", "fun_body", "fun_body_prime", "expcond", 
			"expcond_prime", "oplog", "factorcond", "opcomp", "do_tail", "if_tail", 
			"if_tail_prime", "doval", "casos", "casos_prime", "etiquetas", "etiquetas_tail", 
			"etiquetas_tail_prime", "listaetiqetas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'::'", "'='", "'('", "')'", "'+'", "'-'", "'*'", 
			"'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'/='", "':'", "'PROGRAM'", 
			"'END'", "'INTERFACE'", "'SUBROUTINE'", "'FUNCTION'", "'INTEGER'", "'REAL'", 
			"'CHARACTER'", "'PARAMETER'", "'INTENT'", "'IN'", "'OUT'", "'INOUT'", 
			"'CALL'", "'IF'", "'DO'", "'SELECT'", "'CASE'", "'WHILE'", "'ENDDO'", 
			"'THEN'", "'ENDIF'", "'ELSE'", "'DEFAULT'", "'.TRUE.'", "'.FALSE.'", 
			"'.OR.'", "'.AND.'", "'.EQV.'", "'.NEQV.'", "'.NOT.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "PROGRAM", "END", "INTERFACE", "SUBROUTINE", 
			"FUNCTION", "INTEGER", "REAL", "CHARACTER", "PARAMETER", "INTENT", "IN", 
			"OUT", "INOUT", "CALL", "IF", "DO", "SELECT", "CASE", "WHILE", "ENDDO", 
			"THEN", "ENDIF", "ELSE", "DEFAULT", "TRUE", "FALSE", "OR", "AND", "EQV", 
			"NEQV", "NOT", "NUM_INT_CONST_B", "NUM_INT_CONST_O", "NUM_INT_CONST_H", 
			"STRING_CONST", "NUM_REAL_CONST", "NUM_INT_CONST", "IDENT", "COMMENT", 
			"LN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Translator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public TranslatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public String codigoC;
		public Token id1;
		public Token id2;
		public List<TerminalNode> PROGRAM() { return getTokens(TranslatorParser.PROGRAM); }
		public TerminalNode PROGRAM(int i) {
			return getToken(TranslatorParser.PROGRAM, i);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public CabeceraContext cabecera() {
			return getRuleContext(CabeceraContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public PrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterPrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitPrg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitPrg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrgContext prg() throws RecognitionException {
		PrgContext _localctx = new PrgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prg);

		        ProgramaC programa = new ProgramaC();
		        this.programaGlobal = programa;
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(PROGRAM);
			setState(113);
			((PrgContext)_localctx).id1 = match(IDENT);
			setState(114);
			match(T__0);
			setState(115);
			dcllist(programa.getVariablesMain(), programa.getConstantes());
			setState(116);
			cabecera(programa.getInterfaces());
			setState(117);
			sentlist(programa.getSentenciasMain());
			setState(118);
			match(END);
			setState(119);
			match(PROGRAM);
			setState(120);
			((PrgContext)_localctx).id2 = match(IDENT);
			setState(121);
			subproglist(programa.getImplementaciones());

			        if (!(((PrgContext)_localctx).id1!=null?((PrgContext)_localctx).id1.getText():null).equals((((PrgContext)_localctx).id2!=null?((PrgContext)_localctx).id2.getText():null))) {
			            notifyErrorListeners(((PrgContext)_localctx).id2, "Error Semántico: El nombre del PROGRAM no coincide.", null);
			        } else {
			            ((PrgContext)_localctx).codigoC =  programa.generarCodigo(0);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DcllistContext extends ParserRuleContext {
		public List<VariableC> vars;
		public List<ConstanteC> consts;
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DcllistContext(ParserRuleContext parent, int invokingState, List<VariableC> vars, List<ConstanteC> consts) {
			super(parent, invokingState);
			this.vars = vars;
			this.consts = consts;
		}
		@Override public int getRuleIndex() { return RULE_dcllist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDcllist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDcllist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDcllist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DcllistContext dcllist(List<VariableC> vars,List<ConstanteC> consts) throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState(), vars, consts);
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				dcl(_localctx.vars,_localctx.consts);
				setState(125);
				dcllist(_localctx.vars, _localctx.consts);
				}
				break;
			case INTERFACE:
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CabeceraContext extends ParserRuleContext {
		public List<SubprogramaC> interfaces;
		public List<TerminalNode> INTERFACE() { return getTokens(TranslatorParser.INTERFACE); }
		public TerminalNode INTERFACE(int i) {
			return getToken(TranslatorParser.INTERFACE, i);
		}
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public CabeceraContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CabeceraContext(ParserRuleContext parent, int invokingState, List<SubprogramaC> interfaces) {
			super(parent, invokingState);
			this.interfaces = interfaces;
		}
		@Override public int getRuleIndex() { return RULE_cabecera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCabecera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCabecera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCabecera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CabeceraContext cabecera(List<SubprogramaC> interfaces) throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState(), interfaces);
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(INTERFACE);
				setState(131);
				cablist(_localctx.interfaces);
				setState(132);
				match(END);
				setState(133);
				match(INTERFACE);
				}
				break;
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CablistContext extends ParserRuleContext {
		public List<SubprogramaC> interfaces;
		public DecprocContext dp;
		public DecfunContext df;
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CablistContext(ParserRuleContext parent, int invokingState, List<SubprogramaC> interfaces) {
			super(parent, invokingState);
			this.interfaces = interfaces;
		}
		@Override public int getRuleIndex() { return RULE_cablist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCablist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCablist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCablist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CablistContext cablist(List<SubprogramaC> interfaces) throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState(), interfaces);
		enterRule(_localctx, 6, RULE_cablist);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((CablistContext)_localctx).dp = decproc();
				 _localctx.interfaces.add(((CablistContext)_localctx).dp.sub); 
				setState(140);
				decsubprog(_localctx.interfaces);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				((CablistContext)_localctx).df = decfun();
				 _localctx.interfaces.add(((CablistContext)_localctx).df.fun); 
				setState(144);
				decsubprog(_localctx.interfaces);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecsubprogContext extends ParserRuleContext {
		public List<SubprogramaC> interfaces;
		public DecprocContext dp;
		public DecfunContext df;
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DecsubprogContext(ParserRuleContext parent, int invokingState, List<SubprogramaC> interfaces) {
			super(parent, invokingState);
			this.interfaces = interfaces;
		}
		@Override public int getRuleIndex() { return RULE_decsubprog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDecsubprog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDecsubprog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDecsubprog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecsubprogContext decsubprog(List<SubprogramaC> interfaces) throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState(), interfaces);
		enterRule(_localctx, 8, RULE_decsubprog);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				((DecsubprogContext)_localctx).dp = decproc();
				 _localctx.interfaces.add(((DecsubprogContext)_localctx).dp.sub); 
				setState(150);
				decsubprog(_localctx.interfaces);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				((DecsubprogContext)_localctx).df = decfun();
				 _localctx.interfaces.add(((DecsubprogContext)_localctx).df.fun); 
				setState(154);
				decsubprog(_localctx.interfaces);
				}
				break;
			case END:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentlistContext extends ParserRuleContext {
		public List<SentenciaC> sents;
		public SentContext s;
		public Sentlist_primeContext sentlist_prime() {
			return getRuleContext(Sentlist_primeContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SentlistContext(ParserRuleContext parent, int invokingState, List<SentenciaC> sents) {
			super(parent, invokingState);
			this.sents = sents;
		}
		@Override public int getRuleIndex() { return RULE_sentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterSentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitSentlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitSentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentlistContext sentlist(List<SentenciaC> sents) throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState(), sents);
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((SentlistContext)_localctx).s = sent();
			 if(((SentlistContext)_localctx).s.sentVal != null) _localctx.sents.add(((SentlistContext)_localctx).s.sentVal); 
			setState(161);
			sentlist_prime(_localctx.sents);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Sentlist_primeContext extends ParserRuleContext {
		public List<SentenciaC> sents;
		public SentContext s;
		public Sentlist_primeContext sentlist_prime() {
			return getRuleContext(Sentlist_primeContext.class,0);
		}
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Sentlist_primeContext(ParserRuleContext parent, int invokingState, List<SentenciaC> sents) {
			super(parent, invokingState);
			this.sents = sents;
		}
		@Override public int getRuleIndex() { return RULE_sentlist_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterSentlist_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitSentlist_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitSentlist_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentlist_primeContext sentlist_prime(List<SentenciaC> sents) throws RecognitionException {
		Sentlist_primeContext _localctx = new Sentlist_primeContext(_ctx, getState(), sents);
		enterRule(_localctx, 12, RULE_sentlist_prime);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((Sentlist_primeContext)_localctx).s = sent();
				 if(((Sentlist_primeContext)_localctx).s.sentVal != null) _localctx.sents.add(((Sentlist_primeContext)_localctx).s.sentVal); 
				setState(165);
				sentlist_prime(_localctx.sents);
				}
				break;
			case END:
			case CASE:
			case ENDDO:
			case ENDIF:
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DclContext extends ParserRuleContext {
		public List<VariableC> vars;
		public List<ConstanteC> consts;
		public TipoContext t;
		public Dcl_varcteContext dcl_varcte() {
			return getRuleContext(Dcl_varcteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DclContext(ParserRuleContext parent, int invokingState, List<VariableC> vars, List<ConstanteC> consts) {
			super(parent, invokingState);
			this.vars = vars;
			this.consts = consts;
		}
		@Override public int getRuleIndex() { return RULE_dcl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDcl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDcl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclContext dcl(List<VariableC> vars,List<ConstanteC> consts) throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState(), vars, consts);
		enterRule(_localctx, 14, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((DclContext)_localctx).t = tipo();
			setState(171);
			dcl_varcte(((DclContext)_localctx).t.t, _localctx.vars, _localctx.consts);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dcl_varcteContext extends ParserRuleContext {
		public String tipoBase;
		public List<VariableC> vars;
		public List<ConstanteC> consts;
		public Token id;
		public SimpvalueContext v;
		public TerminalNode PARAMETER() { return getToken(TranslatorParser.PARAMETER, 0); }
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Dcl_varcteContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dcl_varcteContext(ParserRuleContext parent, int invokingState, String tipoBase, List<VariableC> vars, List<ConstanteC> consts) {
			super(parent, invokingState);
			this.tipoBase = tipoBase;
			this.vars = vars;
			this.consts = consts;
		}
		@Override public int getRuleIndex() { return RULE_dcl_varcte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDcl_varcte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDcl_varcte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDcl_varcte(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_varcteContext dcl_varcte(String tipoBase,List<VariableC> vars,List<ConstanteC> consts) throws RecognitionException {
		Dcl_varcteContext _localctx = new Dcl_varcteContext(_ctx, getState(), tipoBase, vars, consts);
		enterRule(_localctx, 16, RULE_dcl_varcte);
		try {
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__1);
				setState(174);
				match(PARAMETER);
				setState(175);
				match(T__2);
				setState(176);
				((Dcl_varcteContext)_localctx).id = match(IDENT);
				setState(177);
				match(T__3);
				setState(178);
				((Dcl_varcteContext)_localctx).v = simpvalue();
				 _localctx.consts.add(new ConstanteC(_localctx.tipoBase, (((Dcl_varcteContext)_localctx).id!=null?((Dcl_varcteContext)_localctx).id.getText():null), ((Dcl_varcteContext)_localctx).v.val)); 
				setState(180);
				ctelist(_localctx.tipoBase, _localctx.consts);
				setState(181);
				match(T__0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__2);
				setState(184);
				varlist(_localctx.tipoBase, _localctx.vars);
				setState(185);
				match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CtelistContext extends ParserRuleContext {
		public String tipoBase;
		public List<ConstanteC> consts;
		public Token id;
		public SimpvalueContext v;
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CtelistContext(ParserRuleContext parent, int invokingState, String tipoBase, List<ConstanteC> consts) {
			super(parent, invokingState);
			this.tipoBase = tipoBase;
			this.consts = consts;
		}
		@Override public int getRuleIndex() { return RULE_ctelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCtelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCtelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCtelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtelistContext ctelist(String tipoBase,List<ConstanteC> consts) throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState(), tipoBase, consts);
		enterRule(_localctx, 18, RULE_ctelist);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(T__1);
				setState(190);
				((CtelistContext)_localctx).id = match(IDENT);
				setState(191);
				match(T__3);
				setState(192);
				((CtelistContext)_localctx).v = simpvalue();
				 _localctx.consts.add(new ConstanteC(_localctx.tipoBase, (((CtelistContext)_localctx).id!=null?((CtelistContext)_localctx).id.getText():null), ((CtelistContext)_localctx).v.val)); 
				setState(194);
				ctelist(_localctx.tipoBase, _localctx.consts);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpvalueContext extends ParserRuleContext {
		public String val;
		public Token NUM_INT_CONST;
		public Token NUM_REAL_CONST;
		public Token STRING_CONST;
		public Token NUM_INT_CONST_B;
		public Token NUM_INT_CONST_O;
		public Token NUM_INT_CONST_H;
		public TerminalNode NUM_INT_CONST() { return getToken(TranslatorParser.NUM_INT_CONST, 0); }
		public TerminalNode NUM_REAL_CONST() { return getToken(TranslatorParser.NUM_REAL_CONST, 0); }
		public TerminalNode STRING_CONST() { return getToken(TranslatorParser.STRING_CONST, 0); }
		public TerminalNode NUM_INT_CONST_B() { return getToken(TranslatorParser.NUM_INT_CONST_B, 0); }
		public TerminalNode NUM_INT_CONST_O() { return getToken(TranslatorParser.NUM_INT_CONST_O, 0); }
		public TerminalNode NUM_INT_CONST_H() { return getToken(TranslatorParser.NUM_INT_CONST_H, 0); }
		public SimpvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterSimpvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitSimpvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitSimpvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpvalueContext simpvalue() throws RecognitionException {
		SimpvalueContext _localctx = new SimpvalueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simpvalue);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((SimpvalueContext)_localctx).NUM_INT_CONST = match(NUM_INT_CONST);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_INT_CONST!=null?((SimpvalueContext)_localctx).NUM_INT_CONST.getText():null); 
				}
				break;
			case NUM_REAL_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((SimpvalueContext)_localctx).NUM_REAL_CONST = match(NUM_REAL_CONST);
				 ((SimpvalueContext)_localctx).val =  (((SimpvalueContext)_localctx).NUM_REAL_CONST!=null?((SimpvalueContext)_localctx).NUM_REAL_CONST.getText():null); 
				}
				break;
			case STRING_CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				((SimpvalueContext)_localctx).STRING_CONST = match(STRING_CONST);

				          String s = (((SimpvalueContext)_localctx).STRING_CONST!=null?((SimpvalueContext)_localctx).STRING_CONST.getText():null);
				          if (s.startsWith("'")) { s = "\"" + s.substring(1, s.length() - 1) + "\""; }
				          ((SimpvalueContext)_localctx).val =  s;
				      
				}
				break;
			case NUM_INT_CONST_B:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((SimpvalueContext)_localctx).NUM_INT_CONST_B = match(NUM_INT_CONST_B);
				 ((SimpvalueContext)_localctx).val =  "0b" + (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).substring(2, (((SimpvalueContext)_localctx).NUM_INT_CONST_B!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_B.getText():null).length() - 1); 
				}
				break;
			case NUM_INT_CONST_O:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				((SimpvalueContext)_localctx).NUM_INT_CONST_O = match(NUM_INT_CONST_O);
				 ((SimpvalueContext)_localctx).val =  "00" + (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).substring(2, (((SimpvalueContext)_localctx).NUM_INT_CONST_O!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_O.getText():null).length() - 1); 
				}
				break;
			case NUM_INT_CONST_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				((SimpvalueContext)_localctx).NUM_INT_CONST_H = match(NUM_INT_CONST_H);
				 ((SimpvalueContext)_localctx).val =  "0x" + (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null).substring(2, (((SimpvalueContext)_localctx).NUM_INT_CONST_H!=null?((SimpvalueContext)_localctx).NUM_INT_CONST_H.getText():null).length() - 1); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public String t;
		public CharlengthContext c;
		public TerminalNode INTEGER() { return getToken(TranslatorParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(TranslatorParser.REAL, 0); }
		public TerminalNode CHARACTER() { return getToken(TranslatorParser.CHARACTER, 0); }
		public CharlengthContext charlength() {
			return getRuleContext(CharlengthContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INTEGER);
				 ((TipoContext)_localctx).t =  "int"; 
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(REAL);
				 ((TipoContext)_localctx).t =  "float"; 
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(CHARACTER);
				setState(218);
				((TipoContext)_localctx).c = charlength();
				 ((TipoContext)_localctx).t =  "char" + ((TipoContext)_localctx).c.val; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharlengthContext extends ParserRuleContext {
		public String val;
		public Token n;
		public TerminalNode NUM_INT_CONST() { return getToken(TranslatorParser.NUM_INT_CONST, 0); }
		public CharlengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charlength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCharlength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCharlength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCharlength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharlengthContext charlength() throws RecognitionException {
		CharlengthContext _localctx = new CharlengthContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_charlength);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__4);
				setState(224);
				((CharlengthContext)_localctx).n = match(NUM_INT_CONST);
				setState(225);
				match(T__5);
				 ((CharlengthContext)_localctx).val =  "[" + (((CharlengthContext)_localctx).n!=null?((CharlengthContext)_localctx).n.getText():null) + "]"; 
				}
				break;
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				 ((CharlengthContext)_localctx).val =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public String tipoBase;
		public List<VariableC> vars;
		public Token id;
		public InitContext i;
		public Varlist_primeContext varlist_prime() {
			return getRuleContext(Varlist_primeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarlistContext(ParserRuleContext parent, int invokingState, String tipoBase, List<VariableC> vars) {
			super(parent, invokingState);
			this.tipoBase = tipoBase;
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist(String tipoBase,List<VariableC> vars) throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState(), tipoBase, vars);
		enterRule(_localctx, 26, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			((VarlistContext)_localctx).id = match(IDENT);
			setState(231);
			((VarlistContext)_localctx).i = init();
			 _localctx.vars.add(new VariableC(_localctx.tipoBase, (((VarlistContext)_localctx).id!=null?((VarlistContext)_localctx).id.getText():null), ((VarlistContext)_localctx).i.val)); 
			setState(233);
			varlist_prime(_localctx.tipoBase, _localctx.vars);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Varlist_primeContext extends ParserRuleContext {
		public String tipoBase;
		public List<VariableC> vars;
		public Token id;
		public InitContext i;
		public Varlist_primeContext varlist_prime() {
			return getRuleContext(Varlist_primeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Varlist_primeContext(ParserRuleContext parent, int invokingState, String tipoBase, List<VariableC> vars) {
			super(parent, invokingState);
			this.tipoBase = tipoBase;
			this.vars = vars;
		}
		@Override public int getRuleIndex() { return RULE_varlist_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterVarlist_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitVarlist_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitVarlist_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varlist_primeContext varlist_prime(String tipoBase,List<VariableC> vars) throws RecognitionException {
		Varlist_primeContext _localctx = new Varlist_primeContext(_ctx, getState(), tipoBase, vars);
		enterRule(_localctx, 28, RULE_varlist_prime);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__1);
				setState(236);
				((Varlist_primeContext)_localctx).id = match(IDENT);
				setState(237);
				((Varlist_primeContext)_localctx).i = init();
				 _localctx.vars.add(new VariableC(_localctx.tipoBase, (((Varlist_primeContext)_localctx).id!=null?((Varlist_primeContext)_localctx).id.getText():null), ((Varlist_primeContext)_localctx).i.val)); 
				setState(239);
				varlist_prime(_localctx.tipoBase, _localctx.vars);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public String val;
		public SimpvalueContext v;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_init);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__3);
				setState(245);
				((InitContext)_localctx).v = simpvalue();
				 ((InitContext)_localctx).val =  ((InitContext)_localctx).v.val; 
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				 ((InitContext)_localctx).val =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecprocContext extends ParserRuleContext {
		public SubprogramaC sub;
		public Token id1;
		public Token id2;
		public List<TerminalNode> SUBROUTINE() { return getTokens(TranslatorParser.SUBROUTINE); }
		public TerminalNode SUBROUTINE(int i) {
			return getToken(TranslatorParser.SUBROUTINE, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public DecprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDecproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDecproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDecproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecprocContext decproc() throws RecognitionException {
		DecprocContext _localctx = new DecprocContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_decproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(SUBROUTINE);
			setState(252);
			((DecprocContext)_localctx).id1 = match(IDENT);
			 ((DecprocContext)_localctx).sub =  new SubprogramaC((((DecprocContext)_localctx).id1!=null?((DecprocContext)_localctx).id1.getText():null), "void"); 
			setState(254);
			formal_paramlist(_localctx.sub);
			setState(255);
			dec_s_paramlist(_localctx.sub);
			setState(256);
			match(END);
			setState(257);
			match(SUBROUTINE);
			setState(258);
			((DecprocContext)_localctx).id2 = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Formal_paramlistContext extends ParserRuleContext {
		public SubprogramaC sub;
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState, SubprogramaC sub) {
			super(parent, invokingState);
			this.sub = sub;
		}
		@Override public int getRuleIndex() { return RULE_formal_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterFormal_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitFormal_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitFormal_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_paramlistContext formal_paramlist(SubprogramaC sub) throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState(), sub);
		enterRule(_localctx, 34, RULE_formal_paramlist);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__4);
				setState(261);
				nomparamlist(_localctx.sub);
				setState(262);
				match(T__5);
				}
				break;
			case END:
			case INTEGER:
			case REAL:
			case CHARACTER:
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NomparamlistContext extends ParserRuleContext {
		public SubprogramaC sub;
		public Token id;
		public Nomparamlist_primeContext nomparamlist_prime() {
			return getRuleContext(Nomparamlist_primeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public NomparamlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NomparamlistContext(ParserRuleContext parent, int invokingState, SubprogramaC sub) {
			super(parent, invokingState);
			this.sub = sub;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterNomparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitNomparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitNomparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomparamlistContext nomparamlist(SubprogramaC sub) throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState(), sub);
		enterRule(_localctx, 36, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((NomparamlistContext)_localctx).id = match(IDENT);
			_localctx.sub.getParametros().add(new ParametroC("", (((NomparamlistContext)_localctx).id!=null?((NomparamlistContext)_localctx).id.getText():null), ""));
			setState(269);
			nomparamlist_prime(_localctx.sub);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nomparamlist_primeContext extends ParserRuleContext {
		public SubprogramaC sub;
		public Token id;
		public Nomparamlist_primeContext nomparamlist_prime() {
			return getRuleContext(Nomparamlist_primeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Nomparamlist_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Nomparamlist_primeContext(ParserRuleContext parent, int invokingState, SubprogramaC sub) {
			super(parent, invokingState);
			this.sub = sub;
		}
		@Override public int getRuleIndex() { return RULE_nomparamlist_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterNomparamlist_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitNomparamlist_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitNomparamlist_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nomparamlist_primeContext nomparamlist_prime(SubprogramaC sub) throws RecognitionException {
		Nomparamlist_primeContext _localctx = new Nomparamlist_primeContext(_ctx, getState(), sub);
		enterRule(_localctx, 38, RULE_nomparamlist_prime);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__1);
				setState(272);
				((Nomparamlist_primeContext)_localctx).id = match(IDENT);
				_localctx.sub.getParametros().add(new ParametroC("", (((Nomparamlist_primeContext)_localctx).id!=null?((Nomparamlist_primeContext)_localctx).id.getText():null), ""));
				setState(274);
				nomparamlist_prime(_localctx.sub);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_s_paramlistContext extends ParserRuleContext {
		public SubprogramaC sub;
		public TipoContext t;
		public TipoparamContext m;
		public Token id;
		public TerminalNode INTENT() { return getToken(TranslatorParser.INTENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState, SubprogramaC sub) {
			super(parent, invokingState);
			this.sub = sub;
		}
		@Override public int getRuleIndex() { return RULE_dec_s_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDec_s_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDec_s_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDec_s_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_s_paramlistContext dec_s_paramlist(SubprogramaC sub) throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState(), sub);
		enterRule(_localctx, 40, RULE_dec_s_paramlist);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((Dec_s_paramlistContext)_localctx).t = tipo();
				setState(279);
				match(T__1);
				setState(280);
				match(INTENT);
				setState(281);
				match(T__4);
				setState(282);
				((Dec_s_paramlistContext)_localctx).m = tipoparam();
				setState(283);
				match(T__5);
				setState(284);
				((Dec_s_paramlistContext)_localctx).id = match(IDENT);
				setState(285);
				match(T__0);

				        boolean correcto = _localctx.sub.actualizarParametro((((Dec_s_paramlistContext)_localctx).id!=null?((Dec_s_paramlistContext)_localctx).id.getText():null), ((Dec_s_paramlistContext)_localctx).t.t, ((Dec_s_paramlistContext)_localctx).m.m);
				        if (!correcto) { notifyErrorListeners(((Dec_s_paramlistContext)_localctx).id, "Error Semántico: El parámetro '" + (((Dec_s_paramlistContext)_localctx).id!=null?((Dec_s_paramlistContext)_localctx).id.getText():null) +  "' no coincide con el orden/nombre de la cabecera.", null); }
				      
				setState(287);
				dec_s_paramlist(_localctx.sub);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoparamContext extends ParserRuleContext {
		public String m;
		public TerminalNode IN() { return getToken(TranslatorParser.IN, 0); }
		public TerminalNode OUT() { return getToken(TranslatorParser.OUT, 0); }
		public TerminalNode INOUT() { return getToken(TranslatorParser.INOUT, 0); }
		public TipoparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterTipoparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitTipoparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitTipoparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoparamContext tipoparam() throws RecognitionException {
		TipoparamContext _localctx = new TipoparamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tipoparam);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				match(IN);
				 ((TipoparamContext)_localctx).m =  "IN"; 
				}
				break;
			case OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(OUT);
				 ((TipoparamContext)_localctx).m =  "OUT"; 
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				match(INOUT);
				 ((TipoparamContext)_localctx).m =  "INOUT"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecfunContext extends ParserRuleContext {
		public SubprogramaC fun;
		public Token id1;
		public TipoContext t;
		public Token id_ret;
		public List<TerminalNode> FUNCTION() { return getTokens(TranslatorParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(TranslatorParser.FUNCTION, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DecfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDecfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDecfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDecfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecfunContext decfun() throws RecognitionException {
		DecfunContext _localctx = new DecfunContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_decfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(FUNCTION);
			setState(301);
			((DecfunContext)_localctx).id1 = match(IDENT);
			 ((DecfunContext)_localctx).fun =  new SubprogramaC((((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null), ""); 
			setState(303);
			match(T__4);
			setState(304);
			nomparamlist(_localctx.fun);
			setState(305);
			match(T__5);
			setState(306);
			((DecfunContext)_localctx).t = tipo();
			setState(307);
			match(T__2);
			setState(308);
			((DecfunContext)_localctx).id_ret = match(IDENT);

			        _localctx.fun.setTipoRetorno(((DecfunContext)_localctx).t.t);
			        if (!(((DecfunContext)_localctx).id1!=null?((DecfunContext)_localctx).id1.getText():null).equals((((DecfunContext)_localctx).id_ret!=null?((DecfunContext)_localctx).id_ret.getText():null))) { notifyErrorListeners(((DecfunContext)_localctx).id_ret, "Error Semántico: El nombre de retorno no coincide con la función.", null); }
			    
			setState(310);
			match(T__0);
			setState(311);
			dec_f_paramlist(_localctx.fun);
			setState(312);
			match(END);
			setState(313);
			match(FUNCTION);
			setState(314);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_f_paramlistContext extends ParserRuleContext {
		public SubprogramaC fun;
		public Dec_f_paramlist_primeContext dec_f_paramlist_prime() {
			return getRuleContext(Dec_f_paramlist_primeContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState, SubprogramaC fun) {
			super(parent, invokingState);
			this.fun = fun;
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDec_f_paramlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDec_f_paramlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDec_f_paramlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_f_paramlistContext dec_f_paramlist(SubprogramaC fun) throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState(), fun);
		enterRule(_localctx, 46, RULE_dec_f_paramlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			dec_f_paramlist_prime(_localctx.fun);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dec_f_paramlist_primeContext extends ParserRuleContext {
		public SubprogramaC fun;
		public TipoContext t;
		public Token id;
		public TerminalNode INTENT() { return getToken(TranslatorParser.INTENT, 0); }
		public TerminalNode IN() { return getToken(TranslatorParser.IN, 0); }
		public Dec_f_paramlist_primeContext dec_f_paramlist_prime() {
			return getRuleContext(Dec_f_paramlist_primeContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Dec_f_paramlist_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Dec_f_paramlist_primeContext(ParserRuleContext parent, int invokingState, SubprogramaC fun) {
			super(parent, invokingState);
			this.fun = fun;
		}
		@Override public int getRuleIndex() { return RULE_dec_f_paramlist_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDec_f_paramlist_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDec_f_paramlist_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDec_f_paramlist_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_f_paramlist_primeContext dec_f_paramlist_prime(SubprogramaC fun) throws RecognitionException {
		Dec_f_paramlist_primeContext _localctx = new Dec_f_paramlist_primeContext(_ctx, getState(), fun);
		enterRule(_localctx, 48, RULE_dec_f_paramlist_prime);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				((Dec_f_paramlist_primeContext)_localctx).t = tipo();
				setState(319);
				match(T__1);
				setState(320);
				match(INTENT);
				setState(321);
				match(T__4);
				setState(322);
				match(IN);
				setState(323);
				match(T__5);
				setState(324);
				((Dec_f_paramlist_primeContext)_localctx).id = match(IDENT);
				setState(325);
				match(T__0);

				        boolean correcto = _localctx.fun.actualizarParametro((((Dec_f_paramlist_primeContext)_localctx).id!=null?((Dec_f_paramlist_primeContext)_localctx).id.getText():null), ((Dec_f_paramlist_primeContext)_localctx).t.t, "IN");
				        if (!correcto) { notifyErrorListeners(((Dec_f_paramlist_primeContext)_localctx).id, "Error Semántico: El parámetro '" + (((Dec_f_paramlist_primeContext)_localctx).id!=null?((Dec_f_paramlist_primeContext)_localctx).id.getText():null) +  "' no coincide con la cabecera.", null); }
				    
				setState(327);
				dec_f_paramlist_prime(_localctx.fun);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentContext extends ParserRuleContext {
		public SentenciaC sentVal;
		public Token id;
		public ExpContext e;
		public Proc_callContext pc;
		public ExpcondContext ec;
		public If_tailContext it;
		public Do_tailContext dt;
		public CasosContext c;
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public TerminalNode IF() { return getToken(TranslatorParser.IF, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public If_tailContext if_tail() {
			return getRuleContext(If_tailContext.class,0);
		}
		public TerminalNode DO() { return getToken(TranslatorParser.DO, 0); }
		public Do_tailContext do_tail() {
			return getRuleContext(Do_tailContext.class,0);
		}
		public List<TerminalNode> SELECT() { return getTokens(TranslatorParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(TranslatorParser.SELECT, i);
		}
		public TerminalNode CASE() { return getToken(TranslatorParser.CASE, 0); }
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public SentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterSent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitSent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitSent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentContext sent() throws RecognitionException {
		SentContext _localctx = new SentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_sent);
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((SentContext)_localctx).id = match(IDENT);
				setState(333);
				match(T__3);
				setState(334);
				((SentContext)_localctx).e = exp();
				setState(335);
				match(T__0);

				          AsignacionC asig = new AsignacionC((((SentContext)_localctx).id!=null?((SentContext)_localctx).id.getText():null), ((SentContext)_localctx).e.val);
				          if (esParametroReferencia((((SentContext)_localctx).id!=null?((SentContext)_localctx).id.getText():null))) asig.setEsPuntero(true);
				          ((SentContext)_localctx).sentVal =  asig;
				      
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				((SentContext)_localctx).pc = proc_call();
				setState(339);
				match(T__0);
				((SentContext)_localctx).sentVal =  ((SentContext)_localctx).pc.procCallVal ; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				match(IF);
				setState(343);
				match(T__4);
				setState(344);
				((SentContext)_localctx).ec = expcond();
				setState(345);
				match(T__5);
				setState(346);
				((SentContext)_localctx).it = if_tail(((SentContext)_localctx).ec.val);
				 ((SentContext)_localctx).sentVal =  ((SentContext)_localctx).it.ifObj; 
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				match(DO);
				setState(350);
				((SentContext)_localctx).dt = do_tail();
				 ((SentContext)_localctx).sentVal =  ((SentContext)_localctx).dt.doObj; 
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(353);
				match(SELECT);
				setState(354);
				match(CASE);
				setState(355);
				match(T__4);
				setState(356);
				((SentContext)_localctx).e = exp();
				setState(357);
				match(T__5);
				setState(358);
				((SentContext)_localctx).c = casos();
				setState(359);
				match(END);
				setState(360);
				match(SELECT);
				 ((SentContext)_localctx).sentVal =  new SelectCaseC(((SentContext)_localctx).e.val, ((SentContext)_localctx).c.listaCasos, ((SentContext)_localctx).c.listaDefault); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public String val;
		public FactorContext f;
		public Exp_primeContext ep;
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_primeContext exp_prime() {
			return getRuleContext(Exp_primeContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((ExpContext)_localctx).f = factor();
			setState(366);
			((ExpContext)_localctx).ep = exp_prime(((ExpContext)_localctx).f.val);
			 ((ExpContext)_localctx).val =  ((ExpContext)_localctx).ep.valSin; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_primeContext extends ParserRuleContext {
		public String valHeredado;
		public String valSin;
		public OpContext o;
		public FactorContext f;
		public Exp_primeContext ep;
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_primeContext exp_prime() {
			return getRuleContext(Exp_primeContext.class,0);
		}
		public Exp_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp_primeContext(ParserRuleContext parent, int invokingState, String valHeredado) {
			super(parent, invokingState);
			this.valHeredado = valHeredado;
		}
		@Override public int getRuleIndex() { return RULE_exp_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterExp_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitExp_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitExp_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_primeContext exp_prime(String valHeredado) throws RecognitionException {
		Exp_primeContext _localctx = new Exp_primeContext(_ctx, getState(), valHeredado);
		enterRule(_localctx, 54, RULE_exp_prime);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				((Exp_primeContext)_localctx).o = op();
				setState(370);
				((Exp_primeContext)_localctx).f = factor();
				setState(371);
				((Exp_primeContext)_localctx).ep = exp_prime(_localctx.valHeredado + " " + ((Exp_primeContext)_localctx).o.val + " " + ((Exp_primeContext)_localctx).f.val);
				 ((Exp_primeContext)_localctx).valSin =  ((Exp_primeContext)_localctx).ep.valSin; 
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case OR:
			case AND:
			case EQV:
			case NEQV:
				enterOuterAlt(_localctx, 2);
				{
				 ((Exp_primeContext)_localctx).valSin =  _localctx.valHeredado; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpContext extends ParserRuleContext {
		public String val;
		public OparitContext oparit;
		public OparitContext oparit() {
			return getRuleContext(OparitContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((OpContext)_localctx).oparit = oparit();
			 ((OpContext)_localctx).val =  (((OpContext)_localctx).oparit!=null?_input.getText(((OpContext)_localctx).oparit.start,((OpContext)_localctx).oparit.stop):null); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OparitContext extends ParserRuleContext {
		public OparitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oparit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterOparit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitOparit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitOparit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OparitContext oparit() throws RecognitionException {
		OparitContext _localctx = new OparitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_oparit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public String val;
		public SimpvalueContext s;
		public ExpContext e;
		public Token id;
		public Factor_primeContext fp;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Factor_primeContext factor_prime() {
			return getRuleContext(Factor_primeContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_factor);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case STRING_CONST:
			case NUM_REAL_CONST:
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				((FactorContext)_localctx).s = simpvalue();
				 ((FactorContext)_localctx).val =  ((FactorContext)_localctx).s.val; 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(T__4);
				setState(386);
				((FactorContext)_localctx).e = exp();
				setState(387);
				match(T__5);
				 ((FactorContext)_localctx).val =  "(" + ((FactorContext)_localctx).e.val + ")"; 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				((FactorContext)_localctx).id = match(IDENT);
				setState(391);
				((FactorContext)_localctx).fp = factor_prime();

				             String prefix = (((FactorContext)_localctx).id!=null?((FactorContext)_localctx).id.getText():null);
				             if (((FactorContext)_localctx).fp.val.isEmpty() && esParametroReferencia((((FactorContext)_localctx).id!=null?((FactorContext)_localctx).id.getText():null))) {
				                 prefix = "*" + prefix;
				             }
				             ((FactorContext)_localctx).val =  prefix + ((FactorContext)_localctx).fp.val;
				         
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_primeContext extends ParserRuleContext {
		public String val;
		public ExpContext e;
		public ExplistContext el;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public Factor_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterFactor_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitFactor_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitFactor_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factor_primeContext factor_prime() throws RecognitionException {
		Factor_primeContext _localctx = new Factor_primeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_factor_prime);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(396);
				match(T__4);
				setState(397);
				((Factor_primeContext)_localctx).e = exp();
				setState(398);
				((Factor_primeContext)_localctx).el = explist(((Factor_primeContext)_localctx).e.val);
				setState(399);
				match(T__5);
				 ((Factor_primeContext)_localctx).val =  "(" + ((Factor_primeContext)_localctx).el.val + ")"; 
				}
				break;
			case T__0:
			case T__1:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case OR:
			case AND:
			case EQV:
			case NEQV:
				enterOuterAlt(_localctx, 2);
				{
				 ((Factor_primeContext)_localctx).val =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExplistContext extends ParserRuleContext {
		public String valHeredado;
		public String val;
		public ExpContext e;
		public ExplistContext el;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExplistContext(ParserRuleContext parent, int invokingState, String valHeredado) {
			super(parent, invokingState);
			this.valHeredado = valHeredado;
		}
		@Override public int getRuleIndex() { return RULE_explist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterExplist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitExplist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitExplist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplistContext explist(String valHeredado) throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState(), valHeredado);
		enterRule(_localctx, 64, RULE_explist);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				match(T__1);
				setState(406);
				((ExplistContext)_localctx).e = exp();
				setState(407);
				((ExplistContext)_localctx).el = explist(_localctx.valHeredado + ", " + ((ExplistContext)_localctx).e.val);
				 ((ExplistContext)_localctx).val =  ((ExplistContext)_localctx).el.val; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				 ((ExplistContext)_localctx).val =  _localctx.valHeredado; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Proc_callContext extends ParserRuleContext {
		public LlamadaC procCallVal;
		public Token id;
		public SubpparamlistContext sp;
		public TerminalNode CALL() { return getToken(TranslatorParser.CALL, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Proc_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterProc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitProc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitProc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_callContext proc_call() throws RecognitionException {
		Proc_callContext _localctx = new Proc_callContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_proc_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(CALL);
			setState(414);
			((Proc_callContext)_localctx).id = match(IDENT);
			setState(415);
			((Proc_callContext)_localctx).sp = subpparamlist();

			          SubprogramaC funcDestino = buscarFuncionEnPrograma((((Proc_callContext)_localctx).id!=null?((Proc_callContext)_localctx).id.getText():null));
			          List<String> argsFinales = new ArrayList<String>();

			          for (int i = 0; i < ((Proc_callContext)_localctx).sp.args.size(); i++) {
			              String argumento = ((Proc_callContext)_localctx).sp.args.get(i);
			              if (funcDestino != null && i < funcDestino.getParametros().size()) {
			                  String modo = funcDestino.getParametros().get(i).getModo();
			                  if ("OUT".equalsIgnoreCase(modo) || "INOUT".equalsIgnoreCase(modo)) {
			                      argumento = "&" + argumento;
			                  }
			              }
			              argsFinales.add(argumento);
			          }
			          String argsCompilados = String.join(", ", argsFinales);
			          ((Proc_callContext)_localctx).procCallVal =  new LlamadaC((((Proc_callContext)_localctx).id!=null?((Proc_callContext)_localctx).id.getText():null), argsCompilados);
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubpparamlistContext extends ParserRuleContext {
		public List<String> args;
		public ExpContext e;
		public Explist_llamadaContext el;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist_llamadaContext explist_llamada() {
			return getRuleContext(Explist_llamadaContext.class,0);
		}
		public SubpparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subpparamlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterSubpparamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitSubpparamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitSubpparamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubpparamlistContext subpparamlist() throws RecognitionException {
		SubpparamlistContext _localctx = new SubpparamlistContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_subpparamlist);
		 ((SubpparamlistContext)_localctx).args =  new ArrayList<String>(); 
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(T__4);
				setState(419);
				((SubpparamlistContext)_localctx).e = exp();
				 _localctx.args.add(((SubpparamlistContext)_localctx).e.val); 
				setState(421);
				((SubpparamlistContext)_localctx).el = explist_llamada(_localctx.args);
				setState(422);
				match(T__5);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Explist_llamadaContext extends ParserRuleContext {
		public List<String> listaHeredada;
		public ExpContext e;
		public Explist_llamadaContext explist_llamada() {
			return getRuleContext(Explist_llamadaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Explist_llamadaContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Explist_llamadaContext(ParserRuleContext parent, int invokingState, List<String> listaHeredada) {
			super(parent, invokingState);
			this.listaHeredada = listaHeredada;
		}
		@Override public int getRuleIndex() { return RULE_explist_llamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterExplist_llamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitExplist_llamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitExplist_llamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Explist_llamadaContext explist_llamada(List<String> listaHeredada) throws RecognitionException {
		Explist_llamadaContext _localctx = new Explist_llamadaContext(_ctx, getState(), listaHeredada);
		enterRule(_localctx, 70, RULE_explist_llamada);
		try {
			setState(433);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(T__1);
				setState(428);
				((Explist_llamadaContext)_localctx).e = exp();
				 _localctx.listaHeredada.add(((Explist_llamadaContext)_localctx).e.val); 
				setState(430);
				explist_llamada(_localctx.listaHeredada);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubproglistContext extends ParserRuleContext {
		public List<SubprogramaC> implementaciones;
		public CodprocContext cp;
		public CodfunContext cf;
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SubproglistContext(ParserRuleContext parent, int invokingState, List<SubprogramaC> implementaciones) {
			super(parent, invokingState);
			this.implementaciones = implementaciones;
		}
		@Override public int getRuleIndex() { return RULE_subproglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterSubproglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitSubproglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitSubproglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubproglistContext subproglist(List<SubprogramaC> implementaciones) throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState(), implementaciones);
		enterRule(_localctx, 72, RULE_subproglist);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				((SubproglistContext)_localctx).cp = codproc();
				 _localctx.implementaciones.add(((SubproglistContext)_localctx).cp.sub); 
				setState(437);
				subproglist(_localctx.implementaciones);
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				((SubproglistContext)_localctx).cf = codfun();
				 _localctx.implementaciones.add(((SubproglistContext)_localctx).cf.fun); 
				setState(441);
				subproglist(_localctx.implementaciones);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodprocContext extends ParserRuleContext {
		public SubprogramaC sub;
		public Token id1;
		public Token id2;
		public List<TerminalNode> SUBROUTINE() { return getTokens(TranslatorParser.SUBROUTINE); }
		public TerminalNode SUBROUTINE(int i) {
			return getToken(TranslatorParser.SUBROUTINE, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public CodprocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codproc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCodproc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCodproc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCodproc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodprocContext codproc() throws RecognitionException {
		CodprocContext _localctx = new CodprocContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(SUBROUTINE);
			setState(447);
			((CodprocContext)_localctx).id1 = match(IDENT);

			          ((CodprocContext)_localctx).sub =  new SubprogramaC((((CodprocContext)_localctx).id1!=null?((CodprocContext)_localctx).id1.getText():null), "void");
			          this.subprogramaActual = _localctx.sub; // nos guardmaos el subprgrama actual que estamos reconociendo asi podremso identificar los parametros de entrad y salida
			      
			setState(449);
			formal_paramlist(_localctx.sub);
			setState(450);
			dec_s_paramlist(_localctx.sub);
			setState(451);
			dcllist(_localctx.sub.getVariables(), new ArrayList<ConstanteC>());
			setState(452);
			sentlist(_localctx.sub.getSentencias());
			setState(453);
			match(END);
			setState(454);
			match(SUBROUTINE);
			setState(455);
			((CodprocContext)_localctx).id2 = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CodfunContext extends ParserRuleContext {
		public SubprogramaC fun;
		public Token id1;
		public TipoContext t;
		public Token id_ret;
		public TerminalNode FUNCTION() { return getToken(TranslatorParser.FUNCTION, 0); }
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CodfunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codfun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCodfun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCodfun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCodfun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodfunContext codfun() throws RecognitionException {
		CodfunContext _localctx = new CodfunContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(FUNCTION);
			setState(458);
			((CodfunContext)_localctx).id1 = match(IDENT);

			        ((CodfunContext)_localctx).fun =  new SubprogramaC((((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null),"");
			        this.subprogramaActual = _localctx.fun; //Mismo caso para las funciones
			    
			setState(460);
			match(T__4);
			setState(461);
			nomparamlist(_localctx.fun);
			setState(462);
			match(T__5);
			setState(463);
			((CodfunContext)_localctx).t = tipo();
			setState(464);
			match(T__2);
			setState(465);
			((CodfunContext)_localctx).id_ret = match(IDENT);

			       _localctx.fun.setTipoRetorno(((CodfunContext)_localctx).t.t);
			       if (!(((CodfunContext)_localctx).id1!=null?((CodfunContext)_localctx).id1.getText():null).equals((((CodfunContext)_localctx).id_ret!=null?((CodfunContext)_localctx).id_ret.getText():null))) { notifyErrorListeners(((CodfunContext)_localctx).id_ret, "Error Semántico: El nombre de retorno no coincide con la función.", null); }
			    
			setState(467);
			match(T__0);
			setState(468);
			dec_f_paramlist(_localctx.fun);
			setState(469);
			dcllist(_localctx.fun.getVariables(), new ArrayList<ConstanteC>());
			setState(470);
			fun_body(_localctx.fun);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fun_bodyContext extends ParserRuleContext {
		public SubprogramaC fun;
		public Proc_callContext pc;
		public Token id;
		public ExpContext e;
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public Proc_callContext proc_call() {
			return getRuleContext(Proc_callContext.class,0);
		}
		public Fun_body_primeContext fun_body_prime() {
			return getRuleContext(Fun_body_primeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Fun_bodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Fun_bodyContext(ParserRuleContext parent, int invokingState, SubprogramaC fun) {
			super(parent, invokingState);
			this.fun = fun;
		}
		@Override public int getRuleIndex() { return RULE_fun_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterFun_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitFun_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitFun_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_bodyContext fun_body(SubprogramaC fun) throws RecognitionException {
		Fun_bodyContext _localctx = new Fun_bodyContext(_ctx, getState(), fun);
		enterRule(_localctx, 78, RULE_fun_body);
		try {
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				((Fun_bodyContext)_localctx).pc = proc_call();
				setState(473);
				match(T__0);
				 _localctx.fun.getSentencias().add(((Fun_bodyContext)_localctx).pc.procCallVal); 
				setState(475);
				fun_body(_localctx.fun);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				((Fun_bodyContext)_localctx).id = match(IDENT);
				setState(478);
				match(T__3);
				setState(479);
				((Fun_bodyContext)_localctx).e = exp();
				setState(480);
				match(T__0);

				          AsignacionC asig = new AsignacionC((((Fun_bodyContext)_localctx).id!=null?((Fun_bodyContext)_localctx).id.getText():null), ((Fun_bodyContext)_localctx).e.val);
				          if (esParametroReferencia((((Fun_bodyContext)_localctx).id!=null?((Fun_bodyContext)_localctx).id.getText():null))) asig.setEsPuntero(true);
				          _localctx.fun.getSentencias().add(asig);
				      
				setState(482);
				fun_body_prime(_localctx.fun);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fun_body_primeContext extends ParserRuleContext {
		public SubprogramaC fun;
		public Token id2;
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(TranslatorParser.FUNCTION, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public Fun_body_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Fun_body_primeContext(ParserRuleContext parent, int invokingState, SubprogramaC fun) {
			super(parent, invokingState);
			this.fun = fun;
		}
		@Override public int getRuleIndex() { return RULE_fun_body_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterFun_body_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitFun_body_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitFun_body_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_body_primeContext fun_body_prime(SubprogramaC fun) throws RecognitionException {
		Fun_body_primeContext _localctx = new Fun_body_primeContext(_ctx, getState(), fun);
		enterRule(_localctx, 80, RULE_fun_body_prime);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				match(END);
				setState(487);
				match(FUNCTION);
				setState(488);
				((Fun_body_primeContext)_localctx).id2 = match(IDENT);

				        if (!_localctx.fun.getNombre().equals((((Fun_body_primeContext)_localctx).id2!=null?((Fun_body_primeContext)_localctx).id2.getText():null))) { notifyErrorListeners(((Fun_body_primeContext)_localctx).id2, "Error Semántico: El nombre del END FUNCTION no coincide.", null); }
				     
				}
				break;
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				fun_body(_localctx.fun);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpcondContext extends ParserRuleContext {
		public String val;
		public FactorcondContext fc;
		public Expcond_primeContext ecp;
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_primeContext expcond_prime() {
			return getRuleContext(Expcond_primeContext.class,0);
		}
		public ExpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterExpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitExpcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitExpcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpcondContext expcond() throws RecognitionException {
		ExpcondContext _localctx = new ExpcondContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			((ExpcondContext)_localctx).fc = factorcond();
			setState(494);
			((ExpcondContext)_localctx).ecp = expcond_prime(((ExpcondContext)_localctx).fc.val);
			 ((ExpcondContext)_localctx).val =  ((ExpcondContext)_localctx).ecp.val; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expcond_primeContext extends ParserRuleContext {
		public String valHeredado;
		public String val;
		public OplogContext o;
		public FactorcondContext fc;
		public Expcond_primeContext ecp;
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_primeContext expcond_prime() {
			return getRuleContext(Expcond_primeContext.class,0);
		}
		public Expcond_primeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expcond_primeContext(ParserRuleContext parent, int invokingState, String valHeredado) {
			super(parent, invokingState);
			this.valHeredado = valHeredado;
		}
		@Override public int getRuleIndex() { return RULE_expcond_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterExpcond_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitExpcond_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitExpcond_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expcond_primeContext expcond_prime(String valHeredado) throws RecognitionException {
		Expcond_primeContext _localctx = new Expcond_primeContext(_ctx, getState(), valHeredado);
		enterRule(_localctx, 84, RULE_expcond_prime);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
			case AND:
			case EQV:
			case NEQV:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				((Expcond_primeContext)_localctx).o = oplog();
				setState(498);
				((Expcond_primeContext)_localctx).fc = factorcond();
				setState(499);
				((Expcond_primeContext)_localctx).ecp = expcond_prime(_localctx.valHeredado + " " + ((Expcond_primeContext)_localctx).o.val + " " + ((Expcond_primeContext)_localctx).fc.val);
				 ((Expcond_primeContext)_localctx).val =  ((Expcond_primeContext)_localctx).ecp.val; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				 ((Expcond_primeContext)_localctx).val =  _localctx.valHeredado; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OplogContext extends ParserRuleContext {
		public String val;
		public TerminalNode OR() { return getToken(TranslatorParser.OR, 0); }
		public TerminalNode AND() { return getToken(TranslatorParser.AND, 0); }
		public TerminalNode EQV() { return getToken(TranslatorParser.EQV, 0); }
		public TerminalNode NEQV() { return getToken(TranslatorParser.NEQV, 0); }
		public OplogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oplog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterOplog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitOplog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitOplog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OplogContext oplog() throws RecognitionException {
		OplogContext _localctx = new OplogContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_oplog);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(505);
				match(OR);
				 ((OplogContext)_localctx).val =  "||"; 
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(AND);
				 ((OplogContext)_localctx).val =  "&&"; 
				}
				break;
			case EQV:
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				match(EQV);
				 ((OplogContext)_localctx).val =  "=="; 
				}
				break;
			case NEQV:
				enterOuterAlt(_localctx, 4);
				{
				setState(511);
				match(NEQV);
				 ((OplogContext)_localctx).val =  "!="; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorcondContext extends ParserRuleContext {
		public String val;
		public ExpContext e1;
		public OpcompContext oc;
		public ExpContext e2;
		public ExpcondContext ec;
		public FactorcondContext fc;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpcompContext opcomp() {
			return getRuleContext(OpcompContext.class,0);
		}
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode NOT() { return getToken(TranslatorParser.NOT, 0); }
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(TranslatorParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TranslatorParser.FALSE, 0); }
		public FactorcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factorcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterFactorcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitFactorcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitFactorcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorcondContext factorcond() throws RecognitionException {
		FactorcondContext _localctx = new FactorcondContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_factorcond);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(515);
				((FactorcondContext)_localctx).e1 = exp();
				setState(516);
				((FactorcondContext)_localctx).oc = opcomp();
				setState(517);
				((FactorcondContext)_localctx).e2 = exp();
				 ((FactorcondContext)_localctx).val =  ((FactorcondContext)_localctx).e1.val + " " + ((FactorcondContext)_localctx).oc.val + " " + ((FactorcondContext)_localctx).e2.val; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(T__4);
				setState(521);
				((FactorcondContext)_localctx).ec = expcond();
				setState(522);
				match(T__5);
				 ((FactorcondContext)_localctx).val =  "(" + ((FactorcondContext)_localctx).ec.val + ")"; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(NOT);
				setState(526);
				((FactorcondContext)_localctx).fc = factorcond();
				 ((FactorcondContext)_localctx).val =  "!" + ((FactorcondContext)_localctx).fc.val; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				match(TRUE);
				 ((FactorcondContext)_localctx).val =  "1"; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
				match(FALSE);
				 ((FactorcondContext)_localctx).val =  "0"; 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpcompContext extends ParserRuleContext {
		public String val;
		public OpcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterOpcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitOpcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitOpcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcompContext opcomp() throws RecognitionException {
		OpcompContext _localctx = new OpcompContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_opcomp);
		try {
			setState(547);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				match(T__10);
				 ((OpcompContext)_localctx).val =  "<"; 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(T__11);
				 ((OpcompContext)_localctx).val =  ">"; 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(539);
				match(T__12);
				 ((OpcompContext)_localctx).val =  "<="; 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				match(T__13);
				 ((OpcompContext)_localctx).val =  ">="; 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				match(T__14);
				 ((OpcompContext)_localctx).val =  "=="; 
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				match(T__15);
				 ((OpcompContext)_localctx).val =  "!="; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_tailContext extends ParserRuleContext {
		public SentenciaC doObj;
		public List<SentenciaC> sents;
		public ExpcondContext ec;
		public Token id;
		public DovalContext d1;
		public DovalContext d2;
		public DovalContext d3;
		public TerminalNode WHILE() { return getToken(TranslatorParser.WHILE, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode ENDDO() { return getToken(TranslatorParser.ENDDO, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public List<DovalContext> doval() {
			return getRuleContexts(DovalContext.class);
		}
		public DovalContext doval(int i) {
			return getRuleContext(DovalContext.class,i);
		}
		public Do_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDo_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDo_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDo_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_tailContext do_tail() throws RecognitionException {
		Do_tailContext _localctx = new Do_tailContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_do_tail);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				match(WHILE);
				setState(550);
				match(T__4);
				setState(551);
				((Do_tailContext)_localctx).ec = expcond();
				setState(552);
				match(T__5);
				 ((Do_tailContext)_localctx).sents =  new ArrayList<SentenciaC>(); 
				setState(554);
				sentlist(_localctx.sents);
				setState(555);
				match(ENDDO);
				 ((Do_tailContext)_localctx).doObj =  new BucleWhileC(((Do_tailContext)_localctx).ec.val, _localctx.sents); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				((Do_tailContext)_localctx).id = match(IDENT);
				setState(559);
				match(T__3);
				setState(560);
				((Do_tailContext)_localctx).d1 = doval();
				setState(561);
				match(T__1);
				setState(562);
				((Do_tailContext)_localctx).d2 = doval();
				setState(563);
				match(T__1);
				setState(564);
				((Do_tailContext)_localctx).d3 = doval();
				 ((Do_tailContext)_localctx).sents =  new ArrayList<SentenciaC>(); 
				setState(566);
				sentlist(_localctx.sents);
				setState(567);
				match(ENDDO);
				 ((Do_tailContext)_localctx).doObj =  new BucleForC((((Do_tailContext)_localctx).id!=null?((Do_tailContext)_localctx).id.getText():null), ((Do_tailContext)_localctx).d1.val, ((Do_tailContext)_localctx).d2.val, ((Do_tailContext)_localctx).d3.val, _localctx.sents); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_tailContext extends ParserRuleContext {
		public String cond;
		public IfC ifObj;
		public List<SentenciaC> sIf;
		public SentContext s;
		public If_tail_primeContext itp;
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public TerminalNode THEN() { return getToken(TranslatorParser.THEN, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public If_tail_primeContext if_tail_prime() {
			return getRuleContext(If_tail_primeContext.class,0);
		}
		public If_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public If_tailContext(ParserRuleContext parent, int invokingState, String cond) {
			super(parent, invokingState);
			this.cond = cond;
		}
		@Override public int getRuleIndex() { return RULE_if_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterIf_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitIf_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitIf_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tailContext if_tail(String cond) throws RecognitionException {
		If_tailContext _localctx = new If_tailContext(_ctx, getState(), cond);
		enterRule(_localctx, 94, RULE_if_tail);
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				((If_tailContext)_localctx).s = sent();

				          ((If_tailContext)_localctx).sIf =  new ArrayList<SentenciaC>();
				          if (((If_tailContext)_localctx).s.sentVal != null) _localctx.sIf.add(((If_tailContext)_localctx).s.sentVal);
				          ((If_tailContext)_localctx).ifObj =  new IfC(_localctx.cond, _localctx.sIf, new ArrayList<SentenciaC>());
				      
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(THEN);
				 ((If_tailContext)_localctx).sIf =  new ArrayList<SentenciaC>(); 
				setState(577);
				sentlist(_localctx.sIf);
				setState(578);
				((If_tailContext)_localctx).itp = if_tail_prime();
				 ((If_tailContext)_localctx).ifObj =  new IfC(_localctx.cond, _localctx.sIf, ((If_tailContext)_localctx).itp.sElse); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_tail_primeContext extends ParserRuleContext {
		public List<SentenciaC> sElse;
		public TerminalNode ENDIF() { return getToken(TranslatorParser.ENDIF, 0); }
		public TerminalNode ELSE() { return getToken(TranslatorParser.ELSE, 0); }
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public If_tail_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tail_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterIf_tail_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitIf_tail_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitIf_tail_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tail_primeContext if_tail_prime() throws RecognitionException {
		If_tail_primeContext _localctx = new If_tail_primeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_if_tail_prime);
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				match(ENDIF);
				 ((If_tail_primeContext)_localctx).sElse =  new ArrayList<SentenciaC>(); 
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(ELSE);
				 ((If_tail_primeContext)_localctx).sElse =  new ArrayList<SentenciaC>(); 
				setState(587);
				sentlist(_localctx.sElse);
				setState(588);
				match(ENDIF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DovalContext extends ParserRuleContext {
		public String val;
		public Token nic;
		public Token id;
		public TerminalNode NUM_INT_CONST() { return getToken(TranslatorParser.NUM_INT_CONST, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public DovalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterDoval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitDoval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitDoval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DovalContext doval() throws RecognitionException {
		DovalContext _localctx = new DovalContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_doval);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				((DovalContext)_localctx).nic = match(NUM_INT_CONST);
				((DovalContext)_localctx).val =  (((DovalContext)_localctx).nic!=null?((DovalContext)_localctx).nic.getText():null); 
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				((DovalContext)_localctx).id = match(IDENT);
				((DovalContext)_localctx).val =  (((DovalContext)_localctx).id!=null?((DovalContext)_localctx).id.getText():null); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasosContext extends ParserRuleContext {
		public List<CasoC> listaCasos;
		public List<SentenciaC> listaDefault;
		public Casos_primeContext cp;
		public TerminalNode CASE() { return getToken(TranslatorParser.CASE, 0); }
		public Casos_primeContext casos_prime() {
			return getRuleContext(Casos_primeContext.class,0);
		}
		public CasosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCasos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCasos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCasos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasosContext casos() throws RecognitionException {
		CasosContext _localctx = new CasosContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_casos);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(598);
				match(CASE);
				setState(599);
				((CasosContext)_localctx).cp = casos_prime();
				 ((CasosContext)_localctx).listaCasos =  ((CasosContext)_localctx).cp.listaCasos; ((CasosContext)_localctx).listaDefault =  ((CasosContext)_localctx).cp.listaDefault; 
				}
				break;
			case END:
				enterOuterAlt(_localctx, 2);
				{
				 ((CasosContext)_localctx).listaCasos =  new ArrayList<CasoC>(); ((CasosContext)_localctx).listaDefault =  new ArrayList<SentenciaC>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Casos_primeContext extends ParserRuleContext {
		public List<CasoC> listaCasos;
		public List<SentenciaC> listaDefault;
		public EtiquetasContext e;
		public CasosContext c;
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(TranslatorParser.DEFAULT, 0); }
		public Casos_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterCasos_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitCasos_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitCasos_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Casos_primeContext casos_prime() throws RecognitionException {
		Casos_primeContext _localctx = new Casos_primeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_casos_prime);
		try {
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				match(T__4);
				setState(606);
				((Casos_primeContext)_localctx).e = etiquetas();
				setState(607);
				match(T__5);
				 List<SentenciaC> sents = new ArrayList<SentenciaC>(); 
				setState(609);
				sentlist(sents);
				setState(610);
				((Casos_primeContext)_localctx).c = casos();

				          ((Casos_primeContext)_localctx).listaCasos =  new ArrayList<CasoC>();
				          _localctx.listaCasos.add(new CasoC(((Casos_primeContext)_localctx).e.val, sents));
				          _localctx.listaCasos.addAll(((Casos_primeContext)_localctx).c.listaCasos);
				          ((Casos_primeContext)_localctx).listaDefault =  ((Casos_primeContext)_localctx).c.listaDefault;
				      
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				match(DEFAULT);
				 List<SentenciaC> sentsDef = new ArrayList<SentenciaC>(); 
				setState(615);
				sentlist(sentsDef);

				          ((Casos_primeContext)_localctx).listaCasos =  new ArrayList<CasoC>();
				          ((Casos_primeContext)_localctx).listaDefault =  sentsDef;
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetasContext extends ParserRuleContext {
		public String val;
		public SimpvalueContext s;
		public Etiquetas_tailContext et;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Etiquetas_tailContext etiquetas_tail() {
			return getRuleContext(Etiquetas_tailContext.class,0);
		}
		public EtiquetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterEtiquetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitEtiquetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitEtiquetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EtiquetasContext etiquetas() throws RecognitionException {
		EtiquetasContext _localctx = new EtiquetasContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_etiquetas);
		try {
			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case STRING_CONST:
			case NUM_REAL_CONST:
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				((EtiquetasContext)_localctx).s = simpvalue();
				setState(621);
				((EtiquetasContext)_localctx).et = etiquetas_tail(((EtiquetasContext)_localctx).s.val);
				 ((EtiquetasContext)_localctx).val =  ((EtiquetasContext)_localctx).et.val; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(T__16);
				setState(625);
				((EtiquetasContext)_localctx).s = simpvalue();
				 ((EtiquetasContext)_localctx).val =  "case < " + ((EtiquetasContext)_localctx).s.val + ":"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Etiquetas_tailContext extends ParserRuleContext {
		public String sHeredado;
		public String val;
		public ListaetiqetasContext le;
		public Etiquetas_tail_primeContext etp;
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public Etiquetas_tail_primeContext etiquetas_tail_prime() {
			return getRuleContext(Etiquetas_tail_primeContext.class,0);
		}
		public Etiquetas_tailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Etiquetas_tailContext(ParserRuleContext parent, int invokingState, String sHeredado) {
			super(parent, invokingState);
			this.sHeredado = sHeredado;
		}
		@Override public int getRuleIndex() { return RULE_etiquetas_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterEtiquetas_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitEtiquetas_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitEtiquetas_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Etiquetas_tailContext etiquetas_tail(String sHeredado) throws RecognitionException {
		Etiquetas_tailContext _localctx = new Etiquetas_tailContext(_ctx, getState(), sHeredado);
		enterRule(_localctx, 106, RULE_etiquetas_tail);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				((Etiquetas_tailContext)_localctx).le = listaetiqetas(_localctx.sHeredado);
				 ((Etiquetas_tailContext)_localctx).val =  ((Etiquetas_tailContext)_localctx).le.val; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(633);
				match(T__16);
				setState(634);
				((Etiquetas_tailContext)_localctx).etp = etiquetas_tail_prime();
				 if (((Etiquetas_tailContext)_localctx).etp.val.isEmpty()) { ((Etiquetas_tailContext)_localctx).val =  "case > " + _localctx.sHeredado + ":"; } else { ((Etiquetas_tailContext)_localctx).val =  "case " + _localctx.sHeredado + " to " + ((Etiquetas_tailContext)_localctx).etp.val + ":"; } 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Etiquetas_tail_primeContext extends ParserRuleContext {
		public String val;
		public SimpvalueContext s;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public Etiquetas_tail_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetas_tail_prime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterEtiquetas_tail_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitEtiquetas_tail_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitEtiquetas_tail_prime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Etiquetas_tail_primeContext etiquetas_tail_prime() throws RecognitionException {
		Etiquetas_tail_primeContext _localctx = new Etiquetas_tail_primeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_etiquetas_tail_prime);
		try {
			setState(643);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT_CONST_B:
			case NUM_INT_CONST_O:
			case NUM_INT_CONST_H:
			case STRING_CONST:
			case NUM_REAL_CONST:
			case NUM_INT_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(639);
				((Etiquetas_tail_primeContext)_localctx).s = simpvalue();
				 ((Etiquetas_tail_primeContext)_localctx).val =  ((Etiquetas_tail_primeContext)_localctx).s.val; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				 ((Etiquetas_tail_primeContext)_localctx).val =  ""; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaetiqetasContext extends ParserRuleContext {
		public String sHeredado;
		public String val;
		public SimpvalueContext s;
		public ListaetiqetasContext le;
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState, String sHeredado) {
			super(parent, invokingState);
			this.sHeredado = sHeredado;
		}
		@Override public int getRuleIndex() { return RULE_listaetiqetas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).enterListaetiqetas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TranslatorListener ) ((TranslatorListener)listener).exitListaetiqetas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TranslatorVisitor ) return ((TranslatorVisitor<? extends T>)visitor).visitListaetiqetas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaetiqetasContext listaetiqetas(String sHeredado) throws RecognitionException {
		ListaetiqetasContext _localctx = new ListaetiqetasContext(_ctx, getState(), sHeredado);
		enterRule(_localctx, 110, RULE_listaetiqetas);
		try {
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(645);
				match(T__1);
				setState(646);
				((ListaetiqetasContext)_localctx).s = simpvalue();
				setState(647);
				((ListaetiqetasContext)_localctx).le = listaetiqetas( _localctx.sHeredado + ":\ncase " + ((ListaetiqetasContext)_localctx).s.val );
				 ((ListaetiqetasContext)_localctx).val =  ((ListaetiqetasContext)_localctx).le.val; 
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				 ((ListaetiqetasContext)_localctx).val =  "case " + _localctx.sHeredado + ":"; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001:\u028e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0081"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0089\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0093"+
		"\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u009e\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a9\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00bc"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c6\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d4\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00de\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00e5\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00f3\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00fa\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u010a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0115\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0123\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u012b\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u014b\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u016c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0178\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u018b\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0194\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u019c"+
		"\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0003\"\u01aa\b\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u01b2\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u01bd\b$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01e5\b\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u01ec\b(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u01f8\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0202\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u0216\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0224"+
		"\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u023b\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0246\b/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u024f\b0\u00011\u00011\u00011\u00011\u00031\u0255\b1\u0001"+
		"2\u00012\u00012\u00012\u00012\u00032\u025c\b2\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u0003"+
		"3\u026b\b3\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u0275\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u027e"+
		"\b5\u00016\u00016\u00016\u00016\u00036\u0284\b6\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u028c\b7\u00017\u0000\u00008\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u0001\u0001\u0000\u0007"+
		"\n\u0293\u0000p\u0001\u0000\u0000\u0000\u0002\u0080\u0001\u0000\u0000"+
		"\u0000\u0004\u0088\u0001\u0000\u0000\u0000\u0006\u0092\u0001\u0000\u0000"+
		"\u0000\b\u009d\u0001\u0000\u0000\u0000\n\u009f\u0001\u0000\u0000\u0000"+
		"\f\u00a8\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010"+
		"\u00bb\u0001\u0000\u0000\u0000\u0012\u00c5\u0001\u0000\u0000\u0000\u0014"+
		"\u00d3\u0001\u0000\u0000\u0000\u0016\u00dd\u0001\u0000\u0000\u0000\u0018"+
		"\u00e4\u0001\u0000\u0000\u0000\u001a\u00e6\u0001\u0000\u0000\u0000\u001c"+
		"\u00f2\u0001\u0000\u0000\u0000\u001e\u00f9\u0001\u0000\u0000\u0000 \u00fb"+
		"\u0001\u0000\u0000\u0000\"\u0109\u0001\u0000\u0000\u0000$\u010b\u0001"+
		"\u0000\u0000\u0000&\u0114\u0001\u0000\u0000\u0000(\u0122\u0001\u0000\u0000"+
		"\u0000*\u012a\u0001\u0000\u0000\u0000,\u012c\u0001\u0000\u0000\u0000."+
		"\u013c\u0001\u0000\u0000\u00000\u014a\u0001\u0000\u0000\u00002\u016b\u0001"+
		"\u0000\u0000\u00004\u016d\u0001\u0000\u0000\u00006\u0177\u0001\u0000\u0000"+
		"\u00008\u0179\u0001\u0000\u0000\u0000:\u017c\u0001\u0000\u0000\u0000<"+
		"\u018a\u0001\u0000\u0000\u0000>\u0193\u0001\u0000\u0000\u0000@\u019b\u0001"+
		"\u0000\u0000\u0000B\u019d\u0001\u0000\u0000\u0000D\u01a9\u0001\u0000\u0000"+
		"\u0000F\u01b1\u0001\u0000\u0000\u0000H\u01bc\u0001\u0000\u0000\u0000J"+
		"\u01be\u0001\u0000\u0000\u0000L\u01c9\u0001\u0000\u0000\u0000N\u01e4\u0001"+
		"\u0000\u0000\u0000P\u01eb\u0001\u0000\u0000\u0000R\u01ed\u0001\u0000\u0000"+
		"\u0000T\u01f7\u0001\u0000\u0000\u0000V\u0201\u0001\u0000\u0000\u0000X"+
		"\u0215\u0001\u0000\u0000\u0000Z\u0223\u0001\u0000\u0000\u0000\\\u023a"+
		"\u0001\u0000\u0000\u0000^\u0245\u0001\u0000\u0000\u0000`\u024e\u0001\u0000"+
		"\u0000\u0000b\u0254\u0001\u0000\u0000\u0000d\u025b\u0001\u0000\u0000\u0000"+
		"f\u026a\u0001\u0000\u0000\u0000h\u0274\u0001\u0000\u0000\u0000j\u027d"+
		"\u0001\u0000\u0000\u0000l\u0283\u0001\u0000\u0000\u0000n\u028b\u0001\u0000"+
		"\u0000\u0000pq\u0005\u0012\u0000\u0000qr\u00057\u0000\u0000rs\u0005\u0001"+
		"\u0000\u0000st\u0003\u0002\u0001\u0000tu\u0003\u0004\u0002\u0000uv\u0003"+
		"\n\u0005\u0000vw\u0005\u0013\u0000\u0000wx\u0005\u0012\u0000\u0000xy\u0005"+
		"7\u0000\u0000yz\u0003H$\u0000z{\u0006\u0000\uffff\uffff\u0000{\u0001\u0001"+
		"\u0000\u0000\u0000|}\u0003\u000e\u0007\u0000}~\u0003\u0002\u0001\u0000"+
		"~\u0081\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080"+
		"|\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0003"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0014\u0000\u0000\u0083\u0084"+
		"\u0003\u0006\u0003\u0000\u0084\u0085\u0005\u0013\u0000\u0000\u0085\u0086"+
		"\u0005\u0014\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0089\u0005\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0003 \u0010\u0000\u008b\u008c\u0006\u0003\uffff\uffff\u0000\u008c\u008d"+
		"\u0003\b\u0004\u0000\u008d\u0093\u0001\u0000\u0000\u0000\u008e\u008f\u0003"+
		",\u0016\u0000\u008f\u0090\u0006\u0003\uffff\uffff\u0000\u0090\u0091\u0003"+
		"\b\u0004\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000"+
		"\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0093\u0007\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0003 \u0010\u0000\u0095\u0096\u0006\u0004\uffff"+
		"\uffff\u0000\u0096\u0097\u0003\b\u0004\u0000\u0097\u009e\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u0003,\u0016\u0000\u0099\u009a\u0006\u0004\uffff\uffff"+
		"\u0000\u009a\u009b\u0003\b\u0004\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0094\u0001\u0000\u0000\u0000"+
		"\u009d\u0098\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\t\u0001\u0000\u0000\u0000\u009f\u00a0\u00032\u0019\u0000\u00a0"+
		"\u00a1\u0006\u0005\uffff\uffff\u0000\u00a1\u00a2\u0003\f\u0006\u0000\u00a2"+
		"\u000b\u0001\u0000\u0000\u0000\u00a3\u00a4\u00032\u0019\u0000\u00a4\u00a5"+
		"\u0006\u0006\uffff\uffff\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9\r\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000\u00ab\u00ac\u0003"+
		"\u0010\b\u0000\u00ac\u000f\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0002"+
		"\u0000\u0000\u00ae\u00af\u0005\u001a\u0000\u0000\u00af\u00b0\u0005\u0003"+
		"\u0000\u0000\u00b0\u00b1\u00057\u0000\u0000\u00b1\u00b2\u0005\u0004\u0000"+
		"\u0000\u00b2\u00b3\u0003\u0014\n\u0000\u00b3\u00b4\u0006\b\uffff\uffff"+
		"\u0000\u00b4\u00b5\u0003\u0012\t\u0000\u00b5\u00b6\u0005\u0001\u0000\u0000"+
		"\u00b6\u00bc\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0003\u0000\u0000"+
		"\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000\u00ba"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bb\u00ad\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b7\u0001\u0000\u0000\u0000\u00bc\u0011\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\u0002\u0000\u0000\u00be\u00bf\u00057\u0000\u0000\u00bf\u00c0"+
		"\u0005\u0004\u0000\u0000\u00c0\u00c1\u0003\u0014\n\u0000\u00c1\u00c2\u0006"+
		"\t\uffff\uffff\u0000\u00c2\u00c3\u0003\u0012\t\u0000\u00c3\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0013\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u00056\u0000\u0000\u00c8\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00c9\u00ca\u00055\u0000\u0000\u00ca\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00cb\u00cc\u00054\u0000\u0000\u00cc\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00cd\u00ce\u00051\u0000\u0000\u00ce\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00cf\u00d0\u00052\u0000\u0000\u00d0\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00d1\u00d2\u00053\u0000\u0000\u00d2\u00d4\u0006\n"+
		"\uffff\uffff\u0000\u00d3\u00c7\u0001\u0000\u0000\u0000\u00d3\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d3\u00cb\u0001\u0000\u0000\u0000\u00d3\u00cd\u0001"+
		"\u0000\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u0017\u0000\u0000\u00d6\u00de\u0006\u000b\uffff\uffff\u0000\u00d7\u00d8"+
		"\u0005\u0018\u0000\u0000\u00d8\u00de\u0006\u000b\uffff\uffff\u0000\u00d9"+
		"\u00da\u0005\u0019\u0000\u0000\u00da\u00db\u0003\u0018\f\u0000\u00db\u00dc"+
		"\u0006\u000b\uffff\uffff\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d5\u0001\u0000\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd"+
		"\u00d9\u0001\u0000\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0005\u0000\u0000\u00e0\u00e1\u00056\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0006\u0000\u0000\u00e2\u00e5\u0006\f\uffff\uffff\u0000\u00e3\u00e5"+
		"\u0006\f\uffff\uffff\u0000\u00e4\u00df\u0001\u0000\u0000\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5\u0019\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u00057\u0000\u0000\u00e7\u00e8\u0003\u001e\u000f\u0000\u00e8\u00e9\u0006"+
		"\r\uffff\uffff\u0000\u00e9\u00ea\u0003\u001c\u000e\u0000\u00ea\u001b\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005\u0002\u0000\u0000\u00ec\u00ed\u0005"+
		"7\u0000\u0000\u00ed\u00ee\u0003\u001e\u000f\u0000\u00ee\u00ef\u0006\u000e"+
		"\uffff\uffff\u0000\u00ef\u00f0\u0003\u001c\u000e\u0000\u00f0\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00eb\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3\u001d\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0005\u0004\u0000\u0000\u00f5\u00f6\u0003"+
		"\u0014\n\u0000\u00f6\u00f7\u0006\u000f\uffff\uffff\u0000\u00f7\u00fa\u0001"+
		"\u0000\u0000\u0000\u00f8\u00fa\u0006\u000f\uffff\uffff\u0000\u00f9\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u001f"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005\u0015\u0000\u0000\u00fc\u00fd"+
		"\u00057\u0000\u0000\u00fd\u00fe\u0006\u0010\uffff\uffff\u0000\u00fe\u00ff"+
		"\u0003\"\u0011\u0000\u00ff\u0100\u0003(\u0014\u0000\u0100\u0101\u0005"+
		"\u0013\u0000\u0000\u0101\u0102\u0005\u0015\u0000\u0000\u0102\u0103\u0005"+
		"7\u0000\u0000\u0103!\u0001\u0000\u0000\u0000\u0104\u0105\u0005\u0005\u0000"+
		"\u0000\u0105\u0106\u0003$\u0012\u0000\u0106\u0107\u0005\u0006\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000"+
		"\u0109\u0104\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000"+
		"\u010a#\u0001\u0000\u0000\u0000\u010b\u010c\u00057\u0000\u0000\u010c\u010d"+
		"\u0006\u0012\uffff\uffff\u0000\u010d\u010e\u0003&\u0013\u0000\u010e%\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0005\u0002\u0000\u0000\u0110\u0111\u0005"+
		"7\u0000\u0000\u0111\u0112\u0006\u0013\uffff\uffff\u0000\u0112\u0115\u0003"+
		"&\u0013\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u010f\u0001\u0000"+
		"\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\'\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0003\u0016\u000b\u0000\u0117\u0118\u0005\u0002\u0000"+
		"\u0000\u0118\u0119\u0005\u001b\u0000\u0000\u0119\u011a\u0005\u0005\u0000"+
		"\u0000\u011a\u011b\u0003*\u0015\u0000\u011b\u011c\u0005\u0006\u0000\u0000"+
		"\u011c\u011d\u00057\u0000\u0000\u011d\u011e\u0005\u0001\u0000\u0000\u011e"+
		"\u011f\u0006\u0014\uffff\uffff\u0000\u011f\u0120\u0003(\u0014\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122"+
		"\u0116\u0001\u0000\u0000\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123"+
		")\u0001\u0000\u0000\u0000\u0124\u0125\u0005\u001c\u0000\u0000\u0125\u012b"+
		"\u0006\u0015\uffff\uffff\u0000\u0126\u0127\u0005\u001d\u0000\u0000\u0127"+
		"\u012b\u0006\u0015\uffff\uffff\u0000\u0128\u0129\u0005\u001e\u0000\u0000"+
		"\u0129\u012b\u0006\u0015\uffff\uffff\u0000\u012a\u0124\u0001\u0000\u0000"+
		"\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012b+\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0016\u0000\u0000"+
		"\u012d\u012e\u00057\u0000\u0000\u012e\u012f\u0006\u0016\uffff\uffff\u0000"+
		"\u012f\u0130\u0005\u0005\u0000\u0000\u0130\u0131\u0003$\u0012\u0000\u0131"+
		"\u0132\u0005\u0006\u0000\u0000\u0132\u0133\u0003\u0016\u000b\u0000\u0133"+
		"\u0134\u0005\u0003\u0000\u0000\u0134\u0135\u00057\u0000\u0000\u0135\u0136"+
		"\u0006\u0016\uffff\uffff\u0000\u0136\u0137\u0005\u0001\u0000\u0000\u0137"+
		"\u0138\u0003.\u0017\u0000\u0138\u0139\u0005\u0013\u0000\u0000\u0139\u013a"+
		"\u0005\u0016\u0000\u0000\u013a\u013b\u00057\u0000\u0000\u013b-\u0001\u0000"+
		"\u0000\u0000\u013c\u013d\u00030\u0018\u0000\u013d/\u0001\u0000\u0000\u0000"+
		"\u013e\u013f\u0003\u0016\u000b\u0000\u013f\u0140\u0005\u0002\u0000\u0000"+
		"\u0140\u0141\u0005\u001b\u0000\u0000\u0141\u0142\u0005\u0005\u0000\u0000"+
		"\u0142\u0143\u0005\u001c\u0000\u0000\u0143\u0144\u0005\u0006\u0000\u0000"+
		"\u0144\u0145\u00057\u0000\u0000\u0145\u0146\u0005\u0001\u0000\u0000\u0146"+
		"\u0147\u0006\u0018\uffff\uffff\u0000\u0147\u0148\u00030\u0018\u0000\u0148"+
		"\u014b\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000\u0000\u014a"+
		"\u013e\u0001\u0000\u0000\u0000\u014a\u0149\u0001\u0000\u0000\u0000\u014b"+
		"1\u0001\u0000\u0000\u0000\u014c\u014d\u00057\u0000\u0000\u014d\u014e\u0005"+
		"\u0004\u0000\u0000\u014e\u014f\u00034\u001a\u0000\u014f\u0150\u0005\u0001"+
		"\u0000\u0000\u0150\u0151\u0006\u0019\uffff\uffff\u0000\u0151\u016c\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0003B!\u0000\u0153\u0154\u0005\u0001\u0000"+
		"\u0000\u0154\u0155\u0006\u0019\uffff\uffff\u0000\u0155\u016c\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005 \u0000\u0000\u0157\u0158\u0005\u0005\u0000"+
		"\u0000\u0158\u0159\u0003R)\u0000\u0159\u015a\u0005\u0006\u0000\u0000\u015a"+
		"\u015b\u0003^/\u0000\u015b\u015c\u0006\u0019\uffff\uffff\u0000\u015c\u016c"+
		"\u0001\u0000\u0000\u0000\u015d\u015e\u0005!\u0000\u0000\u015e\u015f\u0003"+
		"\\.\u0000\u015f\u0160\u0006\u0019\uffff\uffff\u0000\u0160\u016c\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0005\"\u0000\u0000\u0162\u0163\u0005#"+
		"\u0000\u0000\u0163\u0164\u0005\u0005\u0000\u0000\u0164\u0165\u00034\u001a"+
		"\u0000\u0165\u0166\u0005\u0006\u0000\u0000\u0166\u0167\u0003d2\u0000\u0167"+
		"\u0168\u0005\u0013\u0000\u0000\u0168\u0169\u0005\"\u0000\u0000\u0169\u016a"+
		"\u0006\u0019\uffff\uffff\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b"+
		"\u014c\u0001\u0000\u0000\u0000\u016b\u0152\u0001\u0000\u0000\u0000\u016b"+
		"\u0156\u0001\u0000\u0000\u0000\u016b\u015d\u0001\u0000\u0000\u0000\u016b"+
		"\u0161\u0001\u0000\u0000\u0000\u016c3\u0001\u0000\u0000\u0000\u016d\u016e"+
		"\u0003<\u001e\u0000\u016e\u016f\u00036\u001b\u0000\u016f\u0170\u0006\u001a"+
		"\uffff\uffff\u0000\u01705\u0001\u0000\u0000\u0000\u0171\u0172\u00038\u001c"+
		"\u0000\u0172\u0173\u0003<\u001e\u0000\u0173\u0174\u00036\u001b\u0000\u0174"+
		"\u0175\u0006\u001b\uffff\uffff\u0000\u0175\u0178\u0001\u0000\u0000\u0000"+
		"\u0176\u0178\u0006\u001b\uffff\uffff\u0000\u0177\u0171\u0001\u0000\u0000"+
		"\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u01787\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0003:\u001d\u0000\u017a\u017b\u0006\u001c\uffff\uffff\u0000"+
		"\u017b9\u0001\u0000\u0000\u0000\u017c\u017d\u0007\u0000\u0000\u0000\u017d"+
		";\u0001\u0000\u0000\u0000\u017e\u017f\u0003\u0014\n\u0000\u017f\u0180"+
		"\u0006\u001e\uffff\uffff\u0000\u0180\u018b\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0005\u0005\u0000\u0000\u0182\u0183\u00034\u001a\u0000\u0183\u0184"+
		"\u0005\u0006\u0000\u0000\u0184\u0185\u0006\u001e\uffff\uffff\u0000\u0185"+
		"\u018b\u0001\u0000\u0000\u0000\u0186\u0187\u00057\u0000\u0000\u0187\u0188"+
		"\u0003>\u001f\u0000\u0188\u0189\u0006\u001e\uffff\uffff\u0000\u0189\u018b"+
		"\u0001\u0000\u0000\u0000\u018a\u017e\u0001\u0000\u0000\u0000\u018a\u0181"+
		"\u0001\u0000\u0000\u0000\u018a\u0186\u0001\u0000\u0000\u0000\u018b=\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005\u0005\u0000\u0000\u018d\u018e\u0003"+
		"4\u001a\u0000\u018e\u018f\u0003@ \u0000\u018f\u0190\u0005\u0006\u0000"+
		"\u0000\u0190\u0191\u0006\u001f\uffff\uffff\u0000\u0191\u0194\u0001\u0000"+
		"\u0000\u0000\u0192\u0194\u0006\u001f\uffff\uffff\u0000\u0193\u018c\u0001"+
		"\u0000\u0000\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0194?\u0001\u0000"+
		"\u0000\u0000\u0195\u0196\u0005\u0002\u0000\u0000\u0196\u0197\u00034\u001a"+
		"\u0000\u0197\u0198\u0003@ \u0000\u0198\u0199\u0006 \uffff\uffff\u0000"+
		"\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u019c\u0006 \uffff\uffff\u0000"+
		"\u019b\u0195\u0001\u0000\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000"+
		"\u019cA\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u001f\u0000\u0000\u019e"+
		"\u019f\u00057\u0000\u0000\u019f\u01a0\u0003D\"\u0000\u01a0\u01a1\u0006"+
		"!\uffff\uffff\u0000\u01a1C\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\u0005"+
		"\u0000\u0000\u01a3\u01a4\u00034\u001a\u0000\u01a4\u01a5\u0006\"\uffff"+
		"\uffff\u0000\u01a5\u01a6\u0003F#\u0000\u01a6\u01a7\u0005\u0006\u0000\u0000"+
		"\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a2\u0001\u0000\u0000\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000"+
		"\u01aaE\u0001\u0000\u0000\u0000\u01ab\u01ac\u0005\u0002\u0000\u0000\u01ac"+
		"\u01ad\u00034\u001a\u0000\u01ad\u01ae\u0006#\uffff\uffff\u0000\u01ae\u01af"+
		"\u0003F#\u0000\u01af\u01b2\u0001\u0000\u0000\u0000\u01b0\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b1\u01ab\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b2G\u0001\u0000\u0000\u0000\u01b3\u01b4\u0003J%\u0000"+
		"\u01b4\u01b5\u0006$\uffff\uffff\u0000\u01b5\u01b6\u0003H$\u0000\u01b6"+
		"\u01bd\u0001\u0000\u0000\u0000\u01b7\u01b8\u0003L&\u0000\u01b8\u01b9\u0006"+
		"$\uffff\uffff\u0000\u01b9\u01ba\u0003H$\u0000\u01ba\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b3\u0001\u0000"+
		"\u0000\u0000\u01bc\u01b7\u0001\u0000\u0000\u0000\u01bc\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bdI\u0001\u0000\u0000\u0000\u01be\u01bf\u0005\u0015\u0000"+
		"\u0000\u01bf\u01c0\u00057\u0000\u0000\u01c0\u01c1\u0006%\uffff\uffff\u0000"+
		"\u01c1\u01c2\u0003\"\u0011\u0000\u01c2\u01c3\u0003(\u0014\u0000\u01c3"+
		"\u01c4\u0003\u0002\u0001\u0000\u01c4\u01c5\u0003\n\u0005\u0000\u01c5\u01c6"+
		"\u0005\u0013\u0000\u0000\u01c6\u01c7\u0005\u0015\u0000\u0000\u01c7\u01c8"+
		"\u00057\u0000\u0000\u01c8K\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0016"+
		"\u0000\u0000\u01ca\u01cb\u00057\u0000\u0000\u01cb\u01cc\u0006&\uffff\uffff"+
		"\u0000\u01cc\u01cd\u0005\u0005\u0000\u0000\u01cd\u01ce\u0003$\u0012\u0000"+
		"\u01ce\u01cf\u0005\u0006\u0000\u0000\u01cf\u01d0\u0003\u0016\u000b\u0000"+
		"\u01d0\u01d1\u0005\u0003\u0000\u0000\u01d1\u01d2\u00057\u0000\u0000\u01d2"+
		"\u01d3\u0006&\uffff\uffff\u0000\u01d3\u01d4\u0005\u0001\u0000\u0000\u01d4"+
		"\u01d5\u0003.\u0017\u0000\u01d5\u01d6\u0003\u0002\u0001\u0000\u01d6\u01d7"+
		"\u0003N\'\u0000\u01d7M\u0001\u0000\u0000\u0000\u01d8\u01d9\u0003B!\u0000"+
		"\u01d9\u01da\u0005\u0001\u0000\u0000\u01da\u01db\u0006\'\uffff\uffff\u0000"+
		"\u01db\u01dc\u0003N\'\u0000\u01dc\u01e5\u0001\u0000\u0000\u0000\u01dd"+
		"\u01de\u00057\u0000\u0000\u01de\u01df\u0005\u0004\u0000\u0000\u01df\u01e0"+
		"\u00034\u001a\u0000\u01e0\u01e1\u0005\u0001\u0000\u0000\u01e1\u01e2\u0006"+
		"\'\uffff\uffff\u0000\u01e2\u01e3\u0003P(\u0000\u01e3\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e4\u01d8\u0001\u0000\u0000\u0000\u01e4\u01dd\u0001\u0000"+
		"\u0000\u0000\u01e5O\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005\u0013\u0000"+
		"\u0000\u01e7\u01e8\u0005\u0016\u0000\u0000\u01e8\u01e9\u00057\u0000\u0000"+
		"\u01e9\u01ec\u0006(\uffff\uffff\u0000\u01ea\u01ec\u0003N\'\u0000\u01eb"+
		"\u01e6\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01ec"+
		"Q\u0001\u0000\u0000\u0000\u01ed\u01ee\u0003X,\u0000\u01ee\u01ef\u0003"+
		"T*\u0000\u01ef\u01f0\u0006)\uffff\uffff\u0000\u01f0S\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0003V+\u0000\u01f2\u01f3\u0003X,\u0000\u01f3\u01f4"+
		"\u0003T*\u0000\u01f4\u01f5\u0006*\uffff\uffff\u0000\u01f5\u01f8\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f8\u0006*\uffff\uffff\u0000\u01f7\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8U\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0005,\u0000\u0000\u01fa\u0202\u0006+\uffff\uffff"+
		"\u0000\u01fb\u01fc\u0005-\u0000\u0000\u01fc\u0202\u0006+\uffff\uffff\u0000"+
		"\u01fd\u01fe\u0005.\u0000\u0000\u01fe\u0202\u0006+\uffff\uffff\u0000\u01ff"+
		"\u0200\u0005/\u0000\u0000\u0200\u0202\u0006+\uffff\uffff\u0000\u0201\u01f9"+
		"\u0001\u0000\u0000\u0000\u0201\u01fb\u0001\u0000\u0000\u0000\u0201\u01fd"+
		"\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202W\u0001"+
		"\u0000\u0000\u0000\u0203\u0204\u00034\u001a\u0000\u0204\u0205\u0003Z-"+
		"\u0000\u0205\u0206\u00034\u001a\u0000\u0206\u0207\u0006,\uffff\uffff\u0000"+
		"\u0207\u0216\u0001\u0000\u0000\u0000\u0208\u0209\u0005\u0005\u0000\u0000"+
		"\u0209\u020a\u0003R)\u0000\u020a\u020b\u0005\u0006\u0000\u0000\u020b\u020c"+
		"\u0006,\uffff\uffff\u0000\u020c\u0216\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u00050\u0000\u0000\u020e\u020f\u0003X,\u0000\u020f\u0210\u0006,\uffff"+
		"\uffff\u0000\u0210\u0216\u0001\u0000\u0000\u0000\u0211\u0212\u0005*\u0000"+
		"\u0000\u0212\u0216\u0006,\uffff\uffff\u0000\u0213\u0214\u0005+\u0000\u0000"+
		"\u0214\u0216\u0006,\uffff\uffff\u0000\u0215\u0203\u0001\u0000\u0000\u0000"+
		"\u0215\u0208\u0001\u0000\u0000\u0000\u0215\u020d\u0001\u0000\u0000\u0000"+
		"\u0215\u0211\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000\u0000"+
		"\u0216Y\u0001\u0000\u0000\u0000\u0217\u0218\u0005\u000b\u0000\u0000\u0218"+
		"\u0224\u0006-\uffff\uffff\u0000\u0219\u021a\u0005\f\u0000\u0000\u021a"+
		"\u0224\u0006-\uffff\uffff\u0000\u021b\u021c\u0005\r\u0000\u0000\u021c"+
		"\u0224\u0006-\uffff\uffff\u0000\u021d\u021e\u0005\u000e\u0000\u0000\u021e"+
		"\u0224\u0006-\uffff\uffff\u0000\u021f\u0220\u0005\u000f\u0000\u0000\u0220"+
		"\u0224\u0006-\uffff\uffff\u0000\u0221\u0222\u0005\u0010\u0000\u0000\u0222"+
		"\u0224\u0006-\uffff\uffff\u0000\u0223\u0217\u0001\u0000\u0000\u0000\u0223"+
		"\u0219\u0001\u0000\u0000\u0000\u0223\u021b\u0001\u0000\u0000\u0000\u0223"+
		"\u021d\u0001\u0000\u0000\u0000\u0223\u021f\u0001\u0000\u0000\u0000\u0223"+
		"\u0221\u0001\u0000\u0000\u0000\u0224[\u0001\u0000\u0000\u0000\u0225\u0226"+
		"\u0005$\u0000\u0000\u0226\u0227\u0005\u0005\u0000\u0000\u0227\u0228\u0003"+
		"R)\u0000\u0228\u0229\u0005\u0006\u0000\u0000\u0229\u022a\u0006.\uffff"+
		"\uffff\u0000\u022a\u022b\u0003\n\u0005\u0000\u022b\u022c\u0005%\u0000"+
		"\u0000\u022c\u022d\u0006.\uffff\uffff\u0000\u022d\u023b\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u00057\u0000\u0000\u022f\u0230\u0005\u0004\u0000\u0000"+
		"\u0230\u0231\u0003b1\u0000\u0231\u0232\u0005\u0002\u0000\u0000\u0232\u0233"+
		"\u0003b1\u0000\u0233\u0234\u0005\u0002\u0000\u0000\u0234\u0235\u0003b"+
		"1\u0000\u0235\u0236\u0006.\uffff\uffff\u0000\u0236\u0237\u0003\n\u0005"+
		"\u0000\u0237\u0238\u0005%\u0000\u0000\u0238\u0239\u0006.\uffff\uffff\u0000"+
		"\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0225\u0001\u0000\u0000\u0000"+
		"\u023a\u022e\u0001\u0000\u0000\u0000\u023b]\u0001\u0000\u0000\u0000\u023c"+
		"\u023d\u00032\u0019\u0000\u023d\u023e\u0006/\uffff\uffff\u0000\u023e\u0246"+
		"\u0001\u0000\u0000\u0000\u023f\u0240\u0005&\u0000\u0000\u0240\u0241\u0006"+
		"/\uffff\uffff\u0000\u0241\u0242\u0003\n\u0005\u0000\u0242\u0243\u0003"+
		"`0\u0000\u0243\u0244\u0006/\uffff\uffff\u0000\u0244\u0246\u0001\u0000"+
		"\u0000\u0000\u0245\u023c\u0001\u0000\u0000\u0000\u0245\u023f\u0001\u0000"+
		"\u0000\u0000\u0246_\u0001\u0000\u0000\u0000\u0247\u0248\u0005\'\u0000"+
		"\u0000\u0248\u024f\u00060\uffff\uffff\u0000\u0249\u024a\u0005(\u0000\u0000"+
		"\u024a\u024b\u00060\uffff\uffff\u0000\u024b\u024c\u0003\n\u0005\u0000"+
		"\u024c\u024d\u0005\'\u0000\u0000\u024d\u024f\u0001\u0000\u0000\u0000\u024e"+
		"\u0247\u0001\u0000\u0000\u0000\u024e\u0249\u0001\u0000\u0000\u0000\u024f"+
		"a\u0001\u0000\u0000\u0000\u0250\u0251\u00056\u0000\u0000\u0251\u0255\u0006"+
		"1\uffff\uffff\u0000\u0252\u0253\u00057\u0000\u0000\u0253\u0255\u00061"+
		"\uffff\uffff\u0000\u0254\u0250\u0001\u0000\u0000\u0000\u0254\u0252\u0001"+
		"\u0000\u0000\u0000\u0255c\u0001\u0000\u0000\u0000\u0256\u0257\u0005#\u0000"+
		"\u0000\u0257\u0258\u0003f3\u0000\u0258\u0259\u00062\uffff\uffff\u0000"+
		"\u0259\u025c\u0001\u0000\u0000\u0000\u025a\u025c\u00062\uffff\uffff\u0000"+
		"\u025b\u0256\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000\u0000\u0000"+
		"\u025ce\u0001\u0000\u0000\u0000\u025d\u025e\u0005\u0005\u0000\u0000\u025e"+
		"\u025f\u0003h4\u0000\u025f\u0260\u0005\u0006\u0000\u0000\u0260\u0261\u0006"+
		"3\uffff\uffff\u0000\u0261\u0262\u0003\n\u0005\u0000\u0262\u0263\u0003"+
		"d2\u0000\u0263\u0264\u00063\uffff\uffff\u0000\u0264\u026b\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0005)\u0000\u0000\u0266\u0267\u00063\uffff\uffff"+
		"\u0000\u0267\u0268\u0003\n\u0005\u0000\u0268\u0269\u00063\uffff\uffff"+
		"\u0000\u0269\u026b\u0001\u0000\u0000\u0000\u026a\u025d\u0001\u0000\u0000"+
		"\u0000\u026a\u0265\u0001\u0000\u0000\u0000\u026bg\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0003\u0014\n\u0000\u026d\u026e\u0003j5\u0000\u026e\u026f"+
		"\u00064\uffff\uffff\u0000\u026f\u0275\u0001\u0000\u0000\u0000\u0270\u0271"+
		"\u0005\u0011\u0000\u0000\u0271\u0272\u0003\u0014\n\u0000\u0272\u0273\u0006"+
		"4\uffff\uffff\u0000\u0273\u0275\u0001\u0000\u0000\u0000\u0274\u026c\u0001"+
		"\u0000\u0000\u0000\u0274\u0270\u0001\u0000\u0000\u0000\u0275i\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u0003n7\u0000\u0277\u0278\u00065\uffff\uffff"+
		"\u0000\u0278\u027e\u0001\u0000\u0000\u0000\u0279\u027a\u0005\u0011\u0000"+
		"\u0000\u027a\u027b\u0003l6\u0000\u027b\u027c\u00065\uffff\uffff\u0000"+
		"\u027c\u027e\u0001\u0000\u0000\u0000\u027d\u0276\u0001\u0000\u0000\u0000"+
		"\u027d\u0279\u0001\u0000\u0000\u0000\u027ek\u0001\u0000\u0000\u0000\u027f"+
		"\u0280\u0003\u0014\n\u0000\u0280\u0281\u00066\uffff\uffff\u0000\u0281"+
		"\u0284\u0001\u0000\u0000\u0000\u0282\u0284\u00066\uffff\uffff\u0000\u0283"+
		"\u027f\u0001\u0000\u0000\u0000\u0283\u0282\u0001\u0000\u0000\u0000\u0284"+
		"m\u0001\u0000\u0000\u0000\u0285\u0286\u0005\u0002\u0000\u0000\u0286\u0287"+
		"\u0003\u0014\n\u0000\u0287\u0288\u0003n7\u0000\u0288\u0289\u00067\uffff"+
		"\uffff\u0000\u0289\u028c\u0001\u0000\u0000\u0000\u028a\u028c\u00067\uffff"+
		"\uffff\u0000\u028b\u0285\u0001\u0000\u0000\u0000\u028b\u028a\u0001\u0000"+
		"\u0000\u0000\u028co\u0001\u0000\u0000\u0000)\u0080\u0088\u0092\u009d\u00a8"+
		"\u00bb\u00c5\u00d3\u00dd\u00e4\u00f2\u00f9\u0109\u0114\u0122\u012a\u014a"+
		"\u016b\u0177\u018a\u0193\u019b\u01a9\u01b1\u01bc\u01e4\u01eb\u01f7\u0201"+
		"\u0215\u0223\u023a\u0245\u024e\u0254\u025b\u026a\u0274\u027d\u0283\u028b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}