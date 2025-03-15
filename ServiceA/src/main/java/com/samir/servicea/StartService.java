package com.samir.servicea;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StartService implements ApplicationRunner {
    private final ServiceBClient serviceBClient;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put("phoneNumber", "2011");
        serviceBClient.performGetRequest();
    }
}
