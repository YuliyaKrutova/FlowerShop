package com.krutova.flowershop.print;

import java.util.Map.Entry;

import com.krutova.flowershop.bouquet.Bouquet;
import com.krutova.flowershop.bouquet.Flower;
public class Printer {

	public static void printBouquetInfo(Bouquet bouquet) {
		System.out.println(bouquet.toString());
	}
	
	public static void printOrderReport(Bouquet... bouquet){
		for (Bouquet b:bouquet){
			System.out.printf("Клиент с номером %s хочет заказать %sшт. типа %s с названием '%s'.\n",b.getClientID(),b.getBouquetCount(),b.getBouquetType().getDescription(),b.getBouquetName());
		}
	}
	
	public static void printCountFlowers(Bouquet... bouquet){
		for (Bouquet b:bouquet){
			System.out.printf("Количество видов цветов в букете '%s' = %d\n",b.getBouquetName(),b.getFlower().size());
		}
	}
	
	public static void printCheck(Bouquet... bouquet){
		double fullPrice=0D;
		int len=0;
		for (Bouquet b:bouquet){
			System.out.println("**********************************");
			System.out.println("Заказ: "+b.getOrderID());
			System.out.println("Клиент: "+b.getClientID());
			System.out.println("Название: "+b.getBouquetName()+"\n");
			System.out.println("----------------------------------");
			String printStr = "Упаковка("+b.getBouquetType().getDescription()+")";
			len = 18-printStr.length();
			System.out.printf(printStr+"%"+len+"s %1s %12.2f\u20ac\n","","1",b.getBouquetType().getPrice());
			for (Entry<Flower, Integer> fl : b.getFlower().entrySet()) {
				Flower flowerDesc = (Flower)fl.getKey();
				len = 18-flowerDesc.getDescription().length();
				System.out.printf(flowerDesc.getDescription()+"%"+len+"s %d %12.2f\u20ac\n","",fl.getValue(),flowerDesc.getPrice());
				fullPrice = fullPrice+(flowerDesc.getPrice() * Double.parseDouble(Integer.toString((int)fl.getValue())));
			}
			System.out.println("----------------------------------");
			System.out.printf("Всего: %19s %6.2f\u20ac\n","",fullPrice);
			System.out.printf("Кол-во: %9s %2d\n","",b.getBouquetCount());
			System.out.println("----------------------------------");
			System.out.printf("Общая сумма: %13s %6.2f\u20ac\n","",b.getBouquetCount()*fullPrice);
			System.out.println("**********************************\n\n");
		}
	}
		

}
