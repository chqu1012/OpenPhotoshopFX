package de.dc.javafx.photoshop;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ArcExample extends Application {
  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Text Fonts");

    Group g = new Group();
    Scene scene = new Scene(g, 550, 250);

    Arc arc = new Arc();
    arc.setCenterX(50.0f);
    arc.setCenterY(50.0f);
    arc.setRadiusX(25.0f);
    arc.setRadiusY(25.0f);
    arc.setStartAngle(45.0f);
    arc.setLength(270.0f);
    arc.setType(ArcType.ROUND);

    arc.addEventHandler(MouseEvent.MOUSE_PRESSED,
        new EventHandler<MouseEvent>() {
          public void handle(MouseEvent me) {
            System.out.println("left");
          }
        });
    g.getChildren().add(arc);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
}