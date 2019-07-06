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
@Table(name="t_role")
public class RoleEntity {
	
	@Id
	@GenericGenerator(name="roleuuid",strategy="uuid")
	@GeneratedValue(generator="roleuuid")
	@Column(length=32)
	private String roleId;
	
	@Column(length=32)
	private String roleName;
	
	@OneToMany(mappedBy="role")
	private List<UserRoleEntity> ulist;
	
	@OneToMany(mappedBy="role2")
	private List<RolePowerEntity> rlist;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserRoleEntity> getUlist() {
		return ulist;
	}

	public void setUlist(List<UserRoleEntity> ulist) {
		this.ulist = ulist;
	}

	public List<RolePowerEntity> getRlist() {
		return rlist;
	}

	public void setRlist(List<RolePowerEntity> rlist) {
		this.rlist = rlist;
	}
	
	
}
