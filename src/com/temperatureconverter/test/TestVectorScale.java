/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temperatureconverter.test;

import com.temperatureconverter.controller.Converter;
import com.temperatureconverter.model.Scale;


/**
 *
 * @author derickfelix
 */
public class TestVectorScale {
    
    public static void main(String[] args) {
       
        Scale scale = new Scale("Derick", "D", 32, 212);
        Converter cv = new Converter();
        
        scale.setValue(20);
        
        cv.findEachValue(scale);
        System.out.println( scale.getValue() + " "+ scale.getName() + "'s scale "+"is " + 
                cv.getScales()[0].getValue() + " " + cv.getScales()[0].getName());
        System.out.println( scale.getValue() + " "+ scale.getName() + "'s scale "+"is " + 
                cv.getScales()[1].getValue() + " " + cv.getScales()[1].getName());
        System.out.println( scale.getValue() + " "+ scale.getName() + "'s scale "+"is " + 
                cv.getScales()[2].getValue() + " " + cv.getScales()[2].getName());
        //System.out.println(result);
    }
}
