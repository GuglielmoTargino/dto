/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dto;
import com.mycompany.dto.entidades.Calcado;
import com.mycompany.dto.entidades.VisaoCliente;

/**
 *
 * @author GHT
 */
public class Dto {   
    

    public  static void main(String[] args) {
        Calcado tenis= new Calcado("treino","35","azul","zuno", 89.89, 100.00,200,5.6,12);
        
        VisaoCliente cliente= new VisaoCliente(tenis);        
        
        System.out.println(cliente.getPreco());
    }
    
    
}
