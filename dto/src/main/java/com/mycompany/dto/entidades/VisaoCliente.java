/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto.entidades;

/**
 *
 * @author GHT
 */
public class VisaoCliente {
    
    String modelo;
    Double preco;

    public VisaoCliente(Calcado calcado) {
        this.modelo = calcado.getModelo();
        this.preco = calcado.getValorvenda();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
}
