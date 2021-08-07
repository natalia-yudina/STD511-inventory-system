/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

//class for products
public class Items {

    private String strProductNumber, strDescription;
    private int intQuantity;
    private double dbPrice;

    //Construct an Item object 
    Items() {

        strProductNumber = null;
        strDescription = null;
        intQuantity = 0;
        dbPrice = 0;
    }

    void setProductNumber(String productNumber) {
        strProductNumber = productNumber;
    }

    String getProductNumber() {
        return strProductNumber;
    }

    void setDescription(String description) {
        strDescription = description;
    }

    String getDescription() {
        return strDescription;
    }

    void setQuantity(int quantity) {
        intQuantity = quantity;
    }

    int getQuantity() {
        return intQuantity;
    }

    void setPrice(double price) {
        dbPrice = price;
    }

    double getPrice() {
        return dbPrice;
    }    
}
