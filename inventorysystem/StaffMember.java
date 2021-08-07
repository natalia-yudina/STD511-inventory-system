/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

//subclass
public class StaffMember extends Person {

    //Define the data members (fields)
    private String strPosition, strUsername, strPassword, strMemberID;

    //Construct a StaffMember object
    StaffMember() {

        strPosition = null;
        strUsername = null;
        strPassword = null;
        strMemberID = null;
    }

    void setPosition(String position) {
        strPosition = position;
    }

    String getPosition() {
        return strPosition;
    }

    void setMemberID(String memberID) {
        strMemberID = memberID;
    }

    String getMemberID() {
        return strMemberID;
    }
    
    void setUsername(String username) {
        strUsername = username;
    }

    String getUsername() {
        return strUsername;
    }

    void setPassword(String password) {
        strPassword = password;
    }

    String getPassword() {
        return strPassword;
    }

    String getNameWithPosition(){
        String result = super.getFirstName() + " " + super.getLastName() + "\t" + getPosition();
        return result;
    }
}
