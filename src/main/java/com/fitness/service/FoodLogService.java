package com.fitness.service;

import com.fitness.dao.FoodLogDao;
import com.fitness.model.FoodLog;

import java.util.List;

public class FoodLogService {
    private FoodLogDao foodLogDao;

    public FoodLogService() {
        this.foodLogDao = new FoodLogDao();
    }

    public List<FoodLog> getAllFoodLogs() {
        return foodLogDao.getAllFoodLogs();
    }
}
