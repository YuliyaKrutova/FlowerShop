package com.krutova.flowershop.bouquet;

public enum Flower {
	TULIP(2, "Тюльпан"),
	ROSE(3, "Роза"),
	NARCISSE(1.5, "Нарцисс"),
	SUNFLOWER(5, "Подсолнух"),
	GERBERA(2, "Гербера"),
	CHRYSANTHEMUM(0.9, "Хризантема"),
	DAISY(1.3, "Daisy"),
	POPPY(0.7, "Мак");
	
	private double price;
	private String description;
	
	private Flower(double price, String description) {
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
