package displaycontactlist;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    
    private String firstName;
    private String lastName;
    private String cellPhone;
    
    public Contact(){
        
    }
    
    public Contact(String firstName, String lastName, String cellPhone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCellPhone() {
        return cellPhone;
    }
    
    public void setFirstName(String fn) {
        this.firstName = fn;
    }

    public void setLastName(String ln) {
        this.lastName = ln;
    }

    public void setCellPhone(String cell) {
        this.cellPhone = cell;
    }
    
}
