/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dtosimples.entities;

/**
 *
 * @author GHT
 */
public class Calcado {
    
    String nome;
    String modelo;
    String cor;
    String fabricante;
    
    Double valorCompra;
    Double valorVenda;
    Double icms;
    Double lucro; 
    
    int estoque;
    int garantia;
    int tamanho;

    public Calcado(String nome, String modelo, String cor, String fabricante, Double valorCompra, Double valorVenda, Double icms, Double lucro, int estoque, int garantia, int tamanho) {
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.fabricante = fabricante;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.icms = icms;
        this.lucro = lucro;
        this.estoque = estoque;
        this.garantia = garantia;
        this.tamanho = tamanho;
    }
    
    
     
     public String getNome(){
        
        return nome;
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
    
    
    }
    
    

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public Double getLucro() {
        return lucro;
    }

    public void setLucro(Double lucro) {
        this.lucro = lucro;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
   
   
    
    
    
}
