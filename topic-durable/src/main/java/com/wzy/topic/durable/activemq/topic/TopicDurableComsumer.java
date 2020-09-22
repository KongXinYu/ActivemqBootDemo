package com.wzy.topic.durable.activemq.topic;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class TopicDurableComsumer {

    //需要在监听方法指定连接工厂
//    @JmsListener(destination = "${mytopic}",containerFactory = "jmsListenerContainerFactory")
    public void consumer(TextMessage textMessage) throws JMSException {
        System.out.println("订阅着收到消息:    " + textMessage.getText());
    }

}
