package com.test.rmq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.rmq.topic.TopicSender;

@RestController
public class RabbitTestController {

	
    @Autowired
    private TopicSender topicSender;
	
	 @RequestMapping("/callback")
	    public void callbak() {
		 topicSender.send2();
	    }
}
