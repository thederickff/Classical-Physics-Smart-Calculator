/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.models.expansion;

import com.phyisics.models.expansion.Linear;
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
public class LinearTest {

    public LinearTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of alpha method, of class LinearDilatation.
     */
    @Test
    public void testAlpha() {
        System.out.println("alpha");
        double initialL = 2.0;
        double finalL = 2.24;
        double deltaT = 200;
        Linear instance = new Linear();
        double expResult = 60E-5;
        double result = instance.alpha(initialL, finalL, deltaT);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of deltaL method, of class LinearDilatation.
     */
    @Test
    public void testDeltaL() {
        System.out.println("finalL");
        double initialL = 4;
        double deltaT = 40;
        double alpha = 1.7E-5;
        Linear instance = new Linear();
        double expResult = 0.00272;
        double result = instance.deltaL(initialL, deltaT, alpha);
        assertEquals(expResult, result, 0.0);

        result = instance.initialL(4.00272, 0.00272);
        assertEquals(4, result, 0.0);
        result = instance.finalL(4.0, 0.00272);
        assertEquals(4.00272, result, 0.0);
    }

    /**
     * Test of deltaT method, of class LinearDilatation.
     */
    @Test
    public void testDeltaT() {
        System.out.println("deltaT");
        double initialL = 2.0;
        double finalL = 2.24;
        double alpha = 60E-5;
        Linear instance = new Linear();
        double expResult = 200;
        double result = instance.deltaTL(initialL, finalL, alpha);
        assertEquals(expResult, result, 0.0);

    }

}
