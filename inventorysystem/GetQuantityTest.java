/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
test of method getQuantity()
 */
public class GetQuantityTest {

    @Test
public void testgetQuantity(){
    int expectedQuantity = 15;
    Items objItem = new Items();
    objItem.setQuantity(15);
    assertEquals(expectedQuantity, objItem.getQuantity());
}    
}
