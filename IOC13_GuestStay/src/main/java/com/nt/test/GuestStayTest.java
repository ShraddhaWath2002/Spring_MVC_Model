package com.nt.test;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.GuestVO;

public class GuestStayTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String name = null, address = null, food_ordered = null, food_price = null, no_of_days = null, charges = null;
		
		if(sc!=null) {
			System.out.println("Enter the Guest Name : ");
			name = sc.next();
			System.out.println("Enter the Guest Address : ");
			address = sc.next();
			System.out.println("Enter the Food Guest Ordered : ");
			food_ordered = sc.next();
			System.out.println("Enter the Price of Food Guest Ordered : ");
			food_price = sc.next();
			System.out.println("Enter the Number of days Guest Stayed : ");
			no_of_days = sc.next(); 
			System.out.println("Enter the per day charges of Room: ");
			charges = sc.next();
		}
		
		GuestVO vo = new GuestVO();
		vo.setName(name);
		vo.setAddr(address);
		vo.setFood_ordered(food_ordered);
		vo.setFood_price(food_price);
		vo.setNo_of_days(no_of_days);
		vo.setCharges(charges);
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		MainController controller = ctx.getBean("controller",MainController.class);
		
		try {
			String resultMsg = controller.processGuest(vo);
			System.out.println(resultMsg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
