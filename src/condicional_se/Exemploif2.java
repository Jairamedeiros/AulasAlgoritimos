
package condicional_se;

import java.util.Scanner;

public class Exemploif2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean logado = false;
                
        System.out.println("login: ");
        
        String login = sc.next();
        System.out.println("Senha: ");
        
        String senha = sc.next();
        
         
        if (login.equals("Jaira")&& senha.equals("1234")){
            logado = true;
            
            
            
        if(!logado){
            
            System.out.println("Usuário ou senha inválidos");
            
                         
                       
                        
            
        } else{
            System.out.println("usuário LOGADO!");
            
            
            
            
        }   
            
            
            
            
            
            
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
}
