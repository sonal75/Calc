/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author silks
 */
public class CalculatorTest {
    
    public CalculatorTest() {
                

    }
   static Calculator instance;

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("### setup class executed..");
        instance = new Calculator();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
         System.out.println("### teardown class executed..");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before test...");
       // instance = new Calculator();
        System.out.println("object:"+instance);

        
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after the test..");
       // instance=null;
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 6;
        int b = 4;
        //Calculator instance = new Calculator();
        int expResult = 10;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    @Test
    public void testAdd2() {
        System.out.println("add");
        int a = 200;
        int b = 4;
        //Calculator instance = new Calculator();
        int expResult = 204;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 6;
        int b =4;
        //Calculator instance = new Calculator();
        int expResult =24;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Calculator.
     */
    
    /**
     * Test of main method, of class Calculator.
     */
   

    /**
     * Test of main method, of class Calculator.
     */
    
    }
    

