/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
test of method FindUser()
 */
public class FindUserTest {
@Test
public void testfindUser(){
    String username = "lee";
    String password = "444";
    String expectedPosition = "Stock manager";
    assertEquals(expectedPosition, InventorySystem.findUser(username, password));
}    
}
