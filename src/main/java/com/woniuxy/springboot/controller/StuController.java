package com.woniuxy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.springboot.pojo.Stu;
import com.woniuxy.springboot.service.StuService;

@Controller
public class StuController {

	@Autowired
	StuService stuService;
	
	@RequestMapping("/getall")
	@ResponseBody
	public List<Stu> getAll() {
		return stuService.getAllStus();
	}
	
}
