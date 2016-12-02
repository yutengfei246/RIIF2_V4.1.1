package it.polito.yutengfei.RIIF2.module.utility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yutengfei on 01/12/16.
 */
public class Paremeter<T> extends Label<T>{

    private T value;

    // reserved keywords for attributes of parameters
    private Map<String,Object> parameterAttribute = new HashMap<String,Object>(){{
                put("min",null);
                put("max",null);
                put("rate",null);
            }};

    public Paremeter(T value,String name, Boolean isAssociative, Boolean isAbstract) {
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
}
