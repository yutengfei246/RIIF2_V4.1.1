package it.polito.yutengfei.RIIF2.module.Factory;


import it.polito.yutengfei.RIIF2.module.Component;
import it.polito.yutengfei.RIIF2.module.GenericModule;

/**
 * Created by yutengfei on 02/12/16.
 */
public class ComponentFactory implements Factory{

    @Override
    public GenericModule newInstance(String name) {
        return new Component(name);
    }

    @Override
    public Component newInstance() {
        return new Component();
    }
}
