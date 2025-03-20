package com.apple.shop; //이 파일의 경로 써줘야 다른 파일에서 import 할 수 있음

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final itemRepository itemRepository; //repository 등록


    @GetMapping("/list")
    String list( Model model){
        var result = itemRepository.findAll();
        System.out.println(result);

        model.addAttribute("name", "비싼바지");
        return "list";
    }

}
