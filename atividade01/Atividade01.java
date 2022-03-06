
package atividade01;

import Funcionarioteste.Funcionario;


public class Atividade01 {

    
    public static void main(String[] args) {
       
        
        
     Funcionario f1 = new Funcionario(); 
      
  
     f1.setNome("Nancy");
      System.out.println("Nome:"+f1.getNome());
            
     f1.setEnderco("Rua Padre Joao");
      System.out.println("Endereço: "+f1.getEnderco());        
             
     f1.setSalario(3000);
      System.out.println("Salário: "+f1.getSalario());
             
     f1.setArea("TI");
      System.out.println("Area de atuação: "+f1.getArea());       
        
     f1.setRegistro("Carteira :");
      System.out.println("Carteira Assinada "+f1.getRegistro()); 
     System.out.println(" ");
      
     
      
      Funcionario f2 = new Funcionario(); 
      
  
     f2.setNome("Marcos");
      System.out.println("Nome:"+f2.getNome());
            
     f2.setEnderco("Rua Americanas");
      System.out.println("Endereço: "+f2.getEnderco());        
             
     f2.setSalario(1000);
      System.out.println("Salário: "+f1.getSalario());
             
     f2.setArea("Adiministração");
      System.out.println("Area de atuação: "+f2.getArea());       
        
     f2.setRegistro("Registro:");
      System.out.println("Carteira Assinada "+f2.getRegistro()); 
 }   
}
