package kr.dwacademy.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	// @GetMapping(value ="/") 주소 넣음
	// {}중괄호로 묶어서 배열 가능
	@GetMapping(value ={"/", "/hello", "/hello.it"})
	public String helloworld() {
		return "Hello World!!!(한글도 나올 수 있다)";
	}

}
