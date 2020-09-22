package com.wzy.topic.durable.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling // 开启定时任务需要的注解
public class TopicDurableMain {
    public static void main(String[] args) {
        SpringApplication.run(TopicDurableMain.class, args);
    }
}
