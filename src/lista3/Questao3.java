/*
3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. .
 */
package lista3;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Informe o sexo (F)Feminino (M)Masculino : ");
        String sexo = sc.next();
        
        if (sexo.equalsIgnoreCase ("f")){
            System.out.println("Feminino");   
                
    }else if (sexo.equalsIgnoreCase ("m")){
        System.out.println("Masculino");
        
        
}else 
       System.out.println("Sexo inválido"); 
        
}
    
}