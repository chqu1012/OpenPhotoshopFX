package de.dc.javafx.photoshop.widget;

import java.io.File;

import javafx.scene.Cursor;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class ImageFX extends BorderPane{

	private ImageView imageView = new ImageView();
	private double dragDeltaX;
	private double dragDeltaY;
	
	public ImageFX(File imageFile) {
		setCenter(imageView);
		setOnMousePressed(mouseEvent -> {
			dragDeltaX = getLayoutX() - mouseEvent.getSceneX();
			dragDeltaY = getLayoutY() - mouseEvent.getSceneY();
		});

		setOnMouseDragged(mouseEvent -> {
			setLayoutX(mouseEvent.getSceneX() + dragDeltaX);
			setLayoutY(mouseEvent.getSceneY() + dragDeltaY);
			setCursor(Cursor.MOVE);
		});

		setOnMouseEntered(mouseEvent -> setCursor(Cursor.HAND));
		setOnMouseReleased(mouseEvent -> setCursor(Cursor.HAND));
	}
	
}
