package com.Dao;

import com.model.Billing;
import com.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillingDao {
    
    public List<Billing> getBillingByUserId(int userId) {
        List<Billing> billingList = new ArrayList<>();
        String query = "SELECT * FROM Billing WHERE UserID = ?";

        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Billing billing = new Billing();
                billing.setBillingId(rs.getInt("BillingID"));
                billing.setUserId(rs.getInt("UserID"));
                billing.setBillingCycle(rs.getString("BillingCycle"));
                billing.setUsageCharges(rs.getDouble("UsageCharges"));
                billing.setTotalAmount(rs.getDouble("TotalAmount"));
                billing.setPaymentStatus(rs.getString("PaymentStatus"));
                billing.setPaymentMethod(rs.getString("PaymentMethod"));
                billing.setPaymentDate(rs.getTimestamp("PaymentDate") != null ? rs.getTimestamp("PaymentDate").toLocalDateTime() : null);

                billingList.add(billing);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return billingList;
    }
}