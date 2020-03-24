package application;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
public class MainViewController implements Initializable {
	
	


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
	
	//-----------------------------------------------------------------------------------------------------
	
	   @FXML
	    private TableView<Key> tableKeys;
		private ObservableList<Key> observableKeyList = FXCollections.observableArrayList();
		

		 @FXML
		    private TableColumn<Key, String> columnKey;

		    @FXML
		    private TableColumn<Key, String> columnHolder;

		    @FXML
		    private TableColumn<Key, String> columnAccess;

		    @FXML
		    private TableColumn<Key, String> columnSpecial;

		    @FXML
		    private TableColumn<Key, String> columnInst;

	    @FXML
	    private Button btnEditCard;

	    @FXML
	    private Button btnDeleteCard;

	    @FXML
	    private Button btnNewCard;

	    @FXML
	    private TextField txtDisplayName;

	    @FXML
	    private TextArea textboxNote;

	    @FXML
	    private DatePicker dateDisplayExpire;

	    @FXML
	    private TextField txtDisplayCardID;

	    @FXML
	    private Label lblAccess;

	    @FXML
	    private Button btnEditAccess;

	    @FXML
	    private Button btnLogOut;

	    @FXML
	    private Label lblStatus;

	    @FXML
	    private RadioButton radioMainDoor;

	    @FXML
	    private ImageView logoImage;

	    @FXML
	    private Button btnEditNote;

	    @FXML
	    void deleteConfirmDialogue(ActionEvent event) {

	    }

	    @FXML
	    void editAccess(ActionEvent event) {

	    }

	    @FXML
	    void editCard(ActionEvent event) {
	    	try {
	 		    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("NewKeyView.fxml"));
	 		    Parent root = (Parent) loader.load();
	 		    NewKeyController nController = loader.getController();


	 		    nController.setEmployeeReg(this.employeeReg);
	 		    nController.setKeyReg(this.keyReg);
	 		    nController.setSelectedKey(this.selectedKey);
	 		    nController.setLockReg(this.lockReg);
	 		    nController.loadRegisters();
	 		    nController.editKey();
	 		    

	 		    Scene newKeyViewScene = new Scene(root);
				Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
				window.setScene(newKeyViewScene);
	 		    
	 		    }
	 		    catch (IOException e) {
	 		    	e.printStackTrace();
	 		    }
	 	}
	    

	    @FXML
	    void editNote(ActionEvent event) {
	    	if (btnEditNote.getText().equals("Save Note")) {
	    	selectedKey.setComment(textboxNote.getText());
	    	btnEditNote.setText("Edit Note");
	    	textboxNote.setDisable(true);
	    	}
	    	else {
	    	textboxNote.setDisable(false);
	    	btnEditNote.setText("Save Note");
	    	}
	    }

	    @FXML
	    void newCard(ActionEvent event) {
	    	selectedKey = new Key(null, null, null, null, null, null, null, null, null);
	    	 try {
	 		    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("NewKeyView.fxml"));
	 		    Parent root = (Parent) loader.load();
	 		    NewKeyController nController = loader.getController();


	 		    nController.setEmployeeReg(this.employeeReg);
	 		    nController.setKeyReg(this.keyReg);
	 		    nController.setSelectedKey(this.selectedKey);
	 		    nController.setLockReg(this.lockReg);
	 		    nController.loadRegisters();
	 		    

	 		    Scene newKeyViewScene = new Scene(root);
				Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
				window.setScene(newKeyViewScene);
	 		    
	 		    }
	 		    catch (IOException e) {
	 		    	e.printStackTrace();
	 		    }
	 	}
	    

	    @FXML
	    void selectKey(MouseEvent event) {
	    	Key selectedKey = tableKeys.getSelectionModel().getSelectedItem();
			if (selectedKey != null) {
				setSelectedKey(selectedKey);
				txtDisplayCardID.setText(selectedKey.getKeyID());
				dateDisplayExpire.setValue(selectedKey.getValidTo());
				txtDisplayName.setText(selectedKey.getHolder());
				textboxNote.setText(selectedKey.getComment());
				btnEditNote.setDisable(false);
				btnEditCard.setDisable(false);
				btnDeleteCard.setDisable(false);

		}
			else {
				btnEditNote.setDisable(true);
				btnEditCard.setDisable(true);
				btnDeleteCard.setDisable(true);
			}
	    }

	    @FXML
	    void signOut(ActionEvent event) {

	    }

	 // Populates tableKeys with keys from keyReg
		public void setObservableKeyList() {
			observableKeyList.clear();
			for (Key k : keyReg.getKeyList().values()) {
				observableKeyList.add(k);
			}
			

			if ((keyReg.getKeyList().isEmpty())) {
			observableKeyList.add( new Key("test", "test", "test", null, null, null, null, "test", "tester"));
			}
			tableKeys.setItems(observableKeyList);
		}
	    

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			columnKey.setCellValueFactory(new PropertyValueFactory<Key, String>("keyID"));
			columnHolder.setCellValueFactory(new PropertyValueFactory<Key, String>("holder"));
			columnAccess.setCellValueFactory(new PropertyValueFactory<Key, String>("accessLevel"));
			columnSpecial.setCellValueFactory(new PropertyValueFactory<Key, String>("specialAccess"));
			columnInst.setCellValueFactory(new PropertyValueFactory<Key, String>("institution"));
		}

	}

