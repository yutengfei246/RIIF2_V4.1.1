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

    public boolean addParameter(String name) throws ParameterNotCompeletedException {

        if( this.parameter.isCompeleted() ){
            this.parameters.add(this.parameter);
            return true;
        }else
            throw new ParameterNotCompeletedException();
    }

    public void prepareParameter() {
        this.parameter = new Parameter();
    }

    public void prepareConstant() {
        this.constant = new Constant();
    }
}
