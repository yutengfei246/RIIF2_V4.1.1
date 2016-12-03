package it.polito.yutengfei.RIIF2.module.Factory;

import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.module.Template;

/**
 * Created by yutengfei on 02/12/16.
 */
public interface Factory {
    static ComponentFactory newComponentFactory(){
        return new ComponentFactory();
    }

    static TemplateFactory newTemplateFactory(){
        return new TemplateFactory();
    }

    public GenericModule newInstance(String name);

    public GenericModule newInstance();
}
