package org.example.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Builder @Setter @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int quatity;
}
