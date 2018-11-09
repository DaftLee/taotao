package com.taotao.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.taotao.mapper.QureyNowMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private QureyNowMapper qureyNowMapper;

    @Override
    public String qureyNow() {

        System.out.println("testcore");
        System.out.println(qureyNowMapper);
        return qureyNowMapper.qureyNow();
    }
}
