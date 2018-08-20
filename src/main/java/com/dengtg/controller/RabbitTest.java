package com.dengtg.controller;

import com.dengtg.User;
import com.dengtg.product.HelloSender1;
import com.dengtg.product.ObjectSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dengtianguang on 2018/8/20.
 */
@RestController
@RequestMapping("/rabbit")
public class RabbitTest {

    @Autowired
    private HelloSender1 helloSender1;

    @Autowired
    private ObjectSender objectSender;

    @RequestMapping("/hello")
    public void hello() {
        helloSender1.send();
    }

    @RequestMapping(value = "/test")
    public void test(){
        helloSender1.sendTest(10);
    }

    @RequestMapping(value = "/obj")
    public void obj(){

        User user = new User("邓天广","123456");
        objectSender.sendUser(user);
    }
}
