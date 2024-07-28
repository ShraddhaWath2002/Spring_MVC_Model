package com.nt.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GuestDTO implements Serializable{
	private String name;
	private String addr;
	private String food_ordered;
	private Float food_price;
	private Integer no_of_days;
	private Float charges;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getFood_ordered() {
		return food_ordered;
	}
	public void setFood_ordered(String food_ordered) {
		this.food_ordered = food_ordered;
	}
	public Float getFood_price() {
		return food_price;
	}
	public void setFood_price(Float food_price) {
		this.food_price = food_price;
	}
	public Integer getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(Integer no_of_days) {
		this.no_of_days = no_of_days;
	}
	public Float getCharges() {
		return charges;
	}
	public void setCharges(Float charges) {
		this.charges = charges;
	}
	
	
}
