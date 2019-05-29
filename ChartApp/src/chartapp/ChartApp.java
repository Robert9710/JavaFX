package chartapp;

import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ChartApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ObservableList<PieChart.Data> pieData = FXCollections.observableArrayList(
        new PieChart.Data("Rent", 460),
                new PieChart.Data("Food", 200),
                new PieChart.Data("Transport", 57)
        );
        
        ObservableList<String> barData = FXCollections.observableArrayList("Rent", "Food", "Transport");
        
        PieChart budget = new PieChart(pieData);
        
        budget.setTitle("Monthly budget");
        
        System.out.println("1");
        FlowPane root = new FlowPane();
        root.getChildren().add(budget);
        
        Scene scene = new Scene(root, 500, 500);
        
        scene.getStylesheets().add("chartapp/chart.css");
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
