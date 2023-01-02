/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg0.el.famoso.fizzbuzz;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

public class Mdimassimo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){           
        for (int countNumbers = 0; countNumbers<=100; countNumbers++){
            if(countNumbers%5==0 && countNumbers%3==0){
                System.out.println("FizzBuzz");        
        }     else if(countNumbers%3==0){
                System.out.println("Fizz");
            } else if(countNumbers%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(countNumbers);
            }
        }
    }   
}
