/*
1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma 
mensagem caso o valor seja inválido e continue pedindo até que o usuário 
informe um valor válido.

 */
package Lista5;

import java.util.Scanner;

public class Questao1 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         
    System.out.print("Digite uma nota entre 0 e 10: ");
    float n =  sc.nextInt(); 
    
    while (true){
              
    if (n>=0 && n<=10){
    
    System.out.println("Nota = " +n);
        
        
    }else
    System.out.print("Nota inválida, digite outra nota: ");
    n = sc.nextFloat();
    
    
    }}} 
    
    
    
        
   
     
     
     
    

