/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatureconverter.test;

import com.temperatureconverter.model.Scale;

/**
 *
 * @author derickfelix
 */
public class TestVectorScale {
    
    public static void main(String[] args) {
        Scale[] scales = new Scale[3];
        
        scales[0] = new Scale("Celsius", "C", 10 ,30);
        
        System.out.println(scales.length);
    }
}
