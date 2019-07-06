package com.lovo.hibernate.service;

import java.util.List;

import com.lovo.hibernate.entity.UserEntity;

public interface IUserService {
	/**
	 * 查询所有
	 * 
	 * @return
	 */
	public List<UserEntity> getListUser();

	public UserEntity login(String userName);

	public List<String> findPower(String userName);
}
