/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.controllers.expansion;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author derickfelix
 */
public class LinearControllerTest {
    
    private LinearController instance;
    public LinearControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new LinearController();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void getAlpha() {
             System.out.println("alpha");
        double initialL = 2.0;
        double finalL = 2.24;
        double deltaT = 200;
        double expResult = 6.0E-4;
        double result = instance.calcAlpha(3,3,5,3);
        assertEquals(expResult, result, 0.0);

    }
    
}
