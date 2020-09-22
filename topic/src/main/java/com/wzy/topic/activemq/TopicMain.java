package com.wzy.topic.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 开启定时任务需要的注解
public class TopicMain {
    public static void main(String[] args) {
        SpringApplication.run(TopicMain.class, args);
    }
}
