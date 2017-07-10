package com.krutova.flowershop.main;

import com.krutova.flowershop.bouquet.Bouquet;
import com.krutova.flowershop.bouquet.Packaging;
import com.krutova.flowershop.print.Printer;

public class FlowerShopMainTask3 {

	public static void main(String[] args) {

		Bouquet bouquet1 = new Bouquet(4301, Packaging.BASE, "VeryVeryFlower", 8);
		Bouquet bouquet2 = new Bouquet(3978, Packaging.BASKET, "ILY", 6);
		
		Printer.printOrderReport(bouquet1, bouquet2);
	}
}
