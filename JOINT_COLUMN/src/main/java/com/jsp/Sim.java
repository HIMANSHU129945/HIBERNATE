package com.jsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Sim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int s_id;
	private String type;
	
	
	@ManyToMany
	@JoinColumn
	private List<Mobile> mob;

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Mobile> getMob() {
		return mob;
	}

	public void setMob(List<Mobile> mob) {
		this.mob = mob;
	}
	
	

}
