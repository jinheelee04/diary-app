package com.diary.d4jh.web;


import com.diary.d4jh.service.DiaryService;
import com.diary.d4jh.web.dto.SeesawResponse;
import com.diary.d4jh.web.dto.request.DiaryCreateRequestDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/diary")
@Api(value="DiaryApiController v1")
public class DiaryApiController {


    private final DiaryService diaryService;

    /**
     * 신규 다이어리 생성
     * @param request HttpServletRequest
     * @param diaryNm 다이어리명
     * @return
     */
    @ApiOperation(
            value="다이어리 생성",
            notes="신규 다이어리 생성 요청  - diaryNm")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "projNm", value = "프로젝트명", required = true, dataType = "string")
//    })
    @PostMapping("/create")
    public SeesawResponse<?> createDiary(@RequestBody DiaryCreateRequestDto reqDto, Principal principal) {

        int userId= Integer.parseInt(principal.getName());

       diaryService.create(userId,reqDto);

       return SeesawResponse.ok();
    }

}
