/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dtosimples;
import com.mycompany.dtosimples.conexao.ConexaoBanco;
import com.mycompany.dtosimples.crud.Crud;
import com.mycompany.dtosimples.entities.Calcado;





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
       
       crud.atualizar(calcado);
     
     
       
       
       
       
       
       
     
         
    }
}
