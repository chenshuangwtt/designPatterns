package com.cs.j2ee.InterceptingFilter;

public class DebugFilter implements Filter {
	public void execute(String request) {
		System.out.println("request log: " + request);
	}
}