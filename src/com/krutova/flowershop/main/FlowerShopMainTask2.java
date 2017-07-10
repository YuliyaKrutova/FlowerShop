package com.krutova.flowershop.main;

import com.krutova.flowershop.bouquet.Bouquet;
import com.krutova.flowershop.bouquet.Packaging;
import com.krutova.flowershop.print.Printer;


public class FlowerShopMainTask2 {

	public static void main(String[] args) {

		Bouquet bouquet1 = new Bouquet(4711, Packaging.BASE, "FlowerWar 17", 5);
		
		Printer.printBouquetInfo(bouquet1);
		
				
	}

}
