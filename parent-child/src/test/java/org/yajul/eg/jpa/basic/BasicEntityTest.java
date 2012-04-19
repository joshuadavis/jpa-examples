package org.yajul.eg.jpa.basic;

import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Basic entity examples.
 * <br>
 * User: josh
 * Date: 4/19/12
 * Time: 1:02 PM
 */
@Test
public class BasicEntityTest
{
    public void testThing()
    {
        // The name of the persistence unit must match the persistence-unit name in some META-INF/persistence.xml
        // resource in the classpath.
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-examples-db");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Thing thing = new Thing();
        em.persist(thing);


        em.getTransaction().commit();

        em.close();
    }
}
