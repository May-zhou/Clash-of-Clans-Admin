package com.admin.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Warmember {
	@NotBlank(message="{required}")
//	@Size(min=5,max=10,message="{required}")
	private String date;
	@NotBlank(message="{required}")
	//@Size(min=2,max=10,message="{required}")
	private String name;
	private int id;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
