package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Patient;

public class Createpatient {

	public int create(Patient patient) {
		// TODO Auto-generated method stub
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		
		PreparedStatement ps  = con.prepareStatement("insert into patientTenet values(?,?,?,?)");
		
		
			System.out.println("this is the create patient logic ");
			System.out.println("this is the first commit in gitHUb ");
			System.out.println(con);
			
			ps.setInt(1, patient.getId());
			ps.setString(2,patient.getName());
			ps.setString(3, patient.getEmail());
			ps.setString(4, patient.getLocation());
			

			int i = ps.executeUpdate();
			System.out.println(i+"rows are inserteed");
			
			ps.close();
			con.close();
			
			ps = null;
			con = null;
		
	}catch(Exception e){
		e.printStackTrace();
		}
		return 0;
	}

}
