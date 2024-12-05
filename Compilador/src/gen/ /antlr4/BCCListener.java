// Generated from /Users/pedronaves/Desktop/Mesa - MacBook Pro de Pedro/IF/6 Período /Compiladores-IF-Goiano/Compilador/src/main/java/antlr4/BCC.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BCCParser}.
 */
public interface BCCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BCCParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(BCCParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(BCCParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(BCCParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(BCCParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(BCCParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(BCCParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(BCCParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(BCCParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(BCCParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(BCCParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(BCCParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(BCCParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(BCCParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(BCCParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(BCCParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(BCCParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(BCCParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(BCCParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(BCCParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(BCCParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(BCCParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(BCCParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(BCCParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(BCCParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(BCCParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(BCCParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(BCCParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(BCCParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(BCCParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(BCCParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BCCParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(BCCParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BCCParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(BCCParser.SubAlgoritmoContext ctx);
}