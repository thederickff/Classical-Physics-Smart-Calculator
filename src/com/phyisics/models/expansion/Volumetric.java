/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.models.dilatation;

/**
 *
 * @author derickfelix
 */
public class Volumetric extends Linear {

    private final int dimension = 3;

    /**
     * γ = (V1-V0)/V0ΔT
     *
     * @param initialV - is the the length - V0
     * @param finalV - is the the length - V1
     * @param deltaT - is the temperature ΔT
     * @return gamma - is the coefficient 3α
     */
    public double gamma(double initialV, double finalV, double deltaT) {
        return formatNumber(alpha(initialV, finalV, deltaT) / dimension, 5);
    }

    /**
     * ΔV = γV0ΔT
     *
     * @param initialV - is the the length - V0
     * @param deltaT - is the temperature ΔT
     * @param gamma - is the coefficient 3α
     * @return deltaV - is the the length - ΔV
     */
    public double deltaV(double initialV, double deltaT, double gamma) {
        return deltaL(initialV, deltaT, gamma) * dimension;
    }

    /**
     * ΔT = ΔV / γV0
     *
     * @param initialV - is the the length - V0
     * @param finalV - is the the length - V1
     * @param gamma - is the coefficient 3α
     * @return deltaT - is the temperature ΔT
     */
    public double deltaTV(double initialV, double finalV, double gamma) {
        return deltaTL(initialV, finalV, gamma) / dimension;
    }

    /**
     * V0 = V1 - ΔV
     *
     * @param finalV - is the the length - V1
     * @param deltaV - is the the length - ΔV
     * @return initialV - is the the length - V0
     */
    public double initialV(double finalV, double deltaV) {
        return initialL(finalV, deltaV);
    }

    /**
     * V1 = V0 + ΔV
     *
     * @param initialV - is the the length - V0
     * @param deltaV - is the the length - ΔV
     * @return initialV - is the the length - V1
     */
    public double finalV(double initialV, double deltaV) {
        return finalL(initialV, deltaV);
    }
}
