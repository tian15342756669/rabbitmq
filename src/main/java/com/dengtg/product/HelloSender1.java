package com.dengtg.product;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by dengtianguang on 2018/8/20.
 */
@Component
public class HelloSender1 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String sendMsg = "Hello--1 " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("helloQueue", sendMsg);
    }


    public void sendTest(int j){

        for (int i= 0;i<100;i++){
            String sendMsg = "testQueue------ " + i;
//            System.out.println("testQueue : " + sendMsg);
//            System.out.println("================="+rabbitTemplate);
            this.rabbitTemplate.convertAndSend("testQueue", sendMsg);
        }

    }
}
