package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.cg.service.CalService;

//@RunWith(JUnitPlatform.class)
public class Param2Test {
	
	@ParameterizedTest
	@CsvSource({"5,5,10,10", "5,5,3,6.5", "5,2,10,8.5"})
	public void testSum(int a, int b, int c, double expected){
		CalService ser = new CalService();
		assertEquals(expected, ser.calcSeries(a, b, c));
		
	}

}
