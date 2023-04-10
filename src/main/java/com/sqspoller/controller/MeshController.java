package com.sqspoller.controller;

import com.sqspoller.service.MeshRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeshController {
    @Autowired
    private MeshRegister meshRegister;

    @GetMapping("/regdataset")
    public String regDataset() {
        System.out.println("Going to register instance through controller");
        return meshRegister.registerInstance("someinstance");
    }
}
