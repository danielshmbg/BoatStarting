package id.populi.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.populi.start.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	
	User findByUsername(String username );
	
}
