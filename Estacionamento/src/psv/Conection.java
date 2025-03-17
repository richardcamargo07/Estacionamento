/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
/**
 *
 * @author Richard
 */
public class Conection {
    
    public static Connection abrirConexao(){
     
        Connection conn = null;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=";
            conn = DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
        
    }
    public static void fecharConexao(Connection conn){
        try{
            conn.close();
            System.out.println("Conexão fechada. ");    
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
