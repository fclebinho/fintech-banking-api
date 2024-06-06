package dev.gomes.banking.transaction.domain.services;

import java.util.List;

import dev.gomes.banking.transaction.data.models.Transaction;

public interface TransactionService {
  public List<Transaction> getTransactions();
}
