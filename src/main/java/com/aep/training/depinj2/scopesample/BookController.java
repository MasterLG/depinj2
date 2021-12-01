package com.aep.training.depinj2.scopesample;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class BookController {
    public  BookController(){
        System.out.println("Controller Constuctor çalıştı");
    }
    @GetMapping("/sayhi")
    public  String sayHi(){
        return "Hi Folks";
    }
}
