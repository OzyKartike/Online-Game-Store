package ryerson.ca.Profile.helper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import ryerson.ca.Profile.helper.VProfile;

 @XmlRootElement(name = "profiles")
@XmlAccessorType (XmlAccessType.FIELD)
       public class VProfileXML{
     @XmlElement(name="profile")
           private VProfile games;
           
           
           public VProfile getVProfile(){
               return games;
               
           }
          public  VProfileXML(){
               
               
           }
           public void setVProfile(VProfile bs){
               games=bs;
               
           }
           
       }
