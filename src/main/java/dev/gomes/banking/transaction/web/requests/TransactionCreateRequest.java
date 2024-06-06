package dev.gomes.banking.transaction.web.requests;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class TransactionCreateRequest {
  @NotEmpty
  private String description;

  @NotEmpty
  private String type;

  @NotEmpty
  private String status;

  private double amount;

  @JsonFormat(pattern = "yyyy-MM-dd")
  private LocalDate dueDate;
}
