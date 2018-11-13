package com.test.ztree.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.ztree.util.StringUtils;

@RestController
public class TestController {

    @RequestMapping("/getString")
    public String getString() {
        return StringUtils.getString();
    }
}
