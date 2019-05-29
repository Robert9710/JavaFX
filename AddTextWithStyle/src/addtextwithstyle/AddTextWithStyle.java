package addtextwithstyle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AddTextWithStyle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 400, 450);
        
        root.setTop(addHBox("Top"));
        root.setLeft(addVBox("Left"));
        root.setRight(addVBox("Right"));
        root.setBottom(addHBox("Bottom"));
        try{
        scene.getStylesheets().add("addtextwithstyle/textStyles.css");
        }catch(Exception x){
            System.out.println(x.getMessage());
        }
        primaryStage.setTitle("Style Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static HBox addHBox(String str){
        HBox hbox = new HBox();
        Text text = new Text(str);
        hbox.setId("hbox");
        text.setId("textstyle");
        hbox.getChildren().add(text);
        return hbox;
    }
    
    public static VBox addVBox(String str){
        VBox vbox = new VBox();
        Text text = new Text(str);
        vbox.setId("vbox");
        text.setId("textstyle");
        vbox.getChildren().add(text);
        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
