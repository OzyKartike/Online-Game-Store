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
import java.util.HashSet;
import java.util.Set;
import ryerson.ca.searchGame.helper.Game;

/**
 *
 * @author student
 */
public class Game_CRUD {
    
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
//    public static Set<Medicine> search(String word) {
//        Set<Medicine> medicines = new HashSet<>();
//
//        try{
//            Connection con=getCon();
//
//            PreparedStatement ps = con.prepareStatement("SELECT * FROM SEARCH.medicine WHERE name LIKE ?");
//            ps.setString(1, "%" + word + "%");
//
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                String name = rs.getString("name");
//                String imageUrl = rs.getString("imageUrl");
//                String description = rs.getString("description");
//                float price = rs.getFloat("price");
//
//                Medicine medicine = new Medicine(name, imageUrl, description, price);
//                medicines.add(medicine);
//            }
//            con.close();
//        }catch(Exception e){System.out.println(e);}
//
//        return medicines;
//    }
    public static Set<Game> searchForGames(String query){
        Set<Game> games= new HashSet<Game>();
        try{
            Connection con= getCon();
//            
//            String q = "select * from Search_GMS.Game WHERE Title LIKE '%" + query + "%'"+ " OR Genre LIKE '%"+ query + "%' OR Developer LIKE '%"+
//                    query+"%';";
//System.out.println(q);
//			PreparedStatement ps=con.prepareStatement(q);
PreparedStatement ps = con.prepareStatement("SELECT * FROM Search_GMS.Game WHERE Title LIKE ?");
            ps.setString(1, "%" + query + "%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				//been= new UserInfo();
				String genre=rs.getString("Genre");
				String title=rs.getString("Title");
                                String devName=rs.getString("Developer");
                           
                                Game game = new Game(genre,title,devName);
                                games.add(game);
                                
                                }
			
			con.close();

		}catch(Exception e){System.out.println(e);}
            
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+games.size());
        return games;
        
    }
}