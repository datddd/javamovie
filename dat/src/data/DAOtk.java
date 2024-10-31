package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DAOtk {
    public String role;
    public String id;
    public String kiemTraDangNhap(String tenDangNhap, String matKhau) {
                tk user = null; // Khởi tạo đối tượng tk
    String sql = "SELECT DangNhap.VaiTro, DangNhap.id, NGUOIDUNG.HoTen " +
                 "FROM DangNhap " +
                 "JOIN NGUOIDUNG ON DangNhap.id = NGUOIDUNG.ID " + 
                 "WHERE DangNhap.TenDangNhap = ? AND DangNhap.MatKhau = ?";

    try (Connection conn = ConnectToSQLServer.getConnection();
         PreparedStatement statement = conn.prepareStatement(sql)) {

        statement.setString(1, tenDangNhap);
        statement.setString(2, matKhau);

        ResultSet result = statement.executeQuery();
        if (result.next()) {
            user = new tk();
            user.setRole(result.getString("VaiTro"));
            user.setId(result.getString("id")); // Lưu id
            user.setname(result.getString("HoTen")); // Lưu tên
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return role;
    }
    public boolean kiemTraTonTai(String tenDangNhap, String email,String sdt) {
    String sql = "SELECT COUNT(*) FROM DangNhap WHERE TenDangNhap = ? OR Email = ? OR SDT = ?";

    try (Connection conn = ConnectToSQLServer.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu.");
            return true;
        }

        pstmt.setString(1, tenDangNhap);
        pstmt.setString(2, email);
        pstmt.setString(3, sdt); 

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

// Phương thức thêm người dùng
public boolean themNguoiDung(String tenDangNhap, String matKhau, String email, String sdt) {
        String sql = "INSERT INTO DangNhap (TenDangNhap, MatKhau, VaiTro, Email, SDT) VALUES (?, ?, 'user', ?, ?)";

        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, tenDangNhap);
            pstmt.setString(2, matKhau);
            pstmt.setString(3, email);
            pstmt.setString(4, sdt); // Truyền số điện thoại vào truy vấn

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    };
public String getId() {
    return this.id; // Trả về ID người dùng
}
}
    

