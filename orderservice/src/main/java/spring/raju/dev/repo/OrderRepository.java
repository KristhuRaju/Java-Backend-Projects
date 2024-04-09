package spring.raju.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.raju.dev.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
