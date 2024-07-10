package com.juyeon.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OtherController {
    @GetMapping("other-controller-null")
    public String otherNullPointerExceptionTest(){
        String str = null;
        System.out.println(str.charAt(0));

        return "/";
    }

    @GetMapping("other-controller-user")
    public String otherUserExceptionTest() throws MemberRegisterException {
        boolean check = true;
        if (check){
            throw new MemberRegisterException("회원 신청 거절");
        }

        return "/";
    }

    @GetMapping("other-controller-array")
    public String otherArrayExceptionTest(){
        double[] arr = new double[1];
        System.out.println(arr[3]);

        return "/";
    }
}
