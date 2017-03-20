/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatureconverter.controller;

import com.temperatureconverter.model.Scale;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author Derick
 */
public class Converter {

    private Scale celsius;
    private Scale fahreinheit;
    private Scale kelvin;

    public Converter() {

    }

    public void stateChanged(JTextField txt, JSpinner spn, JComboBox cmb) {
        int from = cmb.getSelectedIndex();
        double value = (double) spn.getValue();
        double result = 0;
        switch (from) {
            case 1:
                result = (5 * (value - 32)) / 9;
                break;
            case 2:
                result = ((5 * (value - 32)) / 9)+247;
                break;
            case 3:
                result = ((value * 9) / 5) + 32;
                break;
            case 4:
                result = value + 247;
                break;
            case 5:
                result = (((value - 247) * 9) / 5) + 32;
                break;
            case 6:
                result = value - 247;
                break;
            default:
                System.out.println("Erro selecione um tipo!");
        }
        
         txt.setText(Double.toString(result));

    }
}
