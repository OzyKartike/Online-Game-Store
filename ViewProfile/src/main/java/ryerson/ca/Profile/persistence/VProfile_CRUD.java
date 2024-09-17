package ryerson.ca.Profile.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;
import java.util.Set;
import ryerson.ca.Profile.helper.VProfile;

/**
 *
 * @author student
 */
public class VProfile_CRUD {
    
    private static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/VProfile_GMS?autoReconnect=true&useSSL=false", "root", "student");
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
    public static VProfile searchForProfileInfo(String id){
        VProfile profile = new VProfile();
        String Username= null;
        String DisplayName = null;
        int Picture = 0;
        String Text = null;
        int UserID = 0;
        try{
            Connection con= getCon();
//            
//            String q = "select * from Search_GMS.Game WHERE Title LIKE '%" + query + "%'"+ " OR Genre LIKE '%"+ query + "%' OR Developer LIKE '%"+
//                    query+"%';";
//System.out.println(q);
//			PreparedStatement ps=con.prepareStatement(q);
PreparedStatement ps = con.prepareStatement("SELECT * FROM VProfile_GMS.Profile WHERE Username LIKE ?");
            ps.setString(1,id);
            ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//been= new UserInfo();
				Username=rs.getString("Username");
				DisplayName=rs.getString("DisplayName");
                                Picture = rs.getInt("Picture");
                                Text = rs.getString("Biography");
                                UserID=rs.getInt("UserID");
                                }
                        profile.setDisplayName(DisplayName);
                        profile.setPicture(Picture);
                        profile.setText(Text);
                        profile.setUserID(UserID);
                        profile.setUsername(Username);
			
			con.close();

		}catch(Exception e){System.out.println(e);}
            
      //  System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+profile.size());
        return profile;
        
    }
}