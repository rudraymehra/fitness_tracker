package com.fitness.controller;

import com.fitness.model.Workout;
import com.fitness.service.WorkoutService;

import java.util.List;

public class WorkoutController {
    private WorkoutService workoutService;

    public WorkoutController() {
        this.workoutService = new WorkoutService();
    }

    public void getAllWorkouts() {
        List<Workout> workouts = workoutService.getAllWorkouts();
        if (workouts.isEmpty()) {
            System.out.println("No workouts found.");
        } else {
            for (Workout workout : workouts) {
                System.out.println(workout);
            }
        }
    }

    public static void main(String[] args) {
        WorkoutController controller = new WorkoutController();
        controller.getAllWorkouts();
    }
}
