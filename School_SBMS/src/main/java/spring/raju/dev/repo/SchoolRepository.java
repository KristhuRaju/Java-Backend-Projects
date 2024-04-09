package spring.raju.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.raju.dev.model.School;
@Repository
public interface SchoolRepository extends JpaRepository<School, Integer>{

}
