package it.polito.yutengfei.RIIF2.provider;

import it.polito.yutengfei.RIIF2.module.GenericModule;
import it.polito.yutengfei.RIIF2.requirement.GenericRequirement;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yutengfei on 01/12/16.
 */
public interface  _Provider{

    Map<GenericModule,GenericRequirement> modulesAndRequirements
            = new HashMap<GenericModule,GenericRequirement>();


    /**
     * null parameter
     * @return return all modules and requirements
     */

    public Map<GenericModule,GenericRequirement> provide();

    /**
     * @param genericModule
     * @param genericRequirement
     */
    public void productModule(GenericModule genericModule, GenericRequirement genericRequirement);

    public abstract GenericModule generateModule();

    public abstract GenericRequirement generateRequirement();


}
