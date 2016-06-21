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
    float n1 =  sc.nextInt(); 
    
                 
    
    if (n1>0 || n1<=10){
    
    System.out.println("Nota = "  +n1);
    
    
    while (n1<0 || n1>10){
    System.out.print("Valor inválido, digite outro valor: ");
    
    
        
    }}}}
     
     
     
    

