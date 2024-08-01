package com.juyeon.thymeleaf.model.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class SelectCriteria {
    private int startPage;
    private int endPage;
    private int pageNo;     // 현재 페이지 넘버
}
