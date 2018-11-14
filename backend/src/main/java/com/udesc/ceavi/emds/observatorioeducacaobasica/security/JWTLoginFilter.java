package com.udesc.ceavi.emds.observatorioeducacaobasica.security;

import com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations.LoginService;
import io.jsonwebtoken.Jwts;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTLoginFilter extends BasicAuthenticationFilter {
    private final LoginService loginService;

    public JWTLoginFilter(AuthenticationManager authenticationManager, LoginService loginService) {
        super(authenticationManager);
        this.loginService = loginService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String header = request.getHeader(SecurityConstants.HEADER_STRING);
        if (header != null || !header.startsWith(SecurityConstants.TOKEN_PREFIX)) {
            chain.doFilter(request, response);
            return;
        }
        UsernamePasswordAuthenticationToken authenticationToken = getAuthenticationToken(request);
        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        chain.doFilter(request, response);
    }

    private UsernamePasswordAuthenticationToken getAuthenticationToken(HttpServletRequest request) {
        String token = request.getHeader(SecurityConstants.HEADER_STRING);
        if (token == null) {
            return null;
        }
        String cnpj = Jwts.parser().setSigningKey(SecurityConstants.SECRET).parseClaimsJws(token.replace(SecurityConstants.TOKEN_PREFIX, "")).getBody().getSubject();
        UserDetails userDetails = loginService.loadUserByUsername(cnpj);
        return cnpj != null ? new UsernamePasswordAuthenticationToken(cnpj, null, userDetails.getAuthorities()) : null;
    }
}
