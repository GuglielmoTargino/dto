/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dto.entidades;

/**
 *
 * @author GHT
 */
public class Calcado {
    String modelo;
    String taman;
    String cor;
    String fabric;
    Double valorcompra;
    Double valorvenda;
    int estoque;
    Double icms;
    int garantia;

    public Calcado(String modelo, String taman, String cor, String fabric, Double valorcompra, Double valorvenda, int estoque, Double icms, int garantia) {
        this.modelo=modelo;
        this.taman = taman;
        this.cor = cor;
        this.fabric = fabric;
        this.valorcompra = valorcompra;
        this.valorvenda = valorvenda;
        this.estoque = estoque;
        this.icms = icms;
        this.garantia = garantia;
    }

    public String getTaman() {
        return taman;
    }

    public void setTaman(String taman) {
        this.taman = taman;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public Double getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(Double valorcompra) {
        this.valorcompra = valorcompra;
    }

    public Double getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(Double valorvenda) {
        this.valorvenda = valorvenda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    
    
    
    
    
}
