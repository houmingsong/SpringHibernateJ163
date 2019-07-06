package com.lovo.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_rolepower")
public class RolePowerEntity {
	
	@Id
	@GenericGenerator(name="rolepoweruuid",strategy="uuid")
	@GeneratedValue(generator="rolepoweruuid")
	@Column(length=32)
	private String rolepowerId;
	
	@ManyToOne
	@JoinColumn(name="powerId")
	private PowerEntity power;
	
	@ManyToOne
	@JoinColumn(name="roleId")
	private RoleEntity role2;

	public String getRolepowerId() {
		return rolepowerId;
	}

	public void setRolepowerId(String rolepowerId) {
		this.rolepowerId = rolepowerId;
	}

	public PowerEntity getPower() {
		return power;
	}

	public void setPower(PowerEntity power) {
		this.power = power;
	}

	public RoleEntity getRole2() {
		return role2;
	}

	public void setRole2(RoleEntity role2) {
		this.role2 = role2;
	}

	
}
