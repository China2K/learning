package com.test.rmq.fanout;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.A")
public class FanoutReceiverA2 {

    @RabbitHandler
    public void process(String msg) {
    	System.out.println("-----------------------------------");
        System.out.println("FanoutReceiverA2  : " + msg);
        System.out.println("-----------------------------------");
    }

}