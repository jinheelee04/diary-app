package com.diary.d4jh.security;

import com.diary.d4jh.domain.user.User;
import com.diary.d4jh.mapper.UserMapper;
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
        Optional<User> user =  userMapper.findByEmail(email);

        return user.map(PrincipalDetails::new) // 입력받은 username에 해당하는 사용자가 있다면, PrincipalDetails 객체를 생성한다.
                .orElse(null); // 없다면 null을 반환한다. (인증 실패)

    }
}
