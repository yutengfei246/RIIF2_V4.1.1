package it.polito.yutengfei.RIIF2.module.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yutengfei on 01/12/16.
 */
public class FailMode<T> extends Label<T>{

    private Map<String,Object> requiredAttribute = new HashMap<String,Object>(){{
                put("rate",null);
                put("units",null);

            }};

    public FailMode(String name, Boolean isAssociative, Boolean isAbstract) {
        super(name, isAssociative, isAbstract);
    }

    @Override
    public T getValue() {
        return null;
    }

    @Override
    public Boolean setValue(T value) {
        return false;
    }
}
