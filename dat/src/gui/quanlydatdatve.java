/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import javax.swing.JOptionPane;
import data.Ticket;
import data.DAO;
import data.Ticket;
import java.io.FileWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author admin
 */
public class quanlydatdatve extends javax.swing.JInternalFrame {
    private DAO dao;
    /**
     * Creates new form quanlydatdatve
     */
    public quanlydatdatve() {
        initComponents();
         dao = new DAO();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonxoave = new javax.swing.JButton();
        buttonrest = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonback = new javax.swing.JButton();
        buttonsua = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        buttondatve = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        buttonhienthidanhsanhve = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        buttonin = new javax.swing.JButton();

        buttonxoave.setText("xóa");
        buttonxoave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonxoaveActionPerformed(evt);
            }
        });

        buttonrest.setText("rest");
        buttonrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonrestActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IDVE", "NGAY", "GIO", "MA GHE", "TEN PHON", "TEN PHIM", "GIO CHIEU"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        buttonback.setText("back");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        buttonsua.setText("sửa");
        buttonsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsuaActionPerformed(evt);
            }
        });

        jLabel4.setText("MA GHE");

        jLabel5.setText("TEN PHONG");

        jLabel6.setText("TEN PHIM");

        buttondatve.setText("đặt vé");
        buttondatve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondatveActionPerformed(evt);
            }
        });

        jLabel7.setText("GIO CHIEU");

        buttonhienthidanhsanhve.setText("hiển thị danh sánh vé");
        buttonhienthidanhsanhve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhienthidanhsanhveActionPerformed(evt);
            }
        });

        buttonin.setText("in");
        buttonin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttoninActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonxoave)
                                .addGap(18, 18, 18)
                                .addComponent(buttonhienthidanhsanhve))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(buttondatve)
                        .addGap(18, 18, 18)
                        .addComponent(buttonrest)
                        .addGap(18, 18, 18)
                        .addComponent(buttonsua)
                        .addGap(18, 18, 18)
                        .addComponent(buttonback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonin)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonxoave)
                    .addComponent(buttonhienthidanhsanhve)
                    .addComponent(buttondatve)
                    .addComponent(buttonrest)
                    .addComponent(buttonsua)
                    .addComponent(buttonback)
                    .addComponent(buttonin))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonxoaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonxoaveActionPerformed
       int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int ticketId = (int) jTable1.getValueAt(selectedRow, 0);  // Lấy ID từ bảng
            dao.deleteTicket(ticketId);
            JOptionPane.showMessageDialog(this, "Xóa vé thành công!");
            buttonhienthidanhsanhveActionPerformed(null);  // Cập nhật lại bảng
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn vé cần xóa.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonxoaveActionPerformed

    private void buttonrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonrestActionPerformed
        
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonrestActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Lấy dữ liệu từ bảng và đổ vào các trường nhập liệu
            jTextField4.setText(jTable1.getValueAt(selectedRow, 3).toString());  // MA GHE
            jTextField5.setText(jTable1.getValueAt(selectedRow, 4).toString());  // TEN PHONG
            jTextField6.setText(jTable1.getValueAt(selectedRow, 5).toString());  // TEN PHIM
            jTextField7.setText(jTable1.getValueAt(selectedRow, 6).toString());  // GIO CHIEU
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonbackActionPerformed

    private void buttonsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsuaActionPerformed

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            int ticketId = (int) jTable1.getValueAt(selectedRow, 0);  // Lấy ID từ bảng
            String seat = jTextField4.getText();
            String roomName = jTextField5.getText();
            String movieName = jTextField6.getText();
            String showTime = jTextField7.getText();

            // Kiểm tra dữ liệu hợp lệ
            if (seat.isEmpty() || roomName.isEmpty() || movieName.isEmpty() || showTime.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin.");
            } else {
                Ticket ticket = new Ticket(ticketId, seat, roomName, movieName, showTime);
                dao.updateTicket(ticket);
                JOptionPane.showMessageDialog(this, "Cập nhật vé thành công!");
                buttonhienthidanhsanhveActionPerformed(null);  // Cập nhật lại bảng
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn vé cần sửa.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonsuaActionPerformed

    private void buttondatveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondatveActionPerformed
        // Lấy thông tin từ các trường nhập liệu
    String seat = jTextField4.getText().trim();
    String roomName = jTextField5.getText().trim();
    String movieName = jTextField6.getText().trim();
    String showTime = jTextField7.getText().trim();

    // Kiểm tra thông tin
    if (seat.isEmpty() || roomName.isEmpty() || movieName.isEmpty() || showTime.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;  // Ngừng thực hiện nếu có thông tin không hợp lệ
    }

    // Bạn có thể thêm các kiểm tra khác ở đây (ví dụ: định dạng thời gian)
    // Kiểm tra định dạng thời gian đơn giản (nếu cần)
    if (!isValidTime(showTime)) {
        JOptionPane.showMessageDialog(this, "Định dạng giờ không hợp lệ. Vui lòng nhập lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Tạo đối tượng vé
    Ticket ticket = new Ticket();
    ticket.setSeat(seat);
    ticket.setRoomName(roomName);
    ticket.setMovieName(movieName);
    ticket.setShowTime(showTime);

    // Thêm vé vào cơ sở dữ liệu
    dao.addTicket(ticket);
    JOptionPane.showMessageDialog(this, "Đặt vé thành công!");
    buttonhienthidanhsanhveActionPerformed(null); // Cập nhật lại bảng

        // TODO add your handling code here:
    }//GEN-LAST:event_buttondatveActionPerformed
    private boolean isValidTime(String time) {
    // Định dạng giờ đơn giản: "HH:mm"
    String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";
    return time.matches(regex);
}
    private void buttonhienthidanhsanhveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhienthidanhsanhveActionPerformed
        List<Ticket> tickets = dao.getTickets();
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0);  // Xóa dữ liệu cũ

        for (Ticket ticket : tickets) {
            tableModel.addRow(new Object[]{
                ticket.getId(), ticket.getDate(), ticket.getTime(), 
                ticket.getSeat(), ticket.getRoomName(), 
                ticket.getMovieName(), ticket.getShowTime()
            });
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonhienthidanhsanhveActionPerformed

    private void buttoninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttoninActionPerformed
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Lấy thông tin từ bảng
        int ticketId = (int) jTable1.getValueAt(selectedRow, 0);  // IDVE
        String date = jTable1.getValueAt(selectedRow, 1).toString();  // NGAY
        String time = jTable1.getValueAt(selectedRow, 2).toString();  // GIO
        String seat = jTable1.getValueAt(selectedRow, 3).toString();  // MA GHE
        String roomName = jTable1.getValueAt(selectedRow, 4).toString();  // TEN PHON
        String movieName = jTable1.getValueAt(selectedRow, 5).toString();  // TEN PHIM
        String showTime = jTable1.getValueAt(selectedRow, 6).toString();  // GIO CHIEU

        // Tạo nội dung hóa đơn
        String invoiceContent = "HÓA ĐƠN ĐẶT VÉ\n" +
                                "---------------------\n" +
                                "ID Vé: " + ticketId + "\n" +
                                "Ngày: " + date + "\n" +
                                "Giờ: " + time + "\n" +
                                "Mã Ghế: " + seat + "\n" +
                                "Tên Phòng: " + roomName + "\n" +
                                "Tên Phim: " + movieName + "\n" +
                                "Giờ Chiếu: " + showTime + "\n" +
                                "---------------------\n" +
                                "Cảm ơn bạn đã đặt vé!";

        // Ghi vào file TXT
        try {
            String fileName = "D:\\HoaDon_" + ticketId + ".txt";

            FileWriter writer = new FileWriter(fileName);
            writer.write(invoiceContent);
            writer.close();
            JOptionPane.showMessageDialog(this, "Hóa đơn đã được in thành công: " + fileName);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra khi in hóa đơn: " + e.getMessage());
        }
    } else {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn vé để in hóa đơn.");
    }


        // TODO add your handling code here:
    }//GEN-LAST:event_buttoninActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonback;
    private javax.swing.JButton buttondatve;
    private javax.swing.JButton buttonhienthidanhsanhve;
    private javax.swing.JButton buttonin;
    private javax.swing.JButton buttonrest;
    private javax.swing.JButton buttonsua;
    private javax.swing.JButton buttonxoave;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}