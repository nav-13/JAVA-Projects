package projectshop;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product extends javax.swing.JInternalFrame implements Global {

    /**
     * Creates new form Category
     */
    public Product() {
        initComponents();
        try{
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
              
            String myQuery = "select * from category";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
           
            ResultSet myResult = myStatement.executeQuery();
            
            if(myResult.next()){
                do{
            jComboBox1.addItem(myResult.getString("Name"));
                }
                while(myResult.next());
            }
           
            
           
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
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

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Products");

        jLabel1.setText("Category  Name");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Category" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Subcategory");

        jLabel3.setText("Product Name");

        jLabel4.setText("Price");

        jLabel5.setText("Qty");

        jLabel6.setText("Discount");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Subcategory" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });

        jFormattedTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField2ActionPerformed(evt);
            }
        });

        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Qty", "Subcategory", "Category"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
         if(jComboBox1.getSelectedIndex()>0){
        
        try{
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
              
            String myQuery = "select * from subcategory where category=?";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
            myStatement.setString(1, jComboBox1.getSelectedItem().toString());
            ResultSet myResult = myStatement.executeQuery();
            
            if(myResult.next()){
                jComboBox2.removeAllItems();
                jComboBox2.addItem("choose subcategory name");
                
                do{
            jComboBox2.addItem(myResult.getString("subcategory"));
                }
                while(myResult.next());
            }
           
            
           
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
        }
         }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void jFormattedTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField2ActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
            //trys to connect here
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
          String myQuery = "update product set categoryname=?,subcategoryname=?,price=?,qty=?,discount=? where productname=?";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
            myStatement.setString(1,jComboBox1.getSelectedItem().toString());
               myStatement.setString(2,jComboBox2.getSelectedItem().toString());
               myStatement.setString(6,jTextField1.getText());
               myStatement.setString(3,jFormattedTextField1.getText());
               myStatement.setString(4,jFormattedTextField2.getText());
               myStatement.setString(5,jFormattedTextField3.getText());
           
            
            if(myStatement.executeUpdate()>0){
                JOptionPane.showMessageDialog(rootPane, "updated Added");
                 jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextField1.setText("");
                jFormattedTextField1.setText("");
                jFormattedTextField2.setText("");
                jFormattedTextField3.setText("");
              
                }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Cannot Update");
            
            }
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      try{
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
              
            String myQuery = "select * from product where productname like ?";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
            myStatement.setString(1, jTextField1.getText()+ "%"); 
            ResultSet myResult = myStatement.executeQuery();
            DefaultTableModel myModel=(DefaultTableModel)jTable1.getModel();
            String category,subcategory,pName,price,qty,discount ;
            
            if(myResult.next()){
                myModel.setRowCount(0);
                do{
                    category=myResult.getString("categoryname");
                    subcategory=myResult.getString("subcategoryname");
                    pName=myResult.getString("productname");
                    price=myResult.getString("price");
                    qty=myResult.getString("qty");
                   discount=myResult.getString("discount");
                   myModel.addRow(new String[]{pName,price,qty,subcategory,category});
                    
                    
                    
           
                }
                while(myResult.next());
            }
           
            
           
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            //trys to connect here
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
          String myQuery = "insert into product values(?,?,?,?,?,?)";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
            myStatement.setString(1,jComboBox1.getSelectedItem().toString());
               myStatement.setString(2,jComboBox2.getSelectedItem().toString());
               myStatement.setString(3,jTextField1.getText());
               myStatement.setString(4,jFormattedTextField1.getText());
               myStatement.setString(5,jFormattedTextField2.getText());
               myStatement.setString(6,jFormattedTextField3.getText());
           
            
            if(myStatement.executeUpdate()>0){
                JOptionPane.showMessageDialog(rootPane, "Successfully Added");
                jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextField1.setText("");
                jFormattedTextField1.setText("");
                jFormattedTextField2.setText("");
                jFormattedTextField3.setText("");
              
                }
            else{
                 JOptionPane.showMessageDialog(rootPane, "ERROR");
            
            }
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int result=JOptionPane.showConfirmDialog(rootPane, "Do you really want to delete","DELETE",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        
        if(result==JOptionPane.YES_OPTION)
        {
        try{
            //trys to connect here
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
          String myQuery = "delete from product where productname=?";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
           
               myStatement.setString(1,jTextField1.getText());
           
            
            if(myStatement.executeUpdate()>0){
                JOptionPane.showMessageDialog(rootPane, "Deleted Successfully");
                 jComboBox1.setSelectedIndex(0);
                jComboBox2.setSelectedIndex(0);
                jTextField1.setText("");
                jFormattedTextField1.setText("");
                jFormattedTextField2.setText("");
                jFormattedTextField3.setText("");
              
                }
            else{
                 JOptionPane.showMessageDialog(rootPane, "Cannot Delete");
            
            }
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
        }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         String pname = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
      try{
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
              
            String myQuery = "select * from product where productname=?";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
            //get name of product and related data
            //loops used for multiple rows
            //need multiple colums so no loop
            myStatement.setString(1, pname);
            ResultSet myResult = myStatement.executeQuery();
            
            if(myResult.next()){
                //price feild will get info from price in DB.
                jFormattedTextField3.setText(myResult.getString("price"));
                jTextField1.setText(myResult.getString("productname"));
                 jFormattedTextField1.setText(myResult.getString("qty"));
                  jFormattedTextField2.setText(myResult.getString("discount"));
                  //select item that matches my resuly
                  jComboBox1.setSelectedItem(myResult.getString("categoryname"));
             jComboBox2.setSelectedItem(myResult.getString("subcategoryname"));
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Wrong product name");
            }
           
            
           
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "error in connecection due to "+e.getMessage());
        
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
