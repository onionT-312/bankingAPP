package com.example.bankingApp.service.impl;

import com.example.bankingApp.dto.TransactionDto;
import com.example.bankingApp.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
