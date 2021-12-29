package com.in28minutes.learning.jpa.jpain10steaps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learning.jpa.jpain10steaps.entity.User;
import com.in28minutes.learning.jpa.jpain10steaps.entity.service.UserDAOService;

//component es importante para identificar que es un corredor de line a de comandos
@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{
	//un registrador uso de SLF4J
	private static final Logger log = 
			LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	//spring lo conecta automaticamente
	@Autowired
	private UserDAOService userDaoService;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jack", "Admin");
		//New User is created : User [id=1, name=Jack, role=Admin]
		long insert = userDaoService.insert(user);
		log.info("New User is created : " + user);
	}
}
