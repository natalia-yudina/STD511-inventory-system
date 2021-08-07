/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

//class for personal information
public class Person {
    private String strFirstName, strLastName, gender;
    
    //Construct a Person object
    Person(){
        strFirstName=null;
        strLastName=null;
        gender=null;
    }
    
    //access to method from subclass
    protected void setFirstName(String fn){
        strFirstName = fn;
    }
    
    protected String getFirstName(){
       return strFirstName;
    }
    
    protected void setLastName(String ln){
        strLastName = ln;
    }
    
    protected String getLastName(){
       return strLastName;
    }
   
    protected void setGender(String gender){
        this.gender = gender;
    }
    
    protected String getGender(){
       return gender;
    }
    
}
