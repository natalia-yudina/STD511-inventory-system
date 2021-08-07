/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class InventorySystem {

    /**
     * @param args the command line arguments
     */
    public static String currentUser; //user's position. The screens will change depending on this position

    public static void main(String[] args) {
   
    }

    public static Connection getConnectionInventorySystem() {
        String USERNAME = "root";
        String PASSWORD = "";
        String CONN_STRING = "jdbc:mysql://localhost:3306/db_inventory_system";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            return con;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;

    }
    
    public static String findUser(String user, String password) {

        //find the position of current user
        try {
            Connection con = InventorySystem.getConnectionInventorySystem();
            String sql = "Select position from staff_members where username='" + user + "' and password ='" + password + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                //put value in static variable for using from all classes
                currentUser = rs.getString("position");
                return currentUser;

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return "";
    }    
    
}
