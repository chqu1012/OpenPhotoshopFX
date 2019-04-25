package de.dc.javafx.photoshop.widget;

import java.util.ArrayList;
import java.util.List;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.StrokeLineCap;

public class SelectionPolygon extends Polygon {

	private boolean drawShape = true;
	private List<Double> values = new ArrayList<Double>();
	private List<Double> xList = new ArrayList<>();
	private List<Double> yList = new ArrayList<>();
	private int count = 0;

	public SelectionPolygon(Pane parent) {
		parent.getChildren().add(this);
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getEventType() == MouseEvent.MOUSE_PRESSED) {
					if (drawShape) {
						xList.add(mouseEvent.getX());
						yList.add(mouseEvent.getY());
						System.out.println("X:" + mouseEvent.getX());
						System.out.println("Y:" + mouseEvent.getY());
					}
				} else if (mouseEvent.isSecondaryButtonDown()) {
					if (drawShape) {
						values.add(xList.get(count));
						values.add(yList.get(count));
						count++;
						getPoints().addAll(values);
						setStroke(Color.FORESTGREEN);
						setStrokeWidth(4);
						setStrokeLineCap(StrokeLineCap.ROUND);
						setFill(Color.CORNSILK.deriveColor(0, 1.2, 1, 0.6));
//		                    parent.getChildren().addAll(createControlAnchorsFor(getPoints()));
						drawShape = false;

					}

				}

			}
		};
		parent.setOnMouseDragged(mouseHandler);
		parent.setOnMousePressed(mouseHandler);
		parent.setOnMouseReleased(mouseHandler);
	}
}
