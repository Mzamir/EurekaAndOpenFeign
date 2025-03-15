package com.samir.servicea.controllers;

import com.samir.servicea.feign.ServiceBClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final ServiceBClient bClient;

    @GetMapping("callServiceB")
    public ResponseEntity<String> callServiceB() {
        ResponseEntity<String> response = bClient.callServiceB();
        if (response.getStatusCode().is2xxSuccessful())
            return ResponseEntity.ok(response.getBody());
        else
            return new ResponseEntity<>("Error while calling service B", response.getStatusCode());
    }
}
