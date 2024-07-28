package com.nt.controller;

import com.nt.dto.GuestDTO;
import com.nt.service.IGuestMgmtService;
import com.nt.vo.GuestVO;

public class MainController {
	private IGuestMgmtService service;
	
	public MainController(IGuestMgmtService service) {
		System.out.println("MainController(service)");
		this.service = service;
	}
	
	public String processGuest(GuestVO vo)throws Exception{
		GuestDTO dto = new GuestDTO();
		dto.setName(vo.getName());
		dto.setAddr(vo.getAddr());
		dto.setFood_ordered(vo.getFood_ordered());
		dto.setFood_price(Float.parseFloat(vo.getFood_price()));
		dto.setNo_of_days(Integer.parseInt(vo.getNo_of_days()));
		dto.setCharges(Float.parseFloat(vo.getCharges()));
		
		String msg = service.registerGuest(dto);
		return msg;
	}
}

