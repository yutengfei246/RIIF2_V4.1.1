package it.polito.yutengfei.RIIF2.module.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yutengfei on 01/12/16.
 */
public class Parameter<T> extends Label<T> implements Variable{

    private T value;
    private boolean compeleted;

    // reserved keywords for attributes of parameters
    private Map<String,Object> parameterAttribute = new HashMap<String,Object>(){{
                put("min",null);
                put("max",null);
                put("rate",null);
            }};

    public Parameter(){this(null,null,null,null);}

    public Parameter(T value, String name, Boolean isAssociative, Boolean isAbstract) {
        super(name, isAssociative, isAbstract);
        this.value = value ;
    }


    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public Boolean setValue(T value) {
        this.value = value ;
        return true;
    }

    public boolean isCompeleted() {
        return this.compeleted;
    }


    @Override
    public Boolean containsInstance(String name) {
        return null;
    }
}
