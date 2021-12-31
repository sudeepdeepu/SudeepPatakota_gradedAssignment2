package com.assign2.services;

public class SortingOperation {
	public void sortingStockOperation(double stockPrice[],String sortingOrder) {
		if(sortingOrder=="a") {
			for (int i = 0; i < stockPrice.length; i++) {
	            for (int j = i + 1; j < stockPrice.length; j++) {
	                double temp = 0;
	                if (stockPrice[j] < stockPrice[i]) {
	                    temp = stockPrice[i];
	                    stockPrice[i] = stockPrice[j];
	                    stockPrice[j] = temp;
	                }
	            }
	            System.out.print(stockPrice[i] + " ");
	        }
		}else {
			for (int i = 0; i < stockPrice.length; i++) {
	            for (int j = i + 1; j < stockPrice.length; j++) {
	                double temp = 0;
	                if (stockPrice[i] < stockPrice[j]) {
	                    temp = stockPrice[i];
	                    stockPrice[i] = stockPrice[j];
	                    stockPrice[j] = temp;
	                }
	            }
	            System.out.print(stockPrice[i] + " ");
	        }
		}
	}
}
