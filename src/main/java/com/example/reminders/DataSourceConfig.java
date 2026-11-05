package com.example.reminders;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

    @Bean(destroyMethod = "close")
    public BasicDataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:reminders;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setMaxTotal(8);
        return dataSource;
    }
}
