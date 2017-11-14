package com.example;

import com.example.dao.UserRepository;
import com.example.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class H2TestApplicationTests {

	@Autowired
	private UserRepository repository;

	@Test
	public void contextLoads() {
		User u = repository.findOne(1L);
		assertEquals("admin", u.getUsername());
	}

}
