package com.juyeon.example.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* 1. /auth/login 주소로 들어오는 요청을 시큐리티에서 처리
* 2. userDetailService loadUserByUserName 메소드 실행, UserDetails 객체 반환
* 3. UserDetails 정보는 Authentication에 주입
* 4. Authentication 객체는 SecurityContext에 주입
* */
@Controller
@Slf4j
public class AuthController {
    // 로그인 페이지로 이동
    @GetMapping("/auth/login")
    public void login(){}
}
