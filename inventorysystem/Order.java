/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import java.util.Date;

//class for orders
public class Order {
    
    private double dbSumOrder;
    private String strOrderNumber, strResponsiblePerson;
    private Date dateOrderDate;
    
    //Construct an Order object 
    Order(){
        strOrderNumber=null;
        dateOrderDate=null;
        System.out.println("Object is created");
    }
    
     void setOrderDate(Date OrderDate){
        dateOrderDate = OrderDate;
    }
    
     Date getOrderDate(){
       return dateOrderDate;
    }

     void setOrderNumber(String orderNumber){
        strOrderNumber = orderNumber;
    }
    
     String getOrderNumber(){
       return strOrderNumber;
    }

     void setSumOrder(double sumOrder){
        dbSumOrder = sumOrder;
    }
    
     double getSumOrder(){
       return dbSumOrder;
    } 
 
     void setResponsiblePerson(String responsiblePerson){
        strResponsiblePerson = responsiblePerson;
    }
    
     String getResponsiblePerson(){
       return strResponsiblePerson;
    } 
    
     void setOrderNumber(){
        java.util.Date date = new java.util.Date();
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(date);
        int month = calendar.get(java.util.Calendar.MONTH);
        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        int hour = calendar.get(java.util.Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(java.util.Calendar.MINUTE);
        int seconds = calendar.get(java.util.Calendar.SECOND);
        String orderNumber = "" + month + day + hour + minutes + seconds;
        strOrderNumber = orderNumber;
    }     
}    

