package it.polito.yutengfei.RIIF2.module.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yutengfei on 01/12/16.
 */
public class Constant<T> extends Label<T>{

    private final T constValue; // not allowed to change
    
    private Map<String,Object> constantAttribute  = new HashMap<String,Object>(){{
                 put("units",null);
            }};

    public Constant(T value, String name, Boolean isAssociative, Boolean isAbstract) {
        super(name, isAssociative, isAbstract);
        this.constValue = value;
    }

    @Override
    public T getValue() {
        return this.constValue;
    }

    @Override
    public Boolean setValue(T value) {
        return false;
    }

}
