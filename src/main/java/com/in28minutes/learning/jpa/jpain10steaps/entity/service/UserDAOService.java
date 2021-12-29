package com.in28minutes.learning.jpa.jpain10steaps.entity.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.learning.jpa.jpain10steaps.entity.User;
@Repository
@Transactional
public class UserDAOService {
	//administrador de entidades
	@PersistenceContext
	private EntityManager entityManager;
	
	//metodo de insercion creando un objeto de tipo user
	public long insert(User user) {
		//Abrir transaccion
		entityManager.persist(user);
		//Cerrar transaccion
		return user.getId();
	}
}
