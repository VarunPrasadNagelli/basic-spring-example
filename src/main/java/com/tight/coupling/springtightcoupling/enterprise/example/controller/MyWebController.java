package com.tight.coupling.springtightcoupling.enterprise.example.controller;

import com.tight.coupling.springtightcoupling.enterprise.example.businessService.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;
    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }
}

