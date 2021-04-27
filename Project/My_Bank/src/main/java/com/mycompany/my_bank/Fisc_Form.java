package com.mycompany.my_bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Fisc_Form extends javax.swing.JFrame {

    final String db_url = "jdbc:mysql://localhost/my_bank";
    final String username = "root";
    final String password = "";
    
    public Fisc_Form() {
        initComponents();
        showList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_fisc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(186, 79, 64));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(186, 79, 64));
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Conturi existente");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Monitorizeaza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabel_fisc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nume", "Prenume", "CNP", "Sold EURO", "Sold RON"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabel_fisc);
        if (tabel_fisc.getColumnModel().getColumnCount() > 0) {
            tabel_fisc.getColumnModel().getColumn(0).setResizable(false);
            tabel_fisc.getColumnModel().getColumn(1).setResizable(false);
            tabel_fisc.getColumnModel().getColumn(2).setResizable(false);
            tabel_fisc.getColumnModel().getColumn(3).setResizable(false);
            tabel_fisc.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        this.dispose();
        Fisc_Menu menu = new Fisc_Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void insert_fisc(String nume, String prenume, String cnp, String sold_euro, String sold_ron) throws SQLException{
        
        Connection con = DriverManager.getConnection(db_url,username,password);
        String insertfisc="INSERT INTO `fisc`(`nume`, `prenume`, `cnp`, `sold_euro`, `sold_ron`) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(insertfisc);
        stmt.setString(1,nume);
        stmt.setString(2,prenume);
        stmt.setString(3,cnp);
        stmt.setString(4,sold_euro);
        stmt.setString(5,sold_ron);
        //stmt.executeUpdate();
        if(stmt.executeUpdate()!=0){
            JOptionPane.showMessageDialog(null, "Cont pregatit de monitorizare!");
        }
        con.close();
    }
    
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
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int line = tabel_fisc.getSelectedRow();
        TableModel model = tabel_fisc.getModel();
        
        if(line < 0){
            JOptionPane.showMessageDialog(null, "Nu ati selectat un cont!");
        }else{
            String nume_to_insert = model.getValueAt(line,0).toString();
            String prenume_to_insert = model.getValueAt(line,1).toString();
            String cnp_to_insert = model.getValueAt(line,2).toString();
            String sold1_to_insert = model.getValueAt(line,3).toString();
            String sold2_to_insert = model.getValueAt(line,4).toString();

            try {
                if(verify(cnp_to_insert)==true){
                    
                    JOptionPane.showMessageDialog(null, "Cont deja aflat in monitorizare!");
                    
                }else{
                    try {
                        insert_fisc(nume_to_insert, prenume_to_insert, cnp_to_insert, sold1_to_insert, sold2_to_insert);
                    } catch (SQLException ex) {
                        Logger.getLogger(Fisc_Form.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Fisc_Form.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showList(){
        
        try {
            Connection con = DriverManager.getConnection(db_url,username,password);
            String showData1="SELECT * FROM `clients`";
            PreparedStatement stmt1 = con.prepareStatement(showData1);
            ResultSet rs1 = stmt1.executeQuery();
            
            while(rs1.next()){
                
                String nume_tabel = rs1.getString("nume");
                String prenume_tabel = rs1.getString("prenume");
                String cnp_tabel = rs1.getString("cnp");
                
                String showData2="SELECT * FROM `bank` WHERE `cnp` = '"+cnp_tabel+"'";
                PreparedStatement stmt2 = con.prepareStatement(showData2);
                ResultSet rs2 = stmt2.executeQuery();
                
                rs2.next();
                String sold_euro_tabel = rs2.getString("sold_euro");
                String sold_ron_tabel = rs2.getString("sold_ron");
                
                String tabel_data[] = {nume_tabel, prenume_tabel, cnp_tabel, sold_euro_tabel, sold_ron_tabel};
                DefaultTableModel tbmodel = (DefaultTableModel)tabel_fisc.getModel();
                tbmodel.addRow(tabel_data);
            
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Fisc_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabel1MouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabel_fisc;
    // End of variables declaration//GEN-END:variables
}
