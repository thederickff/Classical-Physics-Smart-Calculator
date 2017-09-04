/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.models;

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
public class ProccessWriterTest {

    private ProccessWriter pw;

    public ProccessWriterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.pw = new ProccessWriter();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void writeAlpha() {
        // α = ΔL/LiΔT
        System.out.println("alpha");
        float initialL = 2.0f;
        double finalL = 2.24;
        double initialT = 0;
        double finalT = 200;
        double alpha = 6.0E-4;
        float deltaL = (float) (finalL - initialL);
        float deltaT = (float) (finalT - initialT);
        float initialLTimesDeltaT = (float) (initialL * deltaT);

        String result, expResult;
        // ΔL = L - Li
        expResult = "ΔL = L - Li \n";
        expResult += "ΔL = " + finalL + " - " + initialL + " \n";
        expResult += "ΔL = " + deltaL + " \n";
        expResult += " \n";
        // ΔT = T - Li
        expResult += "ΔT = T - Ti \n";
        expResult += "ΔT = " + finalT + " - " + initialT + " \n";
        expResult += "ΔT = " + deltaT + " \n";
        expResult += " \n";
        // α = ΔL/LiΔT
        expResult += "α = ΔL / Li * ΔT \n";
        expResult += "α = " + deltaL + " / " + initialL + " * " + deltaT + " \n";
        expResult += "α = " + deltaL + " / " + initialLTimesDeltaT + " \n";
        expResult += "α = " + (deltaL / initialLTimesDeltaT) + " \n";
        result = pw.writeAlpha(initialL, finalL, initialT, finalT);
        System.out.println("ExpResult: \n" + expResult);

        // Assert
        assertEquals(expResult, result);
    }

}
