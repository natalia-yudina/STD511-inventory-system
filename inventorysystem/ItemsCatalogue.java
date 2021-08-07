/*
Assignment 2 Project "Inventory system"
Student Name: Natalia Iudina (S00009622)
10.12.2020
 */
package inventorysystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ItemsCatalogue extends javax.swing.JFrame {


    public ItemsCatalogue() {
        initComponents();
        lblStatus.setText("");
        LoadData();
    }

    public void LoadData() {

        try {
            Connection con = InventorySystem.getConnectionInventorySystem();
            String sql = "Select * from items";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            DefaultTableModel tbl = (DefaultTableModel) tblItems.getModel();
            tbl.setRowCount(0);
            //continue reading from resultset when there is a record
            while (rs.next()) {
                //getting data from database field in order according to table column
                Object o[] = {rs.getString("item_ID"),
                    rs.getString("description"),
                    rs.getString("price"),
                    rs.getString("quantity")};
                tbl.addRow(o);  //adding record into table row
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        tbpEditCatalogue = new javax.swing.JTabbedPane();
        tbNewItem = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btAddToCatalogue = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btReset = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tbDeleteItem = new javax.swing.JPanel();
        txtNumberToDelete = new javax.swing.JTextField();
        lblNumberToDelete = new javax.swing.JLabel();
        btDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Number", "Description", "Price", "Quantity"
            }
        ));
        tblItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItems);

        tbpEditCatalogue.setName(""); // NOI18N

        lblNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumber.setText("Product number:");

        txtNumber.setName(""); // NOI18N
        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescription.setText("Description:");

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        lblQuantity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantity.setText("Quantity:");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Price, $:");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        btAddToCatalogue.setText("Add to catalogue");
        btAddToCatalogue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddToCatalogueActionPerformed(evt);
            }
        });

        lblStatus.setText("Status:");

        btReset.setText("Reset all");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        btUpdate.setText("Update in catalogue");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Item details");

        javax.swing.GroupLayout tbNewItemLayout = new javax.swing.GroupLayout(tbNewItem);
        tbNewItem.setLayout(tbNewItemLayout);
        tbNewItemLayout.setHorizontalGroup(
            tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbNewItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tbNewItemLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tbNewItemLayout.createSequentialGroup()
                        .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tbNewItemLayout.createSequentialGroup()
                                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tbNewItemLayout.createSequentialGroup()
                                        .addComponent(txtNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                        .addGap(197, 197, 197)
                                        .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(tbNewItemLayout.createSequentialGroup()
                                        .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(tbNewItemLayout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btAddToCatalogue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 19, Short.MAX_VALUE))))
        );
        tbNewItemLayout.setVerticalGroup(
            tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbNewItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tbNewItemLayout.createSequentialGroup()
                        .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrice)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tbNewItemLayout.createSequentialGroup()
                        .addComponent(btUpdate)
                        .addGap(29, 29, 29)))
                .addGap(7, 7, 7)
                .addGroup(tbNewItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(btAddToCatalogue))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        tbpEditCatalogue.addTab("New item", tbNewItem);

        txtNumberToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberToDeleteActionPerformed(evt);
            }
        });

        lblNumberToDelete.setText("Number:");

        btDelete.setText("Delete in catalogue");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tbDeleteItemLayout = new javax.swing.GroupLayout(tbDeleteItem);
        tbDeleteItem.setLayout(tbDeleteItemLayout);
        tbDeleteItemLayout.setHorizontalGroup(
            tbDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbDeleteItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumberToDelete)
                .addGap(18, 18, 18)
                .addComponent(txtNumberToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(btDelete)
                .addGap(36, 36, 36))
        );
        tbDeleteItemLayout.setVerticalGroup(
            tbDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbDeleteItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbDeleteItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberToDelete)
                    .addComponent(txtNumberToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        tbpEditCatalogue.addTab("Delete item", tbDeleteItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(tbpEditCatalogue))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(tbpEditCatalogue, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtNumberToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberToDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberToDeleteActionPerformed

    private void btAddToCatalogueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddToCatalogueActionPerformed
        Items objItem = new Items();
        objItem.setProductNumber(txtNumber.getText());
        objItem.setDescription(txtDescription.getText());
        objItem.setPrice(Double.parseDouble(txtPrice.getText()));
        objItem.setQuantity(Integer.parseInt(txtQuantity.getText()));
        SaveToDatabase(objItem);
        LoadData();
    }//GEN-LAST:event_btAddToCatalogueActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        txtNumber.setText("");
        txtDescription.setText("");
        txtPrice.setText("");
        txtQuantity.setText("");
    }//GEN-LAST:event_btResetActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        //Get value from the GUI interface and assign to Items object
        Items objItem = new Items();
        objItem.setProductNumber(txtNumber.getText());
        objItem.setDescription(txtDescription.getText());
        objItem.setPrice(Double.parseDouble(txtPrice.getText()));
        objItem.setQuantity(Integer.parseInt(txtQuantity.getText()));       
        UpdateDatabase(objItem);
        LoadData();
    }//GEN-LAST:event_btUpdateActionPerformed

    private void tblItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemsMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)tblItems.getModel();
        int i = tblItems.getSelectedRow();

       //set data to textfield when row is selected
        txtNumber.setText(tblModel.getValueAt(i,0).toString());
        txtDescription.setText(tblModel.getValueAt(i,1).toString());
        txtPrice.setText(tblModel.getValueAt(i,2).toString());
        txtQuantity.setText(tblModel.getValueAt(i,3).toString());
        
    }//GEN-LAST:event_tblItemsMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
    String key = txtNumberToDelete.getText();
    DeleteData(key);
    LoadData();
    txtNumberToDelete.setText("");
    }//GEN-LAST:event_btDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ItemsCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemsCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemsCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemsCatalogue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemsCatalogue().setVisible(true);
            }
        });
    }

    private void SaveToDatabase(Items newItem) {

        try {
            Connection con = InventorySystem.getConnectionInventorySystem();
            PreparedStatement pst = con.prepareStatement("INSERT INTO items (item_ID, description, price, quantity) VALUES (?, ?, ?, ?);");
            
            pst.setString(1, newItem.getProductNumber());
            pst.setString(2, newItem.getDescription());
            pst.setString(3, Double.toString(newItem.getPrice()));
            pst.setString(4, Integer.toString(newItem.getQuantity()));
            int result = pst.executeUpdate();
            if (result == 1) {
                lblStatus.setText("Status: Item " + newItem.getProductNumber() + " is added succesfully");
                //JOptionPane.showMessageDialog(null, "Registered Succesfully.");
            }
        } catch (HeadlessException | SQLException e) {
            //JOptionPane.showMessageDialog(null,e.toString());
        }
    }

private void UpdateDatabase(Items itemToUpdate){

        try{
            Connection con = InventorySystem.getConnectionInventorySystem();
           String sql="Update items set description=?,price=?,quantity=? where item_ID=?";

           PreparedStatement pst = con.prepareStatement(sql);
           pst.setString(1,itemToUpdate.getDescription());
           pst.setString(2,Double.toString(itemToUpdate.getPrice()));
           pst.setString(3,Integer.toString(itemToUpdate.getQuantity()));
           pst.setString(4,itemToUpdate.getProductNumber());
           int result = pst.executeUpdate();
           if (result==1){
              //JOptionPane.showMessageDialog(null,"Update Successfully.");             
              /*new StudentDetails().setVisible(true);
              this.setVisible(false);   */       
           }
           con.close();          
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());           
        }     
    }

private void DeleteData(String keys){

        try{
           Connection con = InventorySystem.getConnectionInventorySystem();
           String sql="Delete from items where item_ID='" + keys + "'";
           PreparedStatement pst = con.prepareStatement(sql);
           int result = pst.executeUpdate();
           if (result==1){
              JOptionPane.showMessageDialog(null,"Successfully deleted");             
           }
           con.close();          
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());           
        }     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddToCatalogue;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblNumberToDelete;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JPanel tbDeleteItem;
    private javax.swing.JPanel tbNewItem;
    private javax.swing.JTable tblItems;
    private javax.swing.JTabbedPane tbpEditCatalogue;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtNumberToDelete;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
