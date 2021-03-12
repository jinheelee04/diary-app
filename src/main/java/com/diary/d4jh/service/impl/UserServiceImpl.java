package com.diary.d4jh.service.impl;

import com.diary.d4jh.domain.user.User;
import com.diary.d4jh.mapper.UserMapper;
import com.diary.d4jh.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public void save(User user) {
        System.out.println("service="+user);
        userMapper.insertUser(user);
    }

//    @Override
//    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
//        User user = userMapper.findByEmail(email);
//
//        return new UserDetails(user.getEmail(), user.getPwd());
//    }
}
