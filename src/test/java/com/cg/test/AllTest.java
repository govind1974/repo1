package com.cg.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages("com.cg.test")
@SelectClasses({com.cg.test.CalcTest.class, TaxTest.class, JUnit5DynamicTests.class})
public class AllTest {

}
