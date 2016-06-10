/*
6. Faça um Programa que leia três números e mostre o maior deles. 
 */
package lista3;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Informe o 2º número: ");
        int n2 = sc.nextInt();
        System.out.print("Informe o 3º número: ");
        int n3 = sc.nextInt();
            
    
        if (n1>n2 && n1>n3){        
        
            System.out.println("O maior número é o 1ª: " + n1);
              
    } else if  (n2>n1 && n2>n3){   
            System.out.println("O maior número é o 2º: " + n2);
                
    } else
            System.out.println("O maior número é o 3º: " + n3);
         
              
}

}