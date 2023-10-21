package com.sai.SOLID.repository;

import com.sai.SOLID.entity.Income;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IncomeRepository {

    public List<Income> findAllFromDB(){
        return new ArrayList<>();
    }

}
