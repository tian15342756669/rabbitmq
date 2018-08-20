package com.dengtg.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by dengtianguang on 2018/8/20.
 */
@Component
@RabbitListener(queues = "testQueue")
public class TestReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("TestReceiver====111=====  : " + hello);
    }
}
