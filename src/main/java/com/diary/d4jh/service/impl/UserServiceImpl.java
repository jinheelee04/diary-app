package com.diary.d4jh.service.impl;

import com.diary.d4jh.domain.user.User;
import com.diary.d4jh.mapper.UserMapper;
import com.diary.d4jh.service.UserService;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    @Transactional
    public void save(User user) {
        userMapper.insertUser(user);
    }

}
