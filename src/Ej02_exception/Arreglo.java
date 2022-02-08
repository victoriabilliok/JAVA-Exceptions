/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej02_exception;

/**
 *
 * @author Vicky
 */
public class Arreglo {
    Integer[]a= new Integer[4];
    
    public void llenarArray() {
    try{
    for (int i=0; i<10; i++){
        a[i]=i;
    }}
    catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Error: " + e.toString());
                System.out.println("Indice de arreglo fuera de rango.");
            }
}
}

