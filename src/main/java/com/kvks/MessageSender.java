package com.kvks;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

@Component
public class MessageSender implements CommandLineRunner {

   @Autowired
   private JmsMessagingTemplate jmsMessagingTemplate;

   @Autowired
    private Queue notificationQueue;

    @Autowired
    private Queue greetingQueue;

    @Override
    public void run(String... arg0) throws Exception {
        sendMessage();
    }

    public void sendMessage(){
       this.jmsMessagingTemplate.convertAndSend(this.notificationQueue, "You have logged in as kvks");
       this.jmsMessagingTemplate.convertAndSend(this.greetingQueue, "Hello kvks, your welcome");
       System.out.println("Message has been put to queue by sender");
    }

}
