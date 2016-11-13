package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.business.PatientServiceImpl;
import com.model.Patient;

/**
 * Servlet implementation class Patsave
 */
public class Patsave extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PatientServiceImpl psl; 
	
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
		int id = Integer.parseInt(req.getParameter("id")); 
		String name = req.getParameter("name"); 
		String email=req.getParameter("email"); 
		String location = req.getParameter("location");
		
		Patient patient = new Patient();
		patient.setId(id);
		patient.setName(name);
		patient.setEmail(email);
		patient.setLocation(location);
		
		PatientServiceImpl psl = new PatientServiceImpl();
		boolean i=psl.addPatient(patient);
		 System.out.println("inserted successfully") ; 
	
		 out.println("<html>");
		 out.println("<body bgcolor = grey>");
		 out.println("<h1>patient details entered successfully</h1>");
		 out.println("</body>");
		 out.println("</html>");
		 out.close();
		
	}

	

}
