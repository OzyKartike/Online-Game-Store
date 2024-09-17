/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.Profile.helper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author student
 */
@XmlRootElement(name = "profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class VProfile {
    
    private String Username; 
    private String DisplayName;
    private String Text;
    private int Picture;
    private int UserID;

    public VProfile(){
        
    }
    public VProfile(String Username, String DisplayName, int Picture, String Text, int UserID) {
        this.Username = Username;
        this.DisplayName = DisplayName;
        this.Picture = Picture;
        this.Text = Text;
        this.UserID = UserID;
    }

    public String getDisplayName() {
        return DisplayName;
    }
     public void setDisplayName(String fname) {
        this.DisplayName = fname;
    }
    public String getUsername() {
        return Username;
    }
    public void setUsername(String fname) {
        this.Username = fname;
    }
    public int getPicture() {
        return Picture;
    }
    public void setPicture(int fname) {
        this.Picture = fname;
    }
     public int getUserID() 
     {
        return UserID;
    }
     public void setUserID(int fname) {
        this.UserID = fname;
    }
     public String getText() {
        return Text;
    }
     public void setText(String fname) {
        this.Text = fname;
    }
    /*@Override
    public int hashCode() {
        return (Objects.hash(isbn));
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Game other = (Game) obj;
        if (isbn.equals(other.isbn))
            return true;
        else return (false);
        
    }*/
    @Override
    public int hashCode() {
        return Objects.hash(Username);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final VProfile other = (VProfile) obj;
        return Objects.equals(this.Username, other.Username);
    }
    
}