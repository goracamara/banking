package sn.yes.banking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_transaction")
public class Transaction {
    @Id
    @GeneratedValue
    private Integer id;

    private BigDecimal amount;

    private TransactionType type;

    private  String destinationIban;

    private LocalDate transcationDate;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

}
