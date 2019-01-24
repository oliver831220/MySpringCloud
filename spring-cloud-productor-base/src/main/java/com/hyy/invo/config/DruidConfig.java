package com.hyy.invo.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
public class DruidConfig {

	@Primary
    @Bean(name="dataSource")
    public DataSource druidDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

}
