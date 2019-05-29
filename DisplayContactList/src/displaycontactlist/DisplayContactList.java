package displaycontactlist;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DisplayContactList extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label response = new Label("");
        Label title = new Label("Contact list using a TableView\n");
        
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 450, 450);
        
        ObservableList<Contact> contactList = FXCollections.observableArrayList(
                new Contact("Roy", "Jones", "717-555-1212"), 
                new Contact("Jim", "Freed", "441-456-1345"), 
                new Contact("Pat", "Keegan", "717-363-1432"), 
                new Contact("Jane", "Slattery", "441-478-4488"), 
                new Contact("Cy", "Young", "970-554-1265"), 
                new Contact("Rob", "Jones", "570-655-1587"), 
                new Contact("Carol", "King", "215-547-5958"), 
                new Contact("Bob", "Kauffman", "215-456-6345"), 
                new Contact("Gloria", "Shilling", "717-785-6092"), 
                new Contact("Bill", "Sigler", "441-444-1345")
                );
        
        TableView<Contact> tvContacts;
        
        tvContacts = new TableView<Contact>(contactList);
        
        TableColumn<Contact, String> fName = new TableColumn<>("First Name");
        fName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        
        TableColumn<Contact, String> lName = new TableColumn<>("Last Name");
        lName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        
        TableColumn<Contact, String> cell = new TableColumn<>("Phone Number");
        cell.setCellValueFactory(new PropertyValueFactory<>("cellPhone"));
        
        tvContacts.getColumns().addAll(fName, lName, cell);
        
        tvContacts.setPrefSize(400, 400);
        
        TableView.TableViewSelectionModel<Contact> tvMod = 
                tvContacts.getSelectionModel();
        
        tvMod.selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                response.setText(contactList.get((int)newValue).getCellPhone().toString());
            }
        });
        
        root.getChildren().addAll(title, tvContacts, response);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
