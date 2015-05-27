/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas
 */
public class Connexion {
    private Statement statement;
    
    public Statement connect(){
        try{
            
        String url = "jdbc:postgresql://postgresql1.alwaysdata.com:5432/projetjavastri_projetjava";
        String username = "projetjavastri";
        String password = "projetjavaSTRI";
        Connection con = DriverManager.getConnection(url, username, password);
        statement = con.createStatement();  
        }
    catch(SQLException ex){
        JOptionPane.showMessageDialog(null, ex.toString());
        }
        return statement;
    }
}
