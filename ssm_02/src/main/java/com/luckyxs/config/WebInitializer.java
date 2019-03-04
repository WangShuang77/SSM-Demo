package com.luckyxs.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @Author WangShuang
 * @Email xiaoshuang77@aliyun.com
 * @Date 2019/03/04
 * @Description 默认映射访问路径“*.action”可以修改
 */
public class WebInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//创建Spring容器
		AnnotationConfigWebApplicationContext application = new AnnotationConfigWebApplicationContext();
		application.register(MVCConfiguration.class);
		application.register(SpringConfiguration.class);
		application.register(MyBatisConfiguration.class);
		//application.setServletContext(servletContext);
		//2 post乱码配置 --编码过滤器
		CharacterEncodingFilter cefilter = new CharacterEncodingFilter();
		cefilter.setEncoding("UTF-8");
		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("CharacterEncodingFilter", cefilter);
		encodingFilter.addMappingForUrlPatterns(null, true, "/*");
		//3 前端控制器
		ServletRegistration.Dynamic springMvcServlet = servletContext.addServlet("springmvc", new DispatcherServlet(application));
		springMvcServlet.addMapping("*.action");
		springMvcServlet.setLoadOnStartup(2);		//tomcat启动初始化
	}

}
