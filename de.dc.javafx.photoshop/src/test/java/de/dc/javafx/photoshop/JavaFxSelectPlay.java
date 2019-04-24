package de.dc.javafx.photoshop;
import de.dc.javafx.photoshop.widget.SelectionRectangle;
import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.effect.Light.Point;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
 
public class JavaFxSelectPlay extends Application {
     
    public static void main(String[] args) {
        launch();
    }
 
    SelectionRectangle selection;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        WebView wv = new WebView();
        final Point anchor = new Point();
 
        wv.setOnMousePressed(event -> {
        	selection = new SelectionRectangle();
            anchor.setX(event.getX());
            anchor.setY(event.getY());
            selection.setX(event.getX());
            selection.setY(event.getY());
            root.getChildren().add(selection);
            
            selection.setCursor(Cursor.CROSSHAIR);
        });
         
        wv.setOnMouseDragged(event -> {
            selection.setWidth(Math.abs(event.getX() - anchor.getX()));
            selection.setHeight(Math.abs(event.getY() - anchor.getY()));
            selection.setX(Math.min(anchor.getX(), event.getX()));
            selection.setY(Math.min(anchor.getY(), event.getY()));
            
            selection.setCursor(Cursor.NONE);
        });
         
        root.getChildren().add(wv);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Primary Stage");
        primaryStage.show();
    }
     
}