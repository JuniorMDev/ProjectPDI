package sensedia.com.projectpdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "sensedia.com.projectpdi.infrastructure.entities" )
@EnableJpaRepositories(basePackages = "sensedia.com.projectpdi.interfaceAdapters.repositories")
@ComponentScan(basePackages = "sensedia.com.projectpdi.interfaceAdapters.controllers")
public class ProjectPdiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectPdiApplication.class, args);
    }

}
