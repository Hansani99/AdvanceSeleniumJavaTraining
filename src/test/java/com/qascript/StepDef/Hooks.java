package com.qascript.StepDef;


import com.qascript.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {


    @Before
    public void setUp(){
     initializeDriver();

    }

    @After
    public void close(){
        closeDriver();
    }
}
