package com.domain;


import java.sql.*;
import javax.sql.*;

public class DBConnection{

public static void main(String args[]){
int cityid;
String cityName;
String dbUrl = "jdbc:mysql://localhost:3306/mydb";
String dbClass = "com.mysql.jdbc.Driver";
String query = "Select city_id,city_name FROM cities";

try {

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection (dbUrl,"root","root123");
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

}  //end main

}  //end class