package co.edu.usco.pw.springboot_crud01.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
	    .passwordEncoder(NoOpPasswordEncoder.getInstance())
	    .withUser("amaydy")
	        .password("123")
	        .roles("ADMINISTRADOR", "USUARIO")
	    .and()
	    .withUser("usuario")
	        .password("123")
	        .roles("USUARIO");
	}

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/info").hasRole("USUARIO")
		.antMatchers("/").access("hasAnyRole('ADMINISTRADOR','USUARIO')")
		.anyRequest().authenticated()
		.and()
		.formLogin();


		http.csrf().disable();
		http.headers().frameOptions().disable();
        return http.build();
	}
}