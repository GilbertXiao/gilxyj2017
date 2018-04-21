package com.wlb.bean;

public class Task implements Comparable<Task>{
    private int id;
    private String name;
    	
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

	@Override
	public int compareTo(Task o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
    
}
