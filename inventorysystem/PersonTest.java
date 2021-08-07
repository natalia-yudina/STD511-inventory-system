/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
test of method setFirstName()
 */
public class PersonTest {

@Test
public void testsetFirstName(){
    String expectedName = "Leo";
    Person objPerson = new Person();
    objPerson.setFirstName("Leo");
    assertEquals(expectedName, objPerson.getFirstName());
}
}
