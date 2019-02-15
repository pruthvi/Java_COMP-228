package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MainController {

	// Declaration
	@FXML private TextField _Name;
	@FXML private TextField _Address;
	@FXML private TextField _Province;
	@FXML private TextField _City;
	@FXML private TextField _PostalCode;
	@FXML private TextField _PhoneNumber;
	@FXML private TextField _Email;
	@FXML private TextArea _Result;
	@FXML private CheckBox _StudentCouncil;
	@FXML private CheckBox _VolunteerWork;
	@FXML private RadioButton _Computer;
	@FXML private RadioButton _Business;
	@FXML private Button _btnDisplay;
	@FXML private ChoiceBox<String> _btnSelect;

	// Defining course values for Computer and Business program
	ObservableList<String> _compOpt = FXCollections.observableArrayList("JAVA", "DBMS", "WEB DEVELOPMENT");
	ObservableList<String> _busOpt = FXCollections.observableArrayList("ECONOMICS", "ACCOUNTS","MARKETING");

	// Populating Items in  box based on Computer and Business program selection

    @FXML private void initialize() {
		if (_Computer.isSelected()) {
			_btnSelect.setItems(_compOpt);
		} else if (_Business.isSelected()){
			_btnSelect.setItems(_busOpt);
		}
	}


    // Display Button function
	@FXML private void onDisplayClicked() {

		// Getting input from user and storing it in variables
		String name = _Name.getText();
		String address = _Address.getText();
		String province = _Province.getText();
		String city = _City.getText();
		String postalcode = _PostalCode.getText();
		String phonenumber = _PhoneNumber.getText();
		String email = _Email.getText();

		String activity = null;

		if(_StudentCouncil.isSelected())
		{
		    activity = _StudentCouncil.getText();
		}
		if(_VolunteerWork.isSelected())
		{
			activity = _VolunteerWork.getText();
		}
		if((_StudentCouncil.isSelected())&&(_VolunteerWork.isSelected()))
		{
			activity = _VolunteerWork.getText()+", "+_VolunteerWork.getText();
		}


		String major;
		if(_Computer.isSelected())
		{
			major = _Computer.getText();
		}
		else
		{
			major = _Business.getText();
		}

		String course = _btnSelect.getValue();

		// Displaying output result in TextArea
		_Result.setText(name + ", " + address + ", " + province + ", " + city + ", " + postalcode + ", " + phonenumber + ", " + email + "\n" + activity + "\n" + major + "\n" + course);

	}

}
