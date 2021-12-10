package application;



import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage)  throws Exception {

		var loader = new FXMLLoader(getClass().getClassLoader().getResource("application/Diocanaglia.fxml"));
		Parent root = loader.load();
		
		Scene scene = new Scene(root, 700, 500);
	
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();


	}

	public static void main(String[] args) {
		launch(args);
	}
}
