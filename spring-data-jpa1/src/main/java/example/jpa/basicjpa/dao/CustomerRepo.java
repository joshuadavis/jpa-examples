package example.jpa.basicjpa.dao;

import example.jpa.basicjpa.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
