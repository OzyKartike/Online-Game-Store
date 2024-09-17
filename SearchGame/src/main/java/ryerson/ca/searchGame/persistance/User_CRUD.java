/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchGame.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ryerson.ca.searchGame.helper.Game;
import ryerson.ca.searchGame.helper.User;

/**
 *
 * @author student
 */
public class User_CRUD {
    private static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Search_GMS?autoReconnect=true&useSSL=false", "root", "student");
            System.out.println("Connection established.");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
    
    public static List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = getCon();
            String q = "SELECT * FROM User"; 
            ps = con.prepareStatement(q);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("UserID");
                String username=rs.getString("Username");
                String password=rs.getString("Password");
                String email=rs.getString("Email");
                int age = rs.getInt("Age");
                String favgenre=rs.getString("FavGenre");
                
                users.add(new User(id, username, password, email, age, favgenre));
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        }
        return users;
    }
}