
package exemploswhile;

import java.util.Scanner;

public class while2 {
    
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "nao";
        
        int tentativas =0;
        
        while (!resposta.equalsIgnoreCase("sim")){
            System.out.print("Eu sou bonita? ");
            resposta = sc.next();
        
            
        tentativas ++;
        
        }   System.out.println("Parabéns, vc acertou na " + tentativas + " tentativa");
            
            
            
    }
    
    }
    
    

    
    
    
    
    
    

