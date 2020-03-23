package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	
	private Key selectedKey;
	private KeyRegister keyReg = new KeyRegister();
	private EmployeeRegister employeeReg = new EmployeeRegister();
	
	public void start(Stage primaryStage) {
		
	 try {
		    FXMLLoader loader = new FXMLLoader(getClass().getClassLoader().getResource("MainView.fxml"));
		    Parent root = (Parent) loader.load();
		    MainViewController hController = loader.getController();


		    hController.setEmployeeReg(this.employeeReg);
		    hController.setKeyReg(this.keyReg);

		    Stage stage = new Stage();
		    stage.setScene(new Scene(root));
		    stage.setResizable(false);
		    stage.show();
		    
		    }
		    catch (IOException e) {
		    	e.printStackTrace();
		    }
	}
	

	public static void main(String[] args) {
		launch(args);

	}
}
