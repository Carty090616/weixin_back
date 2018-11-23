package com.weixin.config;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@MapperScan("com.weixin.mapper*")
@EnableTransactionManagement(proxyTargetClass = true)
public class MyBatisConfig
{

    @Autowired(required = false)
    private Interceptor[] interceptors;
    @Autowired
    private Environment evn;

    /**
     * 根据数据源创建SqlSessionFactory
     */
    @Bean(name = "sqlSessionFactory")
    public MybatisSqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) throws Exception
    {
        MybatisSqlSessionFactoryBean mybatisPlus = new MybatisSqlSessionFactoryBean();
        mybatisPlus.setDataSource(dataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        mybatisPlus.setMapperLocations(resolver.getResources(evn.getProperty("mybatis.mapperLocations")));
        mybatisPlus.setTypeAliasesPackage(evn.getProperty("mybatis.typeAliasesPackage"));
        mybatisPlus.setPlugins(this.interceptors);
        GlobalConfiguration config = new GlobalConfiguration();
        config.setDbColumnUnderline(true);
        config.setSqlInjector(new AutoSqlInjector());
        mybatisPlus.setGlobalConfig(config);
        return mybatisPlus;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource)
    {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public PaginationInterceptor paginationInterceptor()
    {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

}
