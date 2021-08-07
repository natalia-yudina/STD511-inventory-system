/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * test of method setSumOrder()
 */
public class SetSumOrderTest {

    @Test
    public void testsetSumOrder() {
        double expectedSum = 40.7;
        Order objOrder = new Order();
        objOrder.setSumOrder(15.7 + 25);
        assertEquals(expectedSum, objOrder.getSumOrder(),0);
    }
}
