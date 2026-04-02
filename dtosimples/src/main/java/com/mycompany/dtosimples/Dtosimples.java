
package com.mycompany.dtosimples;
import com.mycompany.dtosimples.crud.Crud;
import com.mycompany.dtosimples.entities.Calcado;
import com.mycompany.dtosimples.telas.Controle;



public class Dtosimples {

    public static void main(String[] args) {
        
        
        Crud crud = new Crud();
        
        Controle control = new Controle();
        
     
        
       
        
        
      
       
        
       Calcado calcado=new Calcado(1,"Botas","trabalho","preto","MTK",120.56,300.45,5.6,89.56,500,11,38);
        
      
       //crud.inserir(calcado);
       
       //crud.excluir(1);
       
       //crud.atualizar(calcado);
       
       
      /*
       
       crud.buscar().forEach(x->
      
               System.out.println(
                       x.getId()+" ID "+
                       x.getNome()+
                       x.getModelo()+
                       x.getCor()+
                       x.getFabricante()+
                       x.getValorCompra()+
                       x.getValorVenda()+
                       x.getIcms()+
                       x.getLucro()+
                       x.getEstoque()+
                       x.getGarantia()+
                       x.getTamanho()
 
               )
    
       );
               
   */
    
      
     
   
   
    
   
  /*
      
          crud.buscarUsuario().forEach(x->
              
              System.out.println(
                      x.getNome()+x.getValorvenda()
         
              )
      
      );
      
      
      
      */
     
    
     
   control.setVisible(true);
   
    
    
     
    
         
    }//fim main aqui
}
