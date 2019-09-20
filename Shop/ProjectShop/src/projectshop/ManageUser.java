package projectshop;
import java.sql.*;
import javax.swing.JOptionPane;

public class ManageUser extends javax.swing.JInternalFrame implements Global {

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        tfUsername = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        choiceBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel1.setText("Manage User");
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("Name");

        jLabel3.setText("Phone Number");

        jLabel4.setText("Address");

        jLabel5.setText("Gender");

        jLabel6.setText("User-Type");

        jLabel7.setText("UserName");

        jLabel8.setText("Password");

        buttonGroup1.add(rbMale);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFemale);
        rbFemale.setText("Female");

        pfPassword.setName(""); // NOI18N
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        choiceBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Admin", "Employee" }));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane2.setViewportView(taAddress);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfName)
                                .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbMale)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemale))
                            .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(262, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     
        try{
            //trys to connect here
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
                //after into,name has to be the one called in the database where data is stored.
            String myQuery = "insert into manageuser values(?,?,?,?,?,?,?)";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
            myStatement.setString(1,tfName.getText());
            myStatement.setString(2,tfPhone.getText());
            myStatement.setString(3,taAddress.getText());
            //myStatement.setString(4,tfName.getText());
            if(rbMale.isSelected()==true){
               myStatement.setString(4,rbMale.getText());
             }
            else if(rbFemale.isSelected()==true){
               myStatement.setString(4,rbFemale.getText());
             }
            myStatement.setString(5,tfUsername.getText());
            myStatement.setString(6,pfPassword.getText());
            myStatement.setString(7,choiceBox.getSelectedItem().toString());
            
            if(myStatement.executeUpdate()>0){
                JOptionPane.showMessageDialog(rootPane, "Successfully Added");
                tfName.setText("");
                tfPhone.setText("");
                taAddress.setText("");
                buttonGroup1.clearSelection();
                tfUsername.setText("");
                pfPassword.setText("");
                choiceBox.setSelectedIndex(0);
                }
            else{
                 JOptionPane.showMessageDialog(rootPane, "ERROR");
            
            }
            
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "ERROR "+e.getMessage());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> choiceBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
