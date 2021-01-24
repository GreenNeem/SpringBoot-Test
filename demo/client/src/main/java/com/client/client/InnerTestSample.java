package com.client.client;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class InnerTestSample {

    public String innermethod(){
        return "Inner_String";
    }

}