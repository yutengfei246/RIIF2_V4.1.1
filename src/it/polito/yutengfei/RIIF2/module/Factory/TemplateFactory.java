package it.polito.yutengfei.RIIF2.module.Factory;

import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.module.Template;

/**
 * Created by yutengfei on 02/12/16.
 */
public class TemplateFactory implements Factory {
    @Override
    public GenericModule newInstance(String name) {
        return new Template(name);
    }

    @Override
    public GenericModule newInstance() {
        return new Template();
    }
}
