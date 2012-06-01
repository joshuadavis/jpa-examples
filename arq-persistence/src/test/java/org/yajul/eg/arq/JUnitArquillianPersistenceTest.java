package org.yajul.eg.arq;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.yajul.eg.jpa.basic.Thing;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 * Arquillian Persistence example with JUnit
 * <br>
 * User: josh
 * Date: 4/24/12
 * Time: 7:39 PM
 */

@RunWith(Arquillian.class)
public class JUnitArquillianPersistenceTest
{
    @Deployment
    public static Archive<?> createDeploymentPackage()
    {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
                .addPackage(Thing.class.getPackage())
                .addAsManifestResource("test-persistence.xml", "persistence.xml")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }


    @PersistenceContext
    private EntityManager em;

    @Inject
    private UserTransaction utx;

    @Test
    public void testThing() throws Exception
    {
        utx.begin();
        Thing thing = new Thing();
        em.persist(thing);
        utx.commit();

        System.out.println("tx.isActive()=" + em.getTransaction().isActive());
    }
}
