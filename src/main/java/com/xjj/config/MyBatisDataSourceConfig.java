package com.xjj.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

@Configuration
public class MyBatisDataSourceConfig implements EnvironmentAware {

	private RelaxedPropertyResolver propertyResolver;
	private static Logger log = LoggerFactory.getLogger(MyBatisDataSourceConfig.class);

	@Override
	public void setEnvironment(Environment env) {
		this.propertyResolver = new RelaxedPropertyResolver(env, "spring.dataSource.");
	}

	@Bean(name = "dataSource")
	@Primary
	public DataSource dataSource() {
		log.debug("Configruing Write DataSource");

		HikariConfig datasource = new HikariConfig();
		datasource.setDriverClassName(propertyResolver.getProperty("driverClassName"));
		datasource.setJdbcUrl(propertyResolver.getProperty("url"));
		datasource.setUsername(propertyResolver.getProperty("username"));
		datasource.setPassword(propertyResolver.getProperty("password"));
		datasource.setPoolName("dataSourcePool");
		datasource.setAutoCommit(false);
		return new HikariDataSource(datasource);
	}
}
