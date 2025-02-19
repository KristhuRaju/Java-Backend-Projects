package it.raju.springboot.springbootfileupload.repository;

import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByName(String Name);
}
