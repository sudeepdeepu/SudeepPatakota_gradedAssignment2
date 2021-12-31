package com.assign2.driver;

import java.util.Scanner;
import com.assign2.services.Operations;


public class Driver {

	public static void main(String[] args) {
		Operations operations = new Operations();
		Scanner sc = new Scanner(System.in);
		int n,price_inc = 0, price_dec = 0;
		String s;
		System.out.println("\nEnter the number of companies");
		n = sc.nextInt();
		double[] current_stock_price = new double[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the current stock price of company "+(i+1)+"\n");
			current_stock_price[i]=sc.nextDouble();
			System.out.println("\nWhether company's stock price rose today compare to yesteray?\n");
			s=sc.next();
			if(s.charAt(0)=='t'||s.charAt(0)=='T') {
				price_inc++;
			}else if(s.charAt(0)=='f'||s.charAt(0)=='F'){
				price_dec++;
			}
		}
		operations.operationsPerformedForStocks(current_stock_price, price_inc, price_dec);
	}
}
