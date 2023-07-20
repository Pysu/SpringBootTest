package com.example.springboottest.config;

import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import javax.sql.DataSource;

@Configuration
public class DataSourceProtest {
    @Autowired
    private DynamicDataSourceByMybatisInterceptor dynamicDataSourceByMybatisInterceptor;

    @Primary
    @Bean(name = "protest")
    @ConfigurationProperties(prefix = "spring.datasource.protest")
    public DataSource getProtestDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "sqlSessionFactoryProtest")
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("protest") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setPlugins(new Interceptor[] {dynamicDataSourceByMybatisInterceptor});
        return sqlSessionFactoryBean.getObject();
    }
}
