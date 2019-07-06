package com.lovo.hibernate;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lovo.hibernate.dao.impl.UserDaoImpl;
import com.lovo.hibernate.entity.UserEntity;
import com.lovo.hibernate.service.IUserService;

public class T {

	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("resouce/application.xml");
	}

	@Test
	public void sessiont() {
		UserDaoImpl dao = (UserDaoImpl) app.getBean("userDao");
		UserEntity user = new UserEntity();
		user.setUserName("刘备");
//		user.setAge(58);
		dao.savaObject(user);
	}

	@Test
	public void findList() {
		IUserService s = (IUserService) app.getBean("userService");
		s.getListUser();
	}

	public static void main(String[] args) {
		System.out.println("请输入用户名：");
		Scanner s = new Scanner(System.in);
		String ss = s.next();
		System.out.println(ss);
	}
}
