package com.sai.SOLID.service;

import com.sai.SOLID.entity.Expense;
import com.sai.SOLID.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense> getExpenses() {
        return expenseRepository.findAllFromDB();
    }

}
