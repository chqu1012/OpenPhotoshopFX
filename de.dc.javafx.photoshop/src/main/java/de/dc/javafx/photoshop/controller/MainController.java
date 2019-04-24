package de.dc.javafx.photoshop.controller;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class MainController extends BaseMainController {

	ObservableList<String> layers = FXCollections.observableArrayList();
	public void initialize() {
	}

	@Override
	protected void onOpenFileButtonClicked(ActionEvent event) {
		FileChooser chooser = new FileChooser();
		File result = chooser.showOpenDialog(new Stage());
		if (result != null) {
			ImageView imageView = new ImageView(new Image(result.toURI().toString()));
			contentPane.getChildren().add(imageView);
		}
	}
}
