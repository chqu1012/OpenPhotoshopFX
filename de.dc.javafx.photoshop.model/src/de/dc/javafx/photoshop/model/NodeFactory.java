package de.dc.javafx.photoshop.model;

import de.dc.javafx.photoshop.model.util.PhotoShopFXSwitch;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class NodeFactory extends PhotoShopFXSwitch<Node> {

	@Override
	public Node casePhotoShopFX(PhotoShopFX object) {
		Pane pane = new Pane();
		object.getNodes().forEach(node -> pane.getChildren().add(doSwitch(node)));
		return pane;
	}

	@Override
	public Node caseLineFX(LineFX object) {
		PointFX start = object.getPosition();
		PointFX end = object.getEndPosition();
		return new Line(start.getX(), start.getY(), end.getX(), end.getY());
	}

	@Override
	public Node caseCircleFX(CircleFX object) {
		PointFX pos = object.getPosition();
		return new Circle(pos.getX(), pos.getY(), object.getRadius());
	}

	@Override
	public Node caseRectangleFX(RectangleFX object) {
		Rectangle rectangle = new Rectangle();
		rectangle.setX(object.getPosition().getX());
		rectangle.setY(object.getPosition().getY());
		rectangle.setWidth(object.getWidth());
		rectangle.setHeight(object.getHeight());
		rectangle.setArcWidth(object.getArcWidth());
		rectangle.setArcHeight(object.getArcHeight());  
		return rectangle;
	}
}
