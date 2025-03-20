package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //클래스에 붙이면
public class BasicController {
    //여기서 서버기능 제작가능
    @GetMapping("/") //누가 메인페이지 접속하면 (1)
    @ResponseBody
    String hello(){
        return "안녕하세요"; //이거 보내주세요 (1-2)
    }

    @GetMapping("/about")
    @ResponseBody
    String about(){
        return "피싱사이트에요";
    }

    //문자말고 HTML 보내려면?
    @GetMapping("/html")
    //@ResponseBody
    String html(){
        return "index.html"; //다른 곳에서 html 파일 만들수 있음 <resources> - <index.html>
    }

}
