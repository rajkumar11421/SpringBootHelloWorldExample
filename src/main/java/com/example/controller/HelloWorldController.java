package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value = "getMessage", method = RequestMethod.GET, produces = { "application/json" })
	public String getHelloWorld(){
		return "Get: Hello World !!";
	}
	
	@RequestMapping(value = "postMessage", method = RequestMethod.POST, consumes = {"application/json" }, produces = { "application/json" })
	public String postHelloWorld(@RequestBody String request){
		return "Post: Hello World !!";
	}
	
}
