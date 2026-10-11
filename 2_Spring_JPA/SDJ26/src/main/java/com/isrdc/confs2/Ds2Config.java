package com.isrdc.confs2;

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
    basePackages = "com.isrdc.repos2",
    entityManagerFactoryRef = "ds2DbEntityManager",
    transactionManagerRef = "ds2DbTransactionManager"
)
public class Ds2Config {
	
	@Value("${app.jpa.ds2-dialect}")
	private String ds2Dialect;
	
	@Bean
    @ConfigurationProperties("spring.datasource.ds2")
    public DataSource ds2DbDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean ds2DbEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("ds2DbDataSource") DataSource datasource) {
    	
    	Map<String, Object> props = new HashMap<>();
    	props.put("hibernate.dialect", ds2Dialect);
    	
        return builder
                .dataSource(datasource)
                .properties(props)
                .packages("com.isrdc.entities2")
                .persistenceUnit("ds2")
                .build();
    }
    @Bean
    public PlatformTransactionManager ds2DbTransactionManager(
            @Qualifier("ds2DbEntityManager") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}
