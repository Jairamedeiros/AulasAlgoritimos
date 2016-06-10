/*
 7. Faça um Programa que leia três números e mostre o maior e o menor deles. 
 */
package lista3;

import java.util.Scanner;

public class Questao7 {
     public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Informe o 2º número: ");
        int n2 = sc.nextInt();
        System.out.print("Informe o 3º número: ");
        int n3 = sc.nextInt();
       
        
    
    if (n1>n2 && n1>n3 && n2>n3){        
        
        System.out.println("O maior número é: " + n1 + "O menor número é: " + n3);
            
           
    } else if  (n1>n2 && n1>n3 && n3>n2){   
        System.out.println("O maior número é: " + n1 + "O menor número é: " + n2);
        
        
                                
    } else if (n2>n1 && n2>n3 && n1>n3){   
        System.out.println("O maior número é: " + n2 + "O menor número é: " + n3);
                 
                
    }else if (n2>n1 && n2>n3 && n3>n1){   
        System.out.println("O maior número é: " + n2 + "O menor número é: " + n1);
    
       
    
    }else if (n3>n1 && n3>n2 && n1>n2){   
        System.out.println("O maior número é: " + n3 + "O menor número é: " + n2);
    
        
        
}else {
        
        System.out.println("O maior número é: " + n3 + "O menor número é: " + n1);
        
        
        
        
    }
        

    }



}
    
    
    
    
    
    
    
    
