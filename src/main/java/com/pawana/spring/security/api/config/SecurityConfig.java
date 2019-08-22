package com.pawana.spring.security.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
// as we are using java based configuration for security,extend it from WebSecurityConfigurerAdappter
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// here over ride configure method so that we can disable csrf token
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();

	}

	@Bean
	public BCryptPasswordEncoder encoderPWD() {
		return new BCryptPasswordEncoder();

	}

}
