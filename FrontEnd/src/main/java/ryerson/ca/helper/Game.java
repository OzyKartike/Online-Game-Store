/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.helper;

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
@XmlRootElement(name = "game")
@XmlAccessorType(XmlAccessType.FIELD)
public class Game {
    
    private String genre; 
    private String title;
    private String devName;

    public Game(){
        
    }
    public Game(String genre, String title,String devName) {
        this.genre = genre;
        this.title = title;
        this.devName = devName;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }
    public String getdevName() {
        return devName;
    }
}
