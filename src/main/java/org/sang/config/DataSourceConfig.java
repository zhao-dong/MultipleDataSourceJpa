package org.sang.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.validation.annotation.Validated;

/**
 * Created by sang on 2018/7/16.
 */
@Configuration
public class DataSourceConfig {
	
    @Bean
    @Primary
    @Validated
    //@ConfigurationProperties(prefix = "one")
    @ConfigurationProperties(prefix = "one")
    public DataSource dsOne() {
       // return DruidDataSourceBuilder.create().build();
    	
    	/*
    	DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:sqlserver://localhost;databaseName=dmsdb;SelectMethod=cursor");
        dataSourceBuilder.username("dmstest");
        dataSourceBuilder.password("Motorola123");
        return dataSourceBuilder.build();
        */
        System.out.println("db1 datasource");
    	return DataSourceBuilder.create().build();
    }
    
    @Bean
    @Validated
    @ConfigurationProperties(prefix = "two")
    public DataSource dsTwo() {
        //return DruidDataSourceBuilder.create().build();
    	
    	/*
    	DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:sqlserver://localhost;databaseName=dmslog");
        dataSourceBuilder.username("dmstest");
        dataSourceBuilder.password("Motorola123");
        return dataSourceBuilder.build();
    	
    	*/
        System.out.println("db2 datasource");
    	return DataSourceBuilder.create().build();
    }
}
