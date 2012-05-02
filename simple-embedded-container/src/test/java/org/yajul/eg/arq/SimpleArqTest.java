package org.yajul.eg.arq;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.testng.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.testng.annotations.Test;

import javax.inject.Inject;
import javax.transaction.UserTransaction;

/**
 * Simple arquillian test with TestNG support.
 * <br>
 * User: josh
 * Date: 5/2/12
 * Time: 3:32 PM
 */
@Test
public class SimpleArqTest extends Arquillian
{

    @Inject
    UserTransaction utx;

    @Inject
    SimpleBean simple;

    @Deployment
    public static JavaArchive createDeployment()
    {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(SimpleBean.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    public void testSimpleBean()
    {
        String s = simple.hello();
        System.out.println("simple bean said : " + s);
    }

}
