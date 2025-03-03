package com.controller;

import com.Dao.PlanDao;
import com.model.Plan;

import java.util.List;

public class PlanController {
    private PlanDao planDAO;

    public PlanController() {
        this.planDAO = new PlanDao();
    }

    public List<Plan> getAllPlans() {
        return planDAO.getAllPlans();
    }
}