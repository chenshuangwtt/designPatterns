package com.cs.j2ee.InterceptingFilter;

public class AuthenticationFilter implements Filter {
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}
}