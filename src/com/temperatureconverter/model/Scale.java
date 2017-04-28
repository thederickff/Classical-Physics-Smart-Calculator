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
    private double value;
    private int pointA;
    private int pointB;
    
    public Scale(String name, String symbol, int pointA, int pointB){
        this.name = name;
        this.symbol = symbol;
        this.value = 0;
        this.pointA = pointA;
        this.pointB = pointB;
    }

    @Override
    public String toString() {
        return "[" + "name=" + name + 
                ", value=" + value + 
                ", pointA=" + pointA + 
                ", pointB=" + pointB + ']';
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getPointA() {
        return pointA;
    }

    public int getPointB() {
        return pointB;
    }
    
    
    
}


