/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto;

/**
 *
 * @author BOG-A409-E-016
 */
public class formula {
    public double Celsius(double f){
        double c=(f-32)/1.8;
        return c;
    }
    public double Fahrenheit(double c){
        return (c*1.8)+32;
    }
    
}
