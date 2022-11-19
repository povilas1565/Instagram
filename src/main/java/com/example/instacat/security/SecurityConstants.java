package com.example.instacat.security;

public class SecurityConstants {

    public static final String SIGN_UP_URLS = "api/auth/**";
    public static final String SECRET_KEY = "cat";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String CONTENT_TYPE = "application/json";
    public static final long EXPIRATION_TIME = 18000_000; // 5 часов
}
