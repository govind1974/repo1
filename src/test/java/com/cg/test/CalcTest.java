package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.cg.service.CalService;

//@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_METHOD)
public class CalcTest implements TestLifecycleLogger{
	
	public CalcTest(){
		System.out.println("created");
	}
	@Test
	public void testSeries1(){
		CalService ser = new CalService();
		double expected = 5.0;
		double actual = ser.calcSeries(5, 3, 2);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSeries2(){
		CalService ser = new CalService();
		assumingThat(ser != null, ()->assertEquals(6.5, ser.calcSeries(5, 5, 3)));
	}
	
	@Test
	public void testSeries3(){
		CalService ser = new CalService();
		double expected = -6.5;
		double actual = ser.calcSeries(-5, -5, -3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSeries4(){
		CalService ser = new CalService();
		double actual = ser.calcSeries(10,5);
		assertEquals(2.0, actual);
	}
	
	@Test
	public void testSeries5(){
		CalService ser = new CalService();
		double actual = ser.calcSeries(10,8,2);
		assertEquals(10.0, actual);
	}

}
