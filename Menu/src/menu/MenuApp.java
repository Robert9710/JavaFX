package menu;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MenuApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 300, 250);
        
        MenuBar menuBar = new MenuBar();
        //menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);
        
        Menu fileMenu = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        fileMenu.getItems().addAll(newFile, save, exit);
        
        Menu lang = new Menu("Languages");
        CheckMenuItem python = new CheckMenuItem("Python");
        CheckMenuItem java = new CheckMenuItem("Java");
        CheckMenuItem c = new CheckMenuItem("C++");
        lang.getItems().addAll(python, java, c);
        
        Menu tutorialMenu = new Menu("Tutorial");
        tutorialMenu.getItems().addAll(
                new MenuItem("Buttons"),
                new MenuItem("Menus"),
                new MenuItem("Images"));

        lang.getItems().addAll(tutorialMenu);
        
        menuBar.getMenus().addAll(fileMenu, lang);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
