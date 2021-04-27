package com.mycompany.my_bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;


public class Client_Menu extends javax.swing.JFrame {
    
    final String db_url = "jdbc:mysql://localhost/my_bank";
    final String username = "root";
    final String password = "";
    private String nume_complet,my_cnp,sold1,sold2;
    
    public Client_Menu(String CNP) {
        my_cnp = CNP;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lichidare = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        send_information = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 79, 64));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setToolTipText("");

        lichidare.setText("Lichidare cont");
        lichidare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lichidareActionPerformed(evt);
            }
        });

        jButton1.setText("Depozit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Retragere");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        send_information.setText("Informatii cont");
        send_information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_informationActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(186, 79, 64));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Contul meu");
        jTextField1.setBorder(null);

        jButton3.setText("Deconecteaza-te");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lichidare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(send_information, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lichidare)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send_information)
                    .addComponent(jButton3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void send_informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_informationActionPerformed
        
     
        try {
                Connection con = DriverManager.getConnection(db_url,username,password);
                PreparedStatement stmt,stmt1;
                ResultSet rs;

                //luam datele
                String getBank = "SELECT * FROM `bank` WHERE `cnp` = '"+my_cnp+"'";
                String getClient = "SELECT * FROM `clients` WHERE `cnp` = '"+my_cnp+"'";

                stmt = con.prepareStatement(getBank);
                rs = stmt.executeQuery();
                rs.next();
                sold1 = rs.getString("sold_euro");
                sold2 = rs.getString("sold_ron");

                stmt1 = con.prepareStatement(getClient);
                rs = stmt1.executeQuery();
                rs.next();
                nume_complet = rs.getString("nume")+" "+rs.getString("prenume");
                //System.out.println(nume_complet);
               

                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        this.dispose();
        Detalii_Form informatii = new Detalii_Form(nume_complet,my_cnp,sold1,sold2);
        informatii.setVisible(true);
        
    }//GEN-LAST:event_send_informationActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      this.dispose();
      Depozit_Form depozit = new Depozit_Form(my_cnp);
      depozit.setVisible(true);
      //System.out.println(my_cnp);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
      this.dispose();
      Retragere_Form retragere = new Retragere_Form(my_cnp);
      retragere.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lichidareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lichidareActionPerformed
       
            

            try {
                Connection con = DriverManager.getConnection(db_url,username,password);
                PreparedStatement stmt,stmt1,stmt2,stmt3;
                ResultSet rs,rs1;

                //luam valorile vechide euro si lei
                String getData = "SELECT * FROM `bank` WHERE `cnp` = '"+my_cnp+"'";

                stmt1 = con.prepareStatement(getData);
                rs = stmt1.executeQuery();
                rs.next();
                int suma_euro = Integer.valueOf(rs.getString("sold_euro"));
                //System.out.println(suma_euro_veche);
                int suma_ron = Integer.valueOf(rs.getString("sold_ron"));
                //System.out.println(suma_ron_veche);
                //nume_complet = rs.getString("nume")+" "+rs.getString("prenume");

                if((suma_euro > 0 && suma_ron > 0)||(suma_euro == 0 && suma_ron > 0)||(suma_euro > 0 && suma_ron == 0)){
                    
                    JOptionPane.showMessageDialog(null, "Sold existent, eroare lichidare!");
                    
                }else {
                    
                    String eraseSold = "DELETE FROM `bank` WHERE `cnp` = '"+my_cnp+"'";
                    String eraseClient = "DELETE FROM `clients` WHERE `cnp` = '"+my_cnp+"'";
                    stmt = con.prepareStatement(eraseSold);
                    stmt1 = con.prepareStatement(eraseClient);
                    
                    
                    String getDataFisc = "SELECT * FROM `fisc` WHERE `cnp` = '"+my_cnp+"'";
                    stmt2 = con.prepareStatement(getDataFisc);
                    
                        rs1 = stmt2.executeQuery();
                        if(rs1.next()){
                            
                            String eraseFisc = "DELETE FROM `fisc` WHERE `cnp` = '"+my_cnp+"'";   
                            stmt3 = con.prepareStatement(eraseFisc);
                            if(stmt.executeUpdate()!=0 && stmt1.executeUpdate()!=0 && stmt3.executeUpdate()!=0){

                                JOptionPane.showMessageDialog(null, "Lichidare cu succes!");
                                SendMail send = new SendMail();
                                send.parasireMail(my_cnp);
                                this.dispose();
                                Login_Form login =  new Login_Form();
                                login.setVisible(true);
                            }
                            
                        }else{
                            
                            if(stmt.executeUpdate()!=0 && stmt1.executeUpdate()!=0){
                                
                                SendMail send = new SendMail();
                                send.parasireMail(my_cnp);
                                JOptionPane.showMessageDialog(null, "Lichidare cu succes!");
                                this.dispose();
                                Login_Form login =  new Login_Form();
                                login.setVisible(true);   
                            }
                        }
                        
                }

                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(Client_Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Client_Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_lichidareActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();
        Login_Form login = new Login_Form();
        login.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton lichidare;
    private javax.swing.JButton send_information;
    // End of variables declaration//GEN-END:variables
}
