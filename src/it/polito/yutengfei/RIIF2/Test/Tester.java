package it.polito.yutengfei.RIIF2.Test;

import it.polito.yutengfei.RIIF2.RIIF2Lexer;
import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.visitor.SecondLevelVisitor;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by yutengfei on 29/11/16.
 */
public class Tester {

    private final InputStream in;

    public Tester(InputStream in) {
        this.in = in ;
    }

    public static void main(String[] args){
        InputStream in = System.in;
        String userDir = System.getProperty("user.dir");
        System.out.println("Userdir is " + userDir);

        if(args.length == 0){}
        else try {
            in = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Tester guiTester
                = new Tester(in);
        guiTester.run();
    }

    private void run() {

        try {
            ANTLRInputStream antlrInputStream = new ANTLRInputStream(this.in);
            RIIF2Lexer riif2Lexer = new RIIF2Lexer(antlrInputStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(riif2Lexer);
            RIIF2Parser parser = new RIIF2Parser(commonTokenStream);

            ParseTree parseTree = parser.program();

      //      ParseTreeWalker walker = new ParseTreeWalker();
    //        walker.walk(null, parseTree);

            SecondLevelVisitor secondLevelVisitor =
                    new SecondLevelVisitor(parseTree,parser);

            secondLevelVisitor.visit(parseTree);

            System.out.println(parseTree.toStringTree());

        } catch (IOException e) {}
    }
}