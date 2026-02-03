/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dtosimples;
import com.mycompany.dtosimples.entities.Calcado;

/**
 *
 * @author GHT
 */
public class Dtosimples {

    public static void main(String[] args) {
        Calcado tenis= new Calcado("Mizuno","Azul", " Doran", 125.56, 126.3, 5.6, 200, 38,12);
        
        System.out.println(tenis.getEstoque());
    }
}
