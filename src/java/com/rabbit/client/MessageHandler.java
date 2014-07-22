package com.rabbit.client;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class MessageHandler implements MessageListener{


	@Override
	public void onMessage(Message message) {
		
		System.out.println("receive================="+message);
	}
}
