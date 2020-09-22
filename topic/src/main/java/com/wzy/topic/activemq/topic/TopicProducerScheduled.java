package com.wzy.topic.activemq.topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Topic;

@Component
public class TopicProducerScheduled {

    //JmsMessagingTemplate是Springboot的Jms模板,Spring的是JmsTemplate
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    // 把ConfigBean类的ActiveMQQueue注入进来
    @Autowired
    private Topic topic;

    // 间隔3秒发送一次,SpringBoot的Scheduled用来定时执行
    @Scheduled(cron = "0/3 * * * * ?")
    public void producerMsgScheduled(){
        String msg = "Scheduled**"+System.currentTimeMillis();
        System.out.println("Scheduled任务, 发送消息:"+ msg);
        jmsMessagingTemplate.convertAndSend(topic
                , msg);
    }

}
