package com.assign2.services;

import java.util.Scanner;

public class Operations {
	public void operationsPerformedForStocks(double stockPrice[], int stockPriceRise, int stockPriceDecrease) {
		SearchOperation searchStock = new SearchOperation();
		SortingOperation sortStock = new SortingOperation();
		Scanner sc = new Scanner(System.in);
		String sortingOrder;
		int option = 1;
		System.out.println("\n\n---------------------------------------------------------\n");
		while(option!=0 && option <=5) {
			System.out.println("\nEnter the operation you want to perform");
			System.out.println("1. Display the companies stock price in ascending order");
			System.out.println("2. Display the companies stock price in descending order");
			System.out.println("3. Display the total no of companies for which stock prices rose today");
			System.out.println("4. Display the total no of companies for which stock prices declined today");
			System.out.println("5. Search a specific stock price\n");
			option = sc.nextInt();
			
			if(option==1) {
				sortingOrder = "a";
				System.out.println("Stock prices in ascending order are:\n");
				sortStock.sortingStockOperation(stockPrice, sortingOrder);
				
			}
			else if (option == 2)
	        {
				sortingOrder = "d";
	        	System.out.println("Stock prices in descending order are:\n");
	        	sortStock.sortingStockOperation(stockPrice, sortingOrder);
	        }
			else if (option == 3)
	        {
	        	System.out.println("Total no of companies whose stock price rose today : "+stockPriceRise);
	        }
	        else if (option == 4)
	        {
	        	System.out.println("Total no of companies whose stock price declined today : "+stockPriceDecrease);
	        }
	        else if (option == 5)
	        {
	            double key;
	            System.out.println("Enter the key value\n");
	            key = sc.nextDouble();
	            searchStock.searchStockOperation(stockPrice,key);
	        }
	        else {
	        	System.out.println("Exited successfully");
	        }
		}
		System.out.println("\n\n---------------------------------------------------------\n");
	}
}
