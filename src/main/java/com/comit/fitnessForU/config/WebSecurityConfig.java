package com.comit.fitnessForU.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.comit.fitnessForU.security.CustomPasswordEncoder;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	@Bean
 SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception{
		
		http.authorizeHttpRequests((requests) -> requests.requestMatchers("/js/**","/img/**","/join")
				                                .permitAll().anyRequest().authenticated())
		                          .formLogin(form -> form.loginPage("/login").permitAll())
		                          .logout(logout-> logout.permitAll())
		                          .csrf().disable();
		return http.build();
	}
	
	@Bean
	 PasswordEncoder passwordEncoder() {
	    //return new BCryptPasswordEncoder();
	    return new CustomPasswordEncoder();
	}
	
	
	
}
