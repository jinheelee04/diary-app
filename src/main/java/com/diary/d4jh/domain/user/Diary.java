package com.diary.d4jh.domain.user;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Diary {

    private int diaryId;

    private int userId;

    private String diaryNm;

    private String prvtYn;

    private Date mdfyDt;

    private Date crtDt;

    @Builder
    public Diary(String diaryNm, String prvtYn){
        this.diaryNm = diaryNm;
        this.prvtYn = prvtYn;
    }
}
