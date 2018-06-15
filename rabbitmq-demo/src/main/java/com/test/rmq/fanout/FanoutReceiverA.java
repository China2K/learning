package com.test.rmq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA {

    @RabbitHandler
    public void process(String msg) {
    	System.out.println("-----------------------------------");
        System.out.println("FanoutReceiverA  : " + msg);
        System.out.println("-----------------------------------");
    }

}