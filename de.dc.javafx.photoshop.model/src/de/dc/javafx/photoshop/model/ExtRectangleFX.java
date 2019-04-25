package de.dc.javafx.photoshop.model;

import java.util.Arrays;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Point2D;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.effect.Light.Point;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class ExtRectangleFX extends Rectangle {

	private Point delta = new Point();
	private BooleanProperty selectionProperty = new SimpleBooleanProperty(false);
	private double handleRadius = 5;
	
	public ExtRectangleFX() {
		super(10, 10, Color.TRANSPARENT);
		setFill(Color.web("BLUE", 0.2));
	    setStroke(Color.BLUE);
	    setStrokeWidth(2);
	    
	    setOnMousePressed(mouseEvent -> {
	    	delta.setX(getX() - mouseEvent.getSceneX());
			delta.setY(getY() - mouseEvent.getSceneY());
		});

		setOnMouseDragged(mouseEvent -> {
				setX(mouseEvent.getSceneX() + delta.getX());
				setY(mouseEvent.getSceneY() + delta.getY());
				setCursor(Cursor.MOVE);
		});
	    setOnMouseEntered(mouseEvent ->setCursor(Cursor.HAND));
		setOnMouseReleased(mouseEvent ->setCursor(Cursor.HAND));
		setOnMouseClicked(event->{
			if (event.getClickCount()==2) {
				selectionProperty.set(selectionProperty.not().get());
			}
		});
		
		 // top left resize handle:
		SimpleDoubleProperty zero = new SimpleDoubleProperty(0);
		Circle resizeHandleNW = createCircle(xProperty().add(zero), yProperty().add(zero));
		// bottom right resize handle:
		Circle resizeHandleSE = createCircle(xProperty().add(widthProperty()), yProperty().add(heightProperty()));
        // top right
		Circle resizeHandleNE = createCircle(xProperty().add(widthProperty()), yProperty().add(zero));
        // bottom left
		Circle resizeHandleSW = createCircle(xProperty().add(zero), yProperty().add(heightProperty()));
		
        // force circles to live in same parent as rectangle:
        parentProperty().addListener((obs, oldParent, newParent) -> {
            for (Circle c : Arrays.asList(resizeHandleNW, resizeHandleSE, resizeHandleNE, resizeHandleSW)) {
                Pane currentParent = (Pane)c.getParent();
                if (currentParent != null) {
                    currentParent.getChildren().remove(c);
                }
                ((Pane)newParent).getChildren().add(c);
            }
        });
        
        Wrapper<Point2D> mouseLocation = new Wrapper<>();

        setUpDragging(resizeHandleNW, mouseLocation, true) ;
        setUpDragging(resizeHandleSE, mouseLocation, true) ;
        setUpDragging(resizeHandleNE, mouseLocation, false) ;
        setUpDragging(resizeHandleSW, mouseLocation, false) ;

        resizeHandleSW.setOnMouseDragged(event -> {
        	if (mouseLocation.value != null) {
        		double deltaX = event.getSceneX() - mouseLocation.value.getX();
        		double deltaY = event.getSceneY() - mouseLocation.value.getY();
        		double newX = getX() + deltaX ;
        		if (newX >= handleRadius && newX <= getX() + getWidth() - handleRadius) {
        			setX(newX);
        			setWidth(getWidth() - deltaX);
        		}
                double newMaxY = getY() + getHeight() + deltaY ;
                if (newMaxY >= getY() 
                        && newMaxY <= getParent().getBoundsInLocal().getHeight() - handleRadius) {
                    setHeight(getHeight() + deltaY);
                }
        		mouseLocation.value = new Point2D(event.getSceneX(), event.getSceneY());
        	}
        });

        resizeHandleNE.setOnMouseDragged(event -> {
        	if (mouseLocation.value != null) {
        		double deltaX = event.getSceneX() - mouseLocation.value.getX();
        		double deltaY = event.getSceneY() - mouseLocation.value.getY();
        		double newMaxX = getX() + getWidth() + deltaX ;
        		if (newMaxX >= getX() 
        				&& newMaxX <= getParent().getBoundsInLocal().getWidth() - handleRadius) {
        			setWidth(getWidth() + deltaX);
        		}
        		double newY = getY() + deltaY ;
        		if (newY >= handleRadius && newY <= getY() + getHeight() - handleRadius) {
        			setY(newY);
        			setHeight(getHeight() - deltaY);
        		}
        		mouseLocation.value = new Point2D(event.getSceneX(), event.getSceneY());
        	}
        });

        resizeHandleNW.setOnMouseDragged(event -> {
        	if (mouseLocation.value != null) {
        		double deltaX = event.getSceneX() - mouseLocation.value.getX();
        		double deltaY = event.getSceneY() - mouseLocation.value.getY();
        		double newX = getX() + deltaX ;
        		if (newX >= handleRadius && newX <= getX() + getWidth() - handleRadius) {
        			setX(newX);
        			setWidth(getWidth() - deltaX);
        		}
        		double newY = getY() + deltaY ;
        		if (newY >= handleRadius && newY <= getY() + getHeight() - handleRadius) {
        			setY(newY);
        			setHeight(getHeight() - deltaY);
        		}
        		mouseLocation.value = new Point2D(event.getSceneX(), event.getSceneY());
        	}
        });

        resizeHandleSE.setOnMouseDragged(event -> {
            if (mouseLocation.value != null) {
                double deltaX = event.getSceneX() - mouseLocation.value.getX();
                double deltaY = event.getSceneY() - mouseLocation.value.getY();
                double newMaxX = getX() + getWidth() + deltaX ;
                if (newMaxX >= getX() 
                        && newMaxX <= getParent().getBoundsInLocal().getWidth() - handleRadius) {
                    setWidth(getWidth() + deltaX);
                }
                double newMaxY = getY() + getHeight() + deltaY ;
                if (newMaxY >= getY() 
                        && newMaxY <= getParent().getBoundsInLocal().getHeight() - handleRadius) {
                    setHeight(getHeight() + deltaY);
                }
                mouseLocation.value = new Point2D(event.getSceneX(), event.getSceneY());
            }
        });

		ObjectBinding<Color> borderBinding = Bindings.when(selectionProperty).then(Color.RED).otherwise(Color.BLUE);
		strokeProperty().bind(borderBinding);
	}
	
	private Circle createCircle(DoubleBinding xBinding, DoubleBinding yBinding) {
        Circle circle = new Circle(handleRadius, Color.RED);
        circle.centerXProperty().bind(xBinding);
        circle.centerYProperty().bind(yBinding);
        circle.visibleProperty().bind(selectionProperty);
        return circle;
	}
	
    private void setUpDragging(Node node, Wrapper<Point2D> mouseLocation, boolean isSE) {
        node.setOnDragDetected(event -> {
        	if (isSE) {
        		node.getParent().setCursor(Cursor.SE_RESIZE);
			}else {
				node.getParent().setCursor(Cursor.SW_RESIZE);
			}
            mouseLocation.value = new Point2D(event.getSceneX(), event.getSceneY());
        });
        node.setOnMouseReleased(event -> {
        	if (isSE) {
        		node.getParent().setCursor(Cursor.SE_RESIZE);
			}else {
				node.getParent().setCursor(Cursor.SW_RESIZE);
			}
            mouseLocation.value = null ;
        });
    }
    
    static class Wrapper<T> { T value ; }
}
