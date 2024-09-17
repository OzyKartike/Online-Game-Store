# Online-Game-Store
An online game store (similar to steam)
### Planning Stage
![image](https://i.postimg.cc/zXXfr11w/usecase.png)
![image](https://i.postimg.cc/dVhthm3L/ER-Diagram.png)
There are 6 entities in this ER diagram, User, Admin, Game, Library, Review, and Purchase.
The User Entity represents individuals utilizing the application, with attributes such as UserID,
Username, Email, Password, and Age. The Game Entity encompasses individual games available
on the platform, characterized by attributes such as GameID, Title, Genre, Developer, Price,
RatingAvg, and Description. Purchase Entity tracks transactions initiated by users to acquire
games, with attributes like PurchaseID, UserID, GameID, and PurchaseDate. The Library Entity
represents the collection of games owned by each user, with attributes including UserID and
GameID. The Admin Entity consists of administrators or managers overseeing the platform, with
attributes like AdminID, Username, Email, and Password. Admins are responsible for managing
user accounts, user reviews, and the various games for sale. The Rating Entity encompasses
ratings assigned to games for different target audiences, featuring attributes such as RatingID,
GameID, AgeGroup, and RatingValue. It provides insights into the suitability of games for
various age groups, aiding users in making informed decisions. These entities are interconnected
through relationships like one-to-many connections and one to one connections. This can be seen
in between user and purchase, 1 user can purchase many games. As well, 1 admin manages many
games, many users, and many reviews. Furthermore, there is one 1 to 1 relationship between user
and library. Each user only has one library of games.


![image](https://i.postimg.cc/gJWYtCDZ/SQL-commands.png)


### Microservice Planning
The envisioned video game distribution center and storefront application will have 6
distinct microservices for 14 use cases. However, for this project we will specifically focus on the
ones that will be implemented including 2 backend and 1 frontend.

The first microservice will be the frontend. The Frontend microservice serves as the
user's entry point into the application. It ensures a seamless and secure user login experience by
verifying credentials, applying authentication mechanisms, and establishing a session for the
user. This microservice is dedicated to handling user-specific interactions and maintaining the
integrity of user accounts. This microservice includes use cases such as User login and Admin
login. The database used by this microservice is called AccountsDB. The tables inside this DB
are UserID, DisplayName, password, email, and age.

The SearchGamer Microservice is the initial microservice developed in this project,
featuring a well-structured architecture divided into four distinct packages, each fulfilling a
specialized role. Within the ryerson.ca.searchGame.business package, the SearchBusiness.java
class orchestrates complex game search operations, synergizing with auxiliary packages such as
GamesXML, Game_CRUD, and Game. In the ryerson.ca.searchGame.endpoint package,
ApplicationConfig.java is instrumental in configuring web resources, complemented by
SearchResource.java, which delivers RESTful endpoints meticulously designed for efficient
game searching, leveraging the rich functionalities of SearchBusiness. The
ryerson.ca.searchGame.helper package hosts pivotal classes like Author.java for streamlined
management of author-related data, Game.java for comprehensive handling of game attributes
and author relationships, and GamesXML.java for proficient XML-based game representation.
Conversely, the ryerson.ca.searchGame.persistance package, particularly the Game_CRUD.java
class, assumes responsibility for intricate data persistence tasks, including intricate database
interactions, sophisticated search operations, and robust CRUD functionalities tailored
specifically for games. This architectural blueprint not only ensures a modular and systematic
implementation of game search capabilities but also fosters the seamless integration of RESTful
services and meticulous data management protocols throughout the project lifecycle. There are
some add-on files to these packages not discussed fully in depth but these classes main purpose
is testing/assistance so do not need in-depth coverage. Below are the following screenshots of
both the file hierarchy and the screenshot of its output.

![image](https://i.postimg.cc/LszSPyp6/search-game.png)
![image](https://i.postimg.cc/LXDMCn5c/search-Game-XMLK.png)



The Profile microservice plays a crucial role in enhancing user experience and platform
functionality by providing seamless access to user data. By retrieving information such as
username, biographical details, and profile picture from the Profile_GMS database, this
microservice enables users to personalize their profiles and manage their information effectively.
Additionally, it facilitates features like user authentication and profile customization,
contributing to a more engaging and interactive platform experience. Overall, the Profile
microservice empowers users to create and maintain their profiles with ease, fostering a sense of
ownership and customization within the platform ecosystem.


![image](https://i.postimg.cc/j2jYGtJL/viewprofile.png)

### Actual Website
![image](https://i.postimg.cc/K8j4nhqc/Screenshot-2024-02-05-220405.png)
![image](https://i.postimg.cc/52rygKTB/Screenshot-2024-02-05-220421.png)
![image](https://i.postimg.cc/jjJ5FQYG/Screenshot-2024-02-05-220443.png)
![image](https://i.postimg.cc/0QRQRM8r/Screenshot-2024-02-05-220455.png)
![image](https://i.postimg.cc/XJfvVjJL/Screenshot-2024-02-05-221422.png)


### Google Cloud
Deployed on google cloud with following images. Used Docker and kubernetes.
![image](https://i.postimg.cc/wMrZZJpG/images.png)
