/*
Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, utilizando 
as seguintes fórmulas: 
a. Para homens: (72.7*h) - 58 
b. Para mulheres: (62.1*h) - 44.7 (h = altura) 
c. Peça o peso da pessoa e informe se ela está dentro, acima ou abaixo do peso. 
 */
package Lista2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe sua altura: ");
        float a = sc.nextFloat();
        System.out.print("Informe seu sexo (1)Masculino (2)Feminino");
        int s = sc.nextInt();
                
        
        float t1 = (float) ((72.7*a) - 58);
        float t2 = (float) ((62.1*a) - 44.7);
        
        if (s == 1){
            
        System.out.println("Seu peso ideal é: " + t1);          
                        
            
        }else if (s==2){
            System.out.println("Seu peso ideal é: " + t2);
                        
    }else {
          
            System.out.println("");
            
                        
            
            }
        
        
        System.out.println("Informe seu peso atual: ");
        float p = sc.nextFloat();
        
        
       if (s == 1 && p>t1){
           
           System.out.println("Vc está acima do peso");
           
                     
           
       }else if (s == 1 && p<t1){
        
           System.out.println("Vc está abaixo do peso");
        
       
       
       }else if (s == 1 && p==t1){
           
           System.out.println("Vc está dentro do peso");
           
           
           
           
       }else if (s==2 && p>t2){
        System.out.println("Vc está acima do peso");
        
       
                   
                    
    } else if (s==2 && p<t2){
        System.out.println("Vc está abaixo do peso");
        
             
        
        
    }else {
       
      System.out.println("Vc está dentro do peso");
       
       
    }   
    
    
    }
    
        
        
        
        
        
        
        
    
    
    
    
        
        
    }
    

