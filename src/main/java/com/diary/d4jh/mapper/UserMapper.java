package com.diary.d4jh.mapper;

import com.diary.d4jh.domain.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    public void insertUser(User user);

    Optional<User> findByEmail(String email);
}