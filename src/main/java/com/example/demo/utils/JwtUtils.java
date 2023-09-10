package com.example.demo.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtils {
    private static long expire = 604800;

    private static String secret = "abc";

    public static String generateToken(int id){
        Date now = new Date();
        Date expiration = new Date(now.getTime()+1000*expire);
        return Jwts.builder()
                .setHeaderParam("type","JWT")
                .setSubject(String.valueOf(id))
                .setIssuedAt(now)
                .setExpiration(expiration)
                .signWith(SignatureAlgorithm.HS512,secret)
                .compact();
    }

    public static Claims getClaimsByToken(String token){
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }
}
