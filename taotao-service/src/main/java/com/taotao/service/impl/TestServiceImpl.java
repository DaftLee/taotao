package com.taotao.service.impl;

import com.taotao.mapper.QureyNowMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private QureyNowMapper qureyNowMapper;

    @Override
    public String qureyNow() {

        System.out.println("testcore");
        return qureyNowMapper.qureyNow();
    }
}
