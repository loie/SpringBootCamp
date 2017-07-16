package de.tutorials.springbbot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.web.builders.WebSecurity
import org.springframework.web.configration.WebSecurityConfigurerAdapter
import org.springframework.web.configration.EnableWebSecurity

@Configuration
@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter {
    @Override
    fun configure(HttpSecurity http) {
        http
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll()
    }

    @Autowired
    fun configureGlobal(AuthenticationManagerBuilder auth) {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
    }
}