package com.stma.medical;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled=true) // active la protection des méthodes
public class SecurConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	public void configGlobal(AuthenticationManagerBuilder authMB) throws Exception {
		authMB.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN");
		authMB.inMemoryAuthentication().withUser("manager").password("1234").roles("MANAGER");
		authMB.inMemoryAuthentication().withUser("user").password("1234").roles("USER");
		authMB.inMemoryAuthentication().withUser("host").password("1234").roles("HOST");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			//.csrf().disable() // optionnel permet d'enlever  le champs hidden ajouté, par défaut,  aux fomulaire
			.authorizeRequests()
				.anyRequest()
					.authenticated()
			.and()
				.formLogin()
					.loginPage("/login")
						.permitAll()
			.defaultSuccessUrl("/index.html");
		
	}
}
