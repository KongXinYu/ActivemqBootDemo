package com.wzy.queue.activemq.queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueueProducer {

    //JmsMessagingTemplate是Springboot的Jms模板,Spring的是JmsTemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    // 把ConfigBean类的ActiveMQQueue注入进来
    @Autowired
    private ActiveMQQueue activeMQQueue;

    //发送queue的方法
    public void producerMsg(){
        jmsMessagingTemplate.convertAndSend(activeMQQueue
                , "**"+System.currentTimeMillis());
    }

}
