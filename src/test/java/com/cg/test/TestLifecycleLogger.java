package com.cg.test;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

	
public 	interface TestLifecycleLogger {
	
	    
	    @BeforeAll
	    static void beforeAllTests() {
	        System.out.println("Before all tests");
	    }
	
	    @AfterAll
	    static void afterAllTests() {
	        System.out.println("After all tests");
	    }
	    @Test
	    default void testMethod() {
	    	System.out.println("this is test method...");
	    }
	
	}