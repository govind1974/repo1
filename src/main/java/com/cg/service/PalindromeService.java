package com.cg.service;

public class PalindromeService {
	
	public boolean isPalindrome(String str){
		if(!str.matches("[a-zA-Z]{2,10}"))
			return false;
		StringBuffer sb = new StringBuffer(str);
		String rev = sb.reverse().toString();
		return str.equalsIgnoreCase(rev);
	}
	

}
