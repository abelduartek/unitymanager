package br.com.unitymanager.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("BancoPU");

	public EntityManager getConnection() {
		return emf.createEntityManager();
	}
}
