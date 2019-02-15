package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDatabaseConnection {

	public static void main(String[] args) {

		
		//Add External Jars and go to server - jdbc - lib 
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle1.centennialcollege.ca:1521:SQLD", "COMP214_F17_54","password");
			System.out.println("Connection is successful");
		}
		catch (ClassNotFoundException e)
		{

			e.printStackTrace();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}


	}

}
