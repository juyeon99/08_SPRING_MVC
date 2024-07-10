package com.juyeon.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
public class InterceptorController {
    @GetMapping("stopwatch")
    public String handlerMethod() throws InterruptedException {
        System.out.println("핸들러 메소드 호출");

        // 1초동안 기다렸다가 다음 코드 실행
        Thread.sleep(1000);
        return "result";
    }
}
