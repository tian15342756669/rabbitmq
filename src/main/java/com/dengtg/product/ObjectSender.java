package com.dengtg.product;

import com.dengtg.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dengtianguang on 2018/8/20.
 */
@Component
public class ObjectSender {

    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendUser(User user){

        System.out.println("Send object:"+user.toString());
        this.amqpTemplate.convertAndSend("object_queue",user);

    }
}
