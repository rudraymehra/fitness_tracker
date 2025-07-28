package com.fitness.dao;

import com.fitness.model.FoodLog;
import com.fitness.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FoodLogDao {

    public List<FoodLog> getAllFoodLogs() {
        List<FoodLog> logs = new ArrayList<>();

        String query = "SELECT * FROM food_logs";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                FoodLog log = new FoodLog();
                log.setId(rs.getInt("id"));
                log.setUserId(rs.getInt("user_id"));
                log.setFoodItem(rs.getString("food_item"));
                log.setCalories(rs.getInt("calories"));
                log.setDate(rs.getDate("date").toLocalDate());

                logs.add(log);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return logs;
    }
}
