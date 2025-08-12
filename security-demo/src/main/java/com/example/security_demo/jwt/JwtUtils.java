package com.example.security_demo.jwt;

import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtils {
    private static final Logger logger = LoggerFactory.getLogger(JwtUtils.class);

    @Value("${spring.app.jwtSecret}")
    private String jwtSecret;

    @Value("${spring.app.jwtExpirationMs}")
    private String jwtExpirationMs;

    public String getFromJwtHeader(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        logger.debug("Authorization header: {}", bearerToken);
        if (bearerToken != null && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);//Remove Bearer prefix
        }
        return null;
    }

    public String generateTokenFromUsername(UserDetails userDetails) {
        String username = userDetails.getUsername();
        return Jwts.builder()
                //settings
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date((new Date()).getTime() + jwtExpirationMs))
                .signWith(key())
                .compact();
    }

    public String getUsernameFromJwtToken(String token) {
        return Jwts
                .parser() // creates a new Jwt parser which is used to decode and validate Jwt
                .verifyWith((SecretKey) key()) // specifies the secret key used to verify the jWT signature
                //which is then cast to Secret key to ensure the token hasnt been tampered with
                .build()//Returns a parser object ready to use
                .parseSignedClaims(token)//parses the JWT string and verifies its signature
                //returns an object containing token header and payload : Jwt<Headers,Claims>
                .getPayload()//retrieves the claims
                .getSubject();//returns the sub Claim which represents Username/id
    }

    //setting up the key for signing Jwt Token
    private Key key() {
        return Keys.hmacShaKeyFor(Decoders.BASE64.decode(jwtSecret));
    }

    public boolean validateJwtToken(String authToken) {
        try {
            System.out.println("Validate");
            Jwts.parser().verifyWith((SecretKey) key()).build().parseSignedClaims(authToken);
            return true;
        } catch (MalformedJwtException e) {
            logger.error("Invalid Jwt token : {}", e.getMessage());
        } catch (ExpiredJwtException e) {
            logger.error("Jwt token is expired {}", e.getMessage());
        } catch (UnsupportedJwtException e) {
            logger.error("Jwt token is not supported {}", e.getMessage());
        } catch (IllegalArgumentException e) {
            logger.error("Jwt claims string is empty {}", e.getMessage());
        }
        return false;
    }


}
