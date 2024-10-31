package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOuser {
    public user getUserByUsername(String id) throws SQLException {
        user user1 = new user();
        String sql = "SELECT * FROM NGUOIDUNG WHERE ID = ?";

        try (Connection connection = ConnectToSQLServer.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user1.setTendn(resultSet.getString("TenDangNhap"));
                user1.setMk(resultSet.getString("MatKhau"));
                user1.setname(resultSet.getString("HoTen"));
                user1.setEmail(resultSet.getString("Email"));
                user1.setSdt(resultSet.getString("SDT"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Lỗi khi lấy thông tin người dùng: " + e.getMessage());
        }

        return user1;
    }
}


