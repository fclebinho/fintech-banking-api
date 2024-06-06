package dev.gomes.banking.transaction.web.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class Transaction {

  @RequestMapping
  public ResponseEntity<List<String>> getTransactions() {
    return ResponseEntity.ok(List.of("Transaction 1", "Transaction 2"));
  }
}
