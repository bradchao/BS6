package tw.brad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MySecurityConfig {

	@Bean
	public SecurityFilterChain myFilterChain(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests()
					.requestMatchers("/login", "/logout","/brad01").permitAll()
					.anyRequest().authenticated()
					.and()
						.formLogin()
						.loginPage("/login")
						.defaultSuccessUrl("/main", true)
						.permitAll()
					.and()
						.logout()
						.logoutUrl("/logout")
						.logoutSuccessUrl("/login?logout")
						.invalidateHttpSession(true)
						.deleteCookies("JSESSIONID")
						.permitAll();
		
		return httpSecurity.build();
	}
	
}
