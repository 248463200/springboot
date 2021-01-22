package com.pyh.springboot;

import com.pyh.springboot.sp01_di.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

	@Autowired
	private User user;
	@Test
	void contextLoads() {
		System.out.println(user);
	}

}
