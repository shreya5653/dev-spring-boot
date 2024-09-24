package com.My_backend_project.springboot.thymeleafdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class ThymeleafdemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
