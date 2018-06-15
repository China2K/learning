package com.test.rmq.topic;

import java.util.Date;
import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicSender  implements  RabbitTemplate.ConfirmCallback{

    @Autowired
    private RabbitTemplate rabbitTemplate;
    

    public void send() {
    	Date date = new Date();
        String msg1 = "I am topic.mesaage msg======" +date;
        System.out.println("sender1 : " + msg1);
        this.rabbitTemplate.convertAndSend("exchange", "topic.message", msg1);
        
        String msg2 = "I am topic.mesaages msg########"+date;
        System.out.println("sender2 : " + msg2);
        this.rabbitTemplate.convertAndSend("exchange", "topic.messages", msg2);
    }
    
    
    
   public void send2() {
	    rabbitTemplate.setConfirmCallback(this);
        String msg="callbackSender : i am callback sender"+new Date();
        System.out.println(msg );
        CorrelationData correlationData = new CorrelationData(UUID.randomUUID().toString());  
        System.out.println("callbackSender UUID: " + correlationData.getId());  
        rabbitTemplate.convertAndSend("exchange", "topic.messages", msg, correlationData); 
    }

   @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("callbakck confirm: " + correlationData.getId());
        System.out.println("callbakck confirm ack: " + ack);
        System.out.println("callbakck confirm cause: " + cause);
        System.out.println("-----------------------------------------");
    }

}