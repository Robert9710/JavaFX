package addimage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AddImage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Image img = new Image("addimage/c2.jpg");
        ImageView image = new ImageView(img);
        iv.setFitHeight(600);
        iv.setFitWidth(600);
        root.setCenter(image);
        Scene scene = new Scene(root, 800, 700);
        
        primaryStage.setTitle("Image");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
