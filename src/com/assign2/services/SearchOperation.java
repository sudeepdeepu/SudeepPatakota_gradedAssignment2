package com.assign2.services;
public class SearchOperation {

	public void searchStockOperation(double stockPrice[],double key) {
		int count=0;
		double selectedStock = 0;
		for(int i=0;i<stockPrice.length;i++) {
			if(key==stockPrice[i]) {
				count++;
				selectedStock=stockPrice[i];
			}
		}
		if(count==0) {
			System.out.println("\nValue not found");
		}
		else {
			System.out.println("\nStock of value "+selectedStock+" is present");
		}
	}
}
