package com.isrdc.confs1;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.isrdc.repos1",
    entityManagerFactoryRef = "ds1DbEntityManager",
    transactionManagerRef = "ds1DbTransactionManager"
)
public class Ds1Config {
	
	@Value("${app.jpa.ds1-dialect}")
	private String ds1Dialect;
	
	@Bean
    @Primary
    @ConfigurationProperties("spring.datasource.ds1")
    public DataSource ds1DbDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean ds1DbEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("ds1DbDataSource") DataSource datasource) {
    	
    	Map<String, Object> props = new HashMap<>();
    	props.put("hibernate.dialect", ds1Dialect);
    	
        return builder
                .dataSource(datasource)
                .properties(props)
                .packages("com.isrdc.entities1")
                .persistenceUnit("ds1")
                .build();
    }
    @Bean
    @Primary
    public PlatformTransactionManager ds1DbTransactionManager(
            @Qualifier("ds1DbEntityManager") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
