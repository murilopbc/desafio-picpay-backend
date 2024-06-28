package com.murilo.picpay.controllers;

import com.murilo.picpay.dtos.transaction.TransactionDTO;
import com.murilo.picpay.entities.Transaction;
import com.murilo.picpay.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(@RequestBody TransactionDTO transaction) throws Exception {
        Transaction newtransaction = this.transactionService.createTransaction(transaction);
        return new ResponseEntity<>(newtransaction, HttpStatus.CREATED);
    }
}
