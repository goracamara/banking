package sn.yes.banking.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Integer id;

    private String houseNumber;

    private Integer zipCode;

    private  String city;

    private String country;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
