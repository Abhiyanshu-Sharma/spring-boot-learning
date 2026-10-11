package com.isrdc.secnconfs;

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
			basePackages = "com.isrdc.secnrepos",
			entityManagerFactoryRef = "secnDbEntityManager",
			transactionManagerRef = "secnDbTransactionManager"
		)
public class SecondaryDataSourceConf {
	
	@Value("${app.jpa.secondary-dialect}")
	private String secnDialect;
	
	@Bean
	@ConfigurationProperties("spring.datasource.secondary")
	public DataSource secnDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
    public LocalContainerEntityManagerFactoryBean secnDbEntityManager(
            EntityManagerFactoryBuilder builder,
            @Qualifier("secnDataSource") DataSource datasource) {
    	
    	Map<String, Object> props = new HashMap<>();
    	props.put("hibernate.dialect", secnDialect);
    	
        return builder
                .dataSource(datasource)
                .properties(props)
                .packages("com.isrdc.secnentities")
                .persistenceUnit("ds2")
                .build();
    }
	
	@Bean
    public PlatformTransactionManager secnDbTransactionManager(
            @Qualifier("secnDbEntityManager") EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }
}











