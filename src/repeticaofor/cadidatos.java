/*
 Crie um algoritmo que mostre na tela o nome de 3 candidatos + a opção Branco e nulo.
e compute a quantidade de votos de cada candidato e mostre o resultado.
 */
package repeticaofor;

import java.util.Scanner;

public class cadidatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
         
        
        int a = 0, b= 0, c = 0, x =0 , y =0, v=0;
        String sair =  "nao";
        
                          
        
        
        do{
           System.out.print("----Votação----\n" 
                              + "1- Candidato 1\n" 
                              + "2- Candidato 2\n" 
                              + "3- Candidato 3\n"
                              + "O- Branco\n"
                              + "--------------\n"
                              + "Voto: ");
           
           v= sc.nextInt();
           
           switch (v){
               case 1:
                   a++;
                   break;
        
               case 2:
                   b++;
                   break;
               case 3:
                   c++;
                   break;
                   
               case 0:
                   x++;
                   break;
                   
               default:
                   y++;
       
           }
           
            System.out.print("------------\nSAIR? ");
            sair = sc.next();
            
           
        }while (!sair.equalsIgnoreCase("sim"));
        
        
         System.out.println("----Resultado----\n" 
                              + a+ "- Candidato 1\n" 
                              + b+ "- Candidato 2\n" 
                              + c+ "- Candidato 3\n"
                              + x+ "- Branco\n"
                              + y+ "- Nulo\n"
                              + "--------------\n");
          
        if(a>b && a>c){
        System.out.println("Vencedor - candiadato 1 - Quantidade de votos = " +a);
    
         
         
  }else if(b>a && b> c){
      System.out.println("Vencedor - candidato 2 - Quantidade de votos = " +b);
      
      
      
      
      
  }else{
            System.out.println("Vencedor - candiadto 3 - Quantidade de votos = " + c);
      
      
  }
            
            
            
    }
}  
   
     
    
    
       
    
    
    
    
 
      
         








