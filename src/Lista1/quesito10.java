/*
Faça um Programa que peça a temperatura em graus Celsius, transforme
e mostre em graus Farenheit.
 */
package Lista1;

import java.util.Scanner;

public class quesito10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura Celsius: ");
        float n1 = sc.nextFloat();
        
        float f = (float) ((n1*1.8) +32);
        
        System.out.println("Temperatura em graus Farenheit = " + f);
        
              
        
        
    }
    
    
    
    
    
}
