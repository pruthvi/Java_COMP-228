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
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;


public class MainController {

	@FXML TextField _txtName;
	@FXML TextField _txtLast;
	@FXML TextField _txtAddress;
	@FXML TextField _txtPostal;
	@FXML TextField _txtProv;
	@FXML TextField _txtPhone;

	@FXML Button _btnAddPlayer;
	@FXML Button _btnUpdatePlayer;

	@FXML TextField _txtGame;
	@FXML Button _btnAddGame;

	@FXML private void onClickAddPlayer() //Class for Adding Player Details
	{
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet())
		{
			Class.forName("oracle.jdbc.OracleDriver"); //class for oracle
			rowSet.setUrl("jdbc:oracle:thin:@199.212.26.208:1521:SQLD");  //connection with host name, port, service name, driver.
																		  //Please change ip to oracle1.centennialcollege.ca in case of connection failure.
			rowSet.setUsername("COMP214_F17_54"); // Username for database access
			rowSet.setPassword("password"); // Password for database access
			rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);
			rowSet.setCommand("SELECT id, first_name, last_name, address, postal_code, province, phone_number FROM PLAYER"); // set query
			rowSet.execute(); // execute query

			rowSet.moveToInsertRow();
			rowSet.updateString(2, _txtName.getText()); //populating from second column of the table, as id column is auto generated in database
			rowSet.updateString(3, _txtLast.getText()); // inserting data from text field into LastName column of the table
			rowSet.updateString(4, _txtAddress.getText());
			rowSet.updateString(5, _txtPostal.getText());
			rowSet.updateString(6, _txtProv.getText());
			rowSet.updateString(7, _txtPhone.getText());
		    rowSet.insertRow(); //inserting row
			System.out.print("Player is added");  //message output for console

		}

		catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}



	@FXML private void onClickAddGame() //Class for Adding Game Title
	{
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet())
		{
			Class.forName("oracle.jdbc.OracleDriver");
			rowSet.setUrl("jdbc:oracle:thin:@199.212.26.208:1521:SQLD");
			rowSet.setUsername("COMP214_F17_54");
			rowSet.setPassword("password");
			rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);
			rowSet.setCommand("SELECT ID, title FROM Game"); // set query
			rowSet.execute(); // execute query


			rowSet.moveToInsertRow(); //Insert values
			rowSet.updateString(2, _txtGame.getText()); //populating second column of the table, as id column is auto generated in table
		    rowSet.insertRow();
			System.out.print("Game Title is added");

		}

		catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		catch(SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
	}


	@FXML private void onClickUpdatePlayer() //Class for Adding Player Details
	{
		try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet())
		{
			Class.forName("oracle.jdbc.OracleDriver"); //class for oracle
			rowSet.setUrl("jdbc:oracle:thin:@199.212.26.208:1521:SQLD");  //connection with host name, port, service name, driver.
																		  //Please change ip to oracle1.centennialcollege.ca in case of connection failure.
			rowSet.setUsername("COMP214_F17_54"); // User name for database access
			rowSet.setPassword("password"); // Password for database access
			rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);
			rowSet.setCommand("SELECT id, first_name, last_name, address, postal_code, province, phone_number FROM PLAYER"); // set query
			rowSet.execute(); // execute query

		//	rowSet.moveToInsertRow();
			rowSet.updateString(2, _txtName.getText()); //populating from second column of the table, as id column is auto generated in database
			rowSet.updateString(3, _txtLast.getText()); // inserting data from text field into LastName column of the table
			rowSet.updateString(4, _txtAddress.getText());
			rowSet.updateString(5, _txtPostal.getText());
			rowSet.updateString(6, _txtProv.getText());
			rowSet.updateString(7, _txtPhone.getText());
		    rowSet.updateRow(); //update row
			System.out.print("Row is updated!");  //message output for console

		}

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

