package com.juyeon.handlermethod;

import lombok.*;

/*
* DTO를 커맨드 객체로 이용하기 위해서는 form의 name과 값이 일치하게 만들어야한다.
*/
@NoArgsConstructor  // 커맨드 객체는 def-constructor를 이용해서 인스턴스를 만들기 때문에 반드시 필요
@Setter // 요청 파라미터 name과 일치하는 필드의 setter를 이용하기 때문에 naming에 맞는 setter 메소드가 작성되어야 한다.
@Getter
@ToString
public class MenuDTO {
    private String name;
    private int price;
    private int categoryCode;
    private String orderableStatus;
}
