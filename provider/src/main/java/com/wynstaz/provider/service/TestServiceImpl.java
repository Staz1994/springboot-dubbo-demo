package com.wynstaz.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wynstaz.core.MyException;
import com.wynstaz.core.TestService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Service
@Component
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl implements TestService {

    @Override
    public String success(){
        System.out.println("success");
        return "success";
    }

    @Override
    public String testException() {
        if (true) {
            throw new MyException("testException");
        }
        return "testException";
    }
}
