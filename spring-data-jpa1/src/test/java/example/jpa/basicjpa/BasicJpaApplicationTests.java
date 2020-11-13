package example.jpa.basicjpa;

import example.jpa.basicjpa.dao.CustomerRepo;
import example.jpa.basicjpa.model.Customer;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { BasicJpaApplication.class })
class BasicJpaApplicationTests {
	private static final Logger log = LoggerFactory.getLogger(BasicJpaApplicationTests.class);

	@Autowired
	private CustomerRepo customerRepo;

	@Test
	void contextLoads() {
	    // Simply test that our spring boot applciation will start.
	}

	@Test
	void testCustomerRepo() {
		Customer c = new Customer();
		c.setFirstName("pootie");
		c.setLastName("twoShoes");
		customerRepo.save(c);
	}
}
