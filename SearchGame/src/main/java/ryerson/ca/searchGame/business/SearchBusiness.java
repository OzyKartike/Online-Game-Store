/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.searchGame.business;

import ryerson.ca.searchGame.helper.GamesXML;
import ryerson.ca.searchGame.helper.UsersXML;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.searchGame.helper.Game;
import ryerson.ca.searchGame.helper.User;
import ryerson.ca.searchGame.persistance.Game_CRUD;
import ryerson.ca.searchGame.persistance.User_CRUD;

/**
 *
 * @author student
 */
public class SearchBusiness {
    
    public  GamesXML getGamesByQuery(String query){
       Set<Game> games = Game_CRUD.searchForGames(query);
       Map<String ,Game> allAuthorsGames= new HashMap ();
           System.out.println("&&&&&&&&&&&&&&&&&&&&&&"+ games.size());
        for(Game game : games){
            if(allAuthorsGames.containsKey(game.getGenre())){
                //allAuthorsGames.get(game.getIsbn()).addAuthor(game.getAuthors());
            }
            else{
                allAuthorsGames.put(game.getGenre(),game );
            }
        }
        System.out.println("**********************"+ allAuthorsGames.size());
        GamesXML bs;
        bs = new GamesXML();
        bs.setGames(new ArrayList(allAuthorsGames.values()));
        return (bs);
    }
    
    public UsersXML getUsers()
    {
        List<User> users = User_CRUD.getAllUsers();
        UsersXML usersXML = new UsersXML();
        usersXML.setUsers(users);
        return usersXML;
    }
}