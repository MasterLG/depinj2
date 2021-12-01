package com.aep.training.depinj2;


import com.aep.training.depinj2.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Depinj2Application {

    public static void main(String[] args) {
        /*Field Injection Örneği*/
       ApplicationContext context= SpringApplication.run(Depinj2Application.class, args);
       //FieldCommunicationController fieldCommunicationController=(FieldCommunicationController)context.getBean("fieldCommunicationController");
       //fieldCommunicationController.handleMessage();

       /*Setter Injection Örneği*/
        //SetterCommunicationController setterCommunicationController=(SetterCommunicationController)context.getBean("setterCommunicationController");
        //setterCommunicationController.handleMessage();

       /*Constructor örneği*/
        //ConstructorCommunicationController constructorCommunicationController=(ConstructorCommunicationController)context.getBean("constructorCommunicationController");
        //constructorCommunicationController.handleMessage();

        /*GeneralPurposesController generalPurposesController =(GeneralPurposesController) context.getBean("generalPurposesController");
        //generalPurposesController.handleMessage();*/
        UnderSamePackageLevelComponent underSamePackageLevelComponent=(UnderSamePackageLevelComponent)context.getBean("underSamePackageLevelComponent");
        underSamePackageLevelComponent.testMe();
    }

}
