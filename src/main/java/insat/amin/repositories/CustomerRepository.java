package insat.amin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import insat.amin.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
