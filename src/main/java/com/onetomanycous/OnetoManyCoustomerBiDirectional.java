package com.onetomanyexp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cs.entity.Coustomer;
import com.cs.entity.Amount;

public class OnotoManyCoustomerBiDirectional {
	
	
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			emf = Persistence.createEntityManagerFactory("coustomerdb");
			entityManager = emf.createEntityManager();

			transaction = entityManager.getTransaction();

			// start transaction
			transaction.begin();

			// entity
			Coustomer coustomerName = entityManager.getReference(Coustomer.class, 8);
			

			Coustomer coustomer = new Coustomer();
			customer.setContactNo("+1-408-575-1317");
			coustomer.setCoustomer(coustomerName);


			// save call
			entityManager.persist(coustomer);
			System.out.println("Company details successfull....");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			if (transaction != null) {
				transaction.commit();
			}
			if (entityManager != null) {
				entityManager.close();
			}
			if (emf != null) {
				emf.close();
			}
		}
	}


}
