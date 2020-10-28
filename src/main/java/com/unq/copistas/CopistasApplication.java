package com.unq.copistas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CopistasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CopistasApplication.class, args);
	}
	/*
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();


	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
					.addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
					.authorizeRequests()
					.antMatchers(HttpMethod.POST, "/user").permitAll()
					.anyRequest().authenticated();
		}*/
}

