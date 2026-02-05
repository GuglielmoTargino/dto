/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dtosimples;
import com.mycompany.dtosimples.entities.Calcado;
import com.mycompany.dtosimples.dtos.VisaoCliente;
import com.mycompany.dtosimples.dtos.VisaoEstoquista;


/**
 *
 * @author GHT
 */
public class Dtosimples {

    public static void main(String[] args) {
        
        Calcado tenis = new Calcado("esporte","azul", "mizuno", 126.56,127.2, 5.6, 2.3, 500, 12, 38);
        
        //VisaoCliente cliente = new VisaoCliente(tenis);
        
        VisaoEstoquista usuario = new VisaoEstoquista(tenis);
        
        System.out.println(usuario.getEstoque());
    }
}
