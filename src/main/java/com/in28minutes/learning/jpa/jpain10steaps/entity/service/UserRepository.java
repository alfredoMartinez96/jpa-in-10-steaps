package com.in28minutes.learning.jpa.jpain10steaps.entity.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learning.jpa.jpain10steaps.entity.User;
//-decimos cual es la entidad que quremos administrar User y es de tipo long la clave de usuario (ID)
//Esto es todo lo que se necesita para poder crear un repositorio
public interface UserRepository extends JpaRepository<User, Long>{
	

}
