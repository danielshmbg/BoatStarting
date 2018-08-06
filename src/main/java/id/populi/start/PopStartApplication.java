package id.populi.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class PopStartApplication {
	
	@Autowired
	private static PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		
		SpringApplication.run(PopStartApplication.class, args);
		
	}
}
