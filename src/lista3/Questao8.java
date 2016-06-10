/*
 8. Faça um programa que pergunte o preço de três produtos e informe qual
produto você deve comprar, sabendo que a decisão é sempre pelo mais barato
 */
package lista3;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o preço do 1º produto: ");
        float n1 = sc.nextInt();
        System.out.print("Informe o preço do 2º produto: ");
        float n2 = sc.nextInt();
        System.out.print("Informe o preço do 3º produto: ");
        float n3 = sc.nextInt();
      
    
        if (n1<n2 && n1<n3){        
        
        System.out.println("O produto de menor preço é o 1º: " + n1);
            
           
     } else if  (n2<n1 && n2<n3){   
        System.out.println("O produto de menor preço é o 2º: " + n2);
                                
    } else
        System.out.println("O produto de menor preço é o 3º: " + n3);
                  
       
}

     
    
}

