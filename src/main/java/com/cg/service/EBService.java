package com.cg.service;

public class EBService {
	
	public double calcBill(double units){
		double bill = 0;
		if(units > 200)
			bill = 100 * 1 + 100 * 2 + (units - 200) * 4;
		else if(units > 100)
			bill = 100 * 1 + (units - 100) * 3.5;
		else
			bill = units * 1;
		return bill;
	}

}
