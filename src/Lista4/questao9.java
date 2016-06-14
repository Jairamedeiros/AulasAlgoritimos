/*
 Faça um Programa que leia um número inteiro menor que 1000 e imprima a 
quantidade de centenas, dezenas e unidades do mesmo. o Observando os
termos no plural a colocação do "e", da vírgula entre outros. 
Exemplo: o 326 = 3 centenas, 2 dezenas e 6 unidades o 12 = 1 dezena e
2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 
20, 10, 21, 11, 1, 7 e 16. 
 */
package Lista4;

import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Informe um número: ");
        int n = sc.nextInt();
       
        if(n>=1000){
                    
        System.out.println(" Informe um número menor que 1000: ");
        System.exit(0);
        
            
        }else{
            int centenas = (int)(n/100);
            int resto = n%100;
            int dezenas = (int)(resto/10);
            resto = resto %10;
            int unidades = resto;  
            
            System.out.println("\nCentenas:  " + centenas + "\nDezenas :" + dezenas + "\nUnidades :" + unidades);
            
            
            
            
            
        }
        
        
        
        
    
    
    
    }
}
