package org.example.billingservice.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.billingservice.model.Customer;

import java.util.Date;
import java.util.List;
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Bill {
    @Id @GeneratedValue
    private Long id;
    private Date billingDate;
    private long CustomerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
    @Transient //indique a jpa que customer est garder dans la classe mais n ets [as enregistrer dans bd
    private Customer customer;
}
