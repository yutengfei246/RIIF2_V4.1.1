package it.polito.yutengfei.RIIF2.provider;

import it.polito.yutengfei.RIIF2.RIIF2Parser;
import it.polito.yutengfei.RIIF2.module.Factory.ComponentFactory;
import it.polito.yutengfei.RIIF2.module.Factory.Factory;
import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.parser.ComponentListener;
import it.polito.yutengfei.RIIF2.provider._Provider;
import it.polito.yutengfei.RIIF2.requirement.GenericRequirement;

import java.util.Map;


/**
 * Created by yutengfei on 01/12/16.
 */
public class ComponentProvider extends ComponentListener implements _Provider {

    public ComponentProvider(RIIF2Parser parser, ComponentFactory componentFactory) {
        super(parser, componentFactory);
    }

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
