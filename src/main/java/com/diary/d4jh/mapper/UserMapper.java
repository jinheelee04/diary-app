package com.diary.d4jh.mapper;

import com.diary.d4jh.domain.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface UserMapper {
    public int insertUser(User user);

    public User findByEmail(String email);
}
