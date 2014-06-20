package fcm.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories("fcm.repositories")
public class JpaConfig {

    @Value("${jpa.db.userName}")
    private String jpaUserName;

    @Value("${jpa.db.userPassword}")
    private String jpaUserPassword;

    @Value("${jpa.db.url}")
    private String jpaUrl;

    @Value("${jpa.db.driverClassName}")
    private String jpaDriverClassName;

    @Value("${jpa.vendorAdapter.databasePlatform}")
    private String databasePlatform;

    @Bean
    public DataSource dataSource() {
        final BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName(jpaDriverClassName);
        basicDataSource.setUrl(jpaUrl);
        basicDataSource.setUsername(jpaUserName);
        basicDataSource.setPassword(jpaUserPassword);
        //CONNECTIONPOOL SETTINGS
        basicDataSource.setTestWhileIdle(true);
        basicDataSource.setTestOnBorrow(true);
        basicDataSource.setTestOnReturn(false);
        basicDataSource.setValidationQuery("select 1 from dual");
        //missig: validationInterval="30000"
        basicDataSource.setTimeBetweenEvictionRunsMillis(30000);
        basicDataSource.setMaxActive(20);
        basicDataSource.setMaxIdle(5);
        basicDataSource.setMaxWait(10000L);
        basicDataSource.setInitialSize(5);
        basicDataSource.setRemoveAbandonedTimeout(600);
        basicDataSource.setRemoveAbandoned(false);
        basicDataSource.setLogAbandoned(true);
        basicDataSource.setMinEvictableIdleTimeMillis(30000L);
//        basicDataSource.setDefaultAutoCommit(true);


        return basicDataSource;
    }

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        EclipseLinkJpaVendorAdapter jpaVendorAdapter = new EclipseLinkJpaVendorAdapter();
        jpaVendorAdapter.setGenerateDdl(true);
        jpaVendorAdapter.setShowSql(true);
        jpaVendorAdapter.setDatabasePlatform(databasePlatform);
        return jpaVendorAdapter;
    }

    @Bean
    public LoadTimeWeaver loadTimeWeaver() {
        return new InstrumentationLoadTimeWeaver();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        localContainerEntityManagerFactoryBean.setDataSource(dataSource());
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        localContainerEntityManagerFactoryBean.setPackagesToScan("fcm.model");
        localContainerEntityManagerFactoryBean.setLoadTimeWeaver(loadTimeWeaver());
        localContainerEntityManagerFactoryBean.getJpaPropertyMap().put("eclipselink.weaving", "false");
        return localContainerEntityManagerFactoryBean;
    }

}
