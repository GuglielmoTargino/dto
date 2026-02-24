/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dtosimples;
import com.mycompany.dtosimples.conexao.ConexaoBanco;
import com.mycompany.dtosimples.entities.Calcado;

/**
 *
 * @author GHT
 */
public class Dtosimples {

    public static void main(String[] args) {
        
        //Calcado tenis = new Calcado("corrida","esporte", "azul","mizuno", 125.86, 126.2, 5.6, 5.3, 500, 12,38);
        
        ConexaoBanco.fazerConexao();
       
    }
}
