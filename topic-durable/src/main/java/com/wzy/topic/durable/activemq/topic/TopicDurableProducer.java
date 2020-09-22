package com.wzy.topic.durable.activemq.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.DeliveryMode;
import javax.jms.JMSSessionMode;
import javax.jms.Topic;

@Component
public class TopicDurableProducer {

    //JmsMessagingTemplate是Springboot的Jms模板,Spring的是JmsTemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    // 把ConfigBean类的ActiveMQQueue注入进来
    @Autowired
    private Topic topic;

    //发送queue的方法
    public void producerMsg(){
        jmsMessagingTemplate.getJmsTemplate().setDeliveryMode(DeliveryMode.PERSISTENT);
        String msg = "**"+System.currentTimeMillis();
        System.out.println("发送："+ msg);
        jmsMessagingTemplate.convertAndSend(topic
                , msg);
    }

}
