package com.lovo.hibernate.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user")
public class UserEntity {
	
	@Id
	@GenericGenerator(name="useruuid",strategy="uuid")
	@GeneratedValue(generator="useruuid")
	@Column(length=32)
	private String userId;
	
	@OneToMany(mappedBy="user")
	private List<UserRoleEntity> userRoleList;
	
	@Column(length=32)
	private String userName;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<UserRoleEntity> getUserRoleList() {
		return userRoleList;
	}

	public void setUserRoleList(List<UserRoleEntity> userRoleList) {
		this.userRoleList = userRoleList;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
}
