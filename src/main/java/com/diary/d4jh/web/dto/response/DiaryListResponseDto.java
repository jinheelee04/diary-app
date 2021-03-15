package com.diary.d4jh.web.dto.response;

import com.diary.d4jh.domain.user.Diary;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Getter
public class DiaryListResponseDto {
    private int diaryId;

    private String diaryNm;

    private String prvtYn;

    private Date mdfyDt;

    private Date crtDt;


    public DiaryListResponseDto(Diary diary){
        this.diaryId = diary.getDiaryId();
        this.diaryNm = diary.getDiaryNm();
        this.prvtYn = diary.getPrvtYn();
        this.mdfyDt = diary.getMdfyDt();
        this.crtDt = diary.getCrtDt();
    }
}
