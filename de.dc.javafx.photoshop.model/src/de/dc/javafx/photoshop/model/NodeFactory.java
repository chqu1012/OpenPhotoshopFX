package de.dc.javafx.photoshop.model;

import de.dc.javafx.photoshop.model.util.PhotoShopFXSwitch;
import javafx.scene.Node;
import javafx.scene.shape.Line;

public class NodeFactory extends PhotoShopFXSwitch<Node>{

	@Override
	public Node caseLineFX(LineFX object) {
		PointFX start = object.getPosition();
		PointFX end = object.getEndPosition();
		return new Line(start.getX(), start.getY(), end.getX(), end.getY());
	}
}
