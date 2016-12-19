package com.cs.creator.prototype;

/**
 * 
 * Prototype
 *
 */
public abstract class Prototype implements Cloneable {

	@Override
	public abstract Object clone() throws CloneNotSupportedException;

}