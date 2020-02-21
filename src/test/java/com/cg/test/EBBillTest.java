package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.service.EBService;

//@RunWith(JUnitPlatform.class)
public class EBBillTest {
	
	@Test
	public void testCalcEBBill(){
		EBService ser = new EBService();
		assertEquals(500.0, ser.calcBill(250));
		
		
	}

}
