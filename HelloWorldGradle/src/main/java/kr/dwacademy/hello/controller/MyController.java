package kr.dwacademy.hello.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MyController {

	public String web(Model model) {
		String serverrTime = LocalDateTime
				.now()
				.format(DateTimeFormatter.ofPattern("yyyy년 mm월 dd일(E) hh:mm:ss"));
		model.addAttribute("serverrTime", serverrTime);
		model.addAttribute("name", "강미정");
		return "index";
	}
}
