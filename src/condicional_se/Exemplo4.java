/*
 Mádia ponderada usando IF
 */
package condicional_se;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota n1 ");
        float n1 = sc.nextFloat();
        System.out.println("Nota n2");
        float n2 = sc.nextFloat();
        System.out.println("Nota n3");
        float n3 = sc.nextFloat();
        float m = (n1*4 + n2*5 + n3*6)/15;
        
        if (m>=7){
            
       
            System.out.println("Aprovado com média" + m);
           
                         
               
                
        } else if(m<3){
             System.out.println("Reprovado com média" + m);
           
        
        
        
    } else {
            
            System.out.println("Recuperação com média" + m);
            
            
            
        }
    
    
    
    
    
}
    
    
}