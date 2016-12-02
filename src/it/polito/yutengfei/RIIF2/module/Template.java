package it.polito.yutengfei.RIIF2.module;

import it.polito.yutengfei.RIIF2.module.utility.FailMode;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yutengfei on 01/12/16.
 */
public class Template extends GenericModule{

    private List<Parameter> parameters = new ArrayList<>();
    private List<Component> components = new ArrayList<>();
    private List<FailMode> failModes = new ArrayList<>();

    public Template(String name) {
        super(name);
    }

}
