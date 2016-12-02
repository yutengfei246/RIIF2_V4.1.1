package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2BaseListener;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.module.Component;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
/**
 * Created by yu tengfei on 01/12/16.
 *
 */
public class ComponentListener extends RIIF2BaseListener {

    private Component component;

    private RIIF2Parser parser;

    public ComponentListener(RIIF2Parser parser){
        this.parser = parser;
    }

    @Override
    public void enterComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        super.enterComponentDeclaration(ctx);

        // create component with the name same
        String name = ctx.Identifier().getText();
        this.component = new Component(name);

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
        super.enterFieldDeclaration(ctx);

        RIIF2Parser.TypeTypeContext typeTypeContext
                = ctx.typeType();

        // it is a parameter
        if(typeTypeContext.PARAMETER() != null){
            this.component.prepareParameter();
            // It is a constant
        }else if( typeTypeContext.CONSTANT() != null){
            this.component.prepareConstant();
        }else{}

    }


}
