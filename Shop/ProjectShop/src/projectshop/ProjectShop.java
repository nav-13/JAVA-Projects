package projectshop;
import java.sql.*;
import javax.swing.JOptionPane;

public class ProjectShop implements Global {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "cant apply look");
        }
        
        
        
        try{
            Connection myConnection = DriverManager.getConnection(PATH+PLACE, USERNAME, PASSWORD);
            
            try{
              
            String myQuery = "select * from usertable";
            PreparedStatement myStatement = myConnection.prepareStatement(myQuery);
           
            ResultSet myResult = myStatement.executeQuery();
            
            if(myResult.next()){
                Login obj = new Login();
                obj.setVisible(true);
                
                
            }
            else{
                JOptionPane.showMessageDialog(null,"first time running software,so create new admin acc");
                Admin onj = new Admin();
                onj.setVisible(true);
            }
            
           
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERROR"+e.getMessage());
            }
            finally{
                myConnection.close();
            }
           //
        }
        //if theres a connection problem it comes here
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "error in connecection due to "+e.getMessage());
        
        }

       
    }
    
}