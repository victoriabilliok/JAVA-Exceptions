/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej03y04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese dos números enteros para operar:");
            String cadena1 = sc.next();
            String cadena2 = sc.next();

            int num1 = Integer.parseInt(cadena1);
            int num2 = Integer.parseInt(cadena2);

            DivisionNumeros dv = new DivisionNumeros();

            dv.calcDiv(num1, num2);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.toString());
            System.out.println("No se puede dividir por cero.");
        } catch (InputMismatchException i) {
            System.out.println("Error: " + i.toString());
            System.out.println("No es un numero");
        } catch (NumberFormatException n) {
            System.out.println("Error: " + n.toString());
            System.out.println("No se puede convertir a entero.");
        }
    }

}
