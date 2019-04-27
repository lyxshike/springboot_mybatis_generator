package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.domain.User;
import com.mapper.UserMapper;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void testSelect() {
		User user = userMapper.findUserByPhone("12345678901");
		System.out.println(user.toString());
	}
}
