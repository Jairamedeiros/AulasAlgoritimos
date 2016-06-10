/*
Faça um Programa para leitura de três notas parciais de um aluno. O programa deve
calcular a média alcançada por aluno e apresentar:
a. A mensagem "Aprovado", se a média for maior ou igual a 7, 
   com a respectiva média alcançada;
b. A mensagem "Reprovado", se a média for menor do que 7, com a 
   respectiva média alcançada;
c. A mensagem "Aprovado com Distinção", se a média for igual a 10.
 */
package Lista4;

import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Informe a 1ª nota: ");
        float n1 = sc.nextFloat();
        System.out.println(" Informe a 2ª nota: ");
        float n2 = sc.nextFloat();
        System.out.println(" Informe a 3ª nota: ");
        float n3 = sc.nextFloat();
        
        // Soma das 3 notas dividido por 3, onde m representa a média
        float m = (n1+n2+n3)/3;
       
        if (m==10){
        
        System.out.println("Aprovado com Distinção média: " + m);                
                
        }else if(m>=7){
        System.out.println("Aprovado com média: " + m);
        
        } else {
        System.out.println("Reprovado com média: " + m);  
            
        }
     
    }    
    
}
