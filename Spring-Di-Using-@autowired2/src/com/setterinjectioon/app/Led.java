package com.setterinjectioon.app;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component @Primary
public class Led implements Light {

	public void lightOn() {
		System.out.println("led On");
	}

	public Led() {
		System.out.println("led created");
	}
	
	
}
