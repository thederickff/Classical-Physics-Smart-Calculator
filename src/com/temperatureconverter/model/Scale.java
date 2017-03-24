/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatureconverter.model;

/**
 *
 * @author Derick
 */
public class Scale {
    
    private String name;
    private int unit;

    public Scale(String name, int unit) {
        this.name = name;
        this.unit = unit;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the unit
     */
    public int getUnit() {
        return unit;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(int unit) {
        this.unit = unit;
    }
    
    
}


