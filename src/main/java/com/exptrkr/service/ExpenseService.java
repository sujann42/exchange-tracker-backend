package com.exptrkr.service;

import com.exptrkr.model.Expense;

import java.util.List;
import java.util.Optional;

public interface ExpenseService {

    List<Expense> findAll();

    Expense save(Expense expense);

    Expense findById(Long id);

    void delete(Long id);
}















