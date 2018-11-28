package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String h = passwordEncoder.encode("123");
        System.out.println(h.length());
        System.out.println(h);
        String p ="$2a$10$SLMdY7OBIaDJ73ItElqTZOm6aVeT6ATXXUYKidNK";
        BCrypt bCrypt = new BCrypt();

        System.out.println(p);
        System.out.println(p.length());
        //        System.out.println(passwordEncoder.);
    }
}

