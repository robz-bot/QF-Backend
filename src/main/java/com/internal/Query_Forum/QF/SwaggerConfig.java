/**
 * 
 */
package com.internal.Query_Forum.QF;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author ROBIN RAJESH
 *
 */
@org.springframework.context.annotation.Configuration
@EnableSwagger2
public class SwaggerConfig {

	private final String releaseVersion = "1.0.0";
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();

	@Bean
	public Docket querForumApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build().apiInfo(metaData());
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	/**
	 * @return
	 */
	private ApiInfo metaData() {
		return new ApiInfoBuilder()
				.title("Query Forum - Spring Boot REST API - " + releaseVersion + " - " + dtf.format(now))
				.version(releaseVersion)
				.description(
						"\"A query forum is a place for discussion in which allows users to share their opinions and suggestions.\"")
				.contact(new Contact("Robin Rajesh", "", "")).license("Apache License 2.0").build();
	}

}