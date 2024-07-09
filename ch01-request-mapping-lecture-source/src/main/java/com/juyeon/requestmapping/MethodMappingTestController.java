package com.juyeon.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
* DispatcherServlet은 웹 요청을 받는 즉시 @Controller가 달린 컨트로러 클래스에 처리를 위임.
* 그 과정은 컨트롤러 클래스의 핸들러 메소드에 선언된 다양한 @RequestMapping 설정 내용에 따른다.
* */
@Controller
public class MethodMappingTestController {
    // 1. 메소드 방식 미지정
    @RequestMapping("/menu/register")
    public String registerMenu(Model model){
        /*
        * Model 객체에 addAttribute()를 이용해 key,value를 추가해 view에서 사용 가능
        * */
        model.addAttribute("message","신규 메뉴 등록용 핸들러 메소드 호출");

        /*
        * 반환하고자 하는 view의 경로를 포함한 이름 작성
        * resources/templates 하위부터의 경로 작성
        * */
        return "page/mappingResult";  // 보여줄 페이지
    }

    // 2. 메소드 방식 지정
    // 요청 URL을 value 속성에 요청 method를 method 속성에 설정
    @RequestMapping(value = "/menu/modify", method = RequestMethod.GET) // POST로 요청시 white label error page
    public String modifyMenu(Model model){
        model.addAttribute("message", "GET 방식의 메뉴 수정용 핸들러 메소드 호출");
        return "page/mappingResult";
    }

    @RequestMapping(value = "/menu/modify", method = RequestMethod.POST) // POST로 요청시 white label error page
    public String modifyAllMenu(Model model){
        model.addAttribute("message", "POST 방식의 메뉴 수정용 핸들러 메소드 호출");
        return "page/mappingResult";
    }

//    @RequestMapping(value = "/menu/delete", method = RequestMethod.GET) // POST로 요청시 white label error page
    @GetMapping("/menu/delete")
    public String getDeleteMenu(Model model){
        model.addAttribute("message","GET 방식의 메뉴 삭제용 핸들러 메소드 호출");
        return "page/mappingResult";
    }

    @PostMapping("/menu/delete")
    public String postDeleteMenu(Model model){
        model.addAttribute("message","POST 방식의 메뉴 삭제용 핸들러 메소드 호출");
        return "page/mappingResult";
    }
}
