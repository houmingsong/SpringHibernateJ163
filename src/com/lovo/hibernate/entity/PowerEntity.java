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
@Table(name="t_power")
public class PowerEntity {
	
	@Id
	@GenericGenerator(name="poweruuid",strategy="uuid")
	@GeneratedValue(generator="poweruuid")
	@Column(length=32)
	private String powerId;
	
	@Column(length=32)
	private String powerName;
	
	@OneToMany(mappedBy="power")
	private List<RolePowerEntity> rolePowerList;

	public String getPowerId() {
		return powerId;
	}

	public void setPowerId(String powerId) {
		this.powerId = powerId;
	}

	public String getPowerName() {
		return powerName;
	}

	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}

	public List<RolePowerEntity> getRolePowerList() {
		return rolePowerList;
	}

	public void setRolePowerList(List<RolePowerEntity> rolePowerList) {
		this.rolePowerList = rolePowerList;
	}
	
	
}
