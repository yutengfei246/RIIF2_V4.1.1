// Generated from /usr/Intellij/ANtlr4WorkSpace/RIIF2_V4.1/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RIIF2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RIIF2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#fieldElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldElement(RIIF2Parser.FieldElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#childComponentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#setTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTemplate(RIIF2Parser.SetTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#abstractFieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractFieldDeclaration(RIIF2Parser.AbstractFieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#abstractFailModeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractFailModeDeclaration(RIIF2Parser.AbstractFailModeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#abstractPlatformDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractPlatformDeclaration(RIIF2Parser.AbstractPlatformDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#environmentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentDeclaration(RIIF2Parser.EnvironmentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#environmentBodyElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvironmentBodyElement(RIIF2Parser.EnvironmentBodyElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#envParameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnvParameterDeclaration(RIIF2Parser.EnvParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#requirementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementDeclaration(RIIF2Parser.RequirementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#associativeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeInstanceDeclarator(RIIF2Parser.AssociativeInstanceDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#childComponentDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignmentDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentDeclarator(RIIF2Parser.AssignmentDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#imposeDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImposeDeclarator(RIIF2Parser.ImposeDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(RIIF2Parser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#imposeInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImposeInitializer(RIIF2Parser.ImposeInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclaratorInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeInstanceDeclaratorInitializer(RIIF2Parser.AssociativeInstanceDeclaratorInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignmentInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentInitializer(RIIF2Parser.AssignmentInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildComponentDeclaratorId(RIIF2Parser.ChildComponentDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(RIIF2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#associativeDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeDeclaratorId(RIIF2Parser.AssociativeDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociativeInstanceDeclaratorId(RIIF2Parser.AssociativeInstanceDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignmentDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentDeclaratorId(RIIF2Parser.AssignmentDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignmentVariableId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentVariableId(RIIF2Parser.AssignmentVariableIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignmentVariableAttributeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentVariableAttributeId(RIIF2Parser.AssignmentVariableAttributeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#assignmentTableItemId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentTableItemId(RIIF2Parser.AssignmentTableItemIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#imposeDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImposeDeclaratorId(RIIF2Parser.ImposeDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(RIIF2Parser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(RIIF2Parser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#childcomponentDeclaratorType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildcomponentDeclaratorType(RIIF2Parser.ChildcomponentDeclaratorTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(RIIF2Parser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#extendsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsList(RIIF2Parser.ExtendsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#implementsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementsList(RIIF2Parser.ImplementsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArg(RIIF2Parser.FuncArgContext ctx);
}