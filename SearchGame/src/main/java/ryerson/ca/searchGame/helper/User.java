/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchGame.helper;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name="User")
@XmlAccessorType(XmlAccessType.FIELD)  
public class User {
    private int userID, age;
    private String userName, password, email, favGenre;
    
    public User(){}
    
    public User(int userID, String userName, String password, String email, int age, String favGenre) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.age = age;
        this.favGenre = favGenre;
    }


    public int getUserID() {
        return userID;
    }
    
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getFavGenre()
    {
        return favGenre;
    }
    
}
