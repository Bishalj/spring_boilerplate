package com.bishal.spring.boilerplate.healthcheck.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Slf4j
@RestController
public class HealthCheckController {

    Logger logger = LoggerFactory.getLogger(HealthCheckController.class);
    @GetMapping("/healthy")
    public String healthCheck(){
        logger.info("Log hit" + new Date());
        return "I am Healthy. " + (new Date());
    }

}
