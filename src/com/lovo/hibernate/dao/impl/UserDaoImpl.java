package com.lovo.hibernate.dao.impl;

import org.springframework.stereotype.Repository;

import com.lovo.hibernate.dao.BasicDao;
import com.lovo.hibernate.entity.UserEntity;

@Repository(value="userDao")
public class UserDaoImpl extends BasicDao<UserEntity>  {
	

}
