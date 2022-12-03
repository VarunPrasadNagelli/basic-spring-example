package com.tight.coupling.springtightcoupling.game;

import org.springframework.stereotype.Component;

@Component
public class superContraGame implements GamingConsole{
    public  void up(){
        System.out.println("superContraGame up");
    }
    public  void down(){
        System.out.println("superContraGame down");
    }
    public  void left(){
        System.out.println("superContraGame left");
    }
    public  void right(){
        System.out.println("superContraGame right");
    }
}
