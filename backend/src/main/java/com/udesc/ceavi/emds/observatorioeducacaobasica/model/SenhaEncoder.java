package com.udesc.ceavi.emds.observatorioeducacaobasica.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        System.out.println(passwordEncoder.encode("123"));
    }
}
