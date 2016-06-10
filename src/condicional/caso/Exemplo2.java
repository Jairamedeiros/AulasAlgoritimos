
package condicional.caso;

import java.util.Scanner;

public class Exemplo2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("## Opções##\nGabriel\nCarlos\nCaio");
        
        String escolha = entrada.next();
                
        switch (escolha){
            case "Gabriel":
                System.out.println("Bom garoto");
                break;
                        
            case "Carlos":
                System.out.println("Sujeito sério");
                break;                
                        
            case "Caio":
            System.out.println("Gente fina");
               break;  
                       
            default:
            System.out.println("Outros");
                           
                           
            
            
            
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
}
