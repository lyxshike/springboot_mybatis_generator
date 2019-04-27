package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.domain.User;
import com.mapper.UserMapper;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;
	
	
	@Test
	public void test() {
//		userMapper.insert("winterchen", "123456", "1234567890");
//		User u = userMapper.findUserByPhone("1234567890");
//		Assert.assertEquals("winterchen", u.getName());
	}

	@Test
	@Transactional(isolation=Isolation.DEFAULT, propagation=Propagation.REQUIRES_NEW)
	public void testTransactional() {
//		userMapper.insert("张三", "123456", "18600000000");
//		//int a = 1/0;
//		userMapper.insert("李四", "123456", "13500000000");
//		User u = userMapper.findUserByPhone("123456789101");
//		Assert.assertEquals("winterchen", u.getName());
	}
}
