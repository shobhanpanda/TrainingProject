package com.price_calculation;

import java.time.LocalDate;

import com.price_calculation.DateDiffCalculator;

public class ThirtyBy360 implements DateDiffCalculator{

	@Override

	public long calculateDateDiff(LocalDate paymentDate, LocalDate settlementDate, boolean maturityDate) {
		
		int pd = paymentDate.getDayOfMonth(); 
		if(settlementDate.getMonthValue() != 2){pd = Math.min(30, pd);} 
		else {
			if(pd == 28 || pd == 29){
				pd = 30;
			} else {pd = pd;}
		}
		
		int sd = settlementDate.getDayOfMonth();		
		if(settlementDate.getMonthValue() != 2){sd = Math.min(30, sd);} 
		else {
			if( (maturityDate = false) && (sd == 28 || sd == 29 )){
				sd = 30;
			} else {sd = sd;}
		}	
		
		long days = sd- pd; 

		long months = settlementDate.getMonthValue() - settlementDate.getMonthValue();
		long years = settlementDate.getYear() - settlementDate.getYear();
		
		return(years*360 + months*30 + days);
		
	}

	@Override
	public float calculateBasis(LocalDate settlementDate) {
		return(360);
	}

}
