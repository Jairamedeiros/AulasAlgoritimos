/*

 */
package exemploswhile;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta = "nao";
        
        
        while (!resposta.equalsIgnoreCase("sim")){
            System.out.print("Eu sou bonita? ");
        
            resposta = sc.next();
              
    }
    
    }
    
    
}
