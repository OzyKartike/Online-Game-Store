/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ryerson.ca.business;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.apache.commons.io.IOUtils;
import ryerson.ca.helper.Game;
import ryerson.ca.helper.GamesXML;
import ryerson.ca.helper.User;
import ryerson.ca.helper.UsersXML;

/**
 *
 * @author student
 */
public class Business {

    public static boolean isAuthenticated(String username, String passwrod) {
        return true;
    }
    
    public static boolean verifyUser(List<User> users, String username, String password) {
        
        for (User user : users) {
            
            if (User.getUserName(user).equals(username) && User.getPassword(user).equals(password)) {
                return true; 
            }
        }
        return false; 
    }
    
    public static UsersXML getUsers() throws IOException {

        Client searchClient = ClientBuilder.newClient();

        WebTarget searchWebTarget = searchClient.target("http://localhost:8080/SearchGame/webresources/users");

        InputStream is = searchWebTarget.request(MediaType.APPLICATION_XML).get(InputStream.class);

        String xml = IOUtils.toString(is, "UTF-8");

        UsersXML users = UsersXmlToObject(xml);

        return users;
    }

    public static GamesXML getGames(String query) throws IOException {

        Client searchClient = ClientBuilder.newClient();

        WebTarget searchWebTarget = searchClient.target("http://localhost:8080/SearchGame/webresources/search/"+query);

        InputStream is = searchWebTarget.request(MediaType.APPLICATION_XML).get(InputStream.class);

        String xml = IOUtils.toString(is, "UTF-8");

        GamesXML games = gameXmlToObjects(xml);

        return (games);

    }

    private static GamesXML gameXmlToObjects(String xml) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(GamesXML.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            GamesXML games = (GamesXML) jaxbUnmarshaller.unmarshal(new StringReader(xml));
            return games;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Game gameholdxmltoObjects(String xml) {
        if(xml.isEmpty())
            return null;
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Game.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Game game = (Game) jaxbUnmarshaller.unmarshal(new StringReader(xml));
            return game;

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static UsersXML UsersXmlToObject(String xml) {
        JAXBContext jaxbContext;
        try {
            
            jaxbContext = JAXBContext.newInstance(UsersXML.class);

            
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            
            return (UsersXML) jaxbUnmarshaller.unmarshal(new StringReader(xml));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}
