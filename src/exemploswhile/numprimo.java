/*.

Encontrar todos os números primos até o número digitado
 */
package exemploswhile;

import java.util.Scanner;

public class numprimo {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        
        for (int i = 1 ; i <= numero; i++){
            
        int divisores =0;
     
        for (int j = 1; j<= i; j++){
                
                
        if(i%j == 0){
        divisores++;
               
         }}  
        
        if(divisores== 2){    
        System.out.println(i+ " ");
             
             
             
         }
            
            
        }
            
        }
}
        
        