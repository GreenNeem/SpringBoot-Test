package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.PostMapping;

@RestController
//@RequestMapping("")
public class HelloController{

    // private PostMapping postMapping;

    // public HelloController(PostMapping postMapping) {
	// 	this.postMapping = postMapping;
    // }
    //@Autowired
    private PostMapping postMapping;

    // public HelloController(PostMapping postMapping){
    //     this.postMapping = postMapping;
    // }


    @RequestMapping("/api/people")
    public String index(Model model){
        model.addAttribute("msg", postMapping.Greetings());
        return "home";
    }

}