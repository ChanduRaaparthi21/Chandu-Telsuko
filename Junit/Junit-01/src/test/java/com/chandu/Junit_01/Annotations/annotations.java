package com.chandu.Junit_01.Annotations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class annotations {

	
//	@BeforeEach
//	void beforeMethod() {
//		System.out.println("before method");
//	}
//	
//	@Test
//	void test1() {
//		System.out.println("Hello in method1");
//	}
//	@Test
//	void test2() {
//		System.out.println("Hello in method2");
//	}
	
	@AfterEach
	void beforeMethod() {
		System.out.println("after method");
	}
	
	@Test
	void test1() {
		System.out.println("Hello in method1");
	}
	@Test
	void test2() {
		System.out.println("Hello in method2");
	}


}
