package it.polito.yutengfei.RIIF2.module.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yutengfei on 01/12/16.
 */
public abstract class Label<T> {

    private final Boolean isAbstract;
    private final String name;
    private final Boolean isAssociative;
    private List<Label<T>> associativeValues = new ArrayList<>();

    // like description, functionality, etc...
    private Map<String,Object> userDifinedAttribute = new HashMap<>();

    public Label(String name, Boolean isAssociative , Boolean isAbstract){
        this.isAbstract = isAbstract;
        this.isAssociative = isAssociative;
        this.name = name;
    }

    public Boolean isAbstract() {
        return isAbstract;
    }

    public String getName() {
        return name;
    }

    public Boolean isAssociative() {
        return isAssociative;
    }

    public abstract T getValue();

    public abstract Boolean setValue(T value);

    public Boolean addAssociativeInstance(Label<T> associativeInstance){
        if (this.associativeValues.add(associativeInstance) )
            return true;
        return false;
    }

    public Boolean putUserDifinedAttribute(String key, Object value){
       this.userDifinedAttribute.put(key,value);
        return true;
    }

}
