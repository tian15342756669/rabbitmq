//package com.dengtg.product;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.amqp.core.Queue;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.Assert.*;
//
///**
// * Created by dengtianguang on 2018/8/20.
// */
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class HelloSender1Test {
//
//    @Bean
//    public Queue testQueue(){
//        return new Queue("testQueue");
//    }
//
//    @Test
//    public void sendTest() throws Exception {
//
//        HelloSender1 sender1 = new HelloSender1();
//
//        for (int i=0;i<100;i++){
//            sender1.sendTest(i);
//        }
//    }
//
//}