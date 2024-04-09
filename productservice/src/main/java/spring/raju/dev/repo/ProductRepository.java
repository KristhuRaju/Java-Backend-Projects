package spring.raju.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.raju.dev.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
