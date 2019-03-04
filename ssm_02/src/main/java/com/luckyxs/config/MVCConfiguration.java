package com.luckyxs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Date 2019/03/04
 * @Description 默认扫描包下的路径需要修改
*/
@ComponentScan(basePackages={"com.luckyxs.controller"})
@EnableWebMvc
public class MVCConfiguration extends WebMvcConfigurerAdapter{

	
	/**
	 * 添加视图解析器
	 */
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("/");
		view.setSuffix(".jsp");
		return view;
	}


	@Bean
	public CommonsMultipartResolver multipartResolver(){
		//spring提供基于commons-fileupload 文件上传解析器实现类
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		//文件上传最大值：单位字节
		multipartResolver.setMaxUploadSize(5242880);	//5M
		//服务器端内存
		multipartResolver.setMaxInMemorySize(4096);
		//默认编码：需与表单页面编码保持一致
		multipartResolver.setDefaultEncoding("UTF-8");
		
		return multipartResolver;
	}

}
