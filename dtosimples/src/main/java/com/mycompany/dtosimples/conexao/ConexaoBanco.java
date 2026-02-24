/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dtosimples.conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author GHT
 */
public class ConexaoBanco {
    
    private static final String url= "jdbc:oracle:thin:@localhost:1521/XE";
    private static final String user= "ght";
    private static final String pass= "400";
    
    public static Connection fazerConexao(){
        
        
        try{
            
            Connection conn = DriverManager.getConnection(url,user,pass);
            
            System.out.println("Conexão OK Sucesso");
            
            return conn;        
        
        
      }catch( SQLException e){           
            
            System.out.println("Conexão Falhou");
            
            return null;      
        
        }
             
    } 
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
