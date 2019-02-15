package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {


	//Declarations

	@FXML TextField _txtCity;
	@FXML Button _btnDisplay;
	@FXML TextArea _txtResult;


	@FXML private void onClickedShow()
	{
		try {

			_txtResult.setText(""); // Clear TextArea

			Class.forName("oracle.jdbc.OracleDriver");

			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@oracle1.centennialcollege.ca:1521:SQLD", "COMP214_F17_54","password"); // Establishes connection

			System.out.println("Successfull connection"); // Checks whether connection was successful in console.

			Statement retrieveStatement = connection.createStatement();
			ResultSet resultSet = retrieveStatement.executeQuery("select * from STUDENTS Where City='" + _txtCity.getText()+ "'"); // Executing query containing input data from TextField

			// Get ResultSet's meta data
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColumns = metaData.getColumnCount();

			// Display column names
			for (int i = 1; i <= numberOfColumns; i++)
			{
				_txtResult.appendText(String.format("%-14s\t",metaData.getColumnName(i)));

			}
			_txtResult.appendText("\n");

			// Display query results
			while (resultSet.next())
			{
				_txtResult.appendText("\n"); // Creates new line for the result
				for (int i = 1; i <= numberOfColumns; i++)
				{
					_txtResult.appendText(String.format("%-14s\t", resultSet.getObject(i))); // Displays row data seperated by single tab. Note, data maybe look good as address field size changes
				}
			}
		}

		// Exception Handling
		catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}
}

