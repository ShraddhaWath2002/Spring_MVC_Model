package com.nt.service;

import com.nt.bo.GuestBO;
import com.nt.dao.IGuestDAO;
import com.nt.dto.GuestDTO;

public class GuestMgmtServiceImpl implements IGuestMgmtService{
	private IGuestDAO dao;
	
	public GuestMgmtServiceImpl(IGuestDAO dao) {
		System.out.println("GuestMgmtServiceImpl(dao)");
		this.dao = dao;
	}

	@Override
	public String registerGuest(GuestDTO dto) throws Exception {
		
		float total_amt = dto.getFood_price()+(dto.getNo_of_days()*dto.getCharges());
		
		GuestBO gbo = new GuestBO();
		gbo.setName(dto.getName());
		gbo.setAddr(dto.getAddr());
		gbo.setFood_ordered(dto.getFood_ordered());
		gbo.setNo_of_days(dto.getNo_of_days());
		gbo.setTotal_amt(total_amt);
		int k = dao.insert(gbo);
	 
		return k==0? "Registration failed" : "Registration Successfull :: Total payable amount = "+total_amt;
	}
	
}
