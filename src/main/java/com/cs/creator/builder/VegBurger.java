package com.cs.creator.builder;

/**
 * 创建扩展了 Burger的实体类。
 */
public class VegBurger extends Burger {
	public float price() {
		return 25.0f;
	}
	public String name() {
		return "Veg Burger";
	}
}