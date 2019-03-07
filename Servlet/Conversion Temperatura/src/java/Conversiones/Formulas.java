/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

/**
 *
 * @author bzamb
 */
public class Formulas {
    private Double celsius;
    private Double fahrenheit;

    public Double getCelsius() {
        return celsius;
    }

    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(Double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double fahrenheitaCelsius(double f){
        celsius=((f-32)/1.8);
        return celsius;
    }
    public double celsiusaFahrenheit(double c){
        fahrenheit=((c*1.8)+32);
        return fahrenheit;
    }
    
}
