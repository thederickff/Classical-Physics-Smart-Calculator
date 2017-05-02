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

        Scale[] scales = new Scale[3];
        //Scale scale = new Scale("Derick", "D", 32, 212);

        scales[0] = new Scale("Celsius", "C", 0, 100);
        scales[1] = new Scale("Fahreinheit", "F", 32, 212);
        scales[2] = new Scale("Kelvin", "K", 273, 373);
        // 9 => 180
        // 5 => 100

        scales[0].setValue(20);
        scales[1].setValue(20);
        scales[2].setValue(20);
        findEachValueByOneValue(scales, scales[1]);
        System.out.println(scales[0]);
        System.out.println(scales[1]);
        System.out.println(scales[2]);
    }

    /**
     * @param to is the scales you want to discover the values by one value
     * @param from is the scale that you using to discover the value of others scales
     * 'to'
     * ((from.value * to.b) / from.b) + to.a
     */
    public static void findEachValueByOneValue(Scale[] to, Scale from) {
        for (Scale to1 : to) {
            if (from != to1) {
                to1.setValue(((from.getValue() * to1.getPointB()) / from.getPointB()) + to1.getPointA());
            }
        }
    }
}
