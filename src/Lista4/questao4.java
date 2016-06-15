/*
. Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina
ao longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à
tabela abaixo:
o Média de Aproveitamento..................Conceito
o Entre 9.0 e 10.0 ........................A
o Entre 7.5 e 9.0 .........................B
o Entre 6.0 e 7.5 .........................C
o Entre 4.0 e 6.0 .........................D
o Entre 4.0 e zero ........................E

O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente 
e a mensagem “APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o
conceito for D ou E
 */
package Lista4;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a 1ª nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Informe a 2ª nota: ");
        float n2 = sc.nextFloat();
              
        // Soma das 2 notas dividido por 2, onde m representa a média
        float m = (n1+n2)/2;
       
        
        
        
        
        if (m<0 || m >10){
        System.out.println("Digite as notas entre 0 e 10");        
                 
        }else if (m>9){
        
        System.out.println("Aprovado conceito (A) média: " + m);                
                
        }else if(m>7.5){
        System.out.println("Aprovado conceito (B) média: " + m);
        
        }else if (m>6) {
        System.out.println("Aprovado conceito (C) média: " + m); 
        
        }else if (m>4) {
        System.out.println("Reprovado conceito (D) média: " + m); 
                    
        }else{
        System.out.println("Reprovado conceito (E) média: " + m);
              
        }
     
    }    
    
}

    
    
    
    
    
    
    
    
    
    
    

