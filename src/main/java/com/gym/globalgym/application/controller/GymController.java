package com.gym.globalgym.application.controller;

import com.gym.globalgym.application.domain.GymInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GymController {

    @GetMapping("/fake")
     public GymInfo test(){
         return GymInfo
                 .builder()
                 .name("lifetime fitness")
                 .address("Jagat[ura")
                 .fees("10000")
                 .timing("900 to 10")
                 .build();
     }
}
