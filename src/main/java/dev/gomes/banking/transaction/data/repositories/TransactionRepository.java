package dev.gomes.banking.transaction.data.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.gomes.banking.transaction.data.models.Transaction;

public interface TransactionRepository
    extends JpaRepository<Transaction, UUID> {

}
