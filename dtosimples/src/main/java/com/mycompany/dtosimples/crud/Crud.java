/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dtosimples.crud;
import com.mycompany.dtosimples.entities.Calcado;
import java.sql.Connection;
import com.mycompany.dtosimples.conexao.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author GHT
 */
public class Crud {
    
    public void inserir(Calcado c){
        
        String sql="INSERT INTO calcado VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try{
            
            Connection conn=ConexaoBanco.fazerConexao();
            PreparedStatement ps=conn.prepareStatement(sql);
            
             ps.setInt(1, c.getId());
             ps.setString(2,c.getNome());
             ps.setString(3,c.getModelo());
             ps.setString(4,c.getCor());
             ps.setString(5,c.getFabricante());
             ps.setDouble(6,c.getValorCompra());
             ps.setDouble(7,c.getValorVenda());
             ps.setDouble(8,c.getIcms());
             ps.setDouble(9,c.getLucro());
             ps.setInt(10,c.getEstoque());
             ps.setInt(11,c.getGarantia());
             ps.setInt(12,c.getTamanho());
             
             ps.executeUpdate();
             
             System.out.println("Cadastro com Sucesso!");
           
        
        }catch(SQLException e){
            
            System.err.println("Casdastro Falhou!");
        
        }
    
    }
    
    
    
    public void excluir(int id){
        
        
        String sql="DELETE FROM calcado where id=?";
        
        try{
            
            Connection conn=ConexaoBanco.fazerConexao();
            PreparedStatement ps=conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            
            
            System.out.println("Item excluido com sucesso!");
        
        
        }catch(SQLException e){
            
            System.err.println("Falha de operação!");
        
        
        }
        

    }
   

    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
