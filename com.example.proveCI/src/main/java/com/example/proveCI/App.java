package com.example.proveCI;

/**
 * Hello world!
 *
 */
public class App {
	
	public String hello(String name) {
		if (name == null) {
			return "Hello!";
		} else
			return "HelloWorld!";
	}
	
	public String hello() {
		return hello(null);
	}
}
