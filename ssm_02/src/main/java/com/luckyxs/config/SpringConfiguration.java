package com.luckyxs.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Date 2019/03/04
 * @Description 默认扫描service包下的路径需要修改
 */
@ComponentScan(basePackages={"com.luckyxs.service"})
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class SpringConfiguration {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer psp(){
		return	new PropertySourcesPlaceholderConfigurer();
	}
	
	@Value("${jdbc.driver}")
	private String driver;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Bean
	public DataSource ds(){
		DruidDataSource ds = new DruidDataSource();
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		return ds;
	}
	
	@Bean
	public DataSourceTransactionManager tm(DataSource ds){
		return new DataSourceTransactionManager(ds);
	}
}