
package exemploswhile;

import java.util.Scanner;

public class while3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0, soma = 0, contador = 0;
        
        
        
        do{ 
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            
            
            soma+=numero;
            contador++;
            
        
        }while (numero !=0);
        
        float media = soma/(contador-1);
      
        
        System.out.println("Soma: " +soma + "\nMédia: " + media);
            
            
        
        }
     }
     
     

    
    
    
    
    
    
    
    
    
    
    
    
    
    

