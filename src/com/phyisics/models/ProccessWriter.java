/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.models;

/**
 *
 * @author derickfelix
 */
public class ProccessWriter {

    public String writeAlpha() {
        String r = "ΔL = L - Li\n";

        System.out.println(r);
        return r;
    }

    public String writeAlpha(double initialL, double finalL, double initialT, double finalT) {
        float deltaL = (float) (finalL - initialL);
        float deltaT = (float) (finalT - initialT);
        float initialLTimesDeltaT = (float) (initialL * deltaT);
        String r;
        // ΔL = L - Li
        r  = "ΔL = L - Li \n";
        r += "ΔL = " + finalL + " - " + initialL + " \n"; 
        
        r += "ΔL = " + deltaL + " \n";
        r += " \n";
        // ΔT = T - Ti
        r += "ΔT = T - Ti \n";
        r += "ΔT = " + finalT + " - " + initialT + " \n";
        r += "ΔT = " + deltaT + " \n";
        r += " \n";
        // α = ΔL/LiΔT
        r += "α = ΔL / Li * ΔT \n";
        r += "α = " + deltaL + " / " + initialL + " * " + deltaT + " \n";
        r += "α = " + deltaL + " / " + initialLTimesDeltaT + " \n";
        r += "α = " + (deltaL / initialLTimesDeltaT) + " \n";
        return r;
    }
}
