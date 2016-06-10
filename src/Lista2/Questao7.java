/*
Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho 
em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é 
de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 
litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
a. Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
b. comprar apenas latas de 18 litros;
c. comprar apenas galões de 3,6 litros;
d. misturar latas e galões, de forma que o preço seja o menor. Acrescente 10% 
de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */
package Lista2;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho da área em metros2: ");
        float n1 = sc.nextFloat();
              
        float a = n1/6;
        
        float l1 = a/18;
        float l2 = (float) (a/3.6);
        float p1 = l1*80;
        float p2 = l2*25;
 
        
        if (a>=l1){
            
            System.out.println("Comprar apenas latas de 18 litros");    
        
    
    }else if (a<=l2){
        
            System.out.println("Comprar latas de 3,6 litros");
        
        
        
        
    }
           
    
    
    
    
    
    
    
    
    
    }
}
