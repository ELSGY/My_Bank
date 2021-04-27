package com.mycompany.my_bank;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Register_Form extends javax.swing.JFrame {

    
    public Register_Form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nume = new javax.swing.JTextField();
        prenume = new javax.swing.JTextField();
        telefon = new javax.swing.JTextField();
        cnp = new javax.swing.JTextField();
        register_username = new javax.swing.JTextField();
        register_password = new javax.swing.JPasswordField();
        create_account = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 79, 64));

        nume.setBackground(new java.awt.Color(186, 79, 64));
        nume.setForeground(new java.awt.Color(204, 204, 204));
        nume.setText("Nume");
        nume.setBorder(null);
        nume.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeFocusLost(evt);
            }
        });
        nume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeActionPerformed(evt);
            }
        });

        prenume.setBackground(new java.awt.Color(186, 79, 64));
        prenume.setForeground(new java.awt.Color(204, 204, 204));
        prenume.setText("Prenume");
        prenume.setBorder(null);
        prenume.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prenumeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prenumeFocusLost(evt);
            }
        });

        telefon.setBackground(new java.awt.Color(186, 79, 64));
        telefon.setForeground(new java.awt.Color(204, 204, 204));
        telefon.setText("Telefon");
        telefon.setBorder(null);
        telefon.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telefonFocusGained(evt);
            }
        });
        telefon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonKeyTyped(evt);
            }
        });

        cnp.setBackground(new java.awt.Color(186, 79, 64));
        cnp.setForeground(new java.awt.Color(204, 204, 204));
        cnp.setText("CNP");
        cnp.setBorder(null);
        cnp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cnpFocusGained(evt);
            }
        });
        cnp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cnpKeyTyped(evt);
            }
        });

        register_username.setBackground(new java.awt.Color(186, 79, 64));
        register_username.setForeground(new java.awt.Color(204, 204, 204));
        register_username.setText("Username");
        register_username.setBorder(null);
        register_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                register_usernameFocusGained(evt);
            }
        });

        register_password.setBackground(new java.awt.Color(186, 79, 64));
        register_password.setForeground(new java.awt.Color(204, 204, 204));
        register_password.setText("Password");
        register_password.setBorder(null);
        register_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                register_passwordFocusGained(evt);
            }
        });

        create_account.setText("Create Account");
        create_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_accountActionPerformed(evt);
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

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator3)
                        .addComponent(cnp)
                        .addComponent(jSeparator5)
                        .addComponent(jSeparator4)
                        .addComponent(nume)
                        .addComponent(prenume)
                        .addComponent(telefon)
                        .addComponent(register_username)
                        .addComponent(register_password, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(create_account)
                        .addGap(18, 18, 18)
                        .addComponent(back_button)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cnp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(register_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_account)
                    .addComponent(back_button))
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void numeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel1MouseClicked

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        
        this.dispose();
        Login_Form login = new Login_Form();
        login.setVisible(true);
        
       
    }//GEN-LAST:event_back_buttonActionPerformed

    private void create_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_accountActionPerformed
       
        String nume_text = nume.getText();
        String prenume_text = prenume.getText();
        String telefon_text = telefon.getText();
        String cnp_text = cnp.getText();
        String username_text = register_username.getText();
        String password_text = String.valueOf(register_password.getPassword());
        
        if(nume_text.trim().equals("") || prenume_text.trim().equals("") || telefon_text.trim().equals("") 
           || cnp_text.trim().equals("") || username_text.trim().equals("") || password_text.trim().equals("") 
           || nume_text.trim().equals("Nume") || prenume_text.trim().equals("Prenume") || telefon_text.trim().equals("Telefon") 
           || cnp_text.trim().equals("CNP") || username_text.trim().equals("Username") || password_text.trim().equals("Password") ){
            
            JOptionPane.showMessageDialog(null, "Nu lasa campuri necompletate!");
            
        }else{
            
               if(telefon_text.length()!=10 || cnp_text.length()!=13 ){

                    JOptionPane.showMessageDialog(null, "Telefon sau CNP incorect!");

                }else{

                        //verificare cont deja existent
                         try {
                            final String db_url = "jdbc:mysql://localhost/my_bank";
                            final String username = "root";
                            final String password = "";
                            
                            Connection con = DriverManager.getConnection(db_url,username,password);
                            String verifyUserQuery = "SELECT * FROM `clients` WHERE `username` = '"+username_text+"'";
                            
                            //verificare cont existent
                            PreparedStatement stmt3 = con.prepareStatement(verifyUserQuery);
                            ResultSet rs = stmt3.executeQuery();

                            if(rs.next()){

                               JOptionPane.showMessageDialog(null, "Cont deja existent!");

                             }else{//creare cont nou
                                     String registerUserQuery1 = "INSERT INTO `clients`(`nume`, `prenume`, `telefon`, `cnp`, `username`, `password`) VALUES (?,?,?,?,?,?)";
                                     String registerUserQuery2 = "INSERT INTO `bank`(`cnp`, `sold_euro`, `sold_ron`) VALUES (?,0,0)";

                                     //intruducere date client
                                    PreparedStatement stmt1 = con.prepareStatement(registerUserQuery1);
                                     stmt1.setString(1,nume_text);
                                     stmt1.setString(2,prenume_text);
                                     stmt1.setString(3,telefon_text);
                                     stmt1.setString(4,cnp_text);
                                     stmt1.setString(5,username_text);
                                     stmt1.setString(6,password_text);
                                     stmt1.executeUpdate();

                                     //creare sold null pentru nou venit
                                     PreparedStatement stmt2 = con.prepareStatement(registerUserQuery2);
                                     stmt2.setString(1,cnp_text);
                                     stmt2.executeUpdate();

                                     //afisare meniu client
                                     this.dispose();
                                     Client_Menu client = new Client_Menu(cnp_text);
                                     client.setVisible(true);

                                     con.close();
                            }
                     } catch (SQLException ex) {
                         Logger.getLogger(Register_Form.class.getName()).log(Level.SEVERE, null, ex);
                     }  
                       
                }   
            }
    }//GEN-LAST:event_create_accountActionPerformed

    private void telefonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonKeyTyped
        
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_telefonKeyTyped

    private void numeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeFocusGained
        
        nume.setText(""); 
        
    }//GEN-LAST:event_numeFocusGained

    private void numeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeFocusLost
        
        //nume.setText("Nume"); 
        
    }//GEN-LAST:event_numeFocusLost

    private void prenumeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prenumeFocusGained
       
        prenume.setText(""); 
        
    }//GEN-LAST:event_prenumeFocusGained

    private void prenumeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prenumeFocusLost
        
       //prenume.setText("Prenume");
         
    }//GEN-LAST:event_prenumeFocusLost

    private void telefonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonFocusGained
       
        telefon.setText(""); 
        
    }//GEN-LAST:event_telefonFocusGained

    private void cnpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cnpFocusGained
        
        cnp.setText(""); 
        
    }//GEN-LAST:event_cnpFocusGained

    private void register_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_register_usernameFocusGained
        
        register_username.setText(""); 
        
    }//GEN-LAST:event_register_usernameFocusGained

    private void register_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_register_passwordFocusGained
        
        register_password.setText(""); 
        
    }//GEN-LAST:event_register_passwordFocusGained

    private void cnpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cnpKeyTyped
        
         if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
        
    }//GEN-LAST:event_cnpKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JTextField cnp;
    private javax.swing.JButton create_account;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField nume;
    private javax.swing.JTextField prenume;
    private javax.swing.JPasswordField register_password;
    private javax.swing.JTextField register_username;
    private javax.swing.JTextField telefon;
    // End of variables declaration//GEN-END:variables
}
