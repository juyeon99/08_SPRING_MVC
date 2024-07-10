package com.juyeon.interceptor;

import org.springframework.stereotype.Service;

@Service
public class MenuService {
    public void method(){
        System.out.println("MenuService 호출됨");
    }
}
