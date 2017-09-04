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
        String r = "";
        // ΔL = L - Li
        r += writeDeltaL(initialL, finalL);
        // ΔT = T - Ti
        r += writeDeltaT(initialT, finalT);
        // α = ΔL/LiΔT
        r += "α = ΔL / (Li * ΔT) \n";
        r += "α = " + deltaL + " / (" + initialL + " * " + deltaT + ") \n";
        r += "α = " + deltaL + " / (" + initialLTimesDeltaT + ") \n";
        r += "α ≃ " + (deltaL / initialLTimesDeltaT) + " \n";
        return r;
    }

    public String writeFinalLength(double initialL, double finalT, double initialT, double alpha) {
        String r = "";
        float deltaT = (float) (finalT - initialT);
        float alphaInitialLDeltaT = (float) (alpha * initialL * deltaT);

        // ΔT = T - Ti
        r += writeDeltaT(initialT, finalT);
        // L = Li + (αLiΔT)
        r += "L = Li + (α * Li * ΔT) \n";
        r += "L = " + initialL + " + (" + alpha + " * " + initialL + " * " + deltaT + ") \n";
        r += "L = " + initialL + " + (" + alpha + " * " + (initialL * deltaT) + ") \n";
        r += "L = " + initialL + " + " + alphaInitialLDeltaT + " \n";
        r += "L ≃ " + (initialL + alphaInitialLDeltaT);
        return r;
    }

    public String writeDeltaL(double initialL, double finalL) {
        // ΔL = L - Li
        String r = "ΔL = L - Li \n";
        r += "ΔL = " + finalL + " - " + initialL + " \n";
        r += "ΔL ≃ " + (finalL - initialL) + " \n";
        r += " \n";
        return r;
    }

    public String writeDeltaT(double initialT, double finalT) {
        // ΔT = T - Ti
        String r = "ΔT = T - Ti \n";
        r += "ΔT = " + finalT + " - " + initialT + " \n";
        r += "ΔT ≃ " + (finalT - initialT) + " \n";
        r += " \n";
        return r;
    }

    public String writeInitialT(double deltaT, double finalT) {
        // Ti = T - ΔT
        String r = "Ti = T - ΔT \n";
        r += "Ti = " + finalT + " - " + deltaT + " \n";
        r += "Ti ≃ " + (finalT - deltaT) + " \n";
        return r;
    }

    public String writeFinalT(double initialL, double finalL, double initialT, double alpha) {
        float deltaL = (float) (finalL - initialL);
        float alphaInitialL = (float) (alpha * initialL);
        float deltaT = (float) (deltaL / alphaInitialL);
        // ΔL = L - Li
        String r = writeDeltaL(initialL, finalL);
        // ΔT = ΔL / αLi 
        r += "ΔT = ΔL / (α * Li) \n";
        r += "ΔT = " + deltaL + " / (" + alpha + " * " + initialL + ") \n";
        r += "ΔT = " + deltaL + " / "+ alphaInitialL + " \n";
        r += "ΔT ≃ " + deltaT + " \n";
        r += " \n";
        // T = Ti + ΔT
        r += "T = Ti + ΔT";
        r += "T = " + initialT + " + " + deltaT + " \n";
        r += "T = " + (initialT + deltaT);
        return r;
    }
}
