/*
 João Papo-de-Pescador, homem de bem, comprou um microcomputador para 
controlar o rendimento diário de seu trabalho. Toda vez que ele traz 
um peso de peixes maior que o estabelecido pelo regulamento de pesca 
do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por
quilo excedente. João precisa que você faça um programa que leia a variável 
peso (peso de peixes) e verifique se há excesso. Se houver, gravar na 
variável excesso e na variável multa o valor da multa que João deverá pagar. 
Caso contrário mostrar tais variáveis com o conteúdo ZERO.
 */
package Lista2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.print("Informe o peso total dos peixes: ");
       float p = sc.nextFloat();
        
       float e = p-50;
       float m = e*4;
       
       
       
       if (p>50){
        System.out.println("Excesso de peso =  " + e );
        System.out.println("Multa por excesso de peso = " + m);
            
                
                
    }else if (p<=50){
           System.out.println("Excesso de peso = " + 0 );
           System.out.println("Multa por excesso de peso = " + 0);
        
    
    
    
    
    } 
    }
}  

    
    
    
