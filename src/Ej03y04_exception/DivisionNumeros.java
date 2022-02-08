/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej03y04_exception;

/**
 *
 * @author Vicky
 */
public class DivisionNumeros {
    private float resultado;
    
    public void calcDiv(int num1, int num2){
        resultado = num1/num2;
        
        System.out.println("El resultado de la división es: "+ resultado);
    }
}
