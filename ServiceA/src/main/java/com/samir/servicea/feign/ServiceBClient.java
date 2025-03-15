package com.samir.servicea.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-b")
public interface ServiceBClient {

    @GetMapping("/serviceB/")
    ResponseEntity<String> callServiceB();
}
