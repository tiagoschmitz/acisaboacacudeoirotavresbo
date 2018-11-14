package com.udesc.ceavi.emds.observatorioeducacaobasica.security;

import com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private LoginService loginService;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .cors()
                .and()
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, SecurityConstants.SIGN_UP_URL)
                .permitAll()
                .antMatchers("/*/admin/**").hasRole("ADMIN")
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                .addFilter(new JWTLoginFilter(authenticationManager(), loginService));
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(loginService).passwordEncoder(new BCryptPasswordEncoder());
//    }

//    private static String REALM = "MY_TEST_REALM";

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//
//        auth.inMemoryAuthentication().withUser(User.withDefaultPasswordEncoder()
//                .username("user")
//                .password("password")
//                .roles("USER")
//                .build());
//    }

//    @Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("bill").password("abc123").roles("ADMIN").and()
//                .withUser("tom").password("abc123").roles("USER");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().
//                csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/controller/**").hasRole("ADMIN")
//                .and().httpBasic().realmName(REALM).authenticationEntryPoint(getBasicAuthEntryPoint())
//                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);//We don't need sessions to be created.
//    }
//
//    @Bean
//    CorsConfigurationSource corsConfigurationSource() {
//        UrlBasedCorsConfigurationSource source = new
//                UrlBasedCorsConfigurationSource();
//        CorsConfiguration CORSConf = new CorsConfiguration();
//        CORSConf.applyPermitDefaultValues();
//        CORSConf.addAllowedMethod(HttpMethod.DELETE);
//        CORSConf.addAllowedMethod(HttpMethod.PUT);
//
//        source.registerCorsConfiguration("/**", CORSConf);
//
//        return source;
//    }
//
//    @Bean
//    public CustomBasicAuthenticationEntryPoint getBasicAuthEntryPoint() {
//        return new CustomBasicAuthenticationEntryPoint();
//    }
//
//
//    /* To allow Pre-flight [OPTIONS] request from browser */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers(HttpMethod.OPTIONS, "/**");
//    }
}
