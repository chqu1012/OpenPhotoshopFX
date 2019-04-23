package de.dc.javafx.photoshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/de/dc/javafx/photoshop/Main.fxml"));
		Parent root = loader.load();
		stage.setScene(new Scene(root , 1200, 700));
		stage.setTitle("PhotoshopFX");
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
