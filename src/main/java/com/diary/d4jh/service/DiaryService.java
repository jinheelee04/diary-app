package com.diary.d4jh.service;

import com.diary.d4jh.web.dto.request.DiaryCreateRequestDto;
import com.diary.d4jh.web.dto.response.DiaryListResponseDto;

import java.util.List;

public interface DiaryService {

    public int create(int userId, DiaryCreateRequestDto reqDto);

    public List<DiaryListResponseDto> findAllUserDiary(int userId);

}
