package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
public class MainViewController implements Initializable {
	
	


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

	    }

	    @FXML
	    void editNote(ActionEvent event) {

	    }

	    @FXML
	    void newCard(ActionEvent event) {

	    }

	    @FXML
	    void selectKey(MouseEvent event) {
	    	Key selectedKey = tableKeys.getSelectionModel().getSelectedItem();
			if (selectedKey != null) {
				setSelectedKey(selectedKey);
				txtDisplayCardID.setText(selectedKey.getKeyID());
				dateDisplayExpire.setValue(selectedKey.getValidTo());
				txtDisplayName.setText(selectedKey.getHolder());
				textboxNote.setText(selectedKey.getEmployee().getComment());
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
		public void setObservableStudentList() {
			observableKeyList.clear();
			for (Key k : keyReg.getKeyList().values()) {
				observableKeyList.add(k);
			}
			

			if ((keyReg.getKeyList().isEmpty())) {
			observableKeyList.add( new Key(null, null, "test", null, null, null, null));
			}
			tableKeys.setItems(observableKeyList);
		}
	    

		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			columnKey.setCellValueFactory(new PropertyValueFactory<Key, String>("keyID"));
			columnHolder.setCellValueFactory(new PropertyValueFactory<Key, String>("holder"));
			columnAccess.setCellValueFactory(new PropertyValueFactory<Key, String>("accessLevel"));
			columnSpecial.setCellValueFactory(new PropertyValueFactory<Key, String>("holder"));
			columnInst.setCellValueFactory(new PropertyValueFactory<Key, String>("institution"));
		}

	}

