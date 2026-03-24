
package com.mycompany.dtosimples.telas;
import com.mycompany.dtosimples.crud.Crud;
import com.mycompany.dtosimples.entities.Calcado;


/**
 *
 * @author GHT
 */
public class Controle extends javax.swing.JFrame {
    
   
    
    
    
    
    
    

    /**
     * Creates new form Controle
     */
    public Controle() {
        initComponents();
        
         Crud crud = new Crud();
         
         crud.buscarUsuario().forEach(x->{
             lblID.setText(x.getNome());
    txtID.setText(String.valueOf(x.getValorvenda()));
         
         
         });
    
      
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Controle");
        getContentPane().setLayout(null);

        lblID.setText("ID Produto");
        lblID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID);
        lblID.setBounds(20, 20, 190, 70);

        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(240, 20, 430, 70);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(704, 492));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_txtIDActionPerformed

 
   
    
          
    
        
          
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
