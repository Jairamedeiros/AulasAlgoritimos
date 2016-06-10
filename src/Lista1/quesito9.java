/*
 Faça um Programa que peça a temperatura em graus Farenheit, 
transforme e mostre a temperatura em graus Celsius. 
• C = (5 * (F-32) / 9)
 */
package Lista1;

import java.util.Scanner;

public class quesito9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura Farenheit: ");
        float n1 = sc.nextFloat();
        
        float c = (5*(n1-32)/9);
        
        System.out.println("Temperatura em graus Celsius = " + c);
        
        
        
               
        
        
        
        
        
        
    }
            
    
    
    
    
    
    
    
    
    
}
