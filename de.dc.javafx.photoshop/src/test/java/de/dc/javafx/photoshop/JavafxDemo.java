package de.dc.javafx.photoshop;

import java.util.concurrent.atomic.AtomicInteger;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

class DrawingPane extends Pane {
	public DrawingPane(Image image, Polygon poly) {
		poly.setFill(Color.web("ANTIQUEWHITE", 0.8));
		poly.setStroke(Color.web("ANTIQUEWHITE"));
		poly.setStrokeWidth(2);

		getChildren().addAll(new ImageView(image), poly);

		final Rectangle selectionRect = new Rectangle(10, 10, Color.TRANSPARENT);
		selectionRect.setFill(Color.web("BLUE", 0.2));
	    selectionRect.setStroke(Color.BLUE);

	    EventHandler<MouseEvent> mouseDragHanlder = new EventHandler<MouseEvent>() {
	        public void handle(MouseEvent event) {
	        	
	        	System.out.println(selectionRect.getBoundsInLocal());
	        	System.out.println(selectionRect.getBoundsInParent());
	        }
	    };

	    
		for (int i = 0; i < poly.getPoints().size(); i += 2) {
			Circle circle = new Circle(poly.getPoints().get(i), poly.getPoints().get(i + 1), 5);
			circle.setFill(Color.web("PERU", 0.8));
			circle.setStroke(Color.PERU);
			circle.setStrokeWidth(2);

			AtomicInteger polyCoordinateIndex = new AtomicInteger(i);
			circle.centerXProperty().addListener((ChangeListener<Number>) (observable, oldValue, newValue) -> poly.getPoints().set(polyCoordinateIndex.get(), newValue.doubleValue()));
			circle.centerYProperty().addListener((ChangeListener<Number>) (observable, oldValue, newValue) -> poly.getPoints().set(polyCoordinateIndex.get() + 1, (Double) newValue));
			setDragHandler(circle);
			getChildren().add(circle);
		}
	}
	
	private double dragDeltaX, dragDeltaY;

	private void setDragHandler(Circle circle) {
		circle.setOnMousePressed(mouseEvent -> {
			dragDeltaX = circle.getCenterX() - mouseEvent.getSceneX();
			dragDeltaY = circle.getCenterY() - mouseEvent.getSceneY();
		});

		circle.setOnMouseDragged(mouseEvent -> {
			circle.setCenterX(mouseEvent.getSceneX() + dragDeltaX);
			circle.setCenterY(mouseEvent.getSceneY() + dragDeltaY);
			circle.setCursor(Cursor.MOVE);
		});

		circle.setOnMouseEntered(mouseEvent -> circle.setCursor(Cursor.HAND));
		circle.setOnMouseReleased(mouseEvent -> circle.setCursor(Cursor.HAND));
	}
}

public class JavafxDemo extends Application {
	@Override
	public void start(Stage stage) {
		Image image = new Image("http://tours-tv.com/uploads/maps/map-Medizinische-Hochschule-Hannover-karta.jpg");
		Polygon poly = new Polygon(10, 10, 100, 10, 200, 100, 50, 200);

		stage.setScene(new Scene(new DrawingPane(image, poly), 800, 600));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}