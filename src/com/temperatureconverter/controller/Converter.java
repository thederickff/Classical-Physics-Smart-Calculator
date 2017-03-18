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
        double result;
        switch (from) {
            case 1:
                result = (5 * (value - 32)) / 9;
                
                txt.setText(Double.toString(result));
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                System.out.println("Erro selecione um tipo!");
        }

    }
}
