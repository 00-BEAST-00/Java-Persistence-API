package com.persistances;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.Student;

public class StudentDaoImplement implements StudentDao {
	

	@Override
	public void insertStudent(Student student) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaDemo");
		System.out.println("Database connected");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		System.out.println("inserted");
		em.close();
		emf.close();
	}

	}
