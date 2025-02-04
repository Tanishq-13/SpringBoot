package com.example.springone.restApis;

import com.example.springone.service.UserServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {//j
    @Autowired
    private UserServic userServic;
    @GetMapping("/")
    public String userLogin(){
        userServic.login();
        return "Welcome to Spring One!";
    }
}
