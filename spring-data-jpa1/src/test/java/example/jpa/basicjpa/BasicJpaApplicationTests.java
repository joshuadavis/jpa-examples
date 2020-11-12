package example.jpa.basicjpa;

import example.test.components.PostgresTestcontainerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { BasicJpaApplication.class , PostgresTestcontainerConfig.class})
class BasicJpaApplicationTests {

	@Test
	void contextLoads() {
	    // Simply test that our spring boot applciation will start.
	}
}
