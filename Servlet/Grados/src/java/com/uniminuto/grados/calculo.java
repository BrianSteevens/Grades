/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto.grados;

/**
 *
 * @author BOG-A409-E-016
 */
public class calculo {
    private Double resultado;

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    public Double calcularR(double g){
        resultado = 180/g;
        return resultado;
    }
    
}
