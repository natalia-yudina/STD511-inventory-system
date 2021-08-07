/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

//class to connect orders and items
public class OrderDetails {

    private String strOrderDetails_ID, strProductNumber, strStatus, strOrderNumber;
    private int intQuantity;

    //Construct a OrderDetails object 
    OrderDetails() {

        strOrderDetails_ID = null;
        strOrderNumber = null;
        strProductNumber = null;
        intQuantity = 0;
        strStatus = null;
    }

    void setOrderNumber(String orderNumber) {
        strOrderNumber = orderNumber;
    }

    String getOrderNumber() {
        return strOrderNumber;
    }

    void setOrderDetails_ID(String orderDetails_ID) {
        strOrderDetails_ID = orderDetails_ID;
    }

    String getOrderDetails_ID() {
        return strOrderDetails_ID;
    }
    
    void setProductNumber(String productNumber) {
        strProductNumber = productNumber;
    }

    String getProductNumber() {
        return strProductNumber;
    }

    void setStatus(String status) {
        strStatus = status;
    }

    String getStatus() {
        return strStatus;
    }

    void setQuantity(int quantity) {
        intQuantity = quantity;
    }

    int getQuantity() {
        return intQuantity;
    }

}
