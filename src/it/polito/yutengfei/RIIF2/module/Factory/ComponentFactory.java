package it.polito.yutengfei.RIIF2.module.Factory;


import it.polito.yutengfei.RIIF2.module.Component;
import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.module.utility.Variable;
import it.polito.yutengfei.RIIF2.parser.VariableIdentifierAlreadyExistException;

/**
 * Created by yutengfei on 02/12/16.
 */
public class ComponentFactory implements Factory{

    public static final int PARAMETER = 10;
    public static final int CONSTANT = 20;
    public static final int TYPE_TABLE = 30;
    public static final int TYPE_ASSOCIATIVE = 40;
    public static final int CHILD_COMPONENT = 50;
    public static final int TYPE_ENUM = 60;
    public static final int FAIL_MODE = 70;

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

    public void prepareVariable(int constant) throws PrepareVariableExistException{

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
        throws VariableIdentifierAlreadyExistException {

    }

    public void prepareChildComponent() {

    }

    public void setChildComponentType(String identifier) {

    }

    public boolean hasPreparedVariable() {

        return false;
    }

    public void assemblePreparedVariable() {

    }

    public boolean isPreparedVariableDone() {
        return false;
    }

    public void cleanPrepared() {

    }

    public void setVariableType(String childComponentType) {

    }

    public void setVariableType(Class cls) {

    }

    public void setEnumTokens(String enumString) {

    }

    public void startSetEnumTokens() {

    }

    public void finishSetEnumTokens() {

    }

    public void start() {
    }

    public void commit() {

    }

    public void setAssociativeVariableInstanceAttribute(String associativeIdentifier, String associativeInstanceIdentifier, String attributeIdentifier)
    throws VariableIdentifierAlreadyExistException{
    }
}
