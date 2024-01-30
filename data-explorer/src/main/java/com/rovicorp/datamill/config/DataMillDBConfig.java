package com.rovicorp.datamill.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef="dataMillEntityManagerFactory",
        transactionManagerRef="dataMillTransactionManager",
        basePackages={"com.rovicorp.datamill.repository"})
public class DataMillDBConfig {

    @Autowired
    private JpaProperties jpaProperties;

    @Primary
    @Bean(name = "dataMillDataSource")
    @ConfigurationProperties(prefix="datamill.datasource")
    public DataSource dataMillDataSource()  {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "dataMillEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean dataMillEntityManager(EntityManagerFactoryBuilder builder,
                                                                        @Qualifier("dataMillDataSource") DataSource dataMillDataSource)  {
        return builder.
                dataSource(dataMillDataSource).
                properties(this.jpaProperties.getHibernateProperties(dataMillDataSource)).
                persistenceUnit("dataMillPersistenceContext").
                packages("com.rovicorp.datamill.domain").
                build();
    }

    @Primary
    @Bean(name = "dataMillTransactionManager")
    public PlatformTransactionManager dataMillTransactionManager(
            @Qualifier("dataMillEntityManagerFactory") EntityManagerFactory dataMillEntityManagerFactory)  {
        return new JpaTransactionManager(dataMillEntityManagerFactory);
    }
}
