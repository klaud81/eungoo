package com.eungoo.app.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.HiddenHttpMethodFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebXmlConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();

		context.register(SpringConfig.class);

		servletContext.addListener(new ContextLoaderListener(context));

		AnnotationConfigWebApplicationContext dispatcherServletContext = new AnnotationConfigWebApplicationContext();

		dispatcherServletContext.register(WebConfig.class);

		ServletRegistration.Dynamic dispatcher = servletContext.addServlet(
				"appServlet", new DispatcherServlet(dispatcherServletContext));

		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/app/*");

		servletContext.addFilter("Spring OpenEntityManagerInViewFilter",
				OpenEntityManagerInViewFilter.class).addMappingForUrlPatterns(
				null, false, "/app/*");

		servletContext.addFilter("HttpMethodFilter",
				HiddenHttpMethodFilter.class).addMappingForUrlPatterns(null,
				false, "/app/*");

		FilterRegistration charEncodingFilterReg = servletContext.addFilter(
				"CharacterEncodingFilter", CharacterEncodingFilter.class);

		charEncodingFilterReg.setInitParameter("encoding", "UTF-8");
		charEncodingFilterReg.setInitParameter("forceEncoding", "true");
		charEncodingFilterReg.addMappingForUrlPatterns(null, false, "/app/*");

	}
}
