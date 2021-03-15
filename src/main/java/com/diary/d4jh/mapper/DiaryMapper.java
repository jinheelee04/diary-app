package com.diary.d4jh.mapper;

import com.diary.d4jh.domain.user.Diary;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DiaryMapper {

    public int createDiary(Diary toEntity);
}
