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
public class Estoque {
    private String nome;
    private int estoque;

    public Estoque(Calcado c) {
        this.nome = c.getNome();
        this.estoque = c.getEstoque();
        
   
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }
    
}
