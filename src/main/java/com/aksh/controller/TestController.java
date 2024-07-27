package com.aksh.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> helloMessage(){
        log.info("Hello World! from Akash");
        return new ResponseEntity<String>("Hello World! from Akash", HttpStatus.OK);
    }
}
