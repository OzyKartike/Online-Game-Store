/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchGame.helper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.searchGame.helper.User;

 @XmlRootElement(name = "users")
@XmlAccessorType (XmlAccessType.FIELD)
       public class UsersXML{
     @XmlElement(name="user")
           private List<User> users;
           
           
           public List<User>getUsers(){
               return users;
               
           }
          public  UsersXML(){
               
               
           }
           public void setUsers(List<User> bs){
               this.users=bs;
               
           }
           
       }