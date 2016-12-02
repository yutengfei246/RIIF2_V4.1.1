package it.polito.yutengfei.RIIF2.module;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yutengfei on 01/12/16.
 */
public abstract class GenericModule{

    private String name;
    private List<String> extendedName = new ArrayList<>();
    private List<String> implementedName = new ArrayList<>();

    public GenericModule(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getImplementedName() {
        return implementedName;
    }

    public void setImplementedName(List<String> implemenedName) {
        this.implementedName = implemenedName;
    }

    public List<String> getExtendedName() {
        return extendedName;
    }

    public void setExtendedName(List<String> extendedName) {
        this.extendedName = extendedName;
    }

    public abstract GenericModule generateModule();

    public abstract Boolean generateModeuleObject();

}
