// Generated from /home/tengfei/IdeaProjects/RIIF2_V4.1.1/RIIF2.g4 by ANTLR 4.5.3
package it.polito.yutengfei.RIIF2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RIIF2Parser}.
 */
public interface RIIF2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RIIF2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(RIIF2Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#componentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#fieldElement}.
	 * @param ctx the parse tree
	 */
	void enterFieldElement(RIIF2Parser.FieldElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#fieldElement}.
	 * @param ctx the parse tree
	 */
	void exitFieldElement(RIIF2Parser.FieldElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(RIIF2Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#setTemplate}.
	 * @param ctx the parse tree
	 */
	void enterSetTemplate(RIIF2Parser.SetTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#setTemplate}.
	 * @param ctx the parse tree
	 */
	void exitSetTemplate(RIIF2Parser.SetTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(RIIF2Parser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#templateBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBodyElement(RIIF2Parser.TemplateBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractFieldDeclaration(RIIF2Parser.AbstractFieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractFieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractFieldDeclaration(RIIF2Parser.AbstractFieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractFailModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractFailModeDeclaration(RIIF2Parser.AbstractFailModeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractFailModeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractFailModeDeclaration(RIIF2Parser.AbstractFailModeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#abstractPlatformDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbstractPlatformDeclaration(RIIF2Parser.AbstractPlatformDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#abstractPlatformDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbstractPlatformDeclaration(RIIF2Parser.AbstractPlatformDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclaration(RIIF2Parser.ImposeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentDeclaration(RIIF2Parser.EnvironmentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environmentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentDeclaration(RIIF2Parser.EnvironmentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#environmentBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterEnvironmentBodyElement(RIIF2Parser.EnvironmentBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#environmentBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitEnvironmentBodyElement(RIIF2Parser.EnvironmentBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#envParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnvParameterDeclaration(RIIF2Parser.EnvParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#envParameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnvParameterDeclaration(RIIF2Parser.EnvParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#requirementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRequirementDeclaration(RIIF2Parser.RequirementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#requirementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRequirementDeclaration(RIIF2Parser.RequirementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeInstanceDeclarator(RIIF2Parser.AssociativeInstanceDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeInstanceDeclarator(RIIF2Parser.AssociativeInstanceDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#failModeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFailModeDeclarator(RIIF2Parser.FailModeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDeclarator(RIIF2Parser.AssignmentDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDeclarator(RIIF2Parser.AssignmentDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclarator(RIIF2Parser.ImposeDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclarator(RIIF2Parser.ImposeDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(RIIF2Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(RIIF2Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeInitializer}.
	 * @param ctx the parse tree
	 */
	void enterImposeInitializer(RIIF2Parser.ImposeInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeInitializer}.
	 * @param ctx the parse tree
	 */
	void exitImposeInitializer(RIIF2Parser.ImposeInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclaratorInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeInstanceDeclaratorInitializer(RIIF2Parser.AssociativeInstanceDeclaratorInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclaratorInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeInstanceDeclaratorInitializer(RIIF2Parser.AssociativeInstanceDeclaratorInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void enterListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#listInitializer}.
	 * @param ctx the parse tree
	 */
	void exitListInitializer(RIIF2Parser.ListInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(RIIF2Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentInitializer}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentInitializer(RIIF2Parser.AssignmentInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentInitializer}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentInitializer(RIIF2Parser.AssignmentInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclaratorId(RIIF2Parser.ChildComponentDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclaratorId(RIIF2Parser.ChildComponentDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(RIIF2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(RIIF2Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeDeclaratorId(RIIF2Parser.AssociativeDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeDeclaratorId(RIIF2Parser.AssociativeDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAssociativeInstanceDeclaratorId(RIIF2Parser.AssociativeInstanceDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#associativeInstanceDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAssociativeInstanceDeclaratorId(RIIF2Parser.AssociativeInstanceDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 */
	void enterVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#variableId}.
	 * @param ctx the parse tree
	 */
	void exitVariableId(RIIF2Parser.VariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentDeclaratorId(RIIF2Parser.AssignmentDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentDeclaratorId(RIIF2Parser.AssignmentDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentVariableId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentVariableId(RIIF2Parser.AssignmentVariableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentVariableId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentVariableId(RIIF2Parser.AssignmentVariableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentVariableAttributeId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentVariableAttributeId(RIIF2Parser.AssignmentVariableAttributeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentVariableAttributeId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentVariableAttributeId(RIIF2Parser.AssignmentVariableAttributeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#assignmentTableItemId}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentTableItemId(RIIF2Parser.AssignmentTableItemIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#assignmentTableItemId}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentTableItemId(RIIF2Parser.AssignmentTableItemIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#imposeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterImposeDeclaratorId(RIIF2Parser.ImposeDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#imposeDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitImposeDeclaratorId(RIIF2Parser.ImposeDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(RIIF2Parser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(RIIF2Parser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void enterEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#enumType}.
	 * @param ctx the parse tree
	 */
	void exitEnumType(RIIF2Parser.EnumTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(RIIF2Parser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(RIIF2Parser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorType}.
	 * @param ctx the parse tree
	 */
	void enterChildComponentDeclaratorType(RIIF2Parser.ChildComponentDeclaratorTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#childComponentDeclaratorType}.
	 * @param ctx the parse tree
	 */
	void exitChildComponentDeclaratorType(RIIF2Parser.ChildComponentDeclaratorTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void enterVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#vector}.
	 * @param ctx the parse tree
	 */
	void exitVector(RIIF2Parser.VectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(RIIF2Parser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(RIIF2Parser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#extendsList}.
	 * @param ctx the parse tree
	 */
	void enterExtendsList(RIIF2Parser.ExtendsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#extendsList}.
	 * @param ctx the parse tree
	 */
	void exitExtendsList(RIIF2Parser.ExtendsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#implementsList}.
	 * @param ctx the parse tree
	 */
	void enterImplementsList(RIIF2Parser.ImplementsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#implementsList}.
	 * @param ctx the parse tree
	 */
	void exitImplementsList(RIIF2Parser.ImplementsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RIIF2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(RIIF2Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(RIIF2Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(RIIF2Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void enterFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcName}.
	 * @param ctx the parse tree
	 */
	void exitFuncName(RIIF2Parser.FuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncArg(RIIF2Parser.FuncArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link RIIF2Parser#funcArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncArg(RIIF2Parser.FuncArgContext ctx);
}