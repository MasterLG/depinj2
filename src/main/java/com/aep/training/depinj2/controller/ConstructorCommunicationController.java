package com.aep.training.depinj2.controller;

import com.aep.training.depinj2.service.impl.CommunicationService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorCommunicationController {
    private final CommunicationService communicationService;
    public  ConstructorCommunicationController(CommunicationService communicationService) {
        this.communicationService=communicationService;
    }

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}
