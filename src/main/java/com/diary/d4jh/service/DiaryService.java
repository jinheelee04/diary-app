package com.diary.d4jh.service;


import com.diary.d4jh.web.dto.request.DiaryCreateRequestDto;

public interface DiaryService {

    public int create(int userId, DiaryCreateRequestDto reqDto);
}
