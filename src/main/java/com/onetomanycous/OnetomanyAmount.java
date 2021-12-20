package com.onetomanyexp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Country;

public class OnetomanytoAmount {

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
			
			Amount amount = entityManager.getReference(Amount.class, 2);


			// entity
			Coustomer customer = new Coustomer();
			customer.getCid();


			Amount amount1 = new Amount();
			amount1.setAmount(12000);
			amount1.setCoustomerId(customer);

			Amount amount2 = new Amount();
			amount2.setAmount(15000);
			amount2.setCoustomerId(customer);

			List<Amount> amountList = new ArrayList();
			amountList.add(amount1);
			amountList.add(amount2);

			customer.setListAmount(amountList);

			// save call
			entityManager.persist(coustomer);
			System.out.println("Coustomer details successfull....");

		} catch (Exception e) {
			System.out.println(e);
			transaction.rollback();
		} finally {
			if (transaction.isActive()) {
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
