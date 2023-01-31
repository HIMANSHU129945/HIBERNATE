package com.jsp;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Certificate {
	
	
	private int certi_no;
	private int duration;
	private String certi_name;
	
	
	public int getCerti_no() {
		return certi_no;
	}
	public void setCerti_no(int certi_no) {
		this.certi_no = certi_no;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCerti_name() {
		return certi_name;
	}
	public void setCerti_name(String certi_name) {
		this.certi_name = certi_name;
	}
	
	

}
