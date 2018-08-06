package com.exilnt.messagesource;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class HelloWorld {
	private String greeting;
	private String message;
	
	@Autowired
	private MessageSource messageSource;
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void sayHello()
	{
		System.out.println(messageSource.getMessage("helloworld", new Object[] {greeting,message}, null));
	}
	public void sayHello_fr()
	{
		System.out.println(messageSource.getMessage("helloworld", new Object[] {greeting,message},  new Locale("FR")));
	}
}
