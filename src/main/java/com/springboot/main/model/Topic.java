package com.springboot.main.model;

public class Topic {
	private int id;
	private String name;
	private int weightage;
	public Topic(int id, String name, int weightage) {
		super();
		this.id = id;
		this.name = name;
		this.weightage = weightage;
	}
	public Topic() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeightage() {
		return weightage;
	}
	public void setWeightage(int weightage) {
		this.weightage = weightage;
	}

}