package com.cs.action.strategy;

public class OperationSubstract implements Strategy {
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}