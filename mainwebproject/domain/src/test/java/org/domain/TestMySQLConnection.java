package org.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.entitymanager.CityService;

import junit.framework.TestCase;

public class TestMySQLConnection extends TestCase {

	public void testGreetingService() {
	/*	CityService cs=new CityService();
		System.out.println("cs  ::"+cs);
		List listOfCity=cs.getAllCities();
		assertNotNull(listOfCity);*/

		int cityid;
		String cityName;
		String dbUrl = "jdbc:mysql://localhost:3306/mydb";
		String dbClass = "com.mysql.jdbc.Driver";
		String query = "Select city_id,city_name FROM cities";

		try {

		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl,"admin","admin");
		//Connection con = DriverManager.getConnection (dbUrl);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
		cityid = rs.getInt("city_id");
		cityName = rs.getString("city_Name");
		System.out.println(cityid);
		System.out.println(cityName);
		} //end while

		con.close();
		} //end try

		catch(ClassNotFoundException e) {
		e.printStackTrace();
		}

		catch(SQLException e) {
		e.printStackTrace();
		}		
		
	}
}
