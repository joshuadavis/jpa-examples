package example.jpa.basicjpa;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

import static org.testcontainers.containers.PostgreSQLContainer.DEFAULT_TAG;

public class PostgresTestcontainerTest {
    private static Logger log = LoggerFactory.getLogger(PostgresTestcontainerTest.class);

    static DockerImageName POSTGRES_IMAGE = DockerImageName.parse(PostgreSQLContainer.IMAGE).withTag(DEFAULT_TAG);

    @Test
    public void testBasicPostgresContainer() {
        try(PostgreSQLContainer container = createContainer()) {
            log.info("Starting container...");
            container.start();
            log.info("url=" + container.getJdbcUrl());
        }
    }

    private PostgreSQLContainer createContainer() {
        return new PostgreSQLContainer(POSTGRES_IMAGE)
                .withDatabaseName("test-db")
                .withUsername("sa")
                .withPassword("sa");
    }
}
