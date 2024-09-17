/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.helper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.helper.Game;

 @XmlRootElement(name = "games")
@XmlAccessorType (XmlAccessType.FIELD)
       public class GamesXML{
     @XmlElement(name="game")
           private ArrayList<Game> games;
           
           
           public List<Game>getGames(){
               return games;
               
           }
          public  GamesXML(){
               
               
           }
           public void setGames(ArrayList<Game> bs){
               games=bs;
               
           }
           
       }
