package com.copart.webservices.rest.jersey;

public class Sport {

	private int id,min,max,teamSize,filled;
	private String name,type;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFilled() {
		return filled;
	}

	public void setFilled(int filled) {
		this.filled = filled;
	}

	@Override
	public String toString()
	{
		return "{id : "+id+", name : "+name+", type : "+type+"}";
		
	}

	
}
