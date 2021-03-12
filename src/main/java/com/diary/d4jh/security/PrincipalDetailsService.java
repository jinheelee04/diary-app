package com.diary.d4jh.security;

import com.diary.d4jh.domain.user.User;
import com.diary.d4jh.mapper.UserMapper;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

@Service
public class PrincipalDetailsService implements UserDetailsService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user =  userMapper.findByEmail(email);
        if(user == null) {
            return null;
        }
        return new PrincipalDetails(user);
    }
}
