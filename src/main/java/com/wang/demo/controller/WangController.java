package com.wang.demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/wang")
@Tag(name = "测试类")
public class WangController {


    @Operation(summary = "测试聊天")
    @GetMapping(value = "/chat")
    private String chat(String msg) {
        System.out.printf("msg:" + msg);
        return "OK";
    }


}
