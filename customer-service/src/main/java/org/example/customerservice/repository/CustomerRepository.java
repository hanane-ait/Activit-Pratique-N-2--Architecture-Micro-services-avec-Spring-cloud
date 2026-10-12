package org.example.customerservice.repository;

import org.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //annotation permet de demarrer automatiquement  un web service restfull qui permet d acceder a toute les methodes dans cette interface
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
