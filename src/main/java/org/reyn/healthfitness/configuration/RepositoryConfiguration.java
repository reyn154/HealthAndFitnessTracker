package org.reyn.healthfitness.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"org.reyn.healthfitness.models"})
@EnableJpaRepositories(basePackages = {"org.reyn.healthfitness.models.dao"})
@EnableTransactionManagement
public class RepositoryConfiguration {

}
