/*
 Faça um Programa que peça as 4 notas bimestrais e mostre a média. 
 */
package Lista1;

import java.util.Scanner;

public class quesito4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nota 1º bimestre: ");
        float n1 = sc.nextFloat();
        System.out.println("Informe nota 2º bimestre: ");
        float n2 = sc.nextFloat();
        System.out.println("Informe nota 3º bimestre: ");
        float n3 = sc.nextFloat();
        System.out.println("Informe nota 4º bimestre: ");
        float n4 = sc.nextFloat();
        
        float m = (n1 + n2 + n3 + n4)/4;
        System.out.println("Média final: " + m);
        
        
        
              
                
                
                
        
    }
    
        
    
    
    
    
}
