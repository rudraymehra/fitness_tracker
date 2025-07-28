package com.fitness.service;

import com.fitness.dao.WorkoutDao;
import com.fitness.model.Workout;

import java.util.List;

public class WorkoutService {
    private WorkoutDao workoutDao;

    public WorkoutService() {
        this.workoutDao = new WorkoutDao();
    }

    public List<Workout> getAllWorkouts() {
        return workoutDao.getAllWorkouts();
    }
}
