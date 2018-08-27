package com.tick_size;

import com.trade.TradeDetails;

public class TickSizeCalculator {
	
	public static void display(double TickSize, double price ){
		price = price - price % TickSize + ((price % TickSize < TickSize / 2) ? 0.0 : TickSize);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		double price = 10.17;
		double TickSize;
		String country = "UK";
	
	switch (country)
	{
	case "India" :
		TickSize = 0.25; 
		break;
	case "US" :
		TickSize = 0.03125; 
		
		break;
	case "UK" :
		TickSize = 0.05; 
		break;
	case "Germany" :
		TickSize = 0.01; 
		break;
	case "Japan" :
		TickSize = 0.01; 
		break;
	case "Thailand" :
		TickSize = 6;
		break;
	case "Hong Kong" :
		TickSize = 1; 
		break;
	case "New Zealand" :
		TickSize = 5;
		break;
	default :
		TickSize = 1;
	}
	
	display(TickSize, price);
}
}