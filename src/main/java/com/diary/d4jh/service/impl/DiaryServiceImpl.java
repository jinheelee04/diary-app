package com.diary.d4jh.service.impl;


import com.diary.d4jh.domain.user.Diary;
import com.diary.d4jh.mapper.DiaryMapper;
import com.diary.d4jh.service.DiaryService;
import com.diary.d4jh.web.dto.request.DiaryCreateRequestDto;
import com.diary.d4jh.web.dto.response.DiaryListResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class DiaryServiceImpl implements DiaryService {

    private final DiaryMapper diaryMapper;



    @Transactional
    public int create(int userId, DiaryCreateRequestDto reqDto) {
        Diary diary = reqDto.toEntity();
        diary.setUserId(userId);

        return diaryMapper.createDiary(diary);
    }

    @Transactional(readOnly = true)
    public List<DiaryListResponseDto> findAllUserDiary(int userId) {
        return diaryMapper.findAllDiary(userId).stream()
                .map(DiaryListResponseDto::new)
                .collect(Collectors.toList());
    }

}
