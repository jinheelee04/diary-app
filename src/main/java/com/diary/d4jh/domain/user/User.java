package com.diary.d4jh.domain.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {

    private Long id;

    private String name;

    private String email;

    private String pwd;

    private Date joinDt;
}
