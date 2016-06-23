/*


Imprimindo na tela as idades menores que 21 anos


*/
package exerciciovetores;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
        
        
        int idades[] = {31,21,18,65,10};
        
        for (int i =0 ; i<5; i++)
        
        if (idades [i]>=21){
            System.out.println("Maiores que 13 anos" + idades[i]);
        }    
            
            
        
        
    }
    
    
}




//2ª opção mais resumida

//  for (idade: idades)



//if  (idade>=21)

