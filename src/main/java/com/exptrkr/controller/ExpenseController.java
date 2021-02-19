package com.exptrkr.controller;

import com.exptrkr.model.Expense;
import com.exptrkr.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ExpenseController {

    @Autowired
    private ExpenseService expenseService;

    @GetMapping("/expenses")
    public ResponseEntity<List<Expense>> getAllExpenses() {
        List<Expense> expense = expenseService.findAll();

        return new ResponseEntity<List<Expense>>(expense, HttpStatus.OK);
    }

    @PostMapping("/expenses")
    public ResponseEntity<Expense> save(@RequestBody Expense expense) {
        Expense expense1 = expenseService.save(expense);
        return new ResponseEntity<Expense>(expense1, HttpStatus.OK);
    }

    @GetMapping("/expenses/{id}")
    public ResponseEntity<Expense> get(@PathVariable("id") Long id) {
        Expense expense = expenseService.findById(id);
        return new ResponseEntity<Expense>(expense, HttpStatus.OK);
    }

    @DeleteMapping("/expenses/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        expenseService.delete(id);
        return new ResponseEntity<String>("Expense "+id+" is successfully deleted!!!", HttpStatus.OK);
    }

}












