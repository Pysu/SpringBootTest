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
import javax.sql.DataSource;

@Configuration
public class DataSourceProslave {
    @Autowired
    private DynamicDataSourceByMybatisInterceptor dynamicDataSourceByMybatisInterceptor;

    @Bean(name = "proslave")
    @ConfigurationProperties(prefix = "spring.datasource.proslave")
    public DataSource getProslaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "sqlSessionFactoryProslave")
    public SqlSessionFactory getSqlSessionFactory(@Qualifier("proslave") DataSource dataSource) throws Exception {
        MybatisSqlSessionFactoryBean sqlSessionFactoryBean = new MybatisSqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setPlugins(new Interceptor[] {dynamicDataSourceByMybatisInterceptor});
        return sqlSessionFactoryBean.getObject();
    }
}
