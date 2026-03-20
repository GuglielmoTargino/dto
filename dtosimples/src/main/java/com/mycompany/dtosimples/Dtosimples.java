/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dtosimples;
import com.mycompany.dtosimples.crud.Crud;
import com.mycompany.dtosimples.entities.Calcado;
import com.mycompany.dtosimples.dtos.Usuario;





/**
 *
 * @author GHT
 */
public class Dtosimples {

    public static void main(String[] args) {
        
        Crud crud = new Crud();
       
        
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
     
      
       crud.buscarUsuario().forEach(x->
               
               System.out.println(                      
                       x.getNome()+x.getValorvenda()
          
               )
 
       );
     
         
    }
}
