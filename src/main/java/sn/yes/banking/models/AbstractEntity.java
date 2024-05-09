package sn.yes.banking.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
@Data
@SuperBuilder
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(
            name = "createdDate",
            nullable = false,
            updatable = false
    )
    @CreatedDate
    private LocalDateTime createdDate;

    @Column(name = "lastModifiedDate")
    @LastModifiedDate
    private LocalDateTime lastModifiedDate;
}
