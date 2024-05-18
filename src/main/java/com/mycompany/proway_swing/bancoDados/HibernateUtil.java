package com.mycompany.proway_swing.bancoDados;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtil {
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
"nossaPersistenciaLocal"
    );

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static void shutdown() {
        if (entityManagerFactory != null)
            entityManagerFactory.close();
    }
}