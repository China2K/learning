package com.test.rmq.topic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqTopicTest {

    @Autowired
    private TopicSender topicSender;
    
    @Test
    public void hello() throws Exception {
    	/*topicSender.send();*/
    	topicSender.send2();
    }

}
