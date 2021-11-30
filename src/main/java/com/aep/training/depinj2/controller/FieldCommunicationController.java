package com.aep.training.depinj2.controller;

import com.aep.training.depinj2.service.impl.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldCommunicationController {
    @Autowired
    public CommunicationService communicationService;

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}
