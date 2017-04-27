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
    private String symbol;
    private int value;
    
    public Scale(String name, String symbol, int value){
        this.name = name;
        this.symbol = symbol;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    
    
    
}


