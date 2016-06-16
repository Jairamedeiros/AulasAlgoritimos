/*
 Crie um algoritmo que mostre na tela o nome de 3 candidatos + a opção Branco e nulo.
e compute a quantidade de votos de cada candidato e mostre o resultado.
 */
package repeticaofor;

import java.util.Scanner;

public class cadidatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         
        System.out.println("1 - Leandro Lima");
        System.out.println("2 - Glória Medeiros");
        System.out.println("3 - Daniela Mirtes");
        System.out.println("4 - Branco");
        System.out.println("5 - Nulo");
         
        
        
        int voto = 0, soma = 0 , contador =0;
        
        
        do{
           System.out.println("Escolha entre as opções acima: ");
           voto = sc.nextInt();
           
           soma+=voto;
           contador++;
           
           
        }while (voto!=0);
        
        float media = soma/(contador-1);
        
        
        
        System.out.println("Total de votos: " + soma + "\nMédia: " + media);
        
        
           
           
            
            
            
        
        
        
        
            
            
            
            
            
            
            
            
            
            
        
        }
        
        
    }
 

