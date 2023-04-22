package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("God");

	public Admin saveAdmin(Admin Admin) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entTransaction = entityManager.getTransaction();
		if (Admin != null) {
			entTransaction.begin();
			entityManager.persist(Admin);
			entTransaction.commit();
		}
		return Admin;
	}

	public Admin updateAdmin(Admin Admin) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entTransaction = entityManager.getTransaction();
		Admin Admin2 = entityManager.find(Admin.class, Admin.getId());
		if (Admin2 != null) {
			entTransaction.begin();
			entityManager.merge(Admin);
			entTransaction.commit();
		} else {
			AdminDao dao = new AdminDao();
			dao.saveAdmin(Admin);
			System.out.println("Admin saved");
		}

		return Admin;
	}

	public Admin deleteAdmin(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entTransaction = entityManager.getTransaction();
		Admin Admin = entityManager.find(Admin.class, id);
		if (Admin != null) {
			entTransaction.begin();
			entityManager.remove(Admin);
			entTransaction.commit();
		}
		return Admin;
	}

	public Admin getAdminById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(Admin.class, id);
	}

	public List<Admin> getAllAdmin() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery(" select a from Admin a ");
		return query.getResultList();
	}

	public Admin loginAdmin(String email, String password) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery(" select a from Admin a where email= ?1 and password= ?2");
		query.setParameter(1, email);
		query.setParameter(2, password);

		List<Admin> list = query.getResultList();
		if (list.size() > 0) {
			return list.get(0);
		}

		return null;
	}
}
