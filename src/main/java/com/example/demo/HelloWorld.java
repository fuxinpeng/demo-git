package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@ResponseBody
	@RequestMapping("/helloworld")
	public String helloWorld(){
		System.out.println("沉舟侧畔千帆过，");
		System.out.println("病树前头万木春。");
		return "HelloWorld";
	}
	
}
