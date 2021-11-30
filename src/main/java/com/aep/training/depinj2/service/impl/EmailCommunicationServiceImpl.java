package com.aep.training.depinj2.service.impl;

import org.springframework.stereotype.Service;

@Service
public class EmailCommunicationServiceImpl implements com.aep.training.depinj2.service.impl.CommunicationService {
    @Override
    public String sendMessage() {
        return "Email gönderildi";
    }
}
