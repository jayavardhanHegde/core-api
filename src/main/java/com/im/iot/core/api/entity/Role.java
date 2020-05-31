package com.im.iot.core.api.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	
	@Column(name = "role_name")
	private String roleName;
	
	@Column(name = "created_on")
	private LocalDateTime createdOn;
	
	@Column(name = "updated_on")
	private LocalDateTime updateOn;
	
	public Role() {
		
	}
	
	public Role(String roleName,LocalDateTime createdOn,LocalDateTime updateOn) {
		this.roleName = roleName;
		this.createdOn=createdOn;
		this.updateOn=updateOn;
	}
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDateTime getUpdateOn() {
		return updateOn;
	}

	public void setUpdateOn(LocalDateTime updateOn) {
		this.updateOn = updateOn;
	}
	
	
	
	

}
