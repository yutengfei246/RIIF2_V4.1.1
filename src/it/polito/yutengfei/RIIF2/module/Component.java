package it.polito.yutengfei.RIIF2.module;

import it.polito.yutengfei.RIIF2.module.utility.Constant;
import it.polito.yutengfei.RIIF2.module.utility.FailMode;
import it.polito.yutengfei.RIIF2.module.utility.ParameterNotCompeletedException;
import it.polito.yutengfei.RIIF2.module.utility.Parameter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yutengfei on 01/12/16.
 */
public class Component extends GenericModule {

    private List<Parameter> parameters = new ArrayList<>();
    private List<Constant> constants = new ArrayList<>();
    private List<FailMode> failModes = new ArrayList<>();

    private Parameter parameter;
    private Constant constant;
    private FailMode failMode;
    private String fieldName;
    private String associativeName;

    public Component(String name) {
        super(name);
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public List<FailMode> getFailModes() {
        return failModes;
    }
    public void setFailModes(List<FailMode> failModes) {
        this.failModes = failModes;
    }

    public List<Constant> getConstants() {
        return constants;
    }

    public void setConstants(List<Constant> constants) {
        this.constants = constants;
    }

    public void prepareParameter() {
        this.parameter = new Parameter();
    }

    public void prepareConstant() {
        this.constant = new Constant();
    }


    public void setAssociativeIdentifier(String associativeIdentifier) {
        this.associativeIdentifier = associativeIdentifier;
    }

    public void setAssociativeInstanceIdentifier(String associativeIdentifier, String associativeInstanceIdentifer) {

    }

    public void prepareChildComponent() {

    }

    public void setChildComponentType(String childComponentType) {

    }

    public void setChildComponentIdentifer(String childComponentIdentifier) {

    }

    public void addParameter() {

    }

    public boolean isParameterCompleted() {


    }

    public boolean isConstantCompleted() {
        return false;
    }

    public void addConstant() {

    }

    public void setVariableIdentifier(String identifier) {

    }

    public void setVariableType(Class cls) {

    }

    public Component(){
        super(null);
    }
}
