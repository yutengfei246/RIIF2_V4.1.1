package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2BaseListener;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.module.Component;
import it.polito.yutengfei.RIIF2.module.Factory.ComponentFactory;
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

    public ComponentListener(RIIF2Parser parser, ComponentFactory componentFactory){
        this.parser = parser;
        this.componentFactoy = componentFactory;
    }

    @Override
    public void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        // create component with the name same
        String name = ctx.Identifier().getText();
        this.componentFactoy.prepareComponent(name);

        System.out.println("Enter ComponentListener ");
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

        if(Parameter != null)
            this.componentFactoy.prepareVariable(ComponentFactory.PARAMETER);
        if(Constant != null)
            this.componentFactoy.prepareVariable(ComponentFactory.CONSTANT);
    }

    @Override
    public void enterVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx) {
        RIIF2Parser.VariableDeclaratorIdContext variableDeclaratorIdContext
                = ctx.variableDeclaratorId();
        String identifier = variableDeclaratorIdContext.getText();

        try {
            this.setVaribaleIdentifier(identifier);
        } catch (VaraibaleIdentifierAlreadyExistException e) {
            //TODO: specifying the specified tokens that we expected
            e.printStackTrace();
        }
        TerminalNode Table = ctx.TYPE_TABLE();
        if(Table != null){
            this.componentFactoy.setVariableType(ComponentFactory.TYPE_TABLE);
        }
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
    public void exitVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx) {
        //TODO:  get the associatived value from last node
    }

    @Override
    public void exitVariableInitializer(RIIF2Parser.VariableInitializerContext ctx) {
        //TODO: get expression valure from sub-tree root ...
    }

    @Override
    public void enterAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx) {
        TerminalNode Identifier = ctx.associativeDeclaratorId().Identifier();
        String identifier = Identifier.getText();

        try {
            this.setVaribaleIdentifier(identifier);
        } catch (VaraibaleIdentifierAlreadyExistException e) {
            e.printStackTrace();
            //TODO: specifying the expected tokens
        }
        this.componentFactoy.setVariableIdentifier(identifier);
        this.componentFactoy.setVariableType(ComponentFactory.TYPE_ASSOCIATIVE);
    }

    private void setVaribaleIdentifier(String identifier) throws VaraibaleIdentifierAlreadyExistException {
        if(this.componentFactoy.containsVariable(identifier)){
            //TODO should throw Exception specifying expected tokens
            throw new VaraibaleIdentifierAlreadyExistException();
        }
        else this.componentFactoy.setVariableIdentifier(identifier);
    }

    @Override
    public void enterAssociativeInstanceDeclarator(RIIF2Parser.AssociativeInstanceDeclaratorContext ctx) {
        List<TerminalNode> Identifiers = ctx.associativeInstanceDeclaratorId().Identifier();
        String associativeIdentifier = Identifiers.get(0).getText();
        String associativeInstanceIdentifier = Identifiers.get(1).getText();

        try {
            this.setVaribaleIdentifier(associativeIdentifier);
            this.componentFactoy.setAssociativeVariableInstance(associativeIdentifier,associativeInstanceIdentifier);

        } catch (VaraibaleIdentifierAlreadyExistException e) {
            //since the identifier already exist so we try to set the Instance of associative array
            try {
                this.componentFactoy.setAssociativeVariableInstance(associativeIdentifier,associativeInstanceIdentifier);
            } catch (VaraibaleIdentifierAlreadyExistException e1) {
                //TODO: here to specify the details about what happened: same instance occurs in this case
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        if(this.componentFactoy.hasPreparedVariable() && this.componentFactoy.isPreparedVariableDone()) {
            this.componentFactoy.assemblePreparedVariable();
            this.componentFactoy.cleanPrepared();
        }
    }

    @Override
    public void exitAssociativeInstanceDeclaratorInitializer(RIIF2Parser.AssociativeInstanceDeclaratorInitializerContext ctx) {
        //TODO: here to read the associative value

    }

    @Override
    public void enterChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx) {
        this.componentFactoy.prepareVariable(ComponentFactory.CHILD_COMPONENT);
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
            this.setVaribaleIdentifier(identifier);
        } catch (VaraibaleIdentifierAlreadyExistException e) {
            // TODO: print out exception details
            e.printStackTrace();
        }
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
