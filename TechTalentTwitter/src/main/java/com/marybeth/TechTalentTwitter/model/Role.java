package com.marybeth.TechTalentTwitter.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "role_id")
	private Long id;
	private String role;

	public Role(String role) {
		this.role = role;
	}

	public Role() {

	}

	public Long getId() {
		return id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}

	// Use this code if your lombok is not working:
	// public String getRole() {
	// return role;
	// }

	// public void setRole(String role) {
	// this.role = role;
	// }

	// public Long getId() {
	// return id;
	// }

	// @Override
	// public String toString() {
	// return "Role [id=" + id + ", role=" + role + "]";
	// }

}