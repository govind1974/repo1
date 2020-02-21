package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.cg.service.TaxException;
import com.cg.service.TaxService;

//@RunWith(JUnitPlatform.class)
public class TaxTest {
	TaxService ser = new TaxService();
	@Test
	public void testTaxCalc1() throws TaxException{
		assertEquals(0.0, ser.calcTax(500000));
	}
	@Test
	public void testTaxCalc2(){
		assertThrows(TaxException.class, ()->{ser.calcTax(-32000);});
	}
	@Test
	public void testTaxCalc3() throws TaxException{
		assertEquals(30000.0, ser.calcTax(800000));
	}
	@Test
	public void testTaxCalc4() throws TaxException{
		assertEquals(80000, ser.calcTax(1200000));
	}
	@Test
	public void testTaxCalc5(){
		assertThrows(TaxException.class, ()->{ser.calcTax(0);});
	}
}
