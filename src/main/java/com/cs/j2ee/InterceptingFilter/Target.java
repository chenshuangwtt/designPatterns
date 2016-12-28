package com.cs.j2ee.InterceptingFilter;

public class Target {
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}