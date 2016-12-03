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
        this.component = this.componentFactoy.newInstance(name);

        // retrieve the extended name
        if(ctx.EXTENDS() != null){
            RIIF2Parser.ExtendsListContext extendsListContext
                    = ctx.extendsList();
            RIIF2Parser.IdentifierListContext identifierListContext
                    = extendsListContext.identifierList();
            List<TerminalNode> identifiers
                    = identifierListContext.Identifier();

            for(TerminalNode identifier : identifiers){
                String Xname = identifier.getText();
                this.component.addExtendedName(Xname);
            }
        }

        // retrieve the implemented name
        if(ctx.IMPLEMENTS() != null){
            RIIF2Parser.ImplementsListContext implementsListContex
                    = ctx.implementsList();
            RIIF2Parser.IdentifierListContext identifierListContext
                    = implementsListContex.identifierList();
            List<TerminalNode> identifiers
                    = identifierListContext.Identifier();

            for(TerminalNode identifier : identifiers){
                String Xname = identifier.getText();
                this.component.addImplementedName(Xname);
            }
        }

        System.out.println("Enter ComponentListener ");
    }

    @Override
    public void enterFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        RIIF2Parser.TypeTypeContext typeTypeContext
                = ctx.typeType();

        // it is a parameter
        if(typeTypeContext.PARAMETER() != null){
            this.component.prepareParameter();
        // It is a constant
        }else if( typeTypeContext.CONSTANT() != null){
            this.component.prepareConstant();
        }else{}

        return;
    }

    @Override
    public void exitFieldDeclaration(RIIF2Parser.FieldDeclarationContext ctx) {
        RIIF2Parser.TypeTypeContext typeTypeContext
                = ctx.typeType();

        // for secure case ... simply check the field in component
        if(typeTypeContext.PARAMETER() != null){
            if(this.component.isParameterCompleted())
                this.component.addParameter();
        }

        if(typeTypeContext.CONSTANT() != null){
            if(this.component.isConstantCompleted())
                this.component.addConstant();
        }

        return;
    }

    @Override
    public void enterVariableDeclarator(RIIF2Parser.VariableDeclaratorContext ctx) {
        RIIF2Parser.VariableDeclaratorIdContext variableDeclaratorIdContext
                = ctx.variableDeclaratorId();
        String identifier = variableDeclaratorIdContext.getText();

        this.component.setVariableIdentifier(identifier);

        return;
    }

    @Override
    public void enterPrimitiveType(RIIF2Parser.PrimitiveTypeContext ctx) {
        Class cls = this.primitiveTypeSplitter(ctx);
        this.component.setVariableType(cls);

        return;
    }

    @Override
    public void exitVariableInitializer(RIIF2Parser.VariableInitializerContext ctx) {
        //TODO: get expression valure from sub-tree root ...
    }

    private Class primitiveTypeSplitter(RIIF2Parser.PrimitiveTypeContext primitiveTypeContext) {
    }

    @Override
    public void enterAssociativeDeclarator(RIIF2Parser.AssociativeDeclaratorContext ctx) {
        TerminalNode Identifier = ctx.associativeDeclaratorId().Identifier();
        String identifier = Identifier.getText();

        this.component.setAssociativeIdentifier(identifier);

        return;
    }

    @Override
    public void enterAssociativeInstanceDeclarator(RIIF2Parser.AssociativeInstanceDeclaratorContext ctx) {
        List<TerminalNode> Identifiers = ctx.associativeInstanceDeclaratorId().Identifier();
        String associativeIdentifier = Identifiers.get(0).getText();
        String associativeInstanceIdentifier = Identifiers.get(1).getText();

        this.component.setAssociativeInstanceIdentifier(associativeIdentifier, associativeInstanceIdentifier);

        return;
    }

    @Override
    public void enterChildComponentDeclaration(RIIF2Parser.ChildComponentDeclarationContext ctx) {
        this.component.prepareChildComponent();

        return;
    }

    @Override
    public void enterChildComponentDeclarator(RIIF2Parser.ChildComponentDeclaratorContext ctx) {
        TerminalNode Type = ctx.childcomponentDeclaratorType().Identifier();
        TerminalNode Identifier = ctx.childComponentDeclaratorId().Identifier();

        String childComponentType = Type.getText();
        String childComponentIdentifier = Identifier.getText();

        this.component.setChildComponentType(childComponentType);
        this.component.setChildComponentIdentifer(childComponentIdentifier);
    }




}
