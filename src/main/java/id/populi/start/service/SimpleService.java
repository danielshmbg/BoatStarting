package id.populi.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.populi.start.model.Shipwreck;
import id.populi.start.repository.ShipwreckRepository;

@Service
public class SimpleService {
	@Autowired
	ShipwreckRepository repository;
	
	public Shipwreck service() {
		return repository.findAll().get(0);
	}
}
