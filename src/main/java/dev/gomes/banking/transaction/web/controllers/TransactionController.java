package dev.gomes.banking.transaction.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.gomes.banking.transaction.data.models.Transaction;
import dev.gomes.banking.transaction.domain.services.TransactionService;
import dev.gomes.banking.transaction.web.requests.TransactionCreateRequest;
import dev.gomes.banking.transaction.web.requests.TransactionDeleteRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
  @Autowired
  private TransactionService transactionService;

  @GetMapping
  public ResponseEntity<List<Transaction>> getTransactions() {
    return ResponseEntity.ok(transactionService.getTransactions());
  }

  @PostMapping
  public ResponseEntity<Transaction> createTransaction(@Valid TransactionCreateRequest request) {
    return ResponseEntity.ok(transactionService.createTransaction(request));
  }

  @DeleteMapping
  public ResponseEntity<Void> deleteTransaction(@Valid TransactionDeleteRequest request) {
    transactionService.deleteTransaction(request);

    return ResponseEntity.noContent().build();
  }

}
