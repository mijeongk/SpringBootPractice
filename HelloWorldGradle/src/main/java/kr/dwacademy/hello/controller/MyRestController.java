package kr.dwacademy.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping(value ="/")
	public String hello() {
		return "반갑다 스트링 부트!!!";
	}
	
}
