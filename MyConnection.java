

package com.mycompany.Sistema_ristorante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class MyConnection {
    
    private static String serverNname = "localhost";
    private static String userName = "root";
    private static String dbName = "restaurant";
    private static Integer portNumber = 3306;
    private static String password = "";
    
    
    
    public static Connection getConnection() throws SQLException{
        
        Connection con = null;
            
        try{
            
           Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/restaurant","root","");
           
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
