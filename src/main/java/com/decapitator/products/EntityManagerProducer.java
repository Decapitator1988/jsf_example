package com.decapitator.products;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



public class EntityManagerProducer {
    @PersistenceContext(unitName = "examplePU")
    private EntityManager entityManager;

    @Produces
    private EntityManager createEntityManager(){
        return entityManager;
    }

    public ExampleBean createExampleBean(){
        return new ExampleBean();
    }
}
