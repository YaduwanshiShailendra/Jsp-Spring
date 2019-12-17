package com.setterinjectioon.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Switch {

	@Autowired
	//@Qualifier("led")
	private Light light ;

	public void switchOn() {
		System.out.println("Switch On");
		light.lightOn();
	}

	public Switch() {
		System.out.println("switch created");
	}

}
