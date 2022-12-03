package com.tight.coupling.springtightcoupling.enterprise.example.dataService;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataService{
    public List<Integer> getData(){
        return Arrays.asList(20,30,40,50);
    }
}