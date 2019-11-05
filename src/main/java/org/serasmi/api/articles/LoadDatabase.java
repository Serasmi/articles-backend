package org.serasmi.api.articles;

import lombok.extern.slf4j.Slf4j;
import org.serasmi.api.articles.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(UserRepository repository) {
    return args -> {
//      log.info("Preloading " + repository.save(new User("Ivan", "user")));
//      log.info("Preloading " + repository.save(new User("Fedor", "user")));
//      log.info("Preloading " + repository.save(new User("Sergey", "admin")));
    };
  }
}
