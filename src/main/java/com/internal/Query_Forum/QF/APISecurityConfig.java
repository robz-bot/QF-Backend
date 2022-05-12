///**
// * 
// */
//package com.internal.Query_Forum.QF;
//
//import org.omg.CORBA.Any;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author ROBIN RAJESH
// *
// */
//@org.springframework.context.annotation.Configuration
//@EnableWebSecurity
//public class APISecurityConfig extends WebSecurityConfigurerAdapter {
//
//	private static final String[] AUTH_LIST = { "/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs",
//			"/webjars/**", "**/v2/api-docs", "**/configuration/ui", "**/swagger-resources/**",
//			"**/configuration/security", "**/swagger-ui.html", "**/webjars/**", "/applications/***" };
//
//	@Override
//	public void configure(WebSecurity web) throws Exception {
//		web.ignoring().antMatchers("/swagger-resources/**", "/swagger-ui.html", "/v2/api-docs", "/webjars/**",
//				"**/v2/api-docs", "**/configuration/ui", "**/swagger-resources/**", "**/configuration/security",
//				"**/swagger-ui.html", "**/webjars/**", "**/actuator/***");
//	}
//
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//
//		httpSecurity.cors().disable().authorizeRequests().antMatchers("/api/auth/**").permitAll().antMatchers(AUTH_LIST)
//				.hasAuthority("USER");
////				.permitAll().anyRequest();
//	}
//
//}