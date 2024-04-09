package spring.raju.dev.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.raju.dev.model.TransactionDetails;

public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails, Long> {

	Optional<TransactionDetails> findByOrderId(long orderId);

}
