/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phyisics.controllers.expansion;

import com.phyisics.models.expansion.Linear;
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
    public double calcAlpha(double initialL, double finalL, double initialT, double finalT) {
        
        return 0;
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
