package dev.gomes.banking.transaction.data.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.gomes.banking.transaction.data.models.Transaction;
import dev.gomes.banking.transaction.data.repositories.TransactionRepository;
import dev.gomes.banking.transaction.domain.services.TransactionService;
import dev.gomes.banking.transaction.web.requests.TransactionCreateRequest;
import dev.gomes.banking.transaction.web.requests.TransactionDeleteRequest;

@Service
public class TransactionServiceImpl implements TransactionService {
  @Autowired
  private TransactionRepository transactionRepository;

  @Override
  public List<Transaction> getTransactions() {
    return transactionRepository.findAll();
  }

  @Override
  public Transaction createTransaction(TransactionCreateRequest request) {
    Transaction transaction = Transaction.builder()
        .description(request.getDescription())
        .type(request.getType())
        .status(request.getStatus())
        .amount(request.getAmount())
        .dueDate(request.getDueDate())
        .build();

    return transactionRepository.save(transaction);
  }

  @Override
  public void deleteTransaction(TransactionDeleteRequest request) {
    transactionRepository.deleteById(request.getId());
  }

}
