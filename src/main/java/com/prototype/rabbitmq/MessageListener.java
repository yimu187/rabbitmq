package com.prototype.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(Message message){
        System.out.println("recieved message" + message.getMessage());

        System.out.println("recieved message" + message.getMessage());

    }
    
}
