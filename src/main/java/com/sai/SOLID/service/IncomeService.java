package com.sai.SOLID.service;

import com.sai.SOLID.entity.Income;
import com.sai.SOLID.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public List<Income> getIncomes() {
        return incomeRepository.findAllFromDB();
    }

}
