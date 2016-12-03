package it.polito.yutengfei.RIIF2.visitor;

import it.polito.yutengfei.RIIF2.RIIF2BaseVisitor;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.module.Factory.Factory;
import it.polito.yutengfei.RIIF2.provider.ComponentProvider;
import it.polito.yutengfei.RIIF2.provider.TemplateProvider;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Created by yutengfei on 02/12/16 .
 */
public class SecondLevelVisitor extends RIIF2BaseVisitor<Boolean> {

    // keeping the tree for listener
    private final ParseTree parseTree;
    private final ParseTreeWalker walker;
    private final ComponentProvider componentProvider;
    private final ParseTreeListener templateProvider;
    private final RIIF2Parser parser;

    private Factory factory;

    private int moduleCounter;

    public SecondLevelVisitor(ParseTree parseTree, RIIF2Parser parser){
        this.parser = parser;
        this.parseTree = parseTree;
        this.walker = new ParseTreeWalker();
        this.componentProvider = new ComponentProvider(this.parser, Factory.newComponentFactory());
        this.templateProvider = new TemplateProvider(this.parser, Factory.newTemplateFactory());
        this.moduleCounter = -1;
    }

    @Override
    public Boolean visitComponentDeclaration(RIIF2Parser.ComponentDeclarationContext ctx) {
        super.visitComponentDeclaration(ctx);

        this.moduleCounter++;
        ParseTree componentTree = this.parseTree.getChild(this.moduleCounter);
        walker.walk(this.componentProvider,componentTree);

        return true;
    }


    @Override
    public Boolean visitTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx) {
        super.visitTemplateDeclaration(ctx);

        this.moduleCounter++;
        ParseTree templateTree = this.parseTree.getChild(this.moduleCounter);
        walker.walk(this.templateProvider,templateTree);

        return true;
    }

}
