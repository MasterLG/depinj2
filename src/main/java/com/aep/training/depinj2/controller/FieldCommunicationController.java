package com.aep.training.depinj2.controller;

import com.aep.training.depinj2.service.CommunicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class FieldCommunicationController {
    //@Qualifier("emailCommunicationServiceImpl")
    @Autowired
    public CommunicationService communicationService;

    public void handleMessage(){
        System.out.println(communicationService.sendMessage());
    }
}
