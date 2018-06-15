package com.test.rmq.hello;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.rmq.hello.HelloSender;
import com.test.rmq.hello.HelloSender2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;
    
    @Autowired
    private HelloSender2 helloSender2;

    @Test
    public void hello() throws Exception {
    	for (int i = 0; i < 10; i++) {
    		String content = "hello-"+i+"   "+new Date();
    		helloSender.send(content);
    		helloSender2.send(content);
			
		}
    }

}
