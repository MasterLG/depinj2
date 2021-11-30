package com.aep.training.depinj2.service.impl;

import com.aep.training.depinj2.service.CommunicationService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pn")
public class PnCommunicationServiceImpl implements CommunicationService {
    @Override
    public String sendMessage() {
        return "Push Notification Gönderildi.";
    }
}
