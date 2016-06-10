/*
Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */
package Lista1;


/* ÁREA DO CÍRCULO POSITIVO*/

import java.util.Scanner;

public class quesito6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o diâmetro do Círculo: ");
        float n1 = sc.nextFloat();
                
        float r = (n1/2);
        
        System.out.println("Raio = " + r);
        
        float a = (float) ((r*r)*3.14);
                        
        System.out.println("Área do círculo = " + a);
        
              
                
        
          
        
        
        
    }
    
    
      
        
        
}
