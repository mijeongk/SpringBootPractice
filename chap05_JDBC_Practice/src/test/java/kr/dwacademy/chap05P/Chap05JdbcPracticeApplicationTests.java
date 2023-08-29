package kr.dwacademy.chap05P;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class Chap05JdbcPracticeApplicationTests {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	void contextLoads() {
	}

}
