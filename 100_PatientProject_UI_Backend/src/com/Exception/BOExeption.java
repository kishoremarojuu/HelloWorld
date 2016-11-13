package com.Exception;

import java.sql.SQLException;

public class BOExeption extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BOExeption(SQLException e) {
		super(e); 
	}
	

	
}
