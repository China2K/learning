package com.test.rmq.hello;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver3 {

    @RabbitHandler
    public void process(String msg) {
    	System.out.println("-------------------------------------------------------------------");
        System.out.println("Receiver  3: " + msg);
        System.out.println("-------------------------------------------------------------------");
    }

}