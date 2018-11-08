package com.taotao.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.taotao.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QureyNowController {

    @Reference
    TestService testService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public String qrNow(){
        System.out.println("test");
        System.out.println(testService);
        return testService.qureyNow();
    }
}
