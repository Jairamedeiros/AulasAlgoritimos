/*
 Faça um Programa que peça 2 números inteiros e um número real. 
Calcule e mostre: 
a. o produto do dobro do primeiro com metade do segundo . 
b. a soma do triplo do primeiro com o terceiro. 
c. o terceiro elevado ao cubo. 
 */
package Lista2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);
        
       System.out.print("Informe o 1º número inteiro: ");
        int  n1 = sc.nextInt();
        System.out.print("Informe o 2º número inteiro: ");
        int  n2 = sc.nextInt();
        System.out.print("Informe um número real: ");
        float  n3 = sc.nextFloat();
        
        float t1 = (n1*2)*(n2/2);
        float t2 = (n1*3 + n3);
        float t3 = (n3*n3*n3);
          
        System.out.println("Resposta letra a: " + t1 );
        System.out.println("Resposta letra b: " + t2);
        System.out.println("Resposta letra C: " + t3);
       
        
        
        /* Segunda opção de se ler*/
        System.out.println("A:" + t1 +"\nB:"+t2+ "\nC:" + t3);
       
       
       
        
        
        
        
    }
    
    
    
    
    
}
