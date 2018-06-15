package com.test.rmq.fanout;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqFanoutTest {

    @Autowired
    private FanoutSender fanoutSender;
    
    @Test
    public void hello() throws Exception {
    	String msgString="fanoutSender :hello this is a msg!"+new Date();
    	fanoutSender.send(msgString);
    }

}
