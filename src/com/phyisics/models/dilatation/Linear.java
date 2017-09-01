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
public class Linear {

    /**
     * α = ΔL/LiΔT
     *
     * @param initialL - is the the length - L0
     * @param finalL - is the the length - L1
     * @param deltaT - is the temperature ΔT
     * @return alpha - is the coefficient α
     */
    protected double alpha(double initialL, double finalL, double deltaT) {
        double alpha = (finalL - initialL) / (initialL * deltaT);
        return formatNumber(alpha, 7);
    }

    /**
     * ΔL = αLiΔT
     *
     * @param initialL - is the the length - L0
     * @param deltaT - is the temperature ΔT
     * @param alpha - is the coefficient α
     * @return deltaL - is the the length - ΔL
     */
    protected double deltaL(double initialL, double deltaT, double alpha) {
        double deltaL = initialL * alpha * deltaT;
        return deltaL;
    }

    /**
     * ΔT = ΔL / αLi
     *
     * @param initialL - is the the length - L0
     * @param finalL - is the the length - L1
     * @param alpha - is the coefficient α
     * @return deltaT - is the temperature ΔT
     */
    protected double deltaTL(double initialL, double finalL, double alpha) {
        double deltaT = (finalL - initialL) / (initialL * alpha);
        return formatNumber(deltaT, 1);
    }
 
    /**
     * L0 = L1 - ΔL
     *
     * @param finalL - is the the length - L1
     * @param deltaL - is the the length - ΔL
     * @return initialL - is the the length - L0
     */
    protected double initialL(double finalL, double deltaL) {
        return finalL - deltaL;
    }

    /**
     * L1 = L0 + ΔL
     *
     * @param initialL - is the the length - L0
     * @param deltaL - is the the length - ΔL
     * @return initialL - is the the length - L1
     */
    protected double finalL(double initialL, double deltaL) {
        return initialL + deltaL;
    }

    /**
     * Format the result by informing the number and  the e.
     * For example: 
     * @param number 3.34673235322
     * @param e 5
     * @return 3.4674 as result
     */   
    protected double formatNumber(double number, int e) {
        return Double.parseDouble(String.format("%." + e + "f", number));
    }

}
