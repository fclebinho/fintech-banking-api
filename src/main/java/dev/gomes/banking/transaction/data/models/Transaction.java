package dev.gomes.banking.transaction.data.models;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Column(name = "description")
  private String description;

  @Column(name = "type")
  private String type;

  @Column(name = "status")
  private String status;

  @Column(name = "amount")
  private double amount;

  @Column(name = "due_date")
  private LocalDateTime dueDate;

  @CreatedDate
  private LocalDateTime createdAt;

}