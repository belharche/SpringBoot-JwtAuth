package com.security.securityDemo.security;

import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtUtil {

    @Value("${security.jwt.secret-key}")
    private String secretKey;

    @Value("${security.jwt.expiration-time}")
    private long jwtExpiration;

    private Claims extractAllClaims(String token) {
        return null;
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        return null;
    }

    public String extractUsername(String token) {
        return null;
    }

    public Date extractExpiration(String token) {
        return null;
    }

    private boolean isTokenExpired(String token) {
        return false;
    }

    public String generateToken(UserDetails userDetails) {
        return null;
    }

    private String createToken(Map<String, Object> claims, String subject) {
        return null;
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        return false;
    }

}
