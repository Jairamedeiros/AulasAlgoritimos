/*
Faça um Programa que leia um número e exiba o dia correspondente da semana. (1-
Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */
package Lista4;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Informe o dia da semana (1)Domingo (2)Segunda (3)Terça (4)Quarta (5)Quinta (6)Sexta : ");
    String sexo = sc.next();
        
    if (sexo.equalsIgnoreCase ("f")){
    System.out.println("Feminino");   
                
    }else if (sexo.equalsIgnoreCase ("m")){
        System.out.println("Masculino");
        
        
}else 
       System.out.println("Sexo inválido"); 
        
}
    
}
}

    
    
    
    
    
    
    
    
    
    
    
}
