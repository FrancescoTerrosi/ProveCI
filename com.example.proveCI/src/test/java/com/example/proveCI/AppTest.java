package com.example.proveCI;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testHello() {
		App a = new App();
		assertEquals("HelloWorld!", a.hello());
	}
	
	@Test
	public void testHelloWithParam() {
		App a = new App();
		assertEquals("HelloJacob!", a.hello("Jacob"));
	}

}
