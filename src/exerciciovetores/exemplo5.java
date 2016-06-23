/*
 *Faça um Programa que leia um vetor de 10 caracteres, e 
diga quantas consoantes foram lidas. Imprima as consoantes

 */
package exerciciovetores;

public class exemplo5 {
    
    public static void main(String[] args) {
     
     
        char[] letra = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n'};
        
        int count = 0;
        
        
        for (int i = 0; i<letra.length ; i++){
            if((letra[i]!= 'a') && (letra[i]!='e')&& (letra[i]!= 'i')&&
            (letra[i]!='o' )&& (letra[i] != 'u')){
            count = count +1;
            
            
        }}
      
        
        
        System.out.print("Número de consoantes: ");
        System.out.println(count);
      
    
    
   }
    
    }
  
    
    
    
    
    
    

