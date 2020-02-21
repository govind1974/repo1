package com.cg.service;

public class TaxService {

	public double calcTax(double income) throws TaxException{
		double tax = 0;
		if(income <= 0)
			throw new TaxException();
		if(income > 1000000)
			tax = 500000 * 0.1 + (income - 1000000) * 0.15;
		else if(income > 500000)
			tax = (income - 500000)*0.1;
			
		return tax;
	}
}
