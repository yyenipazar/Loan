package Stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {


        @Before
        public void before(Scenario scenario){
            System.out.println("========================================");
            System.out.println("Test is starting"+ scenario.getName());
            System.out.println("========================================");
        }
        @After
        public void after(Scenario scenerio){
            System.out.println("========================================");
            System.out.println(scenerio.getName()+" is passed");
            System.out.println("Tag name is "+ scenerio.getSourceTagNames());
            System.out.println("========================================");

        }
    }


