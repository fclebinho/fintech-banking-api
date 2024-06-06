package dev.gomes.banking.transaction.domain.services;

import java.util.List;

import dev.gomes.banking.transaction.data.models.Transaction;
import dev.gomes.banking.transaction.web.requests.TransactionCreateRequest;
import dev.gomes.banking.transaction.web.requests.TransactionDeleteRequest;

public interface TransactionService {
  public List<Transaction> getTransactions();

  public Transaction createTransaction(TransactionCreateRequest request);

  public void deleteTransaction(TransactionDeleteRequest request);
}
