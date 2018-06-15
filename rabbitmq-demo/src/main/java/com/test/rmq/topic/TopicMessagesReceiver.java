package com.test.rmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(queues = "topic.messages")
public class TopicMessagesReceiver {

    @RabbitHandler
    public void process(String msg) {
    	System.out.println("-------------------------------------------");
        System.out.println("topicMessagesReceiver  : " +msg);
        System.out.println("-------------------------------------------");
    }

}