package com.decapitator;

import javax.annotation.PostConstruct;
import javax.inject.Named;

@Named("firstBean")
public class ExampleBeanCDI {
    private String name;
    @PostConstruct
    private void initialize(){
        name = "Hello";
    }

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
