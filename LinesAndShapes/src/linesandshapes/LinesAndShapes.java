package linesandshapes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class LinesAndShapes extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        
        //x,y for the start and end
        Line seesaw = new Line(60,340,340,140);
        seesaw.setStroke(Color.BLACK);
        seesaw.setStrokeWidth(15);
        
        //x,y for the middle and the radius
        Circle c = new Circle(70,280,40);
        c.setStroke(Color.AZURE);
        c.setStrokeWidth(5);
        c.setFill(Color.BLACK);
        
        Circle sun = new Circle(-50, -50, 140);
        sun.setStroke(Color.YELLOW);
        sun.setFill(Color.YELLOW);
        
        //x,y,width,height
        Rectangle r = new Rectangle(240,90,80,70);
        r.setStroke(Color.AQUA);
        r.setStrokeWidth(5);
        r.setFill(Color.YELLOWGREEN);
        
        Line left = new Line(200,240,160,340);
        left.setStrokeWidth(5);
        Line right = new Line(200,240,240,340);
        right.setStrokeWidth(5);
        
        root.getChildren().addAll(seesaw, c, r, left, right, sun);
        
        Scene scene = new Scene(root, 400, 400, Color.SKYBLUE);
        
        primaryStage.setTitle("Playground");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
