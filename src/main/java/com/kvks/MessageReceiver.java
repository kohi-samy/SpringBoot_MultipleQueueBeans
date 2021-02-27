package com.kvks;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(destination = "kvks.notificationQueue")
    public void receiveNotificationQueue(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Message Received: "+text);
    }

    @JmsListener(destination = "kvks.greetingQueue")
    public void receiveGreetingQueue(String text) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Message Received: "+text);
    }

}
