package com.cs.j2ee.BusinessDelegate;

public class EJBService implements BusinessService {

	public void doProcessing() {
		System.out.println("Processing task by invoking EJB Service");
	}
}