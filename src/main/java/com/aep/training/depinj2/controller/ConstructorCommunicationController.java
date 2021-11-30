package com.aep.training.depinj2.controller;

import com.aep.training.depinj2.service.CommunicationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorCommunicationController {
    private final CommunicationService communicationService;

    public  ConstructorCommunicationController(/*@Qualifier("pnCommunicationServiceImpl")*/CommunicationService communicationService) {
        this.communicationService=communicationService;
    }

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}
