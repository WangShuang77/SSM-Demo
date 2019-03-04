package com.luckyxs.config;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;
import javax.sql.DataSource;
import java.util.Properties;
/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Date 2019/03/04
 * @Description 默认扫描dao包下的路径需要修改
 */
public class MyBatisConfiguration {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		//通过工厂bean创建对象
		SqlSessionFactoryBean factoryBean=new SqlSessionFactoryBean();
		//设置数据源
		factoryBean.setDataSource(dataSource);
		//设置别名包扫描
		//factoryBean.setTypeAliasesPackage("com.san.dao");
		//设置全局配置 :驼峰映射
		Properties sqlProps=new Properties();
		sqlProps.setProperty("mapUnderscoreToCamelCase", "true");
		factoryBean.setConfigurationProperties(sqlProps);
		//设置插件
		//分页插件
		PageHelper pageHelper = new PageHelper();
		Properties pageProps = new Properties();
		pageProps.setProperty("dialect", "mysql");
		pageProps.setProperty("rowBoundsWithCount", "true");
		pageHelper.setProperties(pageProps);
		factoryBean.setPlugins(new Interceptor[]{});
		//通过工厂bean获得SqlSessionFactory对象
		return factoryBean.getObject();
	}
	@Bean
	public MapperScannerConfigurer mapperScanner(){
		MapperScannerConfigurer configurer = new MapperScannerConfigurer();
		//需要修改
		configurer.setBasePackage("com.luckyxs.dao");
		return configurer;
	}
}
