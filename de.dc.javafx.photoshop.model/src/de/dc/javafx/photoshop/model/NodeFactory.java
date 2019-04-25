package de.dc.javafx.photoshop.model;

import de.dc.javafx.photoshop.model.util.PhotoShopFXSwitch;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

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
		Line node = new Line(start.getX(), start.getY(), end.getX(), end.getY());
		initNode(node, object);
		return node;
	}

	@Override
	public Node caseCircleFX(CircleFX object) {
		PointFX pos = object.getPosition();
		Circle node = new Circle(pos.getX(), pos.getY(), object.getRadius());
		initNode(node, object);
		return node;
	}

	@Override
	public Node caseRectangleFX(RectangleFX object) {
		ExtRectangleFX node = new ExtRectangleFX();
		node.setX(object.getPosition().getX());
		node.setY(object.getPosition().getY());
		node.setWidth(object.getWidth());
		node.setHeight(object.getHeight());
		node.setArcWidth(object.getArcWidth());
		node.setArcHeight(object.getArcHeight());  
		initNode(node, object);
		return node;
	}
	
	@Override
	public Node casePolygonFX(PolygonFX object) {
		Polygon node = new Polygon();  
		object.getPoints().stream().forEach(p->{
			node.getPoints().add(p.getX());
			node.getPoints().add(p.getY());
		});
		
		initNode(node, object);
		return node;
	}
	
	private void initNode(Shape node, NodeFX fx) {
//		  @GenModel(propertyCategory="Details")
//			double opacity = '1.0'
//		  @GenModel(propertyCategory="Details")
//			String style
//		  @GenModel(propertyCategory="Details")
//			String styleClass
//		  @GenModel(propertyCategory="Details")
//			double strokeWidth
		
		node.setStrokeWidth(fx.getStrokeWidth());
	}
}
