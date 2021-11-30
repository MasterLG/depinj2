package com.aep.training.depinj2.service.impl;

import com.aep.training.depinj2.service.CommunicationService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("email")
public class EmailCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "Email gönderildi";
    }
}
