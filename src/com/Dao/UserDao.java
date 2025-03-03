package com.Dao;
import java.sql.*;
import com.DataBaseConnection; 
import com.model.User;

public class UserDao {

    public boolean createUser(User user) {
        String Query = "INSERT INTO User(Name,Email,Password,PhoneNumber,billingAddress) VALUES (?,?,?,?,?)";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(Query)) {
            stmt.setString(1, user.getUserName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getPhoneNumber());
            stmt.setString(5, user.getBillingAddress());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Problem in Creating User");
            return false;
        }
    }

    public User getUserByEmail(String email) {
        String Query = "SELECT * FROM User WHERE Email = ? ";
        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(Query)) {

            stmt.setString(1, email);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                User user = new User();
                user.setUserID(rs.getInt("UserID"));
                user.setUserName(rs.getString("Name"));
                user.setEmail(rs.getString("Email"));
                user.setPassword(rs.getString("Password"));
                user.setPhoneNumber(rs.getString("PhoneNumber"));
                user.setBillingAddress(rs.getString("BillingAddress"));
                user.setRegistrationDate(rs.getString("RegistrationDate"));

                return user;
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving user by email: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
