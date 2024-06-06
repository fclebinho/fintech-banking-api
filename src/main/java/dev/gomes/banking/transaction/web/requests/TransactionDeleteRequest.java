package dev.gomes.banking.transaction.web.requests;

import java.util.UUID;

import lombok.Data;

@Data
public class TransactionDeleteRequest {
  private UUID id;
}
