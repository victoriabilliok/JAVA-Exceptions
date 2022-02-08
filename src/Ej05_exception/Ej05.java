/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej05_exception;


import java.util.Scanner;

/**
 *
 * @author Vicky
 */
public class Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int intentos = 1;
        String aux;
        int aux2 = 0;
        boolean conf;
        
        int numero = (int) (Math.random() * 500) + 1;
        
        System.out.println("numero aleatorio: "+numero);

        System.out.println("-----------Adivinador----------");
      
        do {
            System.out.println("Ingrese un número entero entre 1 y 500: ");
            aux = sc.next();
            try {
                aux2 = Integer.parseInt(aux);
                conf = true;
            } catch (NumberFormatException b) {
                System.out.println("La cadena no puede convertirse a entero");
                intentos++;
                conf = false;
            }
            
            if (conf == true) {
                if (aux2 > numero) {
                    System.out.println("Incorrecto, es menor.");
                    intentos++;
                } else if (aux2 < numero) {
                    System.out.println("Incorrecto, es mayor.");
                    intentos++;
                } else {
                    System.out.println("Felicitaciones! Adivinaste el número en " + intentos + " intentos.");
                }
            }
        } while (numero != aux2);
    }
}


//        -------------- OTRA OPCION PARA EL PROGRAMA----------------(Y EL TRY/CATCH??)
//        System.out.println("Ingrese un número entre 1 y 500");
//        int num = sc.nextInt();
//       
//        intentos = intentos + 1;
//        
//        while (num != numero) {
//            if (numero > num) {
//                System.out.println("Es Mayor");
//                intentos= intentos +1;
//                System.out.println("Ingrese un número");
//                num = sc.nextInt();
//            } else {
//                System.out.println("Es Menor");
//                intentos = intentos +1;
//                System.out.println("Ingrese un número");
//                num = sc.nextInt();
//            }   
//        }
//    
//        System.out.println("Felicidades! Has adivinado el número en "+ intentos + " intentos!");
//    }
        
//    }


