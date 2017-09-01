/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derick.test;

/**
 *
 * @author derickfelix
 */
public class Matherator implements Adder, Subtractor {

    @Override
    public long add(long... operands) {
        long ret = operands[0];
        
        for(int i = 1; i < operands.length; i++) {
            ret += operands[i];
        }
        return ret;
    }

    @Override
    public long subtract(long... operands) {
         long ret = operands[0];
        
        for(int i = 1; i < operands.length; i++) {
            ret -= operands[i];
        }
        return ret;  
    }
    
}
