/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dtosimples.dtos;
import com.mycompany.dtosimples.entities.Calcado;

/**
 *
 * @author GHT
 */
public class VisaoCliente {
    
    
    String modelo;
    Double preco;
    
    public VisaoCliente(Calcado calcado){        
        
        this.modelo = calcado.getModelo();
        this.preco = calcado.getValorVenda();   
    
    };
    
    
    public String getModelo(){
        return modelo;
    }
    
    public Double getPreco(){
        return preco;
    }
    
    
    
}
