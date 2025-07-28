package com.fitness.dao;

import com.fitness.model.Workout;
import com.fitness.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkoutDao {

    public List<Workout> getAllWorkouts() {
        List<Workout> workouts = new ArrayList<>();

        String query = "SELECT * FROM workouts";
        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Workout workout = new Workout();
                workout.setId(rs.getInt("id"));
                workout.setUserId(rs.getInt("user_id"));
                workout.setType(rs.getString("type"));
                workout.setDuration(rs.getInt("duration"));
                workout.setDate(rs.getDate("date").toLocalDate());

                workouts.add(workout);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return workouts;
    }
}
