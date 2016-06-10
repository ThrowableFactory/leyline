package net.masadora.mall.business.service;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import javaslang.collection.Stream;
import net.masadora.mall.business.domain.user.User;
import net.masadora.mall.business.domain.user.UserRepo;
import net.masadora.mall.business.infrastructure.configurations.MasadoraConstants;
import moe.src.leyline.framework.service.LeylineUserDetailsService;

/**
 * Created by bytenoob on 6/9/16.
 */
@Service
public class UserDetailsServiceImpl extends LeylineUserDetailsService<UserRepo,User> {
    @Override
    public String getPassword(final User user) {
        return user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getRole(User user) {
        Collection<? extends GrantedAuthority> authorities = null;
        switch (user.getRole()){
            case MasadoraConstants.ROLE_USER : authorities = Stream.of("ROLE_ADMIN","ROLE_USER")
                .map(SimpleGrantedAuthority::new)
                .toJavaList();break;
            case MasadoraConstants.ROLE_ADMIN :authorities = Stream.of("ROLE_USER")
                .map(SimpleGrantedAuthority::new)
                .toJavaList();
        }

        return authorities;
    }
}