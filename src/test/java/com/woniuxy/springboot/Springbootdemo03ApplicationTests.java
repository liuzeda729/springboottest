package com.woniuxy.springboot;

import java.util.Date;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.woniuxy.springboot.mapper.StuMapper;
import com.woniuxy.springboot.pojo.Stu;
import com.woniuxy.springboot.service.StuService;

@SpringBootTest
class Springbootdemo03ApplicationTests {
	
	@Autowired
	StuMapper stuMapper;
	
	@Autowired
	StuService stuService;
	
	@Autowired
	DataSource dataSource;
	
	@Test
	void contextLoads() {
	}

	@Test
	void test01() {
		stuMapper.insertStu(new Stu(73, "sally", 23, new Date()));
	}
	
	@Test
	void test02() {
		stuService.stuTransaction();
	}
	
	@Test
	void test03() {
		System.out.println(dataSource);
		System.out.println(dataSource.getClass().getName());
	}
}
