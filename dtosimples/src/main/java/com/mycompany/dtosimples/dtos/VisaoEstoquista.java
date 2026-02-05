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
public class VisaoEstoquista {
    String modelo;
    int estoque;
    
    public VisaoEstoquista(Calcado calcado){
        
        this.estoque = calcado.getEstoque();
        this.modelo = calcado.getModelo();        
        
    }
    
    
    public String getModelo(){
        return modelo;
    }
    
    public int getEstoque(){
        return estoque;
    }
    
}
