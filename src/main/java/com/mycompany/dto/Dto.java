/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dto;
import com.mycompany.dto.entidades.Calcado;
import com.mycompany.dto.dtos.VisaoCliente;
//import com.mycompany.dto.telas.TelaCliente;
import com.mycompany.dto.telas.TelaGerente;

/**
 *
 * @author GHT
 */
public class Dto {   
    

 
        
              
        try {            
            // TODO code application logic here
            Connection conn; //variavel da classe connection para conexão
            Statement st;// serve para permitir executar escrita no BD       
            
            
            //Oracle >> no oracle não precisa indicar o nome do BD
            //Pois quando faz login de usuario cria uma conta automaticamente.
            Class.forName("oracle.jdbc.driver.OracleDriver");//caminho da classe do drive que faz conexão com o BD.
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ght","4004");
            
             
             st=conn.createStatement(); //autentica a conexão feita com BD.
             st.executeUpdate("insert into usuario(nome_usu,senha, cargo) values('giga',25,'chefe')");
             //st.executeUpdate("insert into pets(nome,id_pet) values('nia',7)");
             //st.executeUpdate("delete from pets where nome='jaha'");
            JOptionPane.showMessageDialog(null,"Processo bem Sucedido");
            
        } catch (ClassNotFoundException ex) { // caso não encontre a biblioteca, mosta "Erro de biblioteca"
            JOptionPane.showMessageDialog(null,"Erro de Biblioteca"+ex.getMessage());
            
        } catch (SQLException ex) { // caso não execute o script sql mostra "falha de processo "
            JOptionPane.showMessageDialog(null,"Falha de dado recusados ou incorretos"+ex.getMessage());
            
        } 
        
    }
    
    
}
