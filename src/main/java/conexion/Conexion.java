package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

        public Connection getConnectDB(){

            Connection connection = null;

            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biernes", "root", "");
                if(connection != null){
                    System.out.println("DataBase is connected!!!");
                }
            }catch (SQLException e){
                System.out.println(e);
            }
            return connection;
        }
    }


