package com.decapitator;

import javax.inject.Named;

@Named("firstBean")
public class ExampleBeanCDI {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void someAction(){
        name = "";
    }
}
