package com.chandu.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Autowired
	Cpu cpu;

	public void Compiling() {
		System.out.println("Compiling...");
		cpu.cpu();
	}
	
}
