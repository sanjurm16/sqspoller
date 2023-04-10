package com.sqspoller.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MeshRegister {

    public String registerInstance(String instancename){
        System.out.println("This is message registration service");
        return instancename+ "is registered";
    }
}
