package com.example.security_demo;

import com.example.security_demo.jwt.JwtUtils;
import com.example.security_demo.jwt.LoginRequest;
import com.example.security_demo.jwt.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class GreetingsController {

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String userEndpoint() {
        return "hello user!!!";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/admin")
    public String adminEndpoint() {
        return "hello admin!!!";
    }

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        Authentication authentication;
        try {
            authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        } catch (AuthenticationException e) {
            Map<String, Object> map = new HashMap<>();
            map.put("message", "Bad Credentials");
            map.put("status", false);
            return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
        }

        //if the try block is executed the user is authenticated and security context is set

        SecurityContextHolder.getContext().setAuthentication(authentication);

        //now get the username from the authentication.getPrinciple and cast it to the UserDetails
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        //now generate the jwt Token using the username
        String jwtToken = jwtUtils.generateTokenFromUsername(userDetails);

        //get the roles as well for the loginResponse
        List<String> roles = userDetails.getAuthorities().stream()
                .map(item -> item.getAuthority())
                .collect(Collectors.toList());

        LoginResponse loginResponse = new LoginResponse(jwtToken, userDetails.getUsername(), roles);

        return ResponseEntity.ok(loginResponse);

    }
}
