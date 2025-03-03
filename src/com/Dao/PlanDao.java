package com.Dao;

import com.model.Plan;
import com.DataBaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlanDao {
    public List<Plan> getAllPlans() {
        List<Plan> plans = new ArrayList<>();
        String query = "SELECT * FROM Plan";

        try (Connection conn = DataBaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Plan plan = new Plan();
                plan.setPlanId(rs.getInt("PlanID"));
                plan.setPlanName(rs.getString("PlanName"));
                plan.setSpeed(rs.getString("Speed"));
                plan.setLimit(rs.getString("DataLimit"));
                plan.setPrice(rs.getDouble("Price"));
                plan.setContractDuration(rs.getString("ContractDuration"));

                plans.add(plan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return plans;
    }
}