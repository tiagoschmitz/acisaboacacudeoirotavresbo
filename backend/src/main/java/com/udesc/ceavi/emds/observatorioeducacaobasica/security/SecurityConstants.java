package com.udesc.ceavi.emds.observatorioeducacaobasica.security;

import java.util.concurrent.TimeUnit;

public class SecurityConstants {
    static final String SECRET = "ceavi";
    static final String TOKEN_PREFIX = "udesc";
    static final String HEADER_STRING = "Authorization";
    static final String SIGN_UP_URL = "/users/sign-up";
    static final long EXPIRATION_TIME = 120000000;

//    public static void main(String[] args) {
//        System.out.println(TimeUnit.MICROSECONDS.convert(2, TimeUnit.MINUTES));
//    }
}
