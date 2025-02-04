package com.example.springone.service;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Service
public class UserServic {


    @Getter
    @Setter
    @AllArgsConstructor
    public class User{
        private String name;
        private int age;
        private String address;
    }

    private User user;
    public UserServic(){
        user=new User("Tanishq Gupta",21,"Azamgarh");
    }
    public void login(){
        System.out.println("Logging user in");
    }
    public void logout(){
        System.out.println("Logging out user");
    }

}
