package com.sai.SOLID.controller;

import com.sai.SOLID.entity.Expense;
import com.sai.SOLID.entity.Income;
import com.sai.SOLID.service.CashFlowService;
import com.sai.SOLID.service.ExpenseService;
import com.sai.SOLID.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CashFlowController {

    @Autowired
    private IncomeService incomeService;

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/incomes/all")
    public List<Income> getAllIncomes(){
         return incomeService.getIncomes();
    }

    @PostMapping("/expenses/all")
    public List<Expense> getAllExpenses(){
         return expenseService.getExpenses();
    }

}
