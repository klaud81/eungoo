package com.eungoo.app.config;

import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class DatabaseConfig {

	// Local HsqlDB
	// driverClass = org.hsqldb.jdbc.JDBCDriver
	// jdbcUrl = jdbc:hsqldb:mem:linkdb
	// username = SA
	// password =

	// Local MySQL
	// driverClass = com.mysql.jdbc.Driver
	// jdbcUrl = jdbc:mysql://localhost/test?characterEncoding=UTF-8
	// username = root
	// password = admin

	// Cafe24 MySQL
	// driverClass = com.mysql.jdbc.Driver
	// jdbcUrl = jdbc:mysql://localhost/mcsilvernine?characterEncoding=UTF-8
	// username = mcsilvernine
	// password = rndmswjd12

	@Bean
	public DataSource dataSource() {

		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
		dataSource.setUrl("jdbc:hsqldb:mem:linkdb");
		dataSource.setUsername("SA");
		dataSource.setPassword("");

		return dataSource;
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setDatabase(Database.HSQL);
		vendorAdapter.setGenerateDdl(true);

		Map<String, Object> jpaPropertyMap = vendorAdapter.getJpaPropertyMap();
		jpaPropertyMap.put("javax.persistence.sharedCache.mode", "ALL");
		jpaPropertyMap.put("hibernate.show_sql", "true");
		jpaPropertyMap.put("hibernate.format_sql", "true");
		jpaPropertyMap.put(
				"hibernate.cache.provider_configuration_file_resource_path",
				"ehcache.xml");
		jpaPropertyMap.put("hibernate.cache.region.factory_class",
				"org.hibernate.cache.ehcache.EhCacheRegionFactory");
		jpaPropertyMap.put("hibernate.cache.use_structured_entries", "true");
		jpaPropertyMap.put("hibernate.cache.use_second_level_cache", "true");
		jpaPropertyMap.put("hibernate.cache.use_query_cache", "true");

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan("com.eungoo.app");
		factory.setDataSource(dataSource());
		factory.setJpaPropertyMap(jpaPropertyMap);

		return factory;
	}

}
