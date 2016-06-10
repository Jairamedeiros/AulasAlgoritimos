/*
Faça um programa que peça o tamanho de um arquivo para download (em MB)
e a velocidade de um link de Internet (em Mbps), calcule e informe o 
tempo aproximado de download do arquivo usando este link (em minutos).
 */
package Lista2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o tamanho do arquivo para download (em Mb): ");
        float d = sc.nextFloat();
        System.out.print("Informe a velocidade da internet (em Mbps): ");
        float i = sc.nextFloat();
        
        
        float r = d/(i/8f)/60f;
               
        
        System.out.println("Tempo em minutos para download do link  = " + r);
        
        
        
    }

    
    
    
    
        
        
        
        
    
    
    
    }

