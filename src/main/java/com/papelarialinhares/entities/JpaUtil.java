package com.papelarialinhares.entities;

import javax.persistence.*;

public class JpaUtil {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("papelarialinhares");
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public static void close() {
		factory.close();
	}
}
