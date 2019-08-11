package com.yajunsoso.service.impl;

import com.yajunsoso.dao.Student;
import com.javasoso.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String save() {
        System.out.println("我来了");
        return "hello dubbo my name is zheng ya jun";
    }
}
