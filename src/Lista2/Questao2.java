/*
Tendo como dados de entrada a altura de uma pessoa, construa 
um algoritmo que calcule seu peso ideal, usando a 
seguinte fórmula: (72.7*altura) - 58
 */
package Lista2;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        
        float a = sc.nextFloat();
        
        float p = (float) ((72.7*a)-58);
        
        
        System.out.print("Seu peso ideal é: " + p); 
        
        
             
                       
               
        
        
    }
    
    
    
    
    
}
