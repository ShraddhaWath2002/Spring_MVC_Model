package com.nt.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.GuestBO;

public class GuestDAOImpl implements IGuestDAO{
	
	private static final String GUEST_INSERT_QUERY = "INSERT INTO GuestDetails VALUES (?,?,?,?,?)";
	private DataSource ds;
	
	public GuestDAOImpl (DataSource ds) {
		System.out.println("GuestDAOImpl(ds)");
		this.ds = ds;
	}

	@Override
	public int insert(GuestBO gbo) throws Exception {
		int k = 0;
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GUEST_INSERT_QUERY);){
			if(ps!=null) {
				ps.setString(1, gbo.getName());
				ps.setString(2, gbo.getAddr());
				ps.setString(3, gbo.getFood_ordered());
				ps.setInt(4, gbo.getNo_of_days());
				ps.setFloat(5, gbo.getTotal_amt());
				k = ps.executeUpdate();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return k;
	}
}
