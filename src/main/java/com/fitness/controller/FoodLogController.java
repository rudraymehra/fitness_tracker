package com.fitness.controller;

import com.fitness.model.FoodLog;
import com.fitness.service.FoodLogService;

import java.util.List;

public class FoodLogController {
    private FoodLogService foodLogService;

    public FoodLogController() {
        this.foodLogService = new FoodLogService();
    }

    public void getAllFoodLogs() {
        List<FoodLog> foodLogs = foodLogService.getAllFoodLogs();
        if (foodLogs.isEmpty()) {
            System.out.println("No food logs found.");
        } else {
            for (FoodLog foodLog : foodLogs) {
                System.out.println(foodLog);
            }
        }
    }

    public static void main(String[] args) {
        FoodLogController controller = new FoodLogController();
        controller.getAllFoodLogs();
    }
}
