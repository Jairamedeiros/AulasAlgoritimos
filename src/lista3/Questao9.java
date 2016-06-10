/*
 9. Faça um Programa que leia três números e mostre-os em ordem decrescente. 
 */
package lista3;

import java.util.Scanner;

public class Questao9 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Informe o 2º número: ");
        int n2 = sc.nextInt();
        System.out.print("Informe o 3º número: ");
        int n3 = sc.nextInt();
           
        
    if (n1>n2 && n1>n3 && n2>n3){        
        
        System.out.println("Ordem decrescente dos números:\n" + n1 + "\n" +  n2 + "\n"+ n3); 
           
    } else if  (n1>n2 && n1>n3 && n2<n3){   
        System.out.println("Ordem decrescente dos números:\n" + n1 + "\n" +  n3 + "\n"+ n2);
                                
    } else if (n2>n1 && n2>n3 && n1>n3){   
        System.out.println("Ordem decrescente dos números:\n" + n2 + "\n" +  n1 + "\n"+ n3);
                        
    }else if (n2>n1 && n2>n3 && n1<n3){   
        System.out.println("Ordem decrescente dos números:\n" + n2 + "\n" +  n3 + "\n"+ n1);
   
    }else if (n3>n1 && n3>n2 && n1>n2){   
        System.out.println("Ordem decrescente dos números:\n" + n3 + "\n" +  n1 + "\n"+ n2);
       
    }else {
        System.out.println("Ordem decrescente dos números:\n"  + n3 + "\n" +  n2 + "\n"+ n1);
            
    }
       
    }
}
    
    
    
    
    
    
