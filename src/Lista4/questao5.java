/*
  Faça um Programa que peça os 3 lados de um triângulo. O programa deverá 
informar se os valores podem ser um triângulo. Indique, caso os lados formem 
um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. 
o Dicas: 
o Três lados formam um triângulo quando a soma de quaisquer dois lados for
  maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais; 
o Triângulo Escaleno: três lados diferentes; 
 */
package Lista4;

import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe os lados: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
    
        
        if (!(x+y>z && x+z>y && y+z>x)){
            System.out.println("Lados não formam triângulo!");     
            
        }else{
            if(x==y && x==z && y==z){            
              System.out.println("Triângulo Equilátero!");
 
        } else if(x==y || x==z || y==z){            
              System.out.println("Triângulo Isósceles!");
              
        } else 
             System.out.println("Triângulo Escaleno!");    
                 
                 
                 
                 
             }
    
    
        
            }
        } 
    
    
    
