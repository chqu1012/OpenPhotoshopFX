package de.dc.javafx.photoshop;

import de.dc.javafx.photoshop.widget.SelectionPolygon;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SelectionPolygonExample  extends Application {
    
   public static void main(String[] args) {
       launch();
   }

   SelectionPolygon selection;

   @Override
   public void start(Stage primaryStage) throws Exception {
       Pane root = new Pane();
       selection = new SelectionPolygon(root); 
       Scene scene = new Scene(root, 800, 600);
       primaryStage.setScene(scene);
       primaryStage.setTitle("Primary Stage");
       primaryStage.show();
   }
    
}