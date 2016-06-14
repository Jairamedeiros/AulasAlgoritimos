/*
Faça um Programa que peça um número correspondente a um determinado ano 
e em seguida informe se este ano é ou não bissexto. 
 */
package Lista4;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o ano (XXXX): ");
        int ano = sc.nextInt();
          
        
        if (ano%4==0){
               System.out.println("Ano bissexto.");     
            
            
            
        }else{
            
           System.out.println("Ano não bissexto.");
            
        }
                

    }
}
