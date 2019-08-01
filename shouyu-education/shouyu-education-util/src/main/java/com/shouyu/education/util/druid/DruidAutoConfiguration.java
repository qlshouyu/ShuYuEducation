package com.shouyu.education.util.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * TODO
 *
 * @author 高露 邮箱：<a href="egojit@qq.com">egojit@qq.com</a>
 * @since 2019-08-01 14:47
 */

@Configuration
@ConditionalOnClass(DruidDataSource.class)
@EnableConfigurationProperties(DruidProperties.class)
@AutoConfigureBefore(DataSourceAutoConfiguration.class)
public class DruidAutoConfiguration {

    private final DruidProperties properties;

    public DruidAutoConfiguration(DruidProperties properties) {
        this.properties = properties;
    }

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(properties.getUrl());
        dataSource.setUsername(properties.getUsername());
        dataSource.setPassword(properties.getPassword());

        if (properties.getName() != null) {
            dataSource.setName(properties.getName());
        }
        if (properties.getDriverClass() != null) {
            dataSource.setDriverClassName(properties.getDriverClass());
        }
        if (properties.getInitialSize() > 0) {
            dataSource.setInitialSize(properties.getInitialSize());
        }
        if (properties.getMinIdle() > 0) {
            dataSource.setMinIdle(properties.getMinIdle());
        }
        if (properties.getMaxActive() > 0) {
            dataSource.setMaxActive(properties.getMaxActive());
        }
        if (properties.getMaxWait() > 0) {
            dataSource.setMaxWait(properties.getMaxWait());
        }
        if (properties.getPoolPreparedStatements() != null) {
            dataSource.setPoolPreparedStatements(properties.getPoolPreparedStatements());
        }
        if (properties.getMaxPoolPreparedStatementPerConnectionSize() > 0) {
            dataSource.setMaxPoolPreparedStatementPerConnectionSize(properties.getMaxPoolPreparedStatementPerConnectionSize());
        }
        if (properties.getValidationQuery() != null) {
            dataSource.setValidationQuery(properties.getValidationQuery());
        }
        if (properties.getTestOnBorrow() != null) {
            dataSource.setTestOnBorrow(properties.getTestOnBorrow());
        }
        if (properties.getTestWhileIdle() != null) {
            dataSource.setTestWhileIdle(properties.getTestWhileIdle());
        }
        if (properties.getTestOnReturn() != null) {
            dataSource.setTestOnReturn(properties.getTestOnReturn());
        }
        if (properties.getConnectionProperties() != null) {
            dataSource.setConnectionProperties(properties.getConnectionProperties());
        }
        if (properties.getFilters() != null) {
            try {
                dataSource.setFilters(properties.getFilters());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (properties.getMinEvictableIdleTimeMillis() > 0) {
            dataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
        }
        if (properties.getTimeBetweenEvictionRunsMillis() > 0) {
            dataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
        }
        try {
            dataSource.init();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dataSource;
    }

}
