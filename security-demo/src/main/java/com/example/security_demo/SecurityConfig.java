package com.example.security_demo;

import com.example.security_demo.jwt.AuthEntryPointJwt;
import com.example.security_demo.jwt.AuthTokenFilter;
import com.example.security_demo.jwt.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Autowired
    DataSource dataSource;

    @Autowired
    private AuthEntryPointJwt unauthorizedHandler;

    @Autowired
    private JwtUtils jwtUtils;

    @Bean
    public AuthTokenFilter authenticationJwtTokenFilter() {
        return new AuthTokenFilter(jwtUtils);
    }


    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(requests -> requests.requestMatchers("/h2-console/**").permitAll()
                .requestMatchers("  /signin").permitAll()
                .anyRequest().authenticated());
        ///done for h2-console///
        http.csrf(csrf -> csrf.disable());
        ///allows the frame for h2-console///
        http.headers(header ->
                header.frameOptions(frameOptions -> frameOptions.sameOrigin()));
        ///session policy STATELESS///
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        ///custom handler///
        http.exceptionHandling(exception -> exception.authenticationEntryPoint(unauthorizedHandler));
        ///added custom Auth token filer before the UsernamePasswordAuthenticationFilter///
        http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
        //http.formLogin(withDefaults());
        http.httpBasic(withDefaults());

        return http.build();
    }

    //in memory user details manager
//    @Bean
//    public UserDetailsService userDetailsService() {
//        UserDetails user1 = User.withUsername("user")
//                .password(encoder().encode("user123"))
//                .roles("USER")
//                .build();
//
//        UserDetails admin = User.withUsername("admin")
//                .password(encoder().encode("admin123"))
//                .roles("ADMIN")
//                .build();
//
//        JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);
//        userDetailsManager.createUser(user1);
//        userDetailsManager.createUser(admin);
//
//        return userDetailsManager;
//        //return  new InMemoryUserDetailsManager( user1, admin);
//    }

    @Bean
    public UserDetailsService userDetailsService(DataSource source) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public CommandLineRunner initData(UserDetailsService userDetailsService) {
        return args -> {
            JdbcUserDetailsManager manager = (JdbcUserDetailsManager) userDetailsService;
            UserDetails user1 = User.withUsername("user")
                    .password(encoder().encode("user123"))
                    .roles("USER")
                    .build();

            UserDetails admin = User.withUsername("admin")
                    .password(encoder().encode("admin123"))
                    .roles("ADMIN")
                    .build();

            JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);
            userDetailsManager.createUser(user1);
            userDetailsManager.createUser(admin);
        };

    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    /// exposing the authentication manager as the Bean which is being used by Spring security for authentication
    @Bean
    public AuthenticationManager authenticationManager (AuthenticationConfiguration builder) throws Exception {
        return  builder.getAuthenticationManager();
    }
}
