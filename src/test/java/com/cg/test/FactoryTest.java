package com.cg.test;



import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.runner.RunWith;
//@RunWith(JUnitPlatform.class)
public class FactoryTest {
	
	@TestFactory
    public Collection<DynamicTest> dynamicTests(){
		Collection<DynamicTest> col = new ArrayList<DynamicTest>();
		DynamicTest obj1 = dynamicTest("Test1", ()->{System.out.println("test1");});
		DynamicTest obj2 = dynamicTest("Test2", ()->{System.out.println("test2");});
		DynamicTest obj3 = dynamicTest("Test3", ()->{System.out.println("test3");});
		
		col.add(obj1);
		col.add(obj1);
		col.add(obj1);
		return col;
	}

}
