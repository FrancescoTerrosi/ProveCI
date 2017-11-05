package com.example.proveCI;

/**
 * Hello world!
 *
 */
public class App {
	
	public String hello(String name) {
		if (name == null) {
			return "HelloWorld!";
		} else
			return "Hello"+name+"!";
	}
	
	public String hello() {
		return hello(null);
	}
}
