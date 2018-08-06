package com.train.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
	private camera  cra;
	@Autowired
	private Screen scr;
	@Autowired
	private Speaker spk;
	public camera getCra() {
		return cra;
	}
	public void setCra(camera cra) {
		this.cra = cra;
	}
	public Screen getScr() {
		return scr;
	}
	public void setScr(Screen scr) {
		this.scr = scr;
	}
	public Speaker getSpk() {
		return spk;
	}
	public void setSpk(Speaker spk) {
		this.spk = spk;
	}
	public Mobile(camera cra, Screen scr, Speaker spk) {
		super();
		this.cra = cra;
		this.scr = scr;
		this.spk = spk;
	}
	public Mobile() {
		super();
	}
	

}
