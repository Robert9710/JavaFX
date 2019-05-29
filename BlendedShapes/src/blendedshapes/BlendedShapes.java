package blendedshapes;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BlendedShapes extends Application {

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        root.getChildren().add(BlendModeObjects());

        Scene scene = new Scene(root, 300, 250, Color.AQUAMARINE);

        primaryStage.setTitle("Blended Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static Node BlendModeObjects() {
        Group g = new Group();
        Circle c = new Circle(50, 50, 25);
        c.setFill(Color.WHITE);
        c.setBlendMode(BlendMode.COLOR_BURN);
        Rectangle r = new Rectangle(50, 50, 50, 50);
        r.setFill(Color.BLACK);
        g.getChildren().addAll(c, r);
        return g;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
