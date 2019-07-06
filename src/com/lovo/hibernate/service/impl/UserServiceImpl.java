package com.lovo.hibernate.service.impl;

import java.util.List;

import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lovo.hibernate.dao.impl.UserDaoImpl;
import com.lovo.hibernate.entity.UserEntity;
import com.lovo.hibernate.service.IUserService;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

	ClassPathXmlApplicationContext app = null;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("resouce/application.xml");
	}

	@Autowired
	private UserDaoImpl userDao;

	@Override
	public List<UserEntity> getListUser() {

		return userDao.findHQLList();
	}

	@Override
	public UserEntity login(String userName) {

		return (UserEntity) userDao.login(userName);
	}

	@Override
	public List<String> findPower(String userName) {

		return userDao.findPower(userName);
	}

	public static void main(String[] args) {
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("resouce/application.xml");
		IUserService service = (IUserService) app.getBean("userService");
		 System.out.println(service.login("张三").getUserName());
		// System.out.println(service.findPower("张三").get(1));
	}
}
