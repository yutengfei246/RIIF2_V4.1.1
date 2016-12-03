package it.polito.yutengfei.RIIF2.module.Factory;


import it.polito.yutengfei.RIIF2.module.Component;
import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.module.utility.Variable;
import it.polito.yutengfei.RIIF2.parser.VaraibaleIdentifierAlreadyExistException;

/**
 * Created by yutengfei on 02/12/16.
 */
public class ComponentFactory implements Factory{

    public static final int PARAMETER = 10;
    public static final int CONSTANT = 20;
    public static final int TYPE_TABLE = 30;
    public static final int TYPE_ASSOCIATIVE = 40;

    @Override
    public GenericModule newInstance(String name) {
        return new Component(name);
    }

    @Override
    public Component newInstance() {
        return new Component();
    }

    public void prepareComponent(String name) {
    }

    public void setExIdentifier(String identifier) {
    }

    public void setImpIdentifier(String impIdentifier) {
        this.impIdentifier = impIdentifier;
    }

    public void prepareParameter() {
    }

    public void prepareConstant() {
    }

    public void prepareVariable(int constant) {

    }

    public void setVariableIdentifier(String identifier) {

    }

    public void setVariableType(int typeTable) {

    }

    public boolean containsVariable(String associativeIdentifier) {

        return false;
    }

    public Variable getVariable(String associativeIdentifier) {

    }

    public boolean isAssociative(Variable variable) {
        return false;
    }

    public void setAssociativeVariableInstance(String associativeIdentifier, String associativeInstanceIdentifier)
        throws VaraibaleIdentifierAlreadyExistException{

    }
}
