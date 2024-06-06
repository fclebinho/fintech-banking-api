package dev.gomes.banking.transaction.web.requests;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TransactionCreateRequest {
  private String description;
  private String type;
  private String status;
  private double amount;
  private LocalDateTime dueDate;
}
