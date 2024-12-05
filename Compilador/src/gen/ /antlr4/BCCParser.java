// Generated from /Users/pedronaves/Desktop/Mesa - MacBook Pro de Pedro/IF/6 Período /Compiladores-IF-Goiano/Compilador/src/main/java/antlr4/BCC.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class BCCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TIPO_VAR=16, 
		NUM_INT=17, NUM_REAL=18, VARIAVEL=19, OP_ARIT1=20, OP_ARIT2=21, OP_REL=22, 
		OP_BOOL=23;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_expressaoAritmetica = 3, 
		RULE_termoAritmetico = 4, RULE_fatorAritmetico = 5, RULE_expressaoRelacional = 6, 
		RULE_termoRelacional = 7, RULE_listaComandos = 8, RULE_comando = 9, RULE_comandoAtribuicao = 10, 
		RULE_comandoEntrada = 11, RULE_comandoSaida = 12, RULE_comandoCondicao = 13, 
		RULE_comandoRepeticao = 14, RULE_subAlgoritmo = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "expressaoAritmetica", 
			"termoAritmetico", "fatorAritmetico", "expressaoRelacional", "termoRelacional", 
			"listaComandos", "comando", "comandoAtribuicao", "comandoEntrada", "comandoSaida", 
			"comandoCondicao", "comandoRepeticao", "subAlgoritmo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'DECLARACOES'", "'ALGORITMO'", "'('", "')'", "'ATRIBUIR'", 
			"'A'", "'LER'", "'IMPRIMIR'", "'SE'", "'ENTAO'", "'SENAO'", "'ENQUANTO'", 
			"'INICIO'", "'FIM'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TIPO_VAR", "NUM_INT", "NUM_REAL", "VARIAVEL", 
			"OP_ARIT1", "OP_ARIT2", "OP_REL", "OP_BOOL"
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
	public String getGrammarFileName() { return "BCC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BCCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__0);
			setState(33);
			match(T__1);
			setState(34);
			listaDeclaracoes();
			setState(35);
			match(T__0);
			setState(36);
			match(T__2);
			setState(37);
			listaComandos();
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
	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitListaDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				declaracao();
				setState(40);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				declaracao();
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO_VAR() { return getToken(BCCParser.TIPO_VAR, 0); }
		public TerminalNode VARIAVEL() { return getToken(BCCParser.VARIAVEL, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(TIPO_VAR);
			setState(46);
			match(T__0);
			setState(47);
			match(VARIAVEL);
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
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OP_ARIT1() { return getToken(BCCParser.OP_ARIT1, 0); }
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			termoAritmetico(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
					setState(52);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(53);
					match(OP_ARIT1);
					setState(54);
					termoAritmetico(0);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoAritmeticoContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public TerminalNode OP_ARIT2() { return getToken(BCCParser.OP_ARIT2, 0); }
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitTermoAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitTermoAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		return termoAritmetico(0);
	}

	private TermoAritmeticoContext termoAritmetico(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, _parentState);
		TermoAritmeticoContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_termoAritmetico, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			fatorAritmetico();
			}
			_ctx.stop = _input.LT(-1);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermoAritmeticoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termoAritmetico);
					setState(63);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(64);
					match(OP_ARIT2);
					setState(65);
					fatorAritmetico();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(BCCParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(BCCParser.NUM_REAL, 0); }
		public TerminalNode VARIAVEL() { return getToken(BCCParser.VARIAVEL, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitFatorAritmetico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitFatorAritmetico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fatorAritmetico);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(NUM_REAL);
				}
				break;
			case VARIAVEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(VARIAVEL);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(T__3);
				setState(75);
				expressaoAritmetica(0);
				setState(76);
				match(T__4);
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
	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public TerminalNode OP_BOOL() { return getToken(BCCParser.OP_BOOL, 0); }
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitExpressaoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitExpressaoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		return expressaoRelacional(0);
	}

	private ExpressaoRelacionalContext expressaoRelacional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, _parentState);
		ExpressaoRelacionalContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expressaoRelacional, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(81);
			termoRelacional();
			}
			_ctx.stop = _input.LT(-1);
			setState(88);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoRelacionalContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoRelacional);
					setState(83);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(84);
					match(OP_BOOL);
					setState(85);
					termoRelacional();
					}
					} 
				}
				setState(90);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoRelacionalContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OP_REL() { return getToken(BCCParser.OP_REL, 0); }
		public List<ExpressaoRelacionalContext> expressaoRelacional() {
			return getRuleContexts(ExpressaoRelacionalContext.class);
		}
		public ExpressaoRelacionalContext expressaoRelacional(int i) {
			return getRuleContext(ExpressaoRelacionalContext.class,i);
		}
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitTermoRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitTermoRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_termoRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			expressaoAritmetica(0);
			setState(92);
			match(OP_REL);
			setState(93);
			expressaoRelacional(0);
			setState(94);
			match(T__3);
			setState(95);
			expressaoRelacional(0);
			setState(96);
			match(T__4);
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
	public static class ListaComandosContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitListaComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitListaComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaComandos);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				comando();
				setState(99);
				listaComandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				comando();
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
	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				comandoAtribuicao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				comandoEntrada();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				comandoSaida();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				comandoCondicao();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				comandoRepeticao();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				subAlgoritmo();
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
	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode VARIAVEL() { return getToken(BCCParser.VARIAVEL, 0); }
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitComandoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitComandoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(T__5);
			setState(113);
			expressaoAritmetica(0);
			setState(114);
			match(T__6);
			setState(115);
			match(VARIAVEL);
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
	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode VARIAVEL() { return getToken(BCCParser.VARIAVEL, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitComandoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitComandoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__7);
			setState(118);
			match(VARIAVEL);
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
	public static class ComandoSaidaContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitComandoSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitComandoSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__8);
			setState(121);
			expressaoAritmetica(0);
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
	public static class ComandoCondicaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitComandoCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitComandoCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoCondicao);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__9);
				setState(124);
				expressaoRelacional(0);
				setState(125);
				match(T__10);
				setState(126);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(T__9);
				setState(129);
				expressaoRelacional(0);
				setState(130);
				match(T__10);
				setState(131);
				comando();
				setState(132);
				match(T__11);
				setState(133);
				comando();
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
	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitComandoRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitComandoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__12);
			setState(138);
			expressaoRelacional(0);
			setState(139);
			comando();
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
	public static class SubAlgoritmoContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BCCListener ) ((BCCListener)listener).exitSubAlgoritmo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BCCVisitor ) return ((BCCVisitor<? extends T>)visitor).visitSubAlgoritmo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__13);
			setState(142);
			listaComandos();
			setState(143);
			match(T__14);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 4:
			return termoAritmetico_sempred((TermoAritmeticoContext)_localctx, predIndex);
		case 6:
			return expressaoRelacional_sempred((ExpressaoRelacionalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termoAritmetico_sempred(TermoAritmeticoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoRelacional_sempred(ExpressaoRelacionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u0092\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u00038\b\u0003\n\u0003\f\u0003;\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004C\b\u0004\n\u0004"+
		"\f\u0004F\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006W\b"+
		"\u0006\n\u0006\f\u0006Z\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bg\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\to\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0088"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0003\u0006\b\f\u0010"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e\u0000\u0000\u008f\u0000 \u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000"+
		"\u0000\b<\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fP\u0001"+
		"\u0000\u0000\u0000\u000e[\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000"+
		"\u0000\u0012n\u0001\u0000\u0000\u0000\u0014p\u0001\u0000\u0000\u0000\u0016"+
		"u\u0001\u0000\u0000\u0000\u0018x\u0001\u0000\u0000\u0000\u001a\u0087\u0001"+
		"\u0000\u0000\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u008d\u0001"+
		"\u0000\u0000\u0000 !\u0005\u0001\u0000\u0000!\"\u0005\u0002\u0000\u0000"+
		"\"#\u0003\u0002\u0001\u0000#$\u0005\u0001\u0000\u0000$%\u0005\u0003\u0000"+
		"\u0000%&\u0003\u0010\b\u0000&\u0001\u0001\u0000\u0000\u0000\'(\u0003\u0004"+
		"\u0002\u0000()\u0003\u0002\u0001\u0000),\u0001\u0000\u0000\u0000*,\u0003"+
		"\u0004\u0002\u0000+\'\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000"+
		",\u0003\u0001\u0000\u0000\u0000-.\u0005\u0010\u0000\u0000./\u0005\u0001"+
		"\u0000\u0000/0\u0005\u0013\u0000\u00000\u0005\u0001\u0000\u0000\u0000"+
		"12\u0006\u0003\uffff\uffff\u000023\u0003\b\u0004\u000039\u0001\u0000\u0000"+
		"\u000045\n\u0002\u0000\u000056\u0005\u0014\u0000\u000068\u0003\b\u0004"+
		"\u000074\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<=\u0006\u0004\uffff\uffff\u0000=>\u0003\n\u0005"+
		"\u0000>D\u0001\u0000\u0000\u0000?@\n\u0002\u0000\u0000@A\u0005\u0015\u0000"+
		"\u0000AC\u0003\n\u0005\u0000B?\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000E\t\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000GO\u0005\u0011\u0000\u0000HO\u0005"+
		"\u0012\u0000\u0000IO\u0005\u0013\u0000\u0000JK\u0005\u0004\u0000\u0000"+
		"KL\u0003\u0006\u0003\u0000LM\u0005\u0005\u0000\u0000MO\u0001\u0000\u0000"+
		"\u0000NG\u0001\u0000\u0000\u0000NH\u0001\u0000\u0000\u0000NI\u0001\u0000"+
		"\u0000\u0000NJ\u0001\u0000\u0000\u0000O\u000b\u0001\u0000\u0000\u0000"+
		"PQ\u0006\u0006\uffff\uffff\u0000QR\u0003\u000e\u0007\u0000RX\u0001\u0000"+
		"\u0000\u0000ST\n\u0002\u0000\u0000TU\u0005\u0017\u0000\u0000UW\u0003\u000e"+
		"\u0007\u0000VS\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001"+
		"\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000Y\r\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000[\\\u0003\u0006\u0003\u0000\\]\u0005\u0016\u0000"+
		"\u0000]^\u0003\f\u0006\u0000^_\u0005\u0004\u0000\u0000_`\u0003\f\u0006"+
		"\u0000`a\u0005\u0005\u0000\u0000a\u000f\u0001\u0000\u0000\u0000bc\u0003"+
		"\u0012\t\u0000cd\u0003\u0010\b\u0000dg\u0001\u0000\u0000\u0000eg\u0003"+
		"\u0012\t\u0000fb\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0011"+
		"\u0001\u0000\u0000\u0000ho\u0003\u0014\n\u0000io\u0003\u0016\u000b\u0000"+
		"jo\u0003\u0018\f\u0000ko\u0003\u001a\r\u0000lo\u0003\u001c\u000e\u0000"+
		"mo\u0003\u001e\u000f\u0000nh\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000"+
		"\u0000nj\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000nm\u0001\u0000\u0000\u0000o\u0013\u0001\u0000\u0000\u0000"+
		"pq\u0005\u0006\u0000\u0000qr\u0003\u0006\u0003\u0000rs\u0005\u0007\u0000"+
		"\u0000st\u0005\u0013\u0000\u0000t\u0015\u0001\u0000\u0000\u0000uv\u0005"+
		"\b\u0000\u0000vw\u0005\u0013\u0000\u0000w\u0017\u0001\u0000\u0000\u0000"+
		"xy\u0005\t\u0000\u0000yz\u0003\u0006\u0003\u0000z\u0019\u0001\u0000\u0000"+
		"\u0000{|\u0005\n\u0000\u0000|}\u0003\f\u0006\u0000}~\u0005\u000b\u0000"+
		"\u0000~\u007f\u0003\u0012\t\u0000\u007f\u0088\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\n\u0000\u0000\u0081\u0082\u0003\f\u0006\u0000\u0082"+
		"\u0083\u0005\u000b\u0000\u0000\u0083\u0084\u0003\u0012\t\u0000\u0084\u0085"+
		"\u0005\f\u0000\u0000\u0085\u0086\u0003\u0012\t\u0000\u0086\u0088\u0001"+
		"\u0000\u0000\u0000\u0087{\u0001\u0000\u0000\u0000\u0087\u0080\u0001\u0000"+
		"\u0000\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089\u008a\u0005\r\u0000"+
		"\u0000\u008a\u008b\u0003\f\u0006\u0000\u008b\u008c\u0003\u0012\t\u0000"+
		"\u008c\u001d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000e\u0000\u0000"+
		"\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090\u0005\u000f\u0000\u0000\u0090"+
		"\u001f\u0001\u0000\u0000\u0000\b+9DNXfn\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}