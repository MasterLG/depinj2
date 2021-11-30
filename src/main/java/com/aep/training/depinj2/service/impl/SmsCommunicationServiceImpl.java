package com.aep.training.depinj2.service.impl;

import com.aep.training.depinj2.service.CommunicationService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Primary
@Service
@Profile("sms")
public class SmsCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "SMS Gönderildi.";
    }
}
