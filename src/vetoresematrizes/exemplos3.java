/*
Digite os 10 números - após digitar os 10 números o programa vai mostrar
os números digitados de trás p/ frente.
 */
package vetoresematrizes;

import java.util.Scanner;


public class exemplos3 {
       public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
        
        int numeros[] = new int [10];
        
        
        for (int i = 0; i<numeros.length ; i++){
        
        
        
        System.out.print("Digite o número " + (i+1)+": ");
        numeros[i] = sc.nextInt();
   }
    
        for (int i= (numeros.length-1); i>=0;i--){
            System.out.println("->" + numeros[i]); 
        
            
            
            
        
    }
}
}
    
    
    
    
    
    






