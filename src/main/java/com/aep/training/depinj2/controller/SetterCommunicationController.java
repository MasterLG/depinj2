package com.aep.training.depinj2.controller;

import com.aep.training.depinj2.service.impl.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterCommunicationController {

    private CommunicationService communicationService;

    @Autowired
    public void setCommunicationService(CommunicationService communicationService){
        this.communicationService=communicationService;
    }
    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}
