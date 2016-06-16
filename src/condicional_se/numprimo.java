/*
 * Encontar número Primo .
 */
package condicional_se;

import java.util.Scanner;

public class numprimo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Número primo: números que são divisiveis por 1 e por ele mesmo
        
        int numPrimo; 
        int divisores = 0;
        
        System.out.print("Digite um número inteiro: ");
        numPrimo = sc.nextInt();
      
        for (int i =1; i<= numPrimo; i++){
            
        if(numPrimo % i == 0){
        divisores++; 
       
        }}
        if (divisores ==2){
            
        System.out.println("O número digitado é primo!");
              
                
        }else {
        System.out.println("O número digitado não é primo!");
                  
           
         }    
                      
        }
            
        }
            
            
   