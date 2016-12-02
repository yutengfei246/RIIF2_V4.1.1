package it.polito.yutengfei.RIIF2.provider;

import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.parser.TemplateListener;
import it.polito.yutengfei.RIIF2.requirement.GenericRequirement;

import java.util.Map;

/**
 * Created by yutengfei on 02/12/16.
 */
public class TemplateProvider extends TemplateListener implements _Provider {

    @Override
    public Map<GenericModule, GenericRequirement> provide() {
        return null;
    }

    @Override
    public void productModule(GenericModule genericModule, GenericRequirement genericRequirement) {

    }

    @Override
    public GenericModule generateModule() {
        return null;
    }

    @Override
    public GenericRequirement generateRequirement() {
        return null;
    }

    @Override
    public Boolean generateModeuleObject() {
        return null;
    }
}
