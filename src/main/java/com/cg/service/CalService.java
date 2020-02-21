package com.cg.service;

public class CalService {
	
	public double calcSeries(int a, int b, int c){
		
		return (a+b+c)/2.0;
	}
	
	public long calcSeries(int num){
		long sum =  (num * (num + 1) / 2);
		return sum;
	}
	
public double calcSeries(int a, int b){
		
		return a/b;
	}

}
