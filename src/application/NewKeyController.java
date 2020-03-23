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
import javafx.stage.Stage;



public class NewKeyController implements Initializable {

	
	private Key selectedKey;
	private KeyRegister keyReg;
	private EmployeeRegister employeeReg;
	
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
	
	// ---------------------------------------------------------- FXML ------------------------------------------
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
    private ObservableList<String> observableInstitutionList = FXCollections.observableArrayList("Informatik", "Handelsrätt");

    @FXML
    private TextField txtPnr;

    @FXML
    private ListView<AccessLevel> listAlevels;
    private ObservableList<AccessLevel> observableAlevels = FXCollections.observableArrayList();
    
    @FXML
    private TableView<Lock> tableRooms;
	private ObservableList<Lock> observableRoomList = FXCollections.observableArrayList();

    @FXML
    private TableColumn<Lock, String> columnRoomID;

    @FXML
    private TableColumn<Lock, String> columnRoomType;

    @FXML
    private ListView<Lock> listSpecAccess;

    @FXML
    private Button btnLeft;

    @FXML
    private Button btnRight;

    @FXML
    private Button btnSaveKey;

    // ----------------------------------------------------------------------- Buttons ----------------------------------------------------------
    
    @FXML
    void editAccess(ActionEvent event) {

    }

    @FXML
    void moveLeft(ActionEvent event) {

    }

    @FXML
    void moveRight(ActionEvent event) {

    }

    @FXML
    void saveKey(ActionEvent event) {
    	
			String accessgroups = "";
			ArrayList<Lock> tspecAccess = new ArrayList<Lock>();
			ArrayList<AccessLevel> tAccessLevels = new ArrayList<AccessLevel>();
    		
    		for (Lock l : listSpecAccess.getItems()) {
    			tspecAccess.add(l);
    		}
    		
    		for (AccessLevel a : listAlevels.getItems()) {
    			tAccessLevels.add(a);
    		}
    		for (AccessLevel a : tAccessLevels) {
    			accessgroups = accessgroups+","+a;
    		}
    		
    		
    		
    		if (!txtCardID.isDisable()) {
    		this.selectedKey = new Key(accessgroups, comboInstitution.getSelectionModel().getSelectedItem(), txtCardID.getText(), txtPnr.getText(), dateExpire.getValue(), tspecAccess, tAccessLevels);
    		keyReg.addKey(selectedKey);
    	}
    		 try {
    			    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainView.fxml"));
    			    Parent root = (Parent) loader.load();
    			    MainViewController hController = loader.getController();

    			    

    			    hController.setEmployeeReg(this.employeeReg);
    			    hController.setKeyReg(this.keyReg);
    			    hController.setSelectedKey(this.selectedKey);

    			    Scene mainViewScene = new Scene(root);
    				Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
    				window.setScene(mainViewScene);
    			    
    			    }
    			    catch (IOException e) {
    			    	e.printStackTrace();
    			    }
    	
    	
    
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	comboInstitution.setItems(observableInstitutionList);
	columnRoomID.setCellValueFactory(new PropertyValueFactory<Lock, String>("roomNr"));
	columnRoomType.setCellValueFactory(new PropertyValueFactory<Lock, String>("type"));
	
	}

}
