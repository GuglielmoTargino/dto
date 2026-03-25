
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
        
       /*
         
         crud.buscarUsuario().forEach(x->{
             lblID.setText(x.getNome());
    txtID.setText(String.valueOf(x.getValorvenda()));
         
         
         });
    
      */
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblID1 = new javax.swing.JLabel();
        lblID2 = new javax.swing.JLabel();
        lblID3 = new javax.swing.JLabel();
        lblID4 = new javax.swing.JLabel();
        lblID5 = new javax.swing.JLabel();
        lblID6 = new javax.swing.JLabel();
        lblID7 = new javax.swing.JLabel();
        lblID8 = new javax.swing.JLabel();
        lblID9 = new javax.swing.JLabel();
        lblID10 = new javax.swing.JLabel();
        lblID11 = new javax.swing.JLabel();
        txtID1 = new javax.swing.JTextField();
        txtID2 = new javax.swing.JTextField();
        txtID3 = new javax.swing.JTextField();
        txtID4 = new javax.swing.JTextField();
        txtID5 = new javax.swing.JTextField();
        txtID6 = new javax.swing.JTextField();
        txtID7 = new javax.swing.JTextField();
        txtID8 = new javax.swing.JTextField();
        txtID9 = new javax.swing.JTextField();
        txtID10 = new javax.swing.JTextField();
        txtID11 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Controle");
        getContentPane().setLayout(null);

        lblID.setText("ID Produto");
        lblID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID);
        lblID.setBounds(370, 130, 90, 20);

        txtID.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(480, 160, 190, 20);

        lblID1.setText("ID Produto");
        lblID1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID1);
        lblID1.setBounds(20, 20, 70, 30);

        lblID2.setText("ID Produto");
        lblID2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID2);
        lblID2.setBounds(20, 60, 70, 20);

        lblID3.setText("ID Produto");
        lblID3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID3);
        lblID3.setBounds(20, 90, 140, 20);

        lblID4.setText("ID Produto");
        lblID4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID4);
        lblID4.setBounds(20, 120, 140, 20);

        lblID5.setText("ID Produto");
        lblID5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID5);
        lblID5.setBounds(20, 150, 140, 20);

        lblID6.setText("ID Produto");
        lblID6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID6);
        lblID6.setBounds(370, 160, 90, 20);

        lblID7.setText("ID Produto");
        lblID7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID7);
        lblID7.setBounds(20, 180, 140, 20);

        lblID8.setText("ID Produto");
        lblID8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID8);
        lblID8.setBounds(370, 190, 90, 20);

        lblID9.setText("ID Produto");
        lblID9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID9);
        lblID9.setBounds(370, 20, 80, 20);

        lblID10.setText("ID Produto");
        lblID10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID10);
        lblID10.setBounds(370, 60, 90, 20);

        lblID11.setText("ID Produto");
        lblID11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblID11);
        lblID11.setBounds(370, 90, 90, 20);

        txtID1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID1);
        txtID1.setBounds(110, 20, 60, 30);

        txtID2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID2);
        txtID2.setBounds(110, 60, 60, 20);

        txtID3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID3ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID3);
        txtID3.setBounds(190, 90, 90, 20);

        txtID4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID4);
        txtID4.setBounds(190, 120, 90, 20);

        txtID5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID5ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID5);
        txtID5.setBounds(190, 150, 90, 20);

        txtID6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID6ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID6);
        txtID6.setBounds(490, 130, 190, 20);

        txtID7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID7ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID7);
        txtID7.setBounds(190, 180, 90, 20);

        txtID8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID8ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID8);
        txtID8.setBounds(480, 190, 190, 20);

        txtID9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID9ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID9);
        txtID9.setBounds(470, 20, 210, 20);

        txtID10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID10ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID10);
        txtID10.setBounds(470, 60, 210, 20);

        txtID11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtID11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID11ActionPerformed(evt);
            }
        });
        getContentPane().add(txtID11);
        txtID11.setBounds(470, 90, 210, 20);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 20, 75, 23);

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 250, 75, 23);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 250, 75, 23);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(230, 250, 75, 23);

        jButton5.setText("jButton5");
        getContentPane().add(jButton5);
        jButton5.setBounds(190, 60, 75, 23);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(723, 332));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:   
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID1ActionPerformed

    private void txtID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID2ActionPerformed

    private void txtID3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID3ActionPerformed

    private void txtID4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID4ActionPerformed

    private void txtID5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID5ActionPerformed

    private void txtID6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID6ActionPerformed

    private void txtID7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID7ActionPerformed

    private void txtID8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID8ActionPerformed

    private void txtID9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID9ActionPerformed

    private void txtID10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID10ActionPerformed

    private void txtID11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed



        // TODO add your handling code here:
        
         
         Calcado calcado=new Calcado(
                 Integer.parseInt(txtID.getText()),
                 txtID.getText(),"trabalho","preto",
                 "MTK",120.56,300.45,5.6,
                 89.56,500,11,38);
         
         Crud.inserir(calcado);
      
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

 
   
    
          
    
        
          
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblID1;
    private javax.swing.JLabel lblID10;
    private javax.swing.JLabel lblID11;
    private javax.swing.JLabel lblID2;
    private javax.swing.JLabel lblID3;
    private javax.swing.JLabel lblID4;
    private javax.swing.JLabel lblID5;
    private javax.swing.JLabel lblID6;
    private javax.swing.JLabel lblID7;
    private javax.swing.JLabel lblID8;
    private javax.swing.JLabel lblID9;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID1;
    private javax.swing.JTextField txtID10;
    private javax.swing.JTextField txtID11;
    private javax.swing.JTextField txtID2;
    private javax.swing.JTextField txtID3;
    private javax.swing.JTextField txtID4;
    private javax.swing.JTextField txtID5;
    private javax.swing.JTextField txtID6;
    private javax.swing.JTextField txtID7;
    private javax.swing.JTextField txtID8;
    private javax.swing.JTextField txtID9;
    // End of variables declaration//GEN-END:variables
}
