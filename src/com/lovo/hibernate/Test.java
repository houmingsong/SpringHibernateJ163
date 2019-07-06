package com.lovo.hibernate;

import java.util.List;
import java.util.Scanner;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.hibernate.entity.UserEntity;
import com.lovo.hibernate.service.IUserService;

public class Test {
	
	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("resouce/application.xml");
	}


	@org.junit.Test
	public void login() {
		IUserService s = (IUserService) app.getBean("userService");
		System.out.println("欢迎，请输入用户名");
		//控制台输入
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		UserEntity user = s.login(str);
		List<String> list = s.findPower(str);
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("请选择菜单:");
		String str1 = sc.next();
		for (String string : list) {
			if(str1.equals(string)) {
				System.out.println("有此权限");
			}
		}
	}
}
