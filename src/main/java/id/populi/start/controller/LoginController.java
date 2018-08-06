package id.populi.start.controller;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import id.populi.start.model.User;
import id.populi.start.repository.UserRepository;

@RestController
@RequestMapping("api/v1/")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="loginuser", method = RequestMethod.GET)
	public List<User> List(){
		return userRepository.findAll();
	}
	
	@RequestMapping(value = "loginuser", method = RequestMethod.POST)
	public User create(@RequestBody User shipwreck) {
		return userRepository.saveAndFlush(shipwreck);
	}

	@RequestMapping(value = "loginuser/{id}", method = RequestMethod.GET)
	public User get(@PathVariable int id) {
		return userRepository.findById(id).get();
	}

	@RequestMapping(value = "loginuser/{id}", method = RequestMethod.PUT)
	public User update(@PathVariable int id, @RequestBody User shipwreck) {
		User existingUser = userRepository.findById(id).get();
		BeanUtils.copyProperties(shipwreck, existingUser);
		return userRepository.saveAndFlush(existingUser);
	}

	@RequestMapping(value = "loginuser/{id}", method = RequestMethod.DELETE)
	public User delete(@PathVariable int id) {
		User existingUser = userRepository.findById(id).get();
		userRepository.delete( existingUser);
		return existingUser;
	}
}
