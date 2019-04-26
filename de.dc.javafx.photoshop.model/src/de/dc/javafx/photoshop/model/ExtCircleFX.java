package de.dc.javafx.photoshop.model;

import java.util.Arrays;

import de.dc.javafx.photoshop.model.ExtRectangleFX.Wrapper;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.effect.Light.Point;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ExtCircleFX extends Circle {

	protected CircleFX model;
	private Point delta = new Point();
	private BooleanProperty selectionProperty = new SimpleBooleanProperty(false);
	private double handleRadius = 5;
	
	public ExtCircleFX(CircleFX model) {
		this.model = model;
		setCenterX(model.getPosition().getX());
		setCenterY(model.getPosition().getY());
		setRadius(model.getRadius());

		initDefault();
	}

	private void initDefault() {
		setFill(Color.web("BLUE", 0.2));
		setStroke(Color.BLUE);
		setStrokeWidth(2);

		setOnMousePressed(mouseEvent -> {
			delta.setX(getCenterX() - mouseEvent.getSceneX());
			delta.setY(getCenterY() - mouseEvent.getSceneY());
		});

		setOnMouseDragged(mouseEvent -> {
			setCenterX(mouseEvent.getSceneX() + delta.getX());
			setCenterY(mouseEvent.getSceneY() + delta.getY());
			setCursor(Cursor.MOVE);
		});
		setOnMouseEntered(mouseEvent -> setCursor(Cursor.HAND));
		setOnMouseReleased(mouseEvent -> setCursor(Cursor.HAND));
		setOnMouseClicked(event -> {
			if (event.getClickCount() == 2) {
				selectionProperty.set(selectionProperty.not().get());
			}
		});

		selectionProperty.addListener((ChangeListener<Boolean>) (observable, oldValue, newValue) -> {
			Color color = newValue ? Color.RED :Color.web(model.getStrokeColor());
			setStroke(color);
		});
	}
}
