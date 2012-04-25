package org.yajul.eg.jap.arqtestng;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.annotations.Test;
import org.yajul.eg.jpa.basic.Thing;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Arquillian Persistence example with TestNG
 * <br>
 * User: josh
 * Date: 4/24/12
 * Time: 7:39 PM
 */
@Test
public class TestNGArquillianPersistenceExample extends Arquillian
{
    @Deployment
    public static Archive<?> createDeploymentPackage()
    {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
                .addPackage(Thing.class.getPackage())
                .addAsManifestResource("test-persistence.xml", "persistence.xml");
    }


    @PersistenceContext
    private EntityManager em;

    public void testThing() throws Exception
    {
        Thing thing = new Thing();
        em.persist(thing);

        System.out.println("tx.isActive()=" + em.getTransaction().isActive() );
    }
}
