/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dtosimples.crud;
import com.mycompany.dtosimples.entities.Calcado;
import java.sql.Connection;
import com.mycompany.dtosimples.conexao.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.dtosimples.dtos.Usuario;
import javax.swing.JOptionPane;



/**
 *
 * @author GHT
 */
public class Crud {
    
    public static void inserir(Calcado c){
        
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
    
    public void atualizar(Calcado c){
        String sql="UPDATE calcado SET nome=?, modelo=?, cor=?, fabricante=?,"+
                "valorcompra=?, valorvenda=?, icms=?, lucro=?, estoque=?, garantia=?, tamanho=? where id=?";
        
        try{
        Connection conn=ConexaoBanco.fazerConexao();
        PreparedStatement ps = conn.prepareStatement(sql);
        
             
             ps.setString(1,c.getNome());
             ps.setString(2,c.getModelo());
             ps.setString(3,c.getCor());
             ps.setString(4,c.getFabricante());
             ps.setDouble(5,c.getValorCompra());
             ps.setDouble(6,c.getValorVenda());
             ps.setDouble(7,c.getIcms());
             ps.setDouble(8,c.getLucro());
             ps.setInt(9,c.getEstoque());
             ps.setInt(10,c.getGarantia());
             ps.setInt(11,c.getTamanho());
             ps.setInt(12, c.getId());
        
             ps.executeUpdate();
             
             System.out.println("Item alterado com Sucessso!");
        
        }catch( SQLException e){
            
            System.err.println("Falha de operação!");
        
        }
    }
    
    
    public List<Calcado> buscar(){
        
        List<Calcado> lista = new ArrayList<>();
        String sql = "SELECT * FROM calcado";
        
        try{
            
            Connection conn = ConexaoBanco.fazerConexao();
            PreparedStatement ps =conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                
                lista.add(new Calcado(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("modelo"),
                        rs.getString("cor"),
                        rs.getString("fabricante"),
                        rs.getDouble("valorcompra"),
                        rs.getDouble("valorvenda"),
                        rs.getDouble("icms"),
                        rs.getDouble("lucro"),
                    rs.getInt("estoque"),
                        rs.getInt("garantia"),
                        rs.getInt("tamanho")
           
                ));
                
            }
        
        }catch(SQLException e){
            
            System.err.println("Falha de operação!");
        
        }
        
    return lista;
    
    }
   
    ///////////////////////////////////////////////////////////////////////
    
    
    
    public static Calcado buscarCalcado(int id){
        
        Calcado cal = null;
        
        String sql="SELECT * FROM calcado where id=?";
        
        try{
            Connection conn = ConexaoBanco.fazerConexao();
            PreparedStatement ps =conn.prepareStatement(sql);
              ps.setInt(1, id);
            
            
            ResultSet rs = ps.executeQuery();
            
          
          
            
            
            
            
            
            
           if(rs.next()){
                
                cal= new Calcado(
                        
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("modelo"),
                        rs.getString("cor"),
                        rs.getString("fabricante"),
                        rs.getDouble("valorcompra"),
                        rs.getDouble("valorvenda"),
                        rs.getDouble("icms"),
                        rs.getDouble("lucro"),
                    rs.getInt("estoque"),
                        rs.getInt("garantia"),
                        rs.getInt("tamanho")
                
                
                
                );
                
            }else{
                 JOptionPane.showMessageDialog(null, "ID não encontrado");
                 cal =null;
           }
        

        
        
        }catch(SQLException e){
            
           System.err.println("Falha de operação!");
          
            
            
        }
        
    return cal;
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}//Fechamento de classe Crud aqui
