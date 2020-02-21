package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.cg.service.CalService;

//@RunWith(JUnitPlatform.class)
public class SumSeriesTest {
	
	@Test
	@Disabled("Test Sum of Series Up to 10")
	public void testSeries1(){
		CalService ser = new CalService();
		assertEquals(55, ser.calcSeries(10));
	}

	@Test
	@Disabled("Test Sum of Series Up to 10000")
	public void testSeries2(){
		CalService ser = new CalService();
		assertTimeout(Duration.ofNanos(10), ()-> ser.calcSeries(10000));
	}
	
	@Test
	@Disabled("Test Sum of Series Up to 500000")
	public void testSeries3(){
		CalService ser = new CalService();
		assertTimeout(Duration.ofNanos(10), ()-> ser.calcSeries(500000));
	}
}
