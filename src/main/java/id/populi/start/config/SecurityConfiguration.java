package id.populi.start.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import id.populi.start.service.MyUserDetailsService;


@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyUserDetailsService userDetailsService;
//
//	 @Override
//	 protected void configure(HttpSecurity httpSecurity) throws Exception {
//	 httpSecurity.authorizeRequests().antMatchers("/h2/**").permitAll();
//	
//	 httpSecurity.csrf().disable();
//	 httpSecurity.headers().frameOptions().disable();
//	 }
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(authenticationProvider());
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(encoder());
		return authProvider;
	}

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder(11);
	}

	// @Bean
	// public UserDetailsService userDetailsService() throws Exception {
	// InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
	// manager.createUser(User.withUsername("user").password("password").roles("USER").build());
	// return manager;
	// }

}
