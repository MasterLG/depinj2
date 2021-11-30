package com.aep.training.depinj2.controller;

import com.aep.training.depinj2.service.CommunicationService;
import org.springframework.stereotype.Controller;

@Controller
public class GeneralPurposesController {
    private CommunicationService communicationService;

    public GeneralPurposesController(CommunicationService communicationService){
        this.communicationService=communicationService;
    }

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }

}
