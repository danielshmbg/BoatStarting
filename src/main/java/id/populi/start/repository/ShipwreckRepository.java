package id.populi.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import id.populi.start.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long>{
	
}
