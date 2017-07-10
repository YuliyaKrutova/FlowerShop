package com.krutova.flowershop.bouquet;

import java.util.HashMap;


public class Bouquet {

	private int orderId; //no setter
	private int clientId;
	private Packaging bouquetType;
	private String bouquetName;
	private int bouquetCount;
	private HashMap<Flower, Integer> flower = new HashMap<Flower, Integer>();
	
	public Bouquet(int clientID,Packaging bouquetType,String bouquetName,int bouquetCount){
		
		do {
			orderId = (int)Math.round(Math.random()*100000);
		} while (Integer.toString(orderId).length() != 5);
		
		if (bouquetName.length()>=4 && bouquetName.length()<=20){
			this.bouquetName = bouquetName;
		}else {
			this.bouquetName = "Клиент #"+orderId;
			//System.out.println("Bouquet Name is incorrect! New name for bouquet is: Client #"+orderID); 
		}
		
		if (bouquetCount<=10 && bouquetCount>0){
			this.bouquetCount = bouquetCount;
		}else {
			this.bouquetCount = 10;
		}
		this.clientId = clientID;
		this.bouquetType = bouquetType;
	}
	
	public void addNewFlower(Flower newFlower, int count) {
		int fullSumFlower=0;
		for (int sumFlower : flower.values()){fullSumFlower=fullSumFlower+ sumFlower;}
		for (int i=1; i<=count ;i++){
			if (fullSumFlower<10){
				flower.put(newFlower/*.getDescription()*/, i);
				fullSumFlower++;
			}else {
				System.out.println("Букет '"+bouquetName+"' полон"); 
			}
		}
	}

	public HashMap<Flower, Integer> getFlower() {
		return flower;
	}

	public int getOrderID() {
		return orderId;
	}

	public int getClientID() {
		return clientId;
	}

	public Packaging getBouquetType() {
		return bouquetType;
	}

	public String getBouquetName() {
		return bouquetName;
	}

	public int getBouquetCount() {
		return bouquetCount;
	}

	@Override
	public String toString() {
		return "Букет ["+orderId+": "+clientId+": "+bouquetName+": "+ bouquetCount + "]";
	}
	
	

}
