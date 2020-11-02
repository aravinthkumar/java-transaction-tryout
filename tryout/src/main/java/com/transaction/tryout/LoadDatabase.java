package com.transaction.tryout;

import com.transaction.tryout.order.Order;
import com.transaction.tryout.order.OrderRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(OrderRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Order(1000, "Delaware")));
            log.info("Preloading " + repository.save(new Order(2000, "Deloitte")));

        };
    }
}