package com.diary.d4jh.web.dto.request;

import com.diary.d4jh.domain.user.Diary;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class DiaryCreateRequestDto {
    private String diaryNm;
    private String prvtYn;

    @Builder
    public DiaryCreateRequestDto(String diaryNm, String prvtYn){
        this.diaryNm = diaryNm;
        this.prvtYn = prvtYn;
    }
    public Diary toEntity(){
        return Diary.builder()
                    .diaryNm(diaryNm)
                    .prvtYn(prvtYn)
                    .build();
    }
}
