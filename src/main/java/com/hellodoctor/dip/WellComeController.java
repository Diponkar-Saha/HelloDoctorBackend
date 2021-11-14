package com.hellodoctor.dip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellComeController {
    @GetMapping("/welcome")
    public String welCome(){
        return "welcome to springboot world";
    }
}
