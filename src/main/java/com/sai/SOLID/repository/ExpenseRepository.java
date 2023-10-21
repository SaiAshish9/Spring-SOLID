package com.sai.SOLID.repository;

import com.sai.SOLID.entity.Expense;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpenseRepository {

    public List<Expense> findAllFromDB(){
        return new ArrayList<>();
    }

}
