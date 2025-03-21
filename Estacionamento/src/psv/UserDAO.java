/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package psv;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Patricia - Etec
 */
public class UserDAO {
    private Connection conn;
    
    public UserDAO(Connection conn) {
        setConn(conn);
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public String inserirUser(UserBean user){
        String sql = "INSERT INTO usuarios (email,senha) VALUES (?,?)";
        
        try{
            PreparedStatement ps = getConn().prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getSenha());
            
            if(ps.executeUpdate() > 0){
                return 
            }
        }
    }
}
