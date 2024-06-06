package dev.gomes.banking.transaction.data.models;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transactions")
@Data
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

  @Column(name = "due_date")
  private Timestamp dueDate;

  @Column(name = "created_at")
  private Timestamp createdAt;

  @Column(name = "amount")
  private double amount;

}