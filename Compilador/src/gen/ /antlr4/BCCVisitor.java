// Generated from /Users/pedronaves/Desktop/Mesa - MacBook Pro de Pedro/IF/6 Período /Compiladores-IF-Goiano/Compilador/src/main/java/antlr4/BCC.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BCCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BCCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BCCParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(BCCParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracoes(BCCParser.ListaDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(BCCParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(BCCParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#termoAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAritmetico(BCCParser.TermoAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAritmetico(BCCParser.FatorAritmeticoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoRelacional(BCCParser.ExpressaoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#termoRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoRelacional(BCCParser.TermoRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#listaComandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaComandos(BCCParser.ListaComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(BCCParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoAtribuicao(BCCParser.ComandoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#comandoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoEntrada(BCCParser.ComandoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#comandoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoSaida(BCCParser.ComandoSaidaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#comandoCondicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoCondicao(BCCParser.ComandoCondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(BCCParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BCCParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubAlgoritmo(BCCParser.SubAlgoritmoContext ctx);
}