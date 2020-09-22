package com.wzy.topic.activemq.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class TopicProducer {

    //JmsMessagingTemplate是Springboot的Jms模板,Spring的是JmsTemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    // 把ConfigBean类的ActiveMQQueue注入进来
    @Autowired
    private Topic topic;

    //发送queue的方法
    public void producerMsg(){
        jmsMessagingTemplate.convertAndSend(topic
                , "**"+System.currentTimeMillis());
    }

}
