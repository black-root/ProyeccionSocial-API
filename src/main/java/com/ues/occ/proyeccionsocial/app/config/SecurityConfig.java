package com.ues.occ.proyeccionsocial.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.ues.occ.proyeccionsocial.app.services.UsuarioService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	@Autowired
	private UsuarioService userDetailsService;
	
	@Autowired
	private BCryptPasswordEncoder bcrypt;
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
		
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(bcrypt);
	}
	
	@Override protected void configure(HttpSecurity http) throws Exception {
		 
		  http.
		  	authorizeRequests().
		  	anyRequest().
		  	authenticated().and().
		  	httpBasic().and()
	            .formLogin().permitAll()
	            .and()
	            .logout().permitAll()
	            .and()
	            .csrf().disable();
	/*	  	
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET,"/api").permitAll()
                .antMatchers(HttpMethod.POST,"/api").hasRole("MODERATOR")
                .antMatchers(HttpMethod.DELETE,"/api").hasRole("ADMIN")
                .anyRequest().hasRole("ADMIN")
                .and()
                .httpBasic()
                .and()
                .formLogin().permitAll()
                .and()
                .logout().permitAll()
                .and()
                .csrf().disable();*/
		
	}
	
	   @Bean
	    CorsConfigurationSource corsConfigurationSource() {
	        CorsConfiguration configuration = new CorsConfiguration();
	        configuration.setAllowedOrigins(Arrays.asList("*"));
	        configuration.setAllowedMethods(Arrays.asList("*"));
	        configuration.setAllowedHeaders(Arrays.asList("*"));
	        configuration.setAllowCredentials(true);
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", configuration);
	        return source;
	    }
	  
	  /*

	  @Override protected void configure(HttpSecurity http) throws Exception {
	 
	  http.cors().and().csrf().disable().authorizeRequests().antMatchers(
	  "/api/proyeccion-social/**") .hasAnyRole("admin",
	 "user").and().formLogin();
	   
	 }
	 
		 
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("ronald").password(passwordEncoder().encode("1234")).roles("user");
		auth.inMemoryAuthentication().withUser("pepe").password(passwordEncoder().encode("1234")).roles("admin", "user");
	}
	
	
*/
	
}
