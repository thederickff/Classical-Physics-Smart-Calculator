/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.controllers.expansion;

import com.phyisics.models.expansion.Linear;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author derickfelix
 */
public class LinearController {
    
    protected Linear linear;
    
    public LinearController() {
        this.linear = new Linear();
        
    }
    
    /**
     * Calculates the Alpha
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
     * @param initialL - The initial length
     * @param finalT - The final length
     * @param initialT - The initial temperature
     * @param alpha - The coefficient Alpha
     * @return String - Final Length
     */
    public String calcFinalLength(double initialL, double finalT, double initialT, double alpha) {
        return Double.toString(linear.deltaL(initialL, finalT - initialT, alpha));
    }
    
    
    /**
     * Handle the operations by the selected one
     * @param sel - The item selected
     * @param lbl - The label desired to be updated
     * @param ile - The initial length
     * @param fle - The Final length
     * @param ite - The initial temperature
     * @param fte - The final temperature
     * @param alp - The coefficient alpha
     */
    public void handleOperations(char sel, JLabel lbl, double ile, double fle, double ite, double fte, double alp) {
        lbl.setForeground(Color.green.darker());
        switch (sel) {
            // Initial Length
            case 'l':
                // code
                break;
            // Final Length
            case 'L':
                // Set the text by the result of final length
                lbl.setText(calcFinalLength(ile, fte, ite, alp));
                break;
            // Initial Temperature
            case 't':
                // code
                break;
            // Final Temperature
            case 'T':
                // code
                break;
            // Coefficient
            case 'a':
                // Set the text by the result of alpha 
                lbl.setText(calcAlpha(ile, fle, ite, fte));
                break;
            // None
            default:
                // code
                lbl.setForeground(Color.magenta.darker());
                lbl.setText("You didn't select a type yet");
                break;
        }
    }
    /**
     * Handle the placeholder by the desired field
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
