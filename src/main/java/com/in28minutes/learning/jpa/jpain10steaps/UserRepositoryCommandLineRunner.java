package com.in28minutes.learning.jpa.jpain10steaps;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steaps.entity.User;
import com.in28minutes.learning.jpa.jpain10steaps.entity.service.UserRepository;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner{

	private static final Logger log = 
			LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jill", "Admin");
		//actualizar o guardar un usuario se utilizaria el mismo metodo save()
		userRepository.save(user);
		log.info("New User is created : " + user);
		
		//listar el usuario por id, devuelve una opcion que almacena objetos null o no disponibles
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is retrived : " + userWithIdOne);
		
		//listar a todos los usuario
		List<User> users = userRepository.findAll();
		log.info("All Users : " + users);			
	}
}
