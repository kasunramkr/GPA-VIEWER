package databaseAccses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Acsses {
	Connection mycon;
	
	public Acsses() {
		// TODO Auto-generated constructor stub
		try {
			mycon = DriverManager.getConnection("jdbc:mysql://localhost/gpa","root","");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public Statement GetStatement(){
		try {
			return mycon.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
