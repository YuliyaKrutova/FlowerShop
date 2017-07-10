package com.krutova.flowershop.main;

import com.krutova.flowershop.bouquet.Bouquet;
import com.krutova.flowershop.bouquet.Flower;
import com.krutova.flowershop.bouquet.Packaging;
import com.krutova.flowershop.print.Printer;

public class FlowerShopMainTask5 {

public static void main(String[] args) {
		
		Bouquet bouquet1 = new Bouquet(4301, Packaging.BASE, "VeryVeryFlower", 12);
		Bouquet bouquet2 = new Bouquet(3978, Packaging.BASKET, "ILY", 6);
		
		bouquet1.addNewFlower(Flower.POPPY,2);
		bouquet1.addNewFlower(Flower.NARCISSE,5);
		bouquet1.addNewFlower(Flower.CHRYSANTHEMUM,2);
		bouquet2.addNewFlower(Flower.ROSE,6);
		bouquet2.addNewFlower(Flower.TULIP,5);

		Printer.printCheck(bouquet1,bouquet2);
	}

}
