/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
test of method setOrderDate()
 */
public class SetOrderDateTest {

@Test
public void testsetOrderDate(){
    Order objOrder = new Order();
    java.util.Date date = new java.util.Date();
    objOrder.setOrderDate(date);
    assertEquals(date, objOrder.getOrderDate());
}    
}
