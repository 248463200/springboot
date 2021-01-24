package com.pyh.springboot;

import com.pyh.springboot.sp02_jsr303.Jsr303;
import com.pyh.springboot.sp01_di.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	private User user;
	@Autowired
	private Jsr303 jsr303;
	@Test
	void contextLoads() {
		System.out.println(user);
	}


	@Test
	void contextLoads1() {
		System.out.println(jsr303);
	}

}
