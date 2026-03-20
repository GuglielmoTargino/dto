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
public class Usuario {
    
    
    private String nome;
    private Double valorvenda;

    public Usuario(Calcado c) {
        this.nome = c.getNome();
        this.valorvenda = c.getValorVenda();
    }

    public String getNome() {
        return nome;
    }

    public Double getValorvenda() {
        return valorvenda;
    }
    
    
}
