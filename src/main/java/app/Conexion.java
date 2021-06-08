/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Manfred
 */
public class Conexion {
    public static Connection ObtenerConexion(){
        
String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=empleados;user=sa;password=123";
        try 
        {
            
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        }
        catch(SQLException ex)
        {
            System.out.println(ex.toString());
            return null;
        }
    }
    
}
