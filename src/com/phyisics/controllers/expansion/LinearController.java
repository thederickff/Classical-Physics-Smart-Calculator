/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.controllers.expansion;

import com.phyisics.models.ProccessWriter;
import com.phyisics.models.expansion.Linear;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author derickfelix
 */
public class LinearController {

    protected Linear linear;
    protected ProccessWriter pw;

    public LinearController() {
        this.linear = new Linear();
        this.pw = new ProccessWriter();
    }

    /**
     * Calculates the Alpha
     *
     * @param initialL - The initial length
     * @param finalL - The final length
     * @param initialT - The initial temperature
     * @param finalT - The final temperature
     * @return String - Coefficient Alpha
     */
    public String calcAlpha(double initialL, double finalL, double initialT, double finalT) {
        return Double.toString(linear.alpha(initialL, finalL, finalT - initialT));
    }

    /**
     * Calculates the Final Length
     *
     * @param initialL - The initial length
     * @param finalT - The final temperature
     * @param initialT - The initial temperature
     * @param alpha - The coefficient Alpha
     * @return double - Final Length
     */
    public double calcFinalLength(double initialL, double finalT, double initialT, double alpha) {
        return linear.deltaL(initialL, finalT - initialT, alpha) + initialL;
    }

    /**
     * Calculates the Initial Temperature
     *
     * @param initialL - The initial length
     * @param finalL - The final length
     * @param finalT - The final temperature
     * @param alpha - The coefficient Alpha
     * @return double - Initial Temperature
     */
    public double calcInitialTemperature(double initialL, double finalL, double finalT, double alpha) {
        return finalT - linear.deltaTL(initialL, finalL, alpha);
    }

    /**
     * Calculates the Final Temperature
     *
     * @param initialL - The initial length
     * @param finalL - The final length
     * @param initialT - The initial temperature
     * @param alpha - The coefficient Alpha
     * @return double - Final Temperature
     */
    public double calcFinalTemperature(double initialL, double finalL, double initialT, double alpha) {
        return linear.deltaTL(initialL, finalL, alpha) + initialT;
    }

    /**
     * Calculates the Delta Length
     *
     * @param initialL - The initial length
     * @param finalL - The final length
     * @return double - Delta Length
     */
    public double calcDeltaLength(double initialL, double finalL) {
        return finalL - initialL;
    }

    /**
     * Calculates the Delta Temperature
     *
     * @param initialT - The initial temperature
     * @param finalT - The final temperature
     * @return double - Delta Temperature
     */
    public double calcDeltaTemperature(double initialT, double finalT) {
        return finalT - initialT;
    }

    /**
     * Handle the operations by the selected one
     *
     * @param selected - The item selected - char
     * @param lblResult - The result label desired to be updated - JLabel
     * @param lblDeltaL - The delta length label desired to be updated - JLabel
     * @param lblDeltaT - The delta temperature label desired to be updated - JLabel
     * @param txtAProcces - The delta temperature label desired to be updated - JLabel
     * @param initialL - The initial length - double
     * @param finalL - The Final length - double
     * @param initialT - The initial temperature - double
     * @param finalT - The final temperature - double
     * @param alpha - The coefficient alpha - double
     */
    public void handleOperations(char selected, JLabel lblResult, JLabel lblDeltaL, JLabel lblDeltaT, JTextArea txtAProccess, double initialL, double finalL, double initialT, double finalT, double alpha) {
        lblResult.setForeground(Color.green.darker());
        switch (selected) {
            // Final Length
            case 'L':
                finalL = calcFinalLength(initialL, finalT, initialT, alpha);
                // Set the result text by the result of the final length
                lblResult.setText(String.format("%.6f Lengths", finalL));
                // Write the Final Length proccess
                txtAProccess.setText(pw.writeFinalLength(initialL, finalT, initialT, alpha));
                break;
            // Initial Temperature
            case 't':
                initialT = calcInitialTemperature(initialL, finalL, finalT, alpha);
                // Set the result text by the result of the initial temperature
                lblResult.setText(String.format("%.2f degrees", initialT));
                // Write the Initial Temperature proccess
                txtAProccess.setText(pw.writeInitialT(initialT + finalT, finalT));
                break;
            // Final Temperature
            case 'T':
                finalT = calcFinalTemperature(initialL, finalL, initialT, alpha);
                // Set the result text by the result of the final temperature 
                lblResult.setText(String.format("%.2f degrees", finalT));
                // Write the Final Temperature proccess
                txtAProccess.setText(pw.writeFinalT(initialT + finalT, initialT));
                break;
            // Coefficient
            case 'a':
                // Set the result text by the result of alpha 
                lblResult.setText(calcAlpha(initialL, finalL, initialT, finalT));
                // Write the Coefficient alpha proccess
                txtAProccess.setText(pw.writeAlpha(initialL, finalL, initialT, finalT));
                break;
            // None
            default:
                // code
                lblResult.setForeground(Color.magenta.darker());
                lblResult.setText("You didn't select a type yet");
                break;
        }
        lblDeltaL.setText(String.format("%.6f Lengths", calcDeltaLength(initialL, finalL)));
        lblDeltaT.setText(String.format("%.2f degrees", calcDeltaTemperature(initialT, finalT)));
    }

    /**
     * Handle the placeholder by the desired field
     *
     * @param enabled - Enabled Field
     * @param txt - Text field desired to change
     * @param ph - The desired placeholder
     */
    public void placeHolder(boolean enabled, JTextField txt, String ph) {
        if (enabled) {
            txt.setText("");
        } else {
            txt.setText(ph);
        }
    }
}
