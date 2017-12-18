package com.laonie.demo.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by niejiuqian on 2017/12/15.
 */
@Component
public class HelloSender1 {
    @Autowired
    private AmqpTemplate amqpTemplate;
    public void send() {
        String sendMsg = "hello1 " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.amqpTemplate.convertAndSend("helloQueue", sendMsg);
    }
}
