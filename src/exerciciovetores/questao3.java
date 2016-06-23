/*

Foram anotadas as idades e alturas de 30 alunos. Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura inferior à média de altura desses alunos.




 */
package exerciciovetores;

import java.util.Scanner;

public class questao3 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
          
    String nome[] = new String[3];
    int nota[][] = new int [3][4];
    
        
    for (int i =0; i<3; i++){
    System.out.print("Nome " + (i+1)+ ": ");
    nome[i] = sc.next();
        
        
    for (int j = 0; j<4; j++){
    System.out.print("Nota " + (j+1)+ " de " + nome[i]+ ": " );
    nota[i][j] = sc.nextInt();
      
       
    }
}
        
    float medias []= new float[3];
    int z = 0;
    
    
    while (z<3){
        
    medias[z] = (nota[z][0]+nota [z][1]+nota[z][2]+nota[z][3]/4);   
        
    if (medias[z]>=7){    
        
            System.out.println(nome[z]+ "-> Aprovado");
 
    }else{      
       
     System.out.println(nome[z] + " -> Reprovado"  );
           
    
    z++;
    
    
    } }}}

    
    
    
    
    
    
  