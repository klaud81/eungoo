package com.eungoo.app.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.eungoo.app.controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations(
				"/resources/");
	}

	@Override
	public void configureContentNegotiation(
			ContentNegotiationConfigurer configurer) {
		configurer.favorPathExtension(true).useJaf(false)
				.ignoreAcceptHeader(true)
				.mediaType("html", MediaType.TEXT_HTML)
				.mediaType("json", MediaType.APPLICATION_JSON)
				.defaultContentType(MediaType.TEXT_HTML);
	}

	@Bean
	public ViewResolver contentNegotiatingViewResolver(
			ContentNegotiationManager manager) {
		List<ViewResolver> resolvers = new ArrayList<ViewResolver>();

		InternalResourceViewResolver jspResolver = new InternalResourceViewResolver();
		jspResolver.setPrefix("/WEB-INF/views/");
		jspResolver.setSuffix(".jsp");
		jspResolver.setViewClass(JstlView.class);
		resolvers.add(jspResolver);

		JsonViewResolver jsonResolver = new JsonViewResolver();
		resolvers.add(jsonResolver);

		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
		resolver.setViewResolvers(resolvers);
		resolver.setContentNegotiationManager(manager);
		return resolver;
	}

	public class JsonViewResolver implements ViewResolver {
		public View resolveViewName(String viewName, Locale locale)
				throws Exception {
			MappingJackson2JsonView view = new MappingJackson2JsonView();
			view.setPrettyPrint(true);
			return view;
		}
	}
}
