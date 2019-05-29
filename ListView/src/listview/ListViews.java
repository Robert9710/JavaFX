package listview;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ListViews extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label response = new Label("Select a college or university");
        
        ListView<String> lv;
        
        Text title = new Text("PA Colleges and Universities");
        
        FlowPane root = new FlowPane(10, 10);
        root.setAlignment(Pos.CENTER);
        
        ObservableList<String> cu = FXCollections.observableArrayList("UWL", "UCL", "KCL",
                "UEL", "UoCiL", "UN", "StMU","StGU", "ICL");
        
        lv = new ListView<>(cu);
        lv.setPrefSize(300, 150);
        
        MultipleSelectionModel<String> lvMod = lv.getSelectionModel();
        lvMod.selectedItemProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                response.setText("You selected "+ newValue);
            }
            
        });
        root.getChildren().addAll(title, lv, response);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
