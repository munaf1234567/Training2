package com.train.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Speaker {
	@Value("${stype}")
	private String  type;
	@Value("${volLavel}")
	private int  volLavel;
	public String getType() {
		return type;
	}
	public void setType( String type) {
		this.type = type;
	}
	public int getVolLavel() {
		return volLavel;
	}
	public void setVolLavel( int volLavel) {
		this.volLavel = volLavel;
	}
	@Override
	public String toString() {
		return "Speaker [type=" + type + ", volLavel=" + volLavel + "]";
	}
	public Speaker( String type, int volLavel) {
		super();
		this.type = type;
		this.volLavel = volLavel;
	}
	public Speaker() {
		super();
	}
	

}
