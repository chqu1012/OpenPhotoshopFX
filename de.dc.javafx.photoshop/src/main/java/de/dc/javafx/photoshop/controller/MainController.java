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
	private double dragDeltaX;
	private double dragDeltaY;

	public void initialize() {
	}

	@Override
	protected void onOpenFileButtonClicked(ActionEvent event) {
		FileChooser chooser = new FileChooser();
		File result = chooser.showOpenDialog(new Stage());
		if (result != null) {
			ImageView imageView = new ImageView(new Image(result.toURI().toString()));
			imageView.setX(0);
			imageView.setY(0);
			setDragHandler(imageView);
			contentPane.getChildren().add(imageView);
		}
	}

	private void setDragHandler(Node node) {
		node.setOnMousePressed(mouseEvent -> {
			dragDeltaX = node.getLayoutX() - mouseEvent.getSceneX();
			dragDeltaY = node.getLayoutY() - mouseEvent.getSceneY();
		});

		node.setOnMouseDragged(mouseEvent -> {
			node.setLayoutX(mouseEvent.getSceneX() + dragDeltaX);
			node.setLayoutY(mouseEvent.getSceneY() + dragDeltaY);
			node.setCursor(Cursor.MOVE);
		});

		node.setOnMouseEntered(mouseEvent -> node.setCursor(Cursor.HAND));

		node.setOnMouseReleased(mouseEvent -> node.setCursor(Cursor.HAND));
	}
}
