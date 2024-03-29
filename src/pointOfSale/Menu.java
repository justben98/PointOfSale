/**
 * Class:   Menu
 * All definitions are found here
 * Date: 9th November, 2019.
 */
package pointOfSale;

/**
 *
 * @author justech@ubuntu.com
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;

class EndingListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
        //Exit status
        Menu.frame.dispose();
    }
}


public class Menu extends JFrame {
    private static Object request;
    static JTable myTable;
    protected static JFrame frame;
    
    
    //constructor Menu
    public void Menu (){
        //Table definition
        String [] columnNames = {"MealID", "Description", "Price"};
        myTable = new JTable(40, 3);
        myTable.setBounds(20,10,400,600);
        
        
        //JFrame definition
        frame = new JFrame("Kafuco Mess Menu");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(450,700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(this);
        frame.setVisible(true);
        frame.add(myTable);
        
        JButton closeButton = new JButton ("CLOSE");
        EndingListener buttonEar = new EndingListener();
        closeButton.addActionListener(buttonEar);
        frame.add(closeButton);
        

        //frame.add(mysTable);
        try {
            //Load connection drivers
            Class.forName("com.mysql.jdbc.Driver");
          
            try {

            Connection url = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/KafucoMessDB?autoReconnect=true&useSSL=false","root","Bmwmb.benlasalle2016");
            
            // select dish from Meals table 
            java.sql.Statement stmts = null;
            String query = "SELECT * FROM Meals ";
            stmts = url.createStatement();
            ResultSet rs = stmts.executeQuery(query);
            int li_row = 0;
            while(rs.next()){
                myTable.setValueAt(rs.getString("ID"),li_row,0);
                myTable.setValueAt(rs.getString("Description"),li_row,1);
                myTable.setValueAt(rs.getFloat("Price"),li_row,2);

                li_row++;
            }
           
            } catch (SQLException e) {
                e.printStackTrace();
                    }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    

}
