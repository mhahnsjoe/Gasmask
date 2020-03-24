package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class NewKeyController implements Initializable {

	private Key selectedKey;
	private KeyRegister keyReg;
	private EmployeeRegister employeeReg;
	private LockRegister lockReg;

	public LockRegister getLockReg() {
		return lockReg;
	}

	public void setLockReg(LockRegister lockReg) {
		this.lockReg = lockReg;
	}

	public Key getSelectedKey() {
		return selectedKey;
	}

	public void setSelectedKey(Key selectedKey) {
		this.selectedKey = selectedKey;
	}

	public KeyRegister getKeyReg() {
		return keyReg;
	}

	public void setKeyReg(KeyRegister keyReg) {
		this.keyReg = keyReg;
	}

	public EmployeeRegister getEmployeeReg() {
		return employeeReg;
	}

	public void setEmployeeReg(EmployeeRegister employeeReg) {
		this.employeeReg = employeeReg;
	}

	// ---------------------------------------------------------- FXML	 ------------------------------------------

	@FXML
	private TextField txtName;

	@FXML
	private TextArea txtNote;

	@FXML
	private DatePicker dateExpire;

	@FXML
	private TextField txtCardID;

	@FXML
	private Label lblAccess;

	@FXML
	private Button btnEditAccess;

	@FXML
	private ImageView logoImage;

	@FXML
	private ComboBox<String> comboInstitution;
	private ObservableList<String> observableInstitutionList = FXCollections.observableArrayList("Informatik",
			"Handelsrätt");

	@FXML
	private TextField txtPnr;

	@FXML
	private ListView<String> listAvailableAlevels;
	private ObservableList<String> observableAlevelsList = FXCollections.observableArrayList();

	@FXML
	private TableView<Lock> tableRooms;
	private ObservableList<Lock> observableRoomList = FXCollections.observableArrayList();

	@FXML
	private TableColumn<Lock, String> columnRoomID;

	@FXML
	private TableColumn<Lock, String> columnRoomType;

	@FXML
	private TableView<Lock> tableKeyAccess;
	private ObservableList<Lock> observableAccessList = FXCollections.observableArrayList();

	@FXML
	private TableColumn<Lock, String> columnRoomID1;
	@FXML
	private TableColumn<Lock, String> columnRoomType1;

	@FXML
	private Button btnLeft;

	@FXML
	private Button btnRight;

	@FXML
	private Button btnLeftUpper;

	@FXML
	private Button btnRightUpper;

	@FXML
	private Button btnSaveKey;

	@FXML
	private ListView<String> listOwnedAlevels;
	private ObservableList<String> observableOwnedAlevels = FXCollections.observableArrayList();

	@FXML
	void selectAvailableAccess(MouseEvent event) {
		Lock selectedAccess = tableRooms.getSelectionModel().getSelectedItem();
		if (selectedAccess != null) {
			btnLeft.setDisable(false);
			btnRight.setDisable(true);
			
		}

	}

	@FXML
	void selectAvailableLevel(MouseEvent event) {
		try {
			String selectedLevel = listAvailableAlevels.getSelectionModel().getSelectedItem();
			if (selectedLevel != null) {
				btnLeftUpper.setDisable(false);
				btnRightUpper.setDisable(true);

			}
		} catch (NullPointerException e) {

		}
	}

	@FXML
	void selectOwnedAccess(MouseEvent event) {
		Lock selectedAccess = tableKeyAccess.getSelectionModel().getSelectedItem();
		if (selectedAccess != null) {
			btnLeft.setDisable(true);
			btnRight.setDisable(false);
		}
	}

	@FXML
	void selectOwnedLevel(MouseEvent event) {
		try {
			String selectedLevel = listOwnedAlevels.getSelectionModel().getSelectedItem();
			if (selectedLevel != null) {
				btnLeftUpper.setDisable(true);
				btnRightUpper.setDisable(false);
			}
		} catch (NullPointerException e) {

		}
	}

	@FXML
	void editAccess(ActionEvent event) {

	}

	@FXML
	void moveLeft(ActionEvent event) {
	Lock move = tableRooms.getSelectionModel().getSelectedItem();
	observableRoomList.remove(move);
	observableAccessList.add(move);
	tableRooms.setItems(observableRoomList);
	tableKeyAccess.setItems(observableAccessList);
	if (observableRoomList.isEmpty()) {
		btnLeft.setDisable(true);
	}
	
	}

	@FXML
	void moveRight(ActionEvent event) {
		Lock move = tableKeyAccess.getSelectionModel().getSelectedItem();
		observableRoomList.add(move);
		observableAccessList.remove(move);
		tableRooms.setItems(observableRoomList);
		tableKeyAccess.setItems(observableAccessList);
		if (observableAccessList.isEmpty()) {
			btnRight.setDisable(true);
		}
		
	}

	@FXML
	void moveLeftUpper(ActionEvent event) {
		String move = listAvailableAlevels.getSelectionModel().getSelectedItem();
		observableAlevelsList.remove(move);
		observableOwnedAlevels.add(move);
		listAvailableAlevels.setItems(observableAlevelsList);
		listOwnedAlevels.setItems(observableOwnedAlevels);
		if (observableAlevelsList.isEmpty()) {
			btnLeftUpper.setDisable(true);
		}
	}

	@FXML
	void moveRightUpper(ActionEvent event) {
		String move = listOwnedAlevels.getSelectionModel().getSelectedItem();
		observableOwnedAlevels.remove(move);
		observableAlevelsList.add(move);
		listAvailableAlevels.setItems(observableAlevelsList);
		listOwnedAlevels.setItems(observableOwnedAlevels);
		if (observableOwnedAlevels.isEmpty()) {
			btnRightUpper.setDisable(true);
		}
	}
	// -----------------------------------------------------------------------
	// Buttons ----------------------------------------------------------

	@FXML
	void saveKey(ActionEvent event) {

		ArrayList<Lock> tspecAccess = new ArrayList<Lock>();
		ArrayList<AccessLevel> tAccessLevels = new ArrayList<AccessLevel>();
		String accessgroups="";

		for (Lock l : observableAccessList) {
			tspecAccess.add(l);
		}

		for (String a : observableOwnedAlevels) {
			tAccessLevels.add(lockReg.getAccessLevels().get(a));
		}
		System.out.println(tAccessLevels);
		
		
		
		if (tAccessLevels.size() > 4) {
			accessgroups = "*";
		}
		else if (tAccessLevels.size() == 1) {
			accessgroups = tAccessLevels.get(0).getName();
		}
		else {
		for (AccessLevel a : tAccessLevels) {
			if(accessgroups.isEmpty()) {
				accessgroups = a.getName();
			}
			else {
			accessgroups += ", " + a.getName()  ;
		}
		}
		
		}
		

		if (!txtCardID.isDisable()) {
			this.selectedKey = new Key(accessgroups, comboInstitution.getSelectionModel().getSelectedItem(),
					txtCardID.getText(), txtPnr.getText(), dateExpire.getValue(), tspecAccess, tAccessLevels,
					txtNote.getText(), txtName.getText());
			selectedKey.setSpecialAccess(tspecAccess.size());
			keyReg.addKey(selectedKey);
		}
		else {
			keyReg.removeKey(selectedKey.getKeyID());
			this.selectedKey = new Key(accessgroups, comboInstitution.getSelectionModel().getSelectedItem(),
					txtCardID.getText(), txtPnr.getText(), dateExpire.getValue(), tspecAccess, tAccessLevels,
					txtNote.getText(), txtName.getText());
			selectedKey.setSpecialAccess(tspecAccess.size());
			keyReg.addKey(selectedKey);
			btnSaveKey.setText("Save Keycard");
			txtCardID.setDisable(false);
			
		}

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainView.fxml"));
			Parent root = (Parent) loader.load();
			MainViewController hController = loader.getController();

			hController.setEmployeeReg(this.employeeReg);
			hController.setKeyReg(this.keyReg);
			hController.setSelectedKey(this.selectedKey);
			hController.setLockReg(this.lockReg);
			hController.setObservableKeyList();

			Scene mainViewScene = new Scene(root);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(mainViewScene);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void loadRegisters() {
		String checkNew = selectedKey.getKeyID();
		observableRoomList.clear();
		observableAccessList.clear();
		observableAlevelsList.clear();
		observableOwnedAlevels.clear();
	
		for (Lock l : lockReg.getLockList().values()) {
			observableRoomList.add(l);
		}
		if (checkNew != null) {
		for (Lock l : this.selectedKey.getSpecAccess()) {
			observableRoomList.remove(l);
			observableAccessList.add(l);
		}
		}
		tableRooms.setItems(observableRoomList);
		tableKeyAccess.setItems(observableAccessList);

		if (checkNew != null) {
		for (AccessLevel level : this.selectedKey.getAccessLevels()) {
			observableOwnedAlevels.add(level.getName());
		}
		}
		
		for (AccessLevel level : lockReg.getAccessLevels().values()) {
			if(!observableOwnedAlevels.contains(level.getName())) {
			observableAlevelsList.add(level.getName());
			}
		}
		
		
		listAvailableAlevels.setItems(observableAlevelsList);
		listOwnedAlevels.setItems(observableOwnedAlevels);
	}
	
	public void editKey() {
		Key selected = getSelectedKey();
		txtPnr.setText(selected.getEmployeeID());
		txtCardID.setDisable(true);
		txtCardID.setText(selected.getKeyID());
		dateExpire.setValue(selected.getValidTo());
		comboInstitution.getSelectionModel().select(selected.getInstitution());
		txtName.setText(selected.getHolder());		
		txtNote.setText(selected.getComment());
		btnSaveKey.setText("Update Keycard");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		comboInstitution.setItems(observableInstitutionList);
		columnRoomID.setCellValueFactory(new PropertyValueFactory<Lock, String>("roomNr"));
		columnRoomType.setCellValueFactory(new PropertyValueFactory<Lock, String>("type"));
		columnRoomID1.setCellValueFactory(new PropertyValueFactory<Lock, String>("roomNr"));
		columnRoomType1.setCellValueFactory(new PropertyValueFactory<Lock, String>("type"));

	}

}
