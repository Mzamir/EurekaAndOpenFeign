package com.samir.serviceb.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/serviceB/")
public class Controller {

    @GetMapping
    public ResponseEntity<String> performGetRequest() {
        return ResponseEntity.ok("Hello from service B");
    }

}
