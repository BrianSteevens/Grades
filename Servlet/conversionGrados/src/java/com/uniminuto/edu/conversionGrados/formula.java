/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.edu.conversionGrados;

/**
 *
 * @author bzamb
 */
public class formula {
    private int resultado;
    String aux = "";

    public String calcularR(int g){
        if(g<=90){
            for (int i = g; i < 90; i++) {
                resultado = 180/i;
                aux += Integer.toString(i)+" pi /" + resultado+" - ";
            }
            
        }else if(g <= 180){
            for (int i = g; i < 180; i++) {
                resultado = 180/g;
                aux += "pi" + resultado;
            }
    }
       return aux;
    }
    
    
    
}
