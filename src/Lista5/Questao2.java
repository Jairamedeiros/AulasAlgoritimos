/*
 2. Faça um programa que leia um nome de usuário e a sua senha e não 
aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e
voltando a pedir as informações.

 */
package Lista5;

import java.util.Scanner;

public class Questao2 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Digite seu usuário: ");
    String usuario  = sc.next();
    System.out.print("Digite sua senha: ");
    String senha = sc.next();
    
       
    while (true){
        if(!usuario.equals(senha)){
        System.out.println("login aceito");    
        break;         
           
        }else
        System.out.print("Senha inválida! A senha deve ser difrente do usuario");
        System.out.println(" Informe o usuário: ");  
        usuario = sc.next();
        
        System.out.println("Informe a senha: ");
        senha =sc.next();
            

    }}}
            
            
            
          
    
     
  
    
    
    
    
    

