package com.train.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class camera {
	@Value("${ctype}")
	private String  type;

	public String getType() {
		return type;
	}

	public void setType(  String type) {
		this.type = type;
	}

	public camera(String type) {
		super();
		this.type = type;
	}

	public camera() {
		super();
	} 
	

}
