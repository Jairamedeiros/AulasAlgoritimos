/*
7. Faça um programa que leia 5 números e informe o maior número.
 */
package Lista5;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Inorme 5 números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
    
    
     if (n1>n2 && n1>n3 && n1>n4 && n1>n5){        
        
            System.out.println("O maior número é o 1ª: " + n1);
              
    } else if  (n2>n1 && n2>n3 && n2>n4 && n2>n5){  
            System.out.println("O maior número é o 2º: " + n2);
         
            
    } else if  (n3>n1 && n3>n2 && n3>n4 && n3>n5){  
            System.out.println("O maior número é o 3º: " + n3);
         
            
    } else if  (n4>n1 && n4>n2 && n4>n3 && n3>n5){  
            System.out.println("O maior número é o 4º: " + n4);       
                    
            
    } else
            System.out.println("O maior número é o 5º: " + n5);
            
    
      
    
}}
