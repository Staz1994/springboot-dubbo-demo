package com.wynstaz.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wynstaz.core.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

    @Reference
    private TestService testService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return testService.success();
    }
    @RequestMapping("/testException")
    @ResponseBody
    public String testException(){
        return testService.testException();
    }

}
