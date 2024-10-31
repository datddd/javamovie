/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import data.tk;
import data.ConnectToSQLServer;
import data.DAOtk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class dangnhap extends javax.swing.JInternalFrame {

    private DAOtk dao;
    private String id;

    public dangnhap() {
        initComponents();
        dao = new DAOtk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txttk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttondn = new javax.swing.JButton();
        buttonthoat = new javax.swing.JButton();
        txtmk = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Tên Đăng Nhập");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Mật Khẩu");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG NHẬP");

        buttondn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttondn.setText("Đăng Nhập");
        buttondn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondnActionPerformed(evt);
            }
        });

        buttonthoat.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        buttonthoat.setText("Thoát");
        buttonthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonthoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttk)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(txtmk)))
                    .addComponent(buttondn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonthoat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(buttondn)
                .addGap(18, 18, 18)
                .addComponent(buttonthoat)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonthoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonthoatActionPerformed

    private void buttondnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondnActionPerformed
         String tenDangNhap = txttk.getText();
    String matKhau = new String(txtmk.getPassword());
    tk user = new tk();
    String role = dao.kiemTraDangNhap(tenDangNhap, matKhau);
    if (role != null) {
        JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
        if (role.equals("user")) {
            user.setRole("user");
            user.setId(id); // Lưu ID người dùng
            frmMain mainForm = new frmMain();
            mainForm.receiveData(user);
            mainForm.setVisible(true);
        } else if (role.equals("admin")) {
            user.setRole("admin");
//            user.setId(dao.id); // Lưu ID người dùng
            frmMain mainForm = new frmMain();
            mainForm.receiveData(user);
            mainForm.setVisible(true);
        }
        dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu.");
    }
    }//GEN-LAST:event_buttondnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttondn;
    private javax.swing.JButton buttonthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtmk;
    private javax.swing.JTextField txttk;
    // End of variables declaration//GEN-END:variables
}
