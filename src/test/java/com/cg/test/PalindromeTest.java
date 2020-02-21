package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;

import com.cg.service.PalindromeService;

//@RunWith(JUnitPlatform.class)
@IncludeTags("dev")
public class PalindromeTest {
	
	@Tag("dev")
	@Test
	public void testPalindrome1(){
		PalindromeService ser = new PalindromeService();
		assertTrue(ser.isPalindrome("nitin"));
	}
	
	@Tag("dev")
	@Test
	public void testPalindrome2(){
		PalindromeService ser = new PalindromeService();
		assertTrue(ser.isPalindrome("madam"));
	}
	
	@Tag("prod")
	@Test
	public void testPalindrome3(){
		PalindromeService ser = new PalindromeService();
		assertFalse(ser.isPalindrome(""));
	}
	
	@Tag("dev")
	@Test
	public void testPalindrome4(){
		PalindromeService ser = new PalindromeService();
		assertFalse(ser.isPalindrome("  "));
	}
	@Tag("dev")
	@Tag("prod")
	@Test
	public void testPalindrome5(){
		PalindromeService ser = new PalindromeService();
		assertFalse(ser.isPalindrome("a"));
	}
	
	@Tag("prod")
	@Test
	public void testPalindrome6(){
		PalindromeService ser = new PalindromeService();
		assertFalse(ser.isPalindrome("rama"));
	}




}
