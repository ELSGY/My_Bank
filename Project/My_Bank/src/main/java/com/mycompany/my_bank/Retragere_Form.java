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


public class Retragere_Form extends javax.swing.JFrame {

    final String db_url = "jdbc:mysql://localhost/my_bank";
    final String username = "root";
    final String password = "";

    private String my_cnp;
    public Retragere_Form(String CNP) {
        my_cnp = CNP;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        retragere = new javax.swing.JButton();
        sold = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        combo_box = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 79, 64));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(186, 79, 64));
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Depozitul meu");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
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

        retragere.setText("Retragere");
        retragere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retragereActionPerformed(evt);
            }
        });

        sold.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                soldFocusGained(evt);
            }
        });
        sold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soldKeyTyped(evt);
            }
        });

        jTextField6.setBackground(new java.awt.Color(186, 79, 64));
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setText("Suma");
        jTextField6.setBorder(null);

        jTextField7.setBackground(new java.awt.Color(186, 79, 64));
        jTextField7.setForeground(new java.awt.Color(204, 204, 204));
        jTextField7.setText("Cont");
        jTextField7.setBorder(null);

        combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EURO", "RON" }));

        jButton2.setText("Inapoi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sold, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(retragere)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retragere)
                    .addComponent(jButton2))
                .addGap(41, 41, 41))
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private boolean verify(String cnp) throws SQLException{
        
        Connection con = DriverManager.getConnection(db_url,username,password);
                    
        String cont = "SELECT * FROM `fisc` WHERE `cnp` = '"+cnp+"'";

        //verificare cont existent
        PreparedStatement stmt = con.prepareStatement(cont);
        ResultSet rs = stmt.executeQuery();

        if(rs.next()){
        
            return true;
            
        }
        con.close();
        return false;
    }
    
    private boolean verify_sum(){
        
        String whole = sold.getText();
        String first = whole.substring(0, 1);
        if(first.equals("0")){
            JOptionPane.showMessageDialog(null, "Sold introdus incorect");
            return false;

        }
       
        return true;
    }
    
    private void retragere() throws IOException, MessagingException{
        
         if(sold.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Introduceti suma!");
            
        }else{
             if(verify_sum()==true){
                int suma_text = Integer.valueOf(sold.getText());
                String check = combo_box.getSelectedItem().toString();
                //System.out.println(my_cnp);
                //System.out.println(check);
                //System.out.println(suma_text);



                try {
                    Connection con = DriverManager.getConnection(db_url,username,password);
                    PreparedStatement stmt,stmt1,stmt2;
                    ResultSet rs;

                    //luam valorile vechide euro si lei
                    String getData = "SELECT * FROM `bank` WHERE `cnp` = '"+my_cnp+"'";

                    stmt1 = con.prepareStatement(getData);
                    rs = stmt1.executeQuery();
                    rs.next();
                    int suma_euro_veche = Integer.valueOf(rs.getString("sold_euro"));
                    //System.out.println(suma_euro_veche);
                    int suma_ron_veche = Integer.valueOf(rs.getString("sold_ron"));
                    //System.out.println(suma_ron_veche);


                        //update sold euro
                        if(check.equals("EURO")){
                            int suma_euro_final =  suma_euro_veche - suma_text ;
                            if(suma_euro_final < 0){

                                JOptionPane.showMessageDialog(null, "Fonduri insufiente!");

                            }else{
                                //System.out.println("OKay1");
                                String updateEuro_fisc = "UPDATE `fisc` SET `sold_euro` = "+suma_euro_final+" WHERE `cnp` = '"+my_cnp+"'";
                                String updateEuro = "UPDATE `bank` SET `sold_euro` = "+suma_euro_final+" WHERE `cnp` = '"+my_cnp+"'";
                                stmt = con.prepareStatement(updateEuro);     
                                if(stmt.executeUpdate()!=0){
                                    if(verify(my_cnp)==true){
                                    stmt2 = con.prepareStatement(updateEuro_fisc);
                                    stmt2.executeUpdate();
                                    SendMail send = new SendMail();
                                    send.retragereMail(my_cnp,sold.getText(),"EURO",suma_euro_final,suma_ron_veche);

                                }
                                    JOptionPane.showMessageDialog(null, "Retragere euro cu succes!");

                                }
                            }
                        }



                        //update sold ron
                        if(check.equals("RON")){
                            int suma_ron_final = suma_ron_veche - suma_text;
                            if(suma_ron_final < 0){

                                JOptionPane.showMessageDialog(null, "Fonduri insufiente!");

                            }else{
                                //System.out.println("OKay2");
                                String updateRon = "UPDATE `bank` SET `sold_ron` = "+suma_ron_final+" WHERE `cnp` = '"+my_cnp+"'";
                                String updateRon_fisc = "UPDATE `fisc` SET `sold_ron` = "+suma_ron_final+" WHERE `cnp` = '"+my_cnp+"'";
                                stmt = con.prepareStatement(updateRon);
                                if(stmt.executeUpdate()!=0){
                                    if(verify(my_cnp)==true){
                                    stmt2 = con.prepareStatement(updateRon_fisc);
                                    stmt2.executeUpdate();
                                    SendMail send = new SendMail();
                                    send.depozitMail(my_cnp,sold.getText(),"RON",suma_euro_veche,suma_ron_final);

                                }
                                    JOptionPane.showMessageDialog(null, "Retragere ron cu succes!");

                                }
                            }
                        }

                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
    
    private void retragereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retragereActionPerformed

        try {
            retragere();
        } catch (IOException ex) {
            Logger.getLogger(Retragere_Form.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Retragere_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_retragereActionPerformed

    private void soldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_soldFocusGained

        sold.setText("");
    }//GEN-LAST:event_soldFocusGained

    private void soldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soldKeyTyped

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_soldKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        this.dispose();
        Client_Menu client = new Client_Menu(my_cnp);
        client.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_box;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton retragere;
    private javax.swing.JTextField sold;
    // End of variables declaration//GEN-END:variables
}
