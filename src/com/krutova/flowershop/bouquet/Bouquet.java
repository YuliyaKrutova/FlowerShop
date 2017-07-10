package com.krutova.flowershop.bouquet;

import java.util.HashMap;


public class Bouquet {

	private static final int ID_LENGTH=5;
	private static final int MIN_NAME_LENGTH=4;
	private static final int MAX_NAME_LENGTH=20;
	private static final int MAX_COUNT_BOUQUET_FLOWER=10;
	private int orderId; //no setter
	private int clientId;
	private Packaging bouquetType;
	private String bouquetName;
	private int bouquetCount;
	private HashMap<Flower, Integer> flower = new HashMap<Flower, Integer>();
	
	public Bouquet(int clientID,Packaging bouquetType,String bouquetName,int bouquetCount){
		
		do {
			orderId = (int)Math.round(Math.random()*100000);
		} while (Integer.toString(orderId).length() != ID_LENGTH);
		
		if (bouquetName.length()>=MIN_NAME_LENGTH && bouquetName.length()<=MAX_NAME_LENGTH){
			this.bouquetName = bouquetName;
		}else {
			this.bouquetName = "Клиент #"+orderId;
			//System.out.println("Bouquet Name is incorrect! New name for bouquet is: Client #"+orderID); 
		}
		
		if (bouquetCount<=MAX_COUNT_BOUQUET_FLOWER && bouquetCount>0){
			this.bouquetCount = bouquetCount;
		}else {
			this.bouquetCount = MAX_COUNT_BOUQUET_FLOWER;
		}
		this.clientId = clientID;
		this.bouquetType = bouquetType;
	}
	
	public void addNewFlower(Flower newFlower, int count) {
		int fullSumFlower=0;
		for (int sumFlower : flower.values()){fullSumFlower=fullSumFlower+ sumFlower;}
		for (int i=1; i<=count ;i++){
			if (fullSumFlower<MAX_COUNT_BOUQUET_FLOWER){
				flower.put(newFlower, i);
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
