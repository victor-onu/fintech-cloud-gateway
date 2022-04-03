package com.victor.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateWayController {

    @PostMapping("/accountServiceFallBack")
    public String defaultMessage(){
        return "Account service is currently down, please try again later";
    }
}
