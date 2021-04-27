package com.jpreinold.whatsmygrade.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckResource {

    @GetMapping("/healthcheck")
    public String healthcheck() {
        return "OK";
    }
}
