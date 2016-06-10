/*
2. Faça um Programa que peça um valor e mostre na tela se o valor é 
positivo ou negativo.
 */
package lista3;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        float v = sc.nextInt();
                
         
        
        float a = v;
        
        
        
   if (a>0){
       System.out.println("O valor informado é positivo: " + a);
       
       
   }else if (a<0){
            System.out.println("o valor informado é negativo: " + a);
         
       
        
        
    }else {
       
       System.out.println("O valor é neutro");
       
       
       
   }
    
    
    
    
    }
    
}
