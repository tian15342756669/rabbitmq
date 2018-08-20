package com.dengtg.consumer;

import com.dengtg.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by dengtianguang on 2018/8/20.
 */
@Component
@RabbitListener(queues = "object_queue")
public class ObjectReceiver {

    @RabbitHandler
    public void objectReceiver(User user){

        System.out.println("Receiver object:"+user.toString());

    }
}
