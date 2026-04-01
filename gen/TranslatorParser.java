// Generated from /Users/zskyh/university/third-year/second-term/procesadores/FortranToCTranslator/src/Translator.g4 by ANTLR 4.13.2
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
		RULE_explist = 32, RULE_proc_call = 33, RULE_subpparamlist = 34, RULE_subproglist = 35, 
		RULE_codproc = 36, RULE_codfun = 37, RULE_fun_body = 38, RULE_fun_body_prime = 39, 
		RULE_expcond = 40, RULE_expcond_prime = 41, RULE_oplog = 42, RULE_factorcond = 43, 
		RULE_opcomp = 44, RULE_do_tail = 45, RULE_if_tail = 46, RULE_if_tail_prime = 47, 
		RULE_doval = 48, RULE_casos = 49, RULE_casos_prime = 50, RULE_etiquetas = 51, 
		RULE_etiquetas_tail = 52, RULE_etiquetas_tail_prime = 53, RULE_listaetiqetas = 54;
	private static String[] makeRuleNames() {
		return new String[] {
			"prg", "dcllist", "cabecera", "cablist", "decsubprog", "sentlist", "sentlist_prime", 
			"dcl", "dcl_varcte", "ctelist", "simpvalue", "tipo", "charlength", "varlist", 
			"varlist_prime", "init", "decproc", "formal_paramlist", "nomparamlist", 
			"nomparamlist_prime", "dec_s_paramlist", "tipoparam", "decfun", "dec_f_paramlist", 
			"dec_f_paramlist_prime", "sent", "exp", "exp_prime", "op", "oparit", 
			"factor", "factor_prime", "explist", "proc_call", "subpparamlist", "subproglist", 
			"codproc", "codfun", "fun_body", "fun_body_prime", "expcond", "expcond_prime", 
			"oplog", "factorcond", "opcomp", "do_tail", "if_tail", "if_tail_prime", 
			"doval", "casos", "casos_prime", "etiquetas", "etiquetas_tail", "etiquetas_tail_prime", 
			"listaetiqetas"
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

	public TranslatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrgContext extends ParserRuleContext {
		public List<TerminalNode> PROGRAM() { return getTokens(TranslatorParser.PROGRAM); }
		public TerminalNode PROGRAM(int i) {
			return getToken(TranslatorParser.PROGRAM, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(PROGRAM);
			setState(111);
			match(IDENT);
			setState(112);
			match(T__0);
			setState(113);
			dcllist();
			setState(114);
			cabecera();
			setState(115);
			sentlist();
			setState(116);
			match(END);
			setState(117);
			match(PROGRAM);
			setState(118);
			match(IDENT);
			setState(119);
			subproglist();
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
		public DclContext dcl() {
			return getRuleContext(DclContext.class,0);
		}
		public DcllistContext dcllist() {
			return getRuleContext(DcllistContext.class,0);
		}
		public DcllistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final DcllistContext dcllist() throws RecognitionException {
		DcllistContext _localctx = new DcllistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dcllist);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				dcl();
				setState(122);
				dcllist();
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
		public List<TerminalNode> INTERFACE() { return getTokens(TranslatorParser.INTERFACE); }
		public TerminalNode INTERFACE(int i) {
			return getToken(TranslatorParser.INTERFACE, i);
		}
		public CablistContext cablist() {
			return getRuleContext(CablistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public CabeceraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CabeceraContext cabecera() throws RecognitionException {
		CabeceraContext _localctx = new CabeceraContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cabecera);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERFACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(INTERFACE);
				setState(128);
				cablist();
				setState(129);
				match(END);
				setState(130);
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
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public CablistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CablistContext cablist() throws RecognitionException {
		CablistContext _localctx = new CablistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cablist);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				decproc();
				setState(136);
				decsubprog();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				decfun();
				setState(139);
				decsubprog();
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
		public DecprocContext decproc() {
			return getRuleContext(DecprocContext.class,0);
		}
		public DecsubprogContext decsubprog() {
			return getRuleContext(DecsubprogContext.class,0);
		}
		public DecfunContext decfun() {
			return getRuleContext(DecfunContext.class,0);
		}
		public DecsubprogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final DecsubprogContext decsubprog() throws RecognitionException {
		DecsubprogContext _localctx = new DecsubprogContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decsubprog);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				decproc();
				setState(144);
				decsubprog();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				decfun();
				setState(147);
				decsubprog();
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_primeContext sentlist_prime() {
			return getRuleContext(Sentlist_primeContext.class,0);
		}
		public SentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SentlistContext sentlist() throws RecognitionException {
		SentlistContext _localctx = new SentlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			sent();
			setState(153);
			sentlist_prime();
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
		public SentContext sent() {
			return getRuleContext(SentContext.class,0);
		}
		public Sentlist_primeContext sentlist_prime() {
			return getRuleContext(Sentlist_primeContext.class,0);
		}
		public Sentlist_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Sentlist_primeContext sentlist_prime() throws RecognitionException {
		Sentlist_primeContext _localctx = new Sentlist_primeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentlist_prime);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				sent();
				setState(156);
				sentlist_prime();
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dcl_varcteContext dcl_varcte() {
			return getRuleContext(Dcl_varcteContext.class,0);
		}
		public DclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final DclContext dcl() throws RecognitionException {
		DclContext _localctx = new DclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dcl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			tipo();
			setState(162);
			dcl_varcte();
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
		public TerminalNode PARAMETER() { return getToken(TranslatorParser.PARAMETER, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Dcl_varcteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Dcl_varcteContext dcl_varcte() throws RecognitionException {
		Dcl_varcteContext _localctx = new Dcl_varcteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_dcl_varcte);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__1);
				setState(165);
				match(PARAMETER);
				setState(166);
				match(T__2);
				setState(167);
				match(IDENT);
				setState(168);
				match(T__3);
				setState(169);
				simpvalue();
				setState(170);
				ctelist();
				setState(171);
				match(T__0);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__2);
				setState(174);
				varlist();
				setState(175);
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
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public CtelistContext ctelist() {
			return getRuleContext(CtelistContext.class,0);
		}
		public CtelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final CtelistContext ctelist() throws RecognitionException {
		CtelistContext _localctx = new CtelistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ctelist);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(T__1);
				setState(180);
				match(IDENT);
				setState(181);
				match(T__3);
				setState(182);
				simpvalue();
				setState(183);
				ctelist();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35465847065542656L) != 0)) ) {
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
	public static class TipoContext extends ParserRuleContext {
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
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(INTEGER);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(REAL);
				}
				break;
			case CHARACTER:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(CHARACTER);
				setState(193);
				charlength();
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__4);
				setState(197);
				match(NUM_INT_CONST);
				setState(198);
				match(T__5);
				}
				break;
			case T__1:
			case T__2:
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
	public static class VarlistContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist_primeContext varlist_prime() {
			return getRuleContext(Varlist_primeContext.class,0);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IDENT);
			setState(203);
			init();
			setState(204);
			varlist_prime();
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
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public Varlist_primeContext varlist_prime() {
			return getRuleContext(Varlist_primeContext.class,0);
		}
		public Varlist_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Varlist_primeContext varlist_prime() throws RecognitionException {
		Varlist_primeContext _localctx = new Varlist_primeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varlist_prime);
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__1);
				setState(207);
				match(IDENT);
				setState(208);
				init();
				setState(209);
				varlist_prime();
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
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(T__3);
				setState(215);
				simpvalue();
				}
				break;
			case T__0:
			case T__1:
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
	public static class DecprocContext extends ParserRuleContext {
		public List<TerminalNode> SUBROUTINE() { return getTokens(TranslatorParser.SUBROUTINE); }
		public TerminalNode SUBROUTINE(int i) {
			return getToken(TranslatorParser.SUBROUTINE, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public Formal_paramlistContext formal_paramlist() {
			return getRuleContext(Formal_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
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
			setState(219);
			match(SUBROUTINE);
			setState(220);
			match(IDENT);
			setState(221);
			formal_paramlist();
			setState(222);
			dec_s_paramlist();
			setState(223);
			match(END);
			setState(224);
			match(SUBROUTINE);
			setState(225);
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
	public static class Formal_paramlistContext extends ParserRuleContext {
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Formal_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Formal_paramlistContext formal_paramlist() throws RecognitionException {
		Formal_paramlistContext _localctx = new Formal_paramlistContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formal_paramlist);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__4);
				setState(228);
				nomparamlist();
				setState(229);
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
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Nomparamlist_primeContext nomparamlist_prime() {
			return getRuleContext(Nomparamlist_primeContext.class,0);
		}
		public NomparamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final NomparamlistContext nomparamlist() throws RecognitionException {
		NomparamlistContext _localctx = new NomparamlistContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_nomparamlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(IDENT);
			setState(235);
			nomparamlist_prime();
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
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public Nomparamlist_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Nomparamlist_primeContext nomparamlist_prime() throws RecognitionException {
		Nomparamlist_primeContext _localctx = new Nomparamlist_primeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nomparamlist_prime);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(T__1);
				setState(238);
				nomparamlist();
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode INTENT() { return getToken(TranslatorParser.INTENT, 0); }
		public TipoparamContext tipoparam() {
			return getRuleContext(TipoparamContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Dec_s_paramlistContext dec_s_paramlist() {
			return getRuleContext(Dec_s_paramlistContext.class,0);
		}
		public Dec_s_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Dec_s_paramlistContext dec_s_paramlist() throws RecognitionException {
		Dec_s_paramlistContext _localctx = new Dec_s_paramlistContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dec_s_paramlist);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				tipo();
				setState(243);
				match(T__1);
				setState(244);
				match(INTENT);
				setState(245);
				match(T__4);
				setState(246);
				tipoparam();
				setState(247);
				match(T__5);
				setState(248);
				match(IDENT);
				setState(249);
				match(T__0);
				setState(250);
				dec_s_paramlist();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1879048192L) != 0)) ) {
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
	public static class DecfunContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(TranslatorParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(TranslatorParser.FUNCTION, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Dec_f_paramlistContext dec_f_paramlist() {
			return getRuleContext(Dec_f_paramlistContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
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
			setState(257);
			match(FUNCTION);
			setState(258);
			match(IDENT);
			setState(259);
			match(T__4);
			setState(260);
			nomparamlist();
			setState(261);
			match(T__5);
			setState(262);
			tipo();
			setState(263);
			match(T__2);
			setState(264);
			match(IDENT);
			setState(265);
			match(T__0);
			setState(266);
			dec_f_paramlist();
			setState(267);
			match(END);
			setState(268);
			match(FUNCTION);
			setState(269);
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
		public Dec_f_paramlist_primeContext dec_f_paramlist_prime() {
			return getRuleContext(Dec_f_paramlist_primeContext.class,0);
		}
		public Dec_f_paramlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Dec_f_paramlistContext dec_f_paramlist() throws RecognitionException {
		Dec_f_paramlistContext _localctx = new Dec_f_paramlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dec_f_paramlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			dec_f_paramlist_prime();
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
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode INTENT() { return getToken(TranslatorParser.INTENT, 0); }
		public TerminalNode IN() { return getToken(TranslatorParser.IN, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Dec_f_paramlist_primeContext dec_f_paramlist_prime() {
			return getRuleContext(Dec_f_paramlist_primeContext.class,0);
		}
		public Dec_f_paramlist_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Dec_f_paramlist_primeContext dec_f_paramlist_prime() throws RecognitionException {
		Dec_f_paramlist_primeContext _localctx = new Dec_f_paramlist_primeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dec_f_paramlist_prime);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				tipo();
				setState(274);
				match(T__1);
				setState(275);
				match(INTENT);
				setState(276);
				match(T__4);
				setState(277);
				match(IN);
				setState(278);
				match(T__5);
				setState(279);
				match(IDENT);
				setState(280);
				match(T__0);
				setState(281);
				dec_f_paramlist_prime();
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
		public CasosContext casos() {
			return getRuleContext(CasosContext.class,0);
		}
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
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
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(IDENT);
				setState(287);
				match(T__3);
				setState(288);
				exp();
				setState(289);
				match(T__0);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				proc_call();
				setState(292);
				match(T__0);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				match(IF);
				setState(295);
				match(T__4);
				setState(296);
				expcond();
				setState(297);
				match(T__5);
				setState(298);
				if_tail();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				match(DO);
				setState(301);
				do_tail();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				match(SELECT);
				setState(303);
				match(CASE);
				setState(304);
				match(T__4);
				setState(305);
				exp();
				setState(306);
				match(T__5);
				setState(307);
				casos();
				setState(308);
				match(END);
				setState(309);
				match(SELECT);
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
			setState(313);
			factor();
			setState(314);
			exp_prime();
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
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Exp_primeContext exp_prime() {
			return getRuleContext(Exp_primeContext.class,0);
		}
		public Exp_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Exp_primeContext exp_prime() throws RecognitionException {
		Exp_primeContext _localctx = new Exp_primeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_exp_prime);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				op();
				setState(317);
				factor();
				setState(318);
				exp_prime();
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
			setState(323);
			oparit();
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
			setState(325);
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
			setState(334);
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
				setState(327);
				simpvalue();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(T__4);
				setState(329);
				exp();
				setState(330);
				match(T__5);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(332);
				match(IDENT);
				setState(333);
				factor_prime();
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
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(T__4);
				setState(337);
				exp();
				setState(338);
				explist();
				setState(339);
				match(T__5);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_explist);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(T__1);
				setState(345);
				exp();
				setState(346);
				explist();
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
	public static class Proc_callContext extends ParserRuleContext {
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
			setState(351);
			match(CALL);
			setState(352);
			match(IDENT);
			setState(353);
			subpparamlist();
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
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
		try {
			setState(361);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				match(T__4);
				setState(356);
				exp();
				setState(357);
				explist();
				setState(358);
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
	public static class SubproglistContext extends ParserRuleContext {
		public CodprocContext codproc() {
			return getRuleContext(CodprocContext.class,0);
		}
		public SubproglistContext subproglist() {
			return getRuleContext(SubproglistContext.class,0);
		}
		public CodfunContext codfun() {
			return getRuleContext(CodfunContext.class,0);
		}
		public SubproglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final SubproglistContext subproglist() throws RecognitionException {
		SubproglistContext _localctx = new SubproglistContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_subproglist);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUBROUTINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				codproc();
				setState(364);
				subproglist();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				codfun();
				setState(367);
				subproglist();
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
		public List<TerminalNode> SUBROUTINE() { return getTokens(TranslatorParser.SUBROUTINE); }
		public TerminalNode SUBROUTINE(int i) {
			return getToken(TranslatorParser.SUBROUTINE, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
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
		enterRule(_localctx, 72, RULE_codproc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(SUBROUTINE);
			setState(373);
			match(IDENT);
			setState(374);
			formal_paramlist();
			setState(375);
			dec_s_paramlist();
			setState(376);
			dcllist();
			setState(377);
			sentlist();
			setState(378);
			match(END);
			setState(379);
			match(SUBROUTINE);
			setState(380);
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
	public static class CodfunContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(TranslatorParser.FUNCTION, 0); }
		public List<TerminalNode> IDENT() { return getTokens(TranslatorParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(TranslatorParser.IDENT, i);
		}
		public NomparamlistContext nomparamlist() {
			return getRuleContext(NomparamlistContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		enterRule(_localctx, 74, RULE_codfun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(FUNCTION);
			setState(383);
			match(IDENT);
			setState(384);
			match(T__4);
			setState(385);
			nomparamlist();
			setState(386);
			match(T__5);
			setState(387);
			tipo();
			setState(388);
			match(T__2);
			setState(389);
			match(IDENT);
			setState(390);
			match(T__0);
			setState(391);
			dec_f_paramlist();
			setState(392);
			dcllist();
			setState(393);
			fun_body();
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
		public TerminalNode CALL() { return getToken(TranslatorParser.CALL, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public SubpparamlistContext subpparamlist() {
			return getRuleContext(SubpparamlistContext.class,0);
		}
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Fun_body_primeContext fun_body_prime() {
			return getRuleContext(Fun_body_primeContext.class,0);
		}
		public Fun_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Fun_bodyContext fun_body() throws RecognitionException {
		Fun_bodyContext _localctx = new Fun_bodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fun_body);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(CALL);
				setState(396);
				match(IDENT);
				setState(397);
				subpparamlist();
				setState(398);
				match(T__0);
				setState(399);
				fun_body();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(IDENT);
				setState(402);
				match(T__3);
				setState(403);
				exp();
				setState(404);
				match(T__0);
				setState(405);
				fun_body_prime();
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
		public TerminalNode END() { return getToken(TranslatorParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(TranslatorParser.FUNCTION, 0); }
		public TerminalNode IDENT() { return getToken(TranslatorParser.IDENT, 0); }
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public Fun_body_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Fun_body_primeContext fun_body_prime() throws RecognitionException {
		Fun_body_primeContext _localctx = new Fun_body_primeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fun_body_prime);
		try {
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case END:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(END);
				setState(410);
				match(FUNCTION);
				setState(411);
				match(IDENT);
				}
				break;
			case CALL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				fun_body();
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
		enterRule(_localctx, 80, RULE_expcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			factorcond();
			setState(416);
			expcond_prime();
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
		public OplogContext oplog() {
			return getRuleContext(OplogContext.class,0);
		}
		public FactorcondContext factorcond() {
			return getRuleContext(FactorcondContext.class,0);
		}
		public Expcond_primeContext expcond_prime() {
			return getRuleContext(Expcond_primeContext.class,0);
		}
		public Expcond_primeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Expcond_primeContext expcond_prime() throws RecognitionException {
		Expcond_primeContext _localctx = new Expcond_primeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expcond_prime);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
			case AND:
			case EQV:
			case NEQV:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				oplog();
				setState(419);
				factorcond();
				setState(420);
				expcond_prime();
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
	public static class OplogContext extends ParserRuleContext {
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
		enterRule(_localctx, 84, RULE_oplog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0)) ) {
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
	public static class FactorcondContext extends ParserRuleContext {
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
		enterRule(_localctx, 86, RULE_factorcond);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				exp();
				setState(428);
				opcomp();
				setState(429);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(T__4);
				setState(432);
				expcond();
				setState(433);
				match(T__5);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(NOT);
				setState(436);
				factorcond();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(438);
				match(FALSE);
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
		enterRule(_localctx, 88, RULE_opcomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
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
	public static class Do_tailContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TranslatorParser.WHILE, 0); }
		public ExpcondContext expcond() {
			return getRuleContext(ExpcondContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
		}
		public TerminalNode ENDDO() { return getToken(TranslatorParser.ENDDO, 0); }
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
		enterRule(_localctx, 90, RULE_do_tail);
		try {
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				match(WHILE);
				setState(444);
				match(T__4);
				setState(445);
				expcond();
				setState(446);
				match(T__5);
				setState(447);
				sentlist();
				setState(448);
				match(ENDDO);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(IDENT);
				setState(451);
				match(T__3);
				setState(452);
				doval();
				setState(453);
				match(T__1);
				setState(454);
				doval();
				setState(455);
				match(T__1);
				setState(456);
				doval();
				setState(457);
				sentlist();
				setState(458);
				match(ENDDO);
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
		public If_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final If_tailContext if_tail() throws RecognitionException {
		If_tailContext _localctx = new If_tailContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_if_tail);
		try {
			setState(467);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CALL:
			case IF:
			case DO:
			case SELECT:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				sent();
				}
				break;
			case THEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(THEN);
				setState(464);
				sentlist();
				setState(465);
				if_tail_prime();
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
		enterRule(_localctx, 94, RULE_if_tail_prime);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENDIF:
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				match(ENDIF);
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(ELSE);
				setState(471);
				sentlist();
				setState(472);
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
		enterRule(_localctx, 96, RULE_doval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_la = _input.LA(1);
			if ( !(_la==NUM_INT_CONST || _la==IDENT) ) {
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
	public static class CasosContext extends ParserRuleContext {
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
		enterRule(_localctx, 98, RULE_casos);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(CASE);
				setState(479);
				casos_prime();
				}
				break;
			case END:
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
	public static class Casos_primeContext extends ParserRuleContext {
		public EtiquetasContext etiquetas() {
			return getRuleContext(EtiquetasContext.class,0);
		}
		public SentlistContext sentlist() {
			return getRuleContext(SentlistContext.class,0);
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
		enterRule(_localctx, 100, RULE_casos_prime);
		try {
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				match(T__4);
				setState(484);
				etiquetas();
				setState(485);
				match(T__5);
				setState(486);
				sentlist();
				setState(487);
				casos();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				match(DEFAULT);
				setState(490);
				sentlist();
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
		enterRule(_localctx, 102, RULE_etiquetas);
		try {
			setState(498);
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
				setState(493);
				simpvalue();
				setState(494);
				etiquetas_tail();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				match(T__16);
				setState(497);
				simpvalue();
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
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public Etiquetas_tail_primeContext etiquetas_tail_prime() {
			return getRuleContext(Etiquetas_tail_primeContext.class,0);
		}
		public Etiquetas_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final Etiquetas_tailContext etiquetas_tail() throws RecognitionException {
		Etiquetas_tailContext _localctx = new Etiquetas_tailContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_etiquetas_tail);
		try {
			setState(503);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				listaetiqetas();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				match(T__16);
				setState(502);
				etiquetas_tail_prime();
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
		enterRule(_localctx, 106, RULE_etiquetas_tail_prime);
		try {
			setState(507);
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
				setState(505);
				simpvalue();
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
	public static class ListaetiqetasContext extends ParserRuleContext {
		public SimpvalueContext simpvalue() {
			return getRuleContext(SimpvalueContext.class,0);
		}
		public ListaetiqetasContext listaetiqetas() {
			return getRuleContext(ListaetiqetasContext.class,0);
		}
		public ListaetiqetasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ListaetiqetasContext listaetiqetas() throws RecognitionException {
		ListaetiqetasContext _localctx = new ListaetiqetasContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_listaetiqetas);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(T__1);
				setState(510);
				simpvalue();
				setState(511);
				listaetiqetas();
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

	public static final String _serializedATN =
		"\u0004\u0001:\u0205\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001~\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0086"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u008e\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0097\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00a0\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b2\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bb\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c3\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00c9\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00d5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00da\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00e9\b\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f1\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u00fe\b\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u011d\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0138\b\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0142\b\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u014f\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0157\b\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u015e\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u016a"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0173\b#"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0198\b&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u019e\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u01a8\b)\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01b8"+
		"\b+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01cd\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u01d4\b.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u01db\b/\u00010\u00010\u00011\u00011\u0001"+
		"1\u00031\u01e2\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u01ec\b2\u00013\u00013\u00013\u00013\u00013\u00033\u01f3\b3\u0001"+
		"4\u00014\u00014\u00034\u01f8\b4\u00015\u00015\u00035\u01fc\b5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u0203\b6\u00016\u0000\u00007\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjl\u0000\u0006\u0001\u000016\u0001"+
		"\u0000\u001c\u001e\u0001\u0000\u0007\n\u0001\u0000,/\u0001\u0000\u000b"+
		"\u0010\u0001\u000067\u01fa\u0000n\u0001\u0000\u0000\u0000\u0002}\u0001"+
		"\u0000\u0000\u0000\u0004\u0085\u0001\u0000\u0000\u0000\u0006\u008d\u0001"+
		"\u0000\u0000\u0000\b\u0096\u0001\u0000\u0000\u0000\n\u0098\u0001\u0000"+
		"\u0000\u0000\f\u009f\u0001\u0000\u0000\u0000\u000e\u00a1\u0001\u0000\u0000"+
		"\u0000\u0010\u00b1\u0001\u0000\u0000\u0000\u0012\u00ba\u0001\u0000\u0000"+
		"\u0000\u0014\u00bc\u0001\u0000\u0000\u0000\u0016\u00c2\u0001\u0000\u0000"+
		"\u0000\u0018\u00c8\u0001\u0000\u0000\u0000\u001a\u00ca\u0001\u0000\u0000"+
		"\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000\u0000"+
		"\u0000 \u00db\u0001\u0000\u0000\u0000\"\u00e8\u0001\u0000\u0000\u0000"+
		"$\u00ea\u0001\u0000\u0000\u0000&\u00f0\u0001\u0000\u0000\u0000(\u00fd"+
		"\u0001\u0000\u0000\u0000*\u00ff\u0001\u0000\u0000\u0000,\u0101\u0001\u0000"+
		"\u0000\u0000.\u010f\u0001\u0000\u0000\u00000\u011c\u0001\u0000\u0000\u0000"+
		"2\u0137\u0001\u0000\u0000\u00004\u0139\u0001\u0000\u0000\u00006\u0141"+
		"\u0001\u0000\u0000\u00008\u0143\u0001\u0000\u0000\u0000:\u0145\u0001\u0000"+
		"\u0000\u0000<\u014e\u0001\u0000\u0000\u0000>\u0156\u0001\u0000\u0000\u0000"+
		"@\u015d\u0001\u0000\u0000\u0000B\u015f\u0001\u0000\u0000\u0000D\u0169"+
		"\u0001\u0000\u0000\u0000F\u0172\u0001\u0000\u0000\u0000H\u0174\u0001\u0000"+
		"\u0000\u0000J\u017e\u0001\u0000\u0000\u0000L\u0197\u0001\u0000\u0000\u0000"+
		"N\u019d\u0001\u0000\u0000\u0000P\u019f\u0001\u0000\u0000\u0000R\u01a7"+
		"\u0001\u0000\u0000\u0000T\u01a9\u0001\u0000\u0000\u0000V\u01b7\u0001\u0000"+
		"\u0000\u0000X\u01b9\u0001\u0000\u0000\u0000Z\u01cc\u0001\u0000\u0000\u0000"+
		"\\\u01d3\u0001\u0000\u0000\u0000^\u01da\u0001\u0000\u0000\u0000`\u01dc"+
		"\u0001\u0000\u0000\u0000b\u01e1\u0001\u0000\u0000\u0000d\u01eb\u0001\u0000"+
		"\u0000\u0000f\u01f2\u0001\u0000\u0000\u0000h\u01f7\u0001\u0000\u0000\u0000"+
		"j\u01fb\u0001\u0000\u0000\u0000l\u0202\u0001\u0000\u0000\u0000no\u0005"+
		"\u0012\u0000\u0000op\u00057\u0000\u0000pq\u0005\u0001\u0000\u0000qr\u0003"+
		"\u0002\u0001\u0000rs\u0003\u0004\u0002\u0000st\u0003\n\u0005\u0000tu\u0005"+
		"\u0013\u0000\u0000uv\u0005\u0012\u0000\u0000vw\u00057\u0000\u0000wx\u0003"+
		"F#\u0000x\u0001\u0001\u0000\u0000\u0000yz\u0003\u000e\u0007\u0000z{\u0003"+
		"\u0002\u0001\u0000{~\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000\u0000"+
		"}y\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0003\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\u0014\u0000\u0000\u0080\u0081\u0003\u0006"+
		"\u0003\u0000\u0081\u0082\u0005\u0013\u0000\u0000\u0082\u0083\u0005\u0014"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000"+
		"\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0005\u0001\u0000\u0000\u0000\u0087\u0088\u0003 \u0010"+
		"\u0000\u0088\u0089\u0003\b\u0004\u0000\u0089\u008e\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0003,\u0016\u0000\u008b\u008c\u0003\b\u0004\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u0087\u0001\u0000\u0000\u0000\u008d"+
		"\u008a\u0001\u0000\u0000\u0000\u008e\u0007\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0003 \u0010\u0000\u0090\u0091\u0003\b\u0004\u0000\u0091\u0097"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0003,\u0016\u0000\u0093\u0094\u0003"+
		"\b\u0004\u0000\u0094\u0097\u0001\u0000\u0000\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096\u0092\u0001\u0000"+
		"\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0097\t\u0001\u0000\u0000"+
		"\u0000\u0098\u0099\u00032\u0019\u0000\u0099\u009a\u0003\f\u0006\u0000"+
		"\u009a\u000b\u0001\u0000\u0000\u0000\u009b\u009c\u00032\u0019\u0000\u009c"+
		"\u009d\u0003\f\u0006\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u00a0"+
		"\u0001\u0000\u0000\u0000\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003"+
		"\u0016\u000b\u0000\u00a2\u00a3\u0003\u0010\b\u0000\u00a3\u000f\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0005\u0002\u0000\u0000\u00a5\u00a6\u0005\u001a"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a8\u00057\u0000"+
		"\u0000\u00a8\u00a9\u0005\u0004\u0000\u0000\u00a9\u00aa\u0003\u0014\n\u0000"+
		"\u00aa\u00ab\u0003\u0012\t\u0000\u00ab\u00ac\u0005\u0001\u0000\u0000\u00ac"+
		"\u00b2\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae"+
		"\u00af\u0003\u001a\r\u0000\u00af\u00b0\u0005\u0001\u0000\u0000\u00b0\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b1\u00a4\u0001\u0000\u0000\u0000\u00b1\u00ad"+
		"\u0001\u0000\u0000\u0000\u00b2\u0011\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\u0002\u0000\u0000\u00b4\u00b5\u00057\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0004\u0000\u0000\u00b6\u00b7\u0003\u0014\n\u0000\u00b7\u00b8\u0003\u0012"+
		"\t\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b3\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00bd\u0007\u0000\u0000"+
		"\u0000\u00bd\u0015\u0001\u0000\u0000\u0000\u00be\u00c3\u0005\u0017\u0000"+
		"\u0000\u00bf\u00c3\u0005\u0018\u0000\u0000\u00c0\u00c1\u0005\u0019\u0000"+
		"\u0000\u00c1\u00c3\u0003\u0018\f\u0000\u00c2\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u0017\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0005\u0000\u0000"+
		"\u00c5\u00c6\u00056\u0000\u0000\u00c6\u00c9\u0005\u0006\u0000\u0000\u00c7"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c4\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u0019\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u00057\u0000\u0000\u00cb\u00cc\u0003\u001e\u000f\u0000\u00cc\u00cd"+
		"\u0003\u001c\u000e\u0000\u00cd\u001b\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0002\u0000\u0000\u00cf\u00d0\u00057\u0000\u0000\u00d0\u00d1\u0003"+
		"\u001e\u000f\u0000\u00d1\u00d2\u0003\u001c\u000e\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u001d\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u0004\u0000\u0000\u00d7\u00da\u0003"+
		"\u0014\n\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u001f\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0005\u0015\u0000\u0000\u00dc\u00dd\u00057\u0000"+
		"\u0000\u00dd\u00de\u0003\"\u0011\u0000\u00de\u00df\u0003(\u0014\u0000"+
		"\u00df\u00e0\u0005\u0013\u0000\u0000\u00e0\u00e1\u0005\u0015\u0000\u0000"+
		"\u00e1\u00e2\u00057\u0000\u0000\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0005\u0000\u0000\u00e4\u00e5\u0003$\u0012\u0000\u00e5\u00e6\u0005"+
		"\u0006\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e9#\u0001\u0000\u0000\u0000\u00ea\u00eb\u00057\u0000"+
		"\u0000\u00eb\u00ec\u0003&\u0013\u0000\u00ec%\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0002\u0000\u0000\u00ee\u00f1\u0003$\u0012\u0000\u00ef\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ed\u0001\u0000\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\'\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003"+
		"\u0016\u000b\u0000\u00f3\u00f4\u0005\u0002\u0000\u0000\u00f4\u00f5\u0005"+
		"\u001b\u0000\u0000\u00f5\u00f6\u0005\u0005\u0000\u0000\u00f6\u00f7\u0003"+
		"*\u0015\u0000\u00f7\u00f8\u0005\u0006\u0000\u0000\u00f8\u00f9\u00057\u0000"+
		"\u0000\u00f9\u00fa\u0005\u0001\u0000\u0000\u00fa\u00fb\u0003(\u0014\u0000"+
		"\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fd\u00f2\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe)\u0001\u0000\u0000\u0000\u00ff\u0100\u0007\u0001\u0000\u0000\u0100"+
		"+\u0001\u0000\u0000\u0000\u0101\u0102\u0005\u0016\u0000\u0000\u0102\u0103"+
		"\u00057\u0000\u0000\u0103\u0104\u0005\u0005\u0000\u0000\u0104\u0105\u0003"+
		"$\u0012\u0000\u0105\u0106\u0005\u0006\u0000\u0000\u0106\u0107\u0003\u0016"+
		"\u000b\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u00057\u0000"+
		"\u0000\u0109\u010a\u0005\u0001\u0000\u0000\u010a\u010b\u0003.\u0017\u0000"+
		"\u010b\u010c\u0005\u0013\u0000\u0000\u010c\u010d\u0005\u0016\u0000\u0000"+
		"\u010d\u010e\u00057\u0000\u0000\u010e-\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u00030\u0018\u0000\u0110/\u0001\u0000\u0000\u0000\u0111\u0112\u0003\u0016"+
		"\u000b\u0000\u0112\u0113\u0005\u0002\u0000\u0000\u0113\u0114\u0005\u001b"+
		"\u0000\u0000\u0114\u0115\u0005\u0005\u0000\u0000\u0115\u0116\u0005\u001c"+
		"\u0000\u0000\u0116\u0117\u0005\u0006\u0000\u0000\u0117\u0118\u00057\u0000"+
		"\u0000\u0118\u0119\u0005\u0001\u0000\u0000\u0119\u011a\u00030\u0018\u0000"+
		"\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u011d\u0001\u0000\u0000\u0000"+
		"\u011c\u0111\u0001\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011d1\u0001\u0000\u0000\u0000\u011e\u011f\u00057\u0000\u0000\u011f\u0120"+
		"\u0005\u0004\u0000\u0000\u0120\u0121\u00034\u001a\u0000\u0121\u0122\u0005"+
		"\u0001\u0000\u0000\u0122\u0138\u0001\u0000\u0000\u0000\u0123\u0124\u0003"+
		"B!\u0000\u0124\u0125\u0005\u0001\u0000\u0000\u0125\u0138\u0001\u0000\u0000"+
		"\u0000\u0126\u0127\u0005 \u0000\u0000\u0127\u0128\u0005\u0005\u0000\u0000"+
		"\u0128\u0129\u0003P(\u0000\u0129\u012a\u0005\u0006\u0000\u0000\u012a\u012b"+
		"\u0003\\.\u0000\u012b\u0138\u0001\u0000\u0000\u0000\u012c\u012d\u0005"+
		"!\u0000\u0000\u012d\u0138\u0003Z-\u0000\u012e\u012f\u0005\"\u0000\u0000"+
		"\u012f\u0130\u0005#\u0000\u0000\u0130\u0131\u0005\u0005\u0000\u0000\u0131"+
		"\u0132\u00034\u001a\u0000\u0132\u0133\u0005\u0006\u0000\u0000\u0133\u0134"+
		"\u0003b1\u0000\u0134\u0135\u0005\u0013\u0000\u0000\u0135\u0136\u0005\""+
		"\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u011e\u0001\u0000"+
		"\u0000\u0000\u0137\u0123\u0001\u0000\u0000\u0000\u0137\u0126\u0001\u0000"+
		"\u0000\u0000\u0137\u012c\u0001\u0000\u0000\u0000\u0137\u012e\u0001\u0000"+
		"\u0000\u0000\u01383\u0001\u0000\u0000\u0000\u0139\u013a\u0003<\u001e\u0000"+
		"\u013a\u013b\u00036\u001b\u0000\u013b5\u0001\u0000\u0000\u0000\u013c\u013d"+
		"\u00038\u001c\u0000\u013d\u013e\u0003<\u001e\u0000\u013e\u013f\u00036"+
		"\u001b\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u0142\u0001\u0000"+
		"\u0000\u0000\u0141\u013c\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000"+
		"\u0000\u0000\u01427\u0001\u0000\u0000\u0000\u0143\u0144\u0003:\u001d\u0000"+
		"\u01449\u0001\u0000\u0000\u0000\u0145\u0146\u0007\u0002\u0000\u0000\u0146"+
		";\u0001\u0000\u0000\u0000\u0147\u014f\u0003\u0014\n\u0000\u0148\u0149"+
		"\u0005\u0005\u0000\u0000\u0149\u014a\u00034\u001a\u0000\u014a\u014b\u0005"+
		"\u0006\u0000\u0000\u014b\u014f\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"7\u0000\u0000\u014d\u014f\u0003>\u001f\u0000\u014e\u0147\u0001\u0000\u0000"+
		"\u0000\u014e\u0148\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f=\u0001\u0000\u0000\u0000\u0150\u0151\u0005\u0005\u0000\u0000"+
		"\u0151\u0152\u00034\u001a\u0000\u0152\u0153\u0003@ \u0000\u0153\u0154"+
		"\u0005\u0006\u0000\u0000\u0154\u0157\u0001\u0000\u0000\u0000\u0155\u0157"+
		"\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157?\u0001\u0000\u0000\u0000\u0158\u0159\u0005"+
		"\u0002\u0000\u0000\u0159\u015a\u00034\u001a\u0000\u015a\u015b\u0003@ "+
		"\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015e\u0001\u0000\u0000"+
		"\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000"+
		"\u0000\u015eA\u0001\u0000\u0000\u0000\u015f\u0160\u0005\u001f\u0000\u0000"+
		"\u0160\u0161\u00057\u0000\u0000\u0161\u0162\u0003D\"\u0000\u0162C\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0005\u0005\u0000\u0000\u0164\u0165\u0003"+
		"4\u001a\u0000\u0165\u0166\u0003@ \u0000\u0166\u0167\u0005\u0006\u0000"+
		"\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u016a\u0001\u0000\u0000"+
		"\u0000\u0169\u0163\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016aE\u0001\u0000\u0000\u0000\u016b\u016c\u0003H$\u0000\u016c"+
		"\u016d\u0003F#\u0000\u016d\u0173\u0001\u0000\u0000\u0000\u016e\u016f\u0003"+
		"J%\u0000\u016f\u0170\u0003F#\u0000\u0170\u0173\u0001\u0000\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u016b\u0001\u0000\u0000\u0000"+
		"\u0172\u016e\u0001\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000"+
		"\u0173G\u0001\u0000\u0000\u0000\u0174\u0175\u0005\u0015\u0000\u0000\u0175"+
		"\u0176\u00057\u0000\u0000\u0176\u0177\u0003\"\u0011\u0000\u0177\u0178"+
		"\u0003(\u0014\u0000\u0178\u0179\u0003\u0002\u0001\u0000\u0179\u017a\u0003"+
		"\n\u0005\u0000\u017a\u017b\u0005\u0013\u0000\u0000\u017b\u017c\u0005\u0015"+
		"\u0000\u0000\u017c\u017d\u00057\u0000\u0000\u017dI\u0001\u0000\u0000\u0000"+
		"\u017e\u017f\u0005\u0016\u0000\u0000\u017f\u0180\u00057\u0000\u0000\u0180"+
		"\u0181\u0005\u0005\u0000\u0000\u0181\u0182\u0003$\u0012\u0000\u0182\u0183"+
		"\u0005\u0006\u0000\u0000\u0183\u0184\u0003\u0016\u000b\u0000\u0184\u0185"+
		"\u0005\u0003\u0000\u0000\u0185\u0186\u00057\u0000\u0000\u0186\u0187\u0005"+
		"\u0001\u0000\u0000\u0187\u0188\u0003.\u0017\u0000\u0188\u0189\u0003\u0002"+
		"\u0001\u0000\u0189\u018a\u0003L&\u0000\u018aK\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005\u001f\u0000\u0000\u018c\u018d\u00057\u0000\u0000\u018d"+
		"\u018e\u0003D\"\u0000\u018e\u018f\u0005\u0001\u0000\u0000\u018f\u0190"+
		"\u0003L&\u0000\u0190\u0198\u0001\u0000\u0000\u0000\u0191\u0192\u00057"+
		"\u0000\u0000\u0192\u0193\u0005\u0004\u0000\u0000\u0193\u0194\u00034\u001a"+
		"\u0000\u0194\u0195\u0005\u0001\u0000\u0000\u0195\u0196\u0003N\'\u0000"+
		"\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u018b\u0001\u0000\u0000\u0000"+
		"\u0197\u0191\u0001\u0000\u0000\u0000\u0198M\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0005\u0013\u0000\u0000\u019a\u019b\u0005\u0016\u0000\u0000\u019b"+
		"\u019e\u00057\u0000\u0000\u019c\u019e\u0003L&\u0000\u019d\u0199\u0001"+
		"\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019eO\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0003V+\u0000\u01a0\u01a1\u0003R)\u0000\u01a1"+
		"Q\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003T*\u0000\u01a3\u01a4\u0003"+
		"V+\u0000\u01a4\u01a5\u0003R)\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8S\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u0007\u0003\u0000\u0000\u01aaU\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u00034\u001a\u0000\u01ac\u01ad\u0003X,\u0000\u01ad\u01ae\u00034\u001a"+
		"\u0000\u01ae\u01b8\u0001\u0000\u0000\u0000\u01af\u01b0\u0005\u0005\u0000"+
		"\u0000\u01b0\u01b1\u0003P(\u0000\u01b1\u01b2\u0005\u0006\u0000\u0000\u01b2"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b3\u01b4\u00050\u0000\u0000\u01b4\u01b8"+
		"\u0003V+\u0000\u01b5\u01b8\u0005*\u0000\u0000\u01b6\u01b8\u0005+\u0000"+
		"\u0000\u01b7\u01ab\u0001\u0000\u0000\u0000\u01b7\u01af\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8W\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0007\u0004\u0000\u0000\u01baY\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0005$\u0000\u0000\u01bc\u01bd\u0005\u0005\u0000\u0000\u01bd\u01be"+
		"\u0003P(\u0000\u01be\u01bf\u0005\u0006\u0000\u0000\u01bf\u01c0\u0003\n"+
		"\u0005\u0000\u01c0\u01c1\u0005%\u0000\u0000\u01c1\u01cd\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u00057\u0000\u0000\u01c3\u01c4\u0005\u0004\u0000\u0000"+
		"\u01c4\u01c5\u0003`0\u0000\u01c5\u01c6\u0005\u0002\u0000\u0000\u01c6\u01c7"+
		"\u0003`0\u0000\u01c7\u01c8\u0005\u0002\u0000\u0000\u01c8\u01c9\u0003`"+
		"0\u0000\u01c9\u01ca\u0003\n\u0005\u0000\u01ca\u01cb\u0005%\u0000\u0000"+
		"\u01cb\u01cd\u0001\u0000\u0000\u0000\u01cc\u01bb\u0001\u0000\u0000\u0000"+
		"\u01cc\u01c2\u0001\u0000\u0000\u0000\u01cd[\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d4\u00032\u0019\u0000\u01cf\u01d0\u0005&\u0000\u0000\u01d0\u01d1\u0003"+
		"\n\u0005\u0000\u01d1\u01d2\u0003^/\u0000\u01d2\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d3\u01ce\u0001\u0000\u0000\u0000\u01d3\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d4]\u0001\u0000\u0000\u0000\u01d5\u01db\u0005\'\u0000\u0000"+
		"\u01d6\u01d7\u0005(\u0000\u0000\u01d7\u01d8\u0003\n\u0005\u0000\u01d8"+
		"\u01d9\u0005\'\u0000\u0000\u01d9\u01db\u0001\u0000\u0000\u0000\u01da\u01d5"+
		"\u0001\u0000\u0000\u0000\u01da\u01d6\u0001\u0000\u0000\u0000\u01db_\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0007\u0005\u0000\u0000\u01dda\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0005#\u0000\u0000\u01df\u01e2\u0003d2\u0000"+
		"\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01de\u0001\u0000\u0000\u0000"+
		"\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2c\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e4\u0005\u0005\u0000\u0000\u01e4\u01e5\u0003f3\u0000\u01e5\u01e6\u0005"+
		"\u0006\u0000\u0000\u01e6\u01e7\u0003\n\u0005\u0000\u01e7\u01e8\u0003b"+
		"1\u0000\u01e8\u01ec\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005)\u0000\u0000"+
		"\u01ea\u01ec\u0003\n\u0005\u0000\u01eb\u01e3\u0001\u0000\u0000\u0000\u01eb"+
		"\u01e9\u0001\u0000\u0000\u0000\u01ece\u0001\u0000\u0000\u0000\u01ed\u01ee"+
		"\u0003\u0014\n\u0000\u01ee\u01ef\u0003h4\u0000\u01ef\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0005\u0011\u0000\u0000\u01f1\u01f3\u0003\u0014"+
		"\n\u0000\u01f2\u01ed\u0001\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f3g\u0001\u0000\u0000\u0000\u01f4\u01f8\u0003l6\u0000\u01f5"+
		"\u01f6\u0005\u0011\u0000\u0000\u01f6\u01f8\u0003j5\u0000\u01f7\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000\u0000\u01f8i\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fc\u0003\u0014\n\u0000\u01fa\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fck\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u0002\u0000\u0000"+
		"\u01fe\u01ff\u0003\u0014\n\u0000\u01ff\u0200\u0003l6\u0000\u0200\u0203"+
		"\u0001\u0000\u0000\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01fd"+
		"\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203m\u0001"+
		"\u0000\u0000\u0000#}\u0085\u008d\u0096\u009f\u00b1\u00ba\u00c2\u00c8\u00d4"+
		"\u00d9\u00e8\u00f0\u00fd\u011c\u0137\u0141\u014e\u0156\u015d\u0169\u0172"+
		"\u0197\u019d\u01a7\u01b7\u01cc\u01d3\u01da\u01e1\u01eb\u01f2\u01f7\u01fb"+
		"\u0202";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}