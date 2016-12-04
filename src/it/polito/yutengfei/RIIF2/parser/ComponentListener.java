package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2BaseListener;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.module.Component;
import it.polito.yutengfei.RIIF2.module.Factory.ComponentFactory;
import it.polito.yutengfei.RIIF2.module.Factory.PrepareVariableExistException;
import it.polito.yutengfei.RIIF2.module.utility.VectorType;
import jdk.nashorn.internal.ir.Terminal;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
/**
 * Created by yu tengfei on 01/12/16.
 *
 */
public class ComponentListener extends RIIF2BaseListener {

    //component factory is the one factory that create everything for component
    private final ComponentFactory componentFactoy;

    private Component component;
    private RIIF2Parser parser;
    private ParseTreeProperty<VectorType> vectorPropertyTree;

    public ComponentListener(RIIF2Parser parser, ComponentFactory componentFactory){
        this.parser = parser;
        this.componentFactoy = componentFactory;
    }

    @Override
    public void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        // create component with the name same
        String name = ctx.Identifier().getText();
        this.componentFactoy.start();
        this.componentFactoy.prepareComponent(name);

        System.out.println("Enter ComponentListener ");
    }

    @Override
    public void exitComponentBodyElement(RIIF2Parser.ComponentBodyElementContext ctx) {
        //everything is good ?
        this.componentFactoy.commit();
    }

    @Override
    public void enterExtendsList(RIIF2Parser.ExtendsListContext ctx) {
        RIIF2Parser.IdentifierListContext identifierListContext  = ctx.identifierList();

        List<TerminalNode> identifiers = identifierListContext.Identifier();
        for(TerminalNode Identifier : identifiers){
            String identifier = Identifier.getText();
            this.componentFactoy.setExIdentifier(identifier);
        }
    }

    @Override
    public void enterImplementsList(RIIF2Parser.ImplementsListContext ctx) {
        RIIF2Parser.IdentifierListContext identifierListContext = ctx.identifierList();

        List<TerminalNode> identifiers = identifierListContext.Identifier();
        for(TerminalNode Identifier : identifiers){
            String identifier = Identifier.getText();
            this.componentFactoy.setImpIdentifier(identifier);
        }
    }

    @Override
    public void enterTypeType(RIIF2Parser.TypeTypeContext ctx) {
        TerminalNode Parameter = ctx.PARAMETER();
        TerminalNode Constant = ctx.CONSTANT();

        try {
            if (Parameter != null)
                this.componentFactoy.prepareVariable(ComponentFactory.PARAMETER);
            if (Constant != null)
                this.componentFactoy.prepareVariable(ComponentFactory.CONSTANT);
        }catch (PrepareVariableExistException e){
            //TODO; Exception print
        }
    }


    @Override
    public void enterPrimitiveFieldDeclarator(RIIF2Parser.PrimitiveFieldDeclaratorContext ctx) {
        RIIF2Parser.PrimitiveFieldDeclaratorIdContext primitiveFieldDeclaratorIdContext
                = ctx.primitiveFieldDeclaratorId();
        String identifier = primitiveFieldDeclaratorIdContext.getText();

        try {
            this.setVariableIdentifier(identifier);
        } catch (VariableIdentifierAlreadyExistException e) {
            //TODO: specifying the specified tokens that we expected
            e.printStackTrace();
        }

        TerminalNode Table = ctx.TYPE_TABLE();
        if(Table != null)
            this.componentFactoy.setVariableType(ComponentFactory.TYPE_TABLE);
    }

    @Override
    public void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx) {
        Class cls = this.primitiveTypeSplitter(ctx);
        if(cls != null)
            this.componentFactoy.setVariableType(cls);
        else{
            this.componentFactoy.setVariableType(ComponentFactory.TYPE_ENUM);
        }
    }

    @Override
    public void enterEnumType(RIIF2Parser.EnumTypeContext ctx) {
        List<TerminalNode> enumTokens = ctx.Identifier();

        this.componentFactoy.startSetEnumTokens();
        for(TerminalNode enumToken : enumTokens){
            String enumString = enumToken.getText();
            this.componentFactoy.setEnumTokens(enumString);
        }
    }

    @Override
    public void exitEnumType(RIIF2Parser.EnumTypeContext ctx) {
        this.componentFactoy.finishSetEnumTokens();
    }

    @Override
    public void exitListInitializer(RIIF2Parser.ListInitializerContext ctx) {
        //TODO: set the property tree with this value
    }

    @Override
    public void exitPrimitiveFieldInitializer(RIIF2Parser.PrimitiveFieldInitializerContext ctx) {
        //TODO: retrieve value
    }

    @Override
    public void enterAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx) {
        TerminalNode Identifier = ctx.associativeDeclaratorId().Identifier();
        String identifier = Identifier.getText();

        try {
            this.setVariableIdentifier(identifier);
        } catch (VariableIdentifierAlreadyExistException e) {
            e.printStackTrace();
            //TODO: specifying the expected tokens
        }
        this.componentFactoy.setVariableType(ComponentFactory.TYPE_ASSOCIATIVE);
    }

    // Pay attention here: because here is not field declaration so wo set directly into component factory
    @Override
    public void enterAssociativeInstanceDeclarator(RIIF2Parser.AssociativeInstanceDeclaratorContext ctx) {
        RIIF2Parser.AssociativeInstanceDeclaratorIdContext associativeInstanceDeclaratorIdContext
                = ctx.associativeInstanceDeclaratorId();
        List<TerminalNode> Identifiers = associativeInstanceDeclaratorIdContext.Identifier();
        String associativeIdentifier = Identifiers.get(0).getText();
        String associativeInstanceIdentifier = Identifiers.get(1).getText();

        if(this.componentFactoy.containsVariable(associativeIdentifier)){
            try {
                this.componentFactoy.setAssociativeVariableInstance(associativeIdentifier,associativeInstanceIdentifier);
            } catch (VariableIdentifierAlreadyExistException e) {
                //TODO: print out the exception
                e.printStackTrace();
            }
        }else {//TODO: here should have exception, since the component has no that association array
        }
    }

    @Override
    public void exitAssociativeInstanceDeclaratorInitializer(RIIF2Parser.AssociativeInstanceDeclaratorInitializerContext ctx) {
        //TODO: here to read the associative value
    }

    @Override
    public void enterAssociativeInstanceAttributeDeclarator(RIIF2Parser.AssociativeInstanceAttributeDeclaratorContext ctx) {
        RIIF2Parser.AssociativeInstanceAttributeDeclaratorIdContext associativeInstanceAttributeDeclaratorIdContext
                =ctx.associativeInstanceAttributeDeclaratorId();
        List<TerminalNode> AssociativeInstanceIdentifier
                =associativeInstanceAttributeDeclaratorIdContext
                    .associativeInstanceDeclaratorId()
                        .Identifier();
        TerminalNode AttributeIdentifier = associativeInstanceAttributeDeclaratorIdContext.Identifier();

        String associativeIdentifier = AssociativeInstanceIdentifier.get(0).getText();
        String associativeInstanceIdentifier = AssociativeInstanceIdentifier.get(1).getText();
        String attributeIdentifier = AttributeIdentifier.getText();

        if(this.componentFactoy.containsVariable(associativeIdentifier)){
            try {
                this.componentFactoy.setAssociativeVariableInstance(associativeIdentifier,associativeInstanceIdentifier);
            } catch (VariableIdentifierAlreadyExistException e) {
                try {
                    this.componentFactoy.setAssociativeVariableInstanceAttribute(associativeIdentifier,
                            associativeInstanceIdentifier,
                            attributeIdentifier);
                } catch (VariableIdentifierAlreadyExistException e1) {
                    //TODO:here should print out the exception
                    e1.printStackTrace();
                }
            }
        }else{
            //TODO: exception
        }
    }

    @Override
    public void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        if(this.componentFactoy.hasPreparedVariable() && this.componentFactoy.isPreparedVariableDone()) {
            this.componentFactoy.assemblePreparedVariable(); //commit
            this.componentFactoy.cleanPrepared();
        }
    }

    @Override
    public void enterChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx) {
        try {
            this.componentFactoy.prepareVariable(ComponentFactory.CHILD_COMPONENT);
        } catch (PrepareVariableExistException e) {
            //TODO: exception print
            e.printStackTrace();
        }
    }

    @Override
    public void enterChildComponentDeclaratorType(RIIF2Parser.ChildComponentDeclaratorTypeContext ctx) {
        TerminalNode Identifier = ctx.Identifier();
        String  childComponentType = Identifier.getText();

        this.componentFactoy.setVariableType(childComponentType);
    }

    @Override
    public void enterChildComponentDeclaratorId(RIIF2Parser.ChildComponentDeclaratorIdContext ctx) {
        TerminalNode Identifier = ctx.Identifier();
        String identifier = Identifier.getText();

        try {
            this.setVariableIdentifier(identifier);
        } catch (VariableIdentifierAlreadyExistException e) {
            // TODO: print out exception details
            e.printStackTrace();
        }
    }

    @Override
    public void exitChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx) {
        RIIF2Parser.VectorContext vectorContext = ctx.vector();

        if(vectorContext != null){
            VectorType vectorType = this.vectorPropertyTree.get(vectorContext);
            this.componentFactoy.setVariableType(ComponentFactory.TYPE_ARRAY);
            this.componentFactoy.setVariableArray(vectorType);
        }
    }

    @Override
    public void exitChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx) {

        if(this.componentFactoy.hasPreparedVariable() && this.componentFactoy.isPreparedVariableDone()){
            this.componentFactoy.assemblePreparedVariable();
            this.componentFactoy.cleanPrepared();
        }
    }

    //Fail Mode may have type ( only associative possible )
    @Override
    public void enterFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx) {
        try {
            this.componentFactoy.prepareVariable(ComponentFactory.FAIL_MODE);
        } catch (PrepareVariableExistException e) {
            //TODO: exception print
            e.printStackTrace();
        }
    }

    @Override
    public void enterPrimitiveFieldDeclaratorId(RIIF2Parser.PrimitiveFieldDeclaratorIdContext ctx) {
        if( ctx.getParent() instanceof RIIF2Parser.FailModeDeclaratorContext){
            String identifier = ctx.Identifier().getText();
            try {
                this.setVariableIdentifier(identifier);
            } catch (VariableIdentifierAlreadyExistException e) {
                //TODO: exception
                e.printStackTrace();
            }
        }
    }

    @Override
    public void enterAssociativeDeclaratorId(RIIF2Parser.AssociativeDeclaratorIdContext ctx) {
        if(ctx.getParent() instanceof RIIF2Parser.FailModeDeclaratorContext){
            String identifier = ctx.Identifier().getText();
            try {
                this.setVariableIdentifier(identifier);
            } catch (VariableIdentifierAlreadyExistException e) {
                //TODO: exception
                e.printStackTrace();
            }
            this.componentFactoy.setVariableType(ComponentFactory.TYPE_ASSOCIATIVE);
        }
    }

    @Override
    public void exitFailModeDeclaration(RIIF2Parser.FailModeDeclarationContext ctx) {
        if(this.componentFactoy.hasPreparedVariable() && this.componentFactoy.isPreparedVariableDone()){
            this.componentFactoy.assemblePreparedVariable();
            this.componentFactoy.cleanPrepared();
        }
    }

    @Override
    public void enterAssignment(RIIF2Parser.AssignmentContext ctx) {
        this.componentFactoy.startAssignment();
        try {
            this.componentFactoy.prepareVariable(ComponentFactory.ASSIGNMENT);
        } catch (PrepareVariableExistException e) {
            //TODO: exception
            e.printStackTrace();
        }
    }

    @Override
    public void exitAssignment(RIIF2Parser.AssignmentContext ctx) {
        this.componentFactoy.commitAssignment();
    }

    @Override
    public void exitAssignmentDeclarator(RIIF2Parser.AssignmentDeclaratorContext ctx) {
        RIIF2Parser.VectorContext vectorContext = ctx.vector();

        if(vectorContext != null){
            VectorType vectorType = this.vectorPropertyTree.get(vectorContext);
            this.componentFactoy.setVariableType(ComponentFactory.TYPE_ARRAY);
            this.componentFactoy.setVariableArray(vectorType);
        }
    }

    @Override
    public void enterAssignmentDeclaratorId(RIIF2Parser.AssignmentDeclaratorIdContext ctx) {
        super.enterAssignmentDeclaratorId(ctx);
    }

    @Override
    public void enterVariableId(RIIF2Parser.VariableIdContext ctx) {
        RIIF2Parser.PrimitiveFieldDeclaratorIdContext primitiveFieldDeclaratorIdContext
                = ctx.primitiveFieldDeclaratorId();

        if(primitiveFieldDeclaratorIdContext != null){
            primitiveFieldDeclaratorIdContext
        }
    }

    @Override
    public void exitAssignmentVariableId(RIIF2Parser.AssignmentVariableIdContext ctx) {

    }

    @Override
    public void exitAssignmentVariableAttributeId(RIIF2Parser.AssignmentVariableAttributeIdContext ctx) {
        super.exitAssignmentVariableAttributeId(ctx);
    }

    @Override
    public void exitAssignmentTableItemId(RIIF2Parser.AssignmentTableItemIdContext ctx) {
        super.exitAssignmentTableItemId(ctx);
    }

    private void setVariableIdentifier(String identifier) throws VariableIdentifierAlreadyExistException {
        if(this.componentFactoy.containsVariable(identifier)){
            //TODO should throw Exception specifying expected tokens
            throw new VariableIdentifierAlreadyExistException();
        }
        else this.componentFactoy.setVariableIdentifier(identifier);
    }

    private Class primitiveTypeSplitter(RIIF2Parser.PrimitiveTypeContext primitiveTypeContext) {
        TerminalNode floatType = primitiveTypeContext.TYPE_FLOAT();
        TerminalNode integerType = primitiveTypeContext.TYPE_INTEGER();
        TerminalNode stringType = primitiveTypeContext.TYPE_STRING();

        return (floatType != null)? Float.class :
                    (integerType != null)? Integer.class :
                            (stringType != null)? String.class :
                                    null;
    }
}
