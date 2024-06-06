package dev.gomes.banking.transaction.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gomes.banking.transaction.data.models.Transaction;
import dev.gomes.banking.transaction.domain.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
  @Autowired
  private TransactionService transactionService;

  @RequestMapping
  public ResponseEntity<List<Transaction>> getTransactions() {

    return ResponseEntity.ok(transactionService.getTransactions());
  }
}
