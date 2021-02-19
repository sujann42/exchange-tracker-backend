package com.exptrkr.service;

import com.exptrkr.model.Expense;
import com.exptrkr.repo.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    private ExpenseRepository expenseRepository;

    @Override
    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    @Override
    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    @Override
    public Expense findById(Long id) {
        if(expenseRepository.findById(id).isPresent()){
            return expenseRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        Expense expense = findById(id);
        expenseRepository.delete(expense);


    }

}












