package Operation;

import java.sql.*;


public class DBUtil {

     public static Connection getConnection(){
         Connection con=null;
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students_management_system","root", "123456");       
        }catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch(SQLException e)
        {
            e.printStackTrace();
        }
         return con;
        
}    
}

     
 




