package com.krutova.flowershop.bouquet;

public enum Packaging {
	BASE(2, "Обычная"),
	BASKET(7, "Корзина");
	
	private double price;
	private String description;
	
	private Packaging(double price, String description) {
		this.price = price;
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
	
}
