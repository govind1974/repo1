package com.cg.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleTest {
	
	public LifeCycleTest() {
		System.out.println("Lifecycle constructor");
	}
	
	@BeforeAll
	public static void beforeAll(){
		System.out.println("Before All");
	}
	
	@AfterAll
	public static void afterAll(){
		System.out.println("After All");
	}
	
	
	@Test
	public void test1(){
		
	}
	
	@Test
	public void test2(){
		
	}
	
	@Test
	public void test3(){
		
	}

}
