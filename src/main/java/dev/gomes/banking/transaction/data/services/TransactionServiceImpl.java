package dev.gomes.banking.transaction.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.gomes.banking.transaction.data.models.Transaction;
import dev.gomes.banking.transaction.data.repositories.TransactionRepository;
import dev.gomes.banking.transaction.domain.services.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
  @Autowired
  private TransactionRepository transactionRepository;

  @Override
  public List<Transaction> getTransactions() {
    return transactionRepository.findAll();
  }

}
