/*

 */
package condicional.caso;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um Número: ");
        
        int n = sc.nextInt();
        
        switch (n){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");    
                break;
             case 3:
                System.out.println("Março");  
                break;
              case 4:
                System.out.println("Abril");     
                break; 
            default:
                System.out.println("Outro mês");     
                 
            
            
        }
        
        
        
        
        
    }
    
        
}
