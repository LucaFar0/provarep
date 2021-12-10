package application;


import java.net.URL;
import java.util.ResourceBundle ;
import javafx.event.ActionEvent ;
import javafx.fxml.FXML ;
import javafx.fxml.Initializable ;
import javafx.scene.control.Label ;
import javafx.scene.paint.Color ;
import javafx.scene.shape.Rectangle ;
import javafx.stage.Window;
import javafx.scene.control.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class LoginController{
	Model model = new Model();;
	
	@FXML
	private TextField textEmail;

	@FXML
	private PasswordField textPasswd;

	@FXML
	private Button logButton;
	
	public void click(ActionEvent ActionEvent) {
		Window owner = logButton.getScene().getWindow();

		
		if (textEmail.getText().isEmpty()) {
			showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter your email id");
			return;
		}
		if (textPasswd.getText().isEmpty()) {
			showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
					"Please enter a password");
			return;
		}
		
		System.out.println(textEmail.getText());
		System.out.println(textPasswd.getText());
		
		

		model.setEmail(textEmail.getText());
		model.setPassword(textPasswd.getText());
		resetTextFields();
	}
	
	public void resetTextFields(){
		textEmail.setText("");
		textPasswd.setText("");
	}
	
	 private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
	        Alert alert = new Alert(alertType);
	        alert.setTitle(title);
	        alert.setHeaderText(null);
	        alert.setContentText(message);
	        alert.initOwner(owner);
	        alert.show();
	    }
}
