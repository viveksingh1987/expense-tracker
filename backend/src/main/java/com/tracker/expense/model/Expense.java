package com.tracker.expense.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;
    private String userEmail;
    private double amount;
    private String category;
    private LocalDate date;
    private String note;

    public Expense(){};

    public Expense(Long id, String userEmail, double amount, String category, LocalDate date, String note) {
        this.expenseId = id;
        this.userEmail = userEmail;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.note = note;
    }

    public Long getExpenseIdId() {
        return expenseId;
    }

    public void setExpenseId(Long id) {
        this.expenseId = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}