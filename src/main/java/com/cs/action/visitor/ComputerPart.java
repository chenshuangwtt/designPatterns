package com.cs.action.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}