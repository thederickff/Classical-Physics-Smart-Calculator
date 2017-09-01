/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.models.dilatation;

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
public class VolumetricTest {
    
    public VolumetricTest() {
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
     * Test of gamma method, of class VolumetricDilatation.
     */
    @Test
    public void testGamma() {
        System.out.println("gamma");
        double initialV = 78.5;
        double finalV = 79.2;
        double deltaT = 20;
        Volumetric instance = new Volumetric();
        double expResult = 1.5E-4;
        double result = instance.gamma(initialV, finalV, deltaT);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of deltaV method, of class VolumetricDilatation.
     */
    @Test
    public void testDeltaV() {
        System.out.println("deltaV");
        double initialV = 78.5;
        double deltaT = 20;
        double gamma = 1.5E-4;
        Volumetric instance = new Volumetric();
        double expResult = 79.2;
        double result = instance.deltaV(initialV, deltaT, gamma);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of deltaTV method, of class VolumetricDilatation.
     */
    @Test
    public void testDeltaTV() {
        System.out.println("deltaTV");
        double initialV = 78.5;
        double finalV = 79.2;
        double gamma = 1.5E-4;
        Volumetric instance = new Volumetric();
        double expResult = 0.0;
        double result = instance.deltaTV(initialV, finalV, gamma);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of initialV method, of class VolumetricDilatation.
     */
    @Test
    public void testInitialV() {
        System.out.println("initialV");
        double finalV = 79.2;
        double deltaV = 34.3;
        Volumetric instance = new Volumetric();
        double expResult = 3.5;
        double result = instance.initialV(finalV, deltaV);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of finalV method, of class VolumetricDilatation.
     */
    @Test
    public void testFinalV() {
        System.out.println("finalV");
        double initialV = 34.343;
        double deltaV = 30.3;
        Volumetric instance = new Volumetric();
        double expResult = 53.5;
        double result = instance.finalV(initialV, deltaV);
        assertEquals(expResult, result, 0.0);
    }
    
}
