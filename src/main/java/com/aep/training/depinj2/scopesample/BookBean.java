package com.aep.training.depinj2.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BookBean {
    public BookBean(){
        System.out.println("CONSTRUCTOR=> Book Bean constructor method executed!");
    }
    public void sayIsbn(){
        System.out.println("My ISBN: 1234");
    }
}
