package com.sqspoller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;


@Service

public class MeshMessageReceiver {
    @Autowired
    private MeshRegister meshRegister;
    @SqsListener(value = "${cloud.aws.end-point.uri}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void onMessageRecieve(String message){
        System.out.println("This is message receiver. Received "+ message);
        meshRegister.registerInstance(message);
    }



}
