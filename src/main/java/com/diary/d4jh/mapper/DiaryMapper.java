package com.diary.d4jh.mapper;

import com.diary.d4jh.domain.user.Diary;
import org.apache.ibatis.annotations.Mapper;

import java.util.Arrays;
import java.util.List;


@Mapper
public interface DiaryMapper {

    public int createDiary(Diary toEntity);

    public List<Diary> findAllDiary(int userId);
}
