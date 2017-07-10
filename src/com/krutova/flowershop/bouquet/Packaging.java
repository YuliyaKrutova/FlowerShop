package com.krutova.flowershop.bouquet;

public enum Packaging {
	BASE(2, "Base"),
	BASKET(7, "Basket");
	
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
