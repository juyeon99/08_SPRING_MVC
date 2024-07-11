package com.juyeon.fileupload;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/*")
@Slf4j
public class MainController {
    @GetMapping(value = {"/","/main"})
    public String defaultLocation(){
        String firstName = "jenny";
        String lastName = "hong";

//        System.out.println("메인 페이지로 이동");
        log.info("로그: 성: {}, 이름: {}", lastName, firstName);
        return "main";
    }
}
