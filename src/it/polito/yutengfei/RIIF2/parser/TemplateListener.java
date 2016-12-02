package it.polito.yutengfei.RIIF2.parser;

import it.polito.yutengfei.RIIF2.RIIF2BaseListener;
import it.polito.yutengfei.RIIF2.RIIF2Parser;

/**
 * Created by yutengfei on 02/12/16.
 */
public class TemplateListener extends RIIF2BaseListener {

    @Override
    public void enterTemplateDeclaration(RIIF2Parser.TemplateDeclarationContext ctx) {
        super.enterTemplateDeclaration(ctx);

        System.out.println("TemplateListener ");
    }
}
