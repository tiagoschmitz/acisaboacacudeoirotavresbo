package com.udesc.ceavi.emds.observatorioeducacaobasica.services.implementations;

import com.udesc.ceavi.emds.observatorioeducacaobasica.model.login.Login;
import com.udesc.ceavi.emds.observatorioeducacaobasica.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

//@Service
@Component
public class CustomUserDetailService implements UserDetailsService {
    private final LoginRepository loginRepository;

    @Autowired
    public CustomUserDetailService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Login login = Optional.ofNullable(loginRepository.findByCnpj(username)).orElseThrow(() -> new UsernameNotFoundException("CNPJ não encontrado"));
        System.out.println(login.getSenha());
        List<GrantedAuthority> authorityListAdmin = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN");
        List<GrantedAuthority> authorityListUser = AuthorityUtils.createAuthorityList("ROLE_USER");
        return new User(login.getCnpj(), login.getSenha(), login.isAdmin() ? authorityListAdmin : authorityListUser);
    }
}
